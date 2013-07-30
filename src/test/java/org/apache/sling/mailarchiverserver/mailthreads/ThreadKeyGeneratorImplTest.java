package org.apache.sling.mailarchiverserver.mailthreads;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.james.mime4j.dom.Header;
import org.apache.james.mime4j.dom.Message;
import org.apache.james.mime4j.stream.Field;
import org.apache.sling.mailarchiveserver.ThreadKeyGeneratorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Matchers;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class ThreadKeyGeneratorImplTest {
    private ThreadKeyGeneratorImpl generator = new ThreadKeyGeneratorImpl();
    private final String input;
    private final String expected;
    
    @Parameters(name="{0}")
    public static List<Object[]> data() {
        final List<Object[]> result = new ArrayList<Object[]>();
        result.add(new Object[] { "", ""} );
        result.add(new Object[] { "foo", "output of foo"} );
        result.add(new Object[] { "bar is a bit longer so shouldn't fail", "b/ba/bar_is_a_bit_longer_so_shouldnt_fail"} );
        return result;
    }
    
    public ThreadKeyGeneratorImplTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }
    
    @Test
    public void testSimpleKeys() {
        final Message m = Mockito.mock(Message.class);
        final Header header = Mockito.mock(Header.class);
        final Field subject = Mockito.mock(Field.class);
        
        Mockito.when(m.getHeader()).thenReturn(header);
        Mockito.when(header.getField(Matchers.same("Subject"))).thenReturn(subject);
        Mockito.when(subject.getBody()).thenReturn(input);
        assertEquals(expected, generator.getThreadKey(m));
    }
}
