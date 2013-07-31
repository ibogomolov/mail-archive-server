package util;

import java.io.PrintStream;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.resource.ValueMap;

/**
 * Util class to calculate entropy of a letter position in the message subject
 * 
 * @author bogomolo
 */

@Component
public class SubjectLettersEntropy {

	private static final int SAMPLE_LENGTH = 300;
	private static final int ALPHABET_LENGTH = 26;
	private static final double THRESHOLD = 0.9;

	private static final double MAX_THEOR_ENTROPY = -Math.log10(1./ALPHABET_LENGTH);
	
	@Reference
	ResourceResolverFactory resourceResolverFactory;
	private ResourceResolver resolver = null;
	public static SubjectLettersEntropy instance = null;

	public SubjectLettersEntropy() {
		if (instance == null) {
			instance = this;
		} 
	}

	int[][] count = new int[SAMPLE_LENGTH][ALPHABET_LENGTH];
	double[] entropy = new double[SAMPLE_LENGTH];
	int messages = 0;

	public void calculateEntropyAndPrint(PrintStream out) {
		try {
			if (resourceResolverFactory == null) {
				System.out.println("resourceResolverFactory is NULL");
			}
			resolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
		} catch (LoginException e) {
			e.printStackTrace();
		}

		String root = "/content/mailarchiveserver/archive"; // /domain/project/list/t/th/thread/message
		Resource main = resolver.getResource(root);
		iterate(main, 6);
		int[] sum = new int[SAMPLE_LENGTH];

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < ALPHABET_LENGTH; j++) {
				sum[i] += count[i][j];
			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < ALPHABET_LENGTH; j++) {
				if (count[i][j] > 0) {
					double num = count[i][j]/1./sum[i];
					entropy[i] += - num * Math.log10(num); 
				}
			}
		}

		System.out.println(String.format("%s\t%s\t%s", "charAt","entropy", "sum"));
		for (int i = 0; i < sum.length; i++) {
			if (entropy[i] >= MAX_THEOR_ENTROPY*THRESHOLD || sum[i] >= messages*THRESHOLD) 
				System.out.println(String.format("%d\t%.3f\t%d", i, entropy[i], sum[i]));
		}
		out.println("Messages #: "+messages);
	}

	private void countLetters(Resource r) {
		messages++;
		ValueMap properties = r.adaptTo(ValueMap.class);
		String subj = properties.get("Subject", (String) null);
		for (int i = 0; i < Math.min(subj.length(), SAMPLE_LENGTH); i++) {
			Character c = Character.toLowerCase(subj.charAt(i));
			if (c.toString().matches("[a-z]")) {
				count[i][c-'a']++;
			}
		}
	}

	private void iterate(Resource r, int lvl) {
		for (Resource child : r.getChildren()) {
			if (lvl == 0) {
				countLetters(child);
			} else {
				iterate(child, lvl-1);
			}
		}
	}

}