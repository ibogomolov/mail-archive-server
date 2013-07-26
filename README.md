Mail Archive Server prototype
===================

WHY MAIL ARCHIVE SERVER?
------------------------
Mail archive server is designed to store messages of mailing lists and allows convenient search and navigation through them. This prototype contains import -> store -> browse functionality and is a starting point for a complete mail archive server.

PREREQUISITES
-------------
In order to run protorype, you need the following:
- Sling Launchpad
- Apache James :: Mime4j :: Core bundle
- Apache James :: Mime4j :: Mbox Iterator bundle
- Apache James :: Mime4j :: DOM bundle

HOW TO INSTALL
--------------
1. Download and run Sling Launchpad: http://sling.apache.org/downloads.cgi
2. Currently there is no release of Mime4j with all required functionality, so you need to build a snapshot version yourself:

	http://james.apache.org/mime4j/start/build.html
        (source code is at http://svn.apache.org/repos/asf/james/mime4j/trunk/)

After, install required bundles using OSGi console at 

	http://localhost:8080/system/console/bundles

Or use WebDAV to create an install folder like /apps/mailserver/install and copy the bundles there.

3. Clone this project: 

	git clone https://github.com/ibogomolov/mail-archive-server.git

Build and install it executing from the root folder (assuming Sling Launchpad is running on port 8080):

    mvn -P autoInstallBundle clean install -Dsling.url=http://localhost:8080/system/console

The OSGi console must then list three org.apache.james.apache-mime4j-*** bundles and org.apache.sling.mailarchiveserver bundle as active. 

HOW TO TEST
-----------
Start at 

	http://localhost:8080/content/mailarchiveserver.html

Import a .mbox file. Some samples can be found in script/mbox/ folder. Import could take some time. 
Browse your archive by mailing list and conversation thread. Message preview and subject are clickable.

KNOWN ISSUES
------------
Sometimes building the dom module of Mime4j bundle produces a .jar file that is not a bundle - META-INF/MANIFEST.MF file does not contain bundle description. The nature of this problems is unknown. A workaround is to substitute wrong MANIFEST.MF with the one from target/classes/META-INF/ which is correct.
