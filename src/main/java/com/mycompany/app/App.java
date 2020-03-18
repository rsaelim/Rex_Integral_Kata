package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 * Resources used to set up the repo
 * 		http://maven.apache.org/guides/getting-started/
 * 		http://maven.apache.org/guides/introduction/introduction-to-the-pom.html
 * 		https://stackoverflow.com/questions/42525139/maven-build-compilation-error-failed-to-execute-goal-org-apache-maven-plugins
 *
 */

public class App 
{
    public static String main( String[] actions, String[] data ) {

    	Hashtable<String, profileInfo> infoDict = new Hashtable<String, profileInfo>();

		String currentUser = actions[0];
		infoDict.put( currentUser, new profileInfo() );

		String cumulativeMessage = "";
		for ( int i = 1; i < actions.length; ++i ) {

			switch( actions[i] ) {
			  case "publish":
			  	message newMessage = new message(i, data[i]);
			    infoDict.get(currentUser).messages.add( newMessage );
			    break;
			  case "viewTimeline":
			    String whosTimeline = data[i];
			    if (infoDict.get( whosTimeline ) == null ) { break; }
			    for ( int msgIndex = 0; msgIndex < infoDict.get( whosTimeline ).messages.size(); ++msgIndex ) {
			    	String content = infoDict.get( whosTimeline ).messages.get(msgIndex).getContent();
			    	int time = infoDict.get( whosTimeline ).messages.get(msgIndex).getTime();
			    	cumulativeMessage += content + " (" + time + ")" + "\n";
			    }
			    break;
			  case "follow":
			  	infoDict.get(currentUser).following.add( data[i] );
			  	break;
			  case "viewWall":
			  	Iterator<String> setItr = infoDict.get(currentUser).following.iterator();
			  	ArrayList<message> messagesOnWall = new ArrayList<message>();
			  	// TODO: Need account of each message as well
			  	// while (setItr.hasNext()) {
			  	// 	for (int j = 0; j > infoDict.get(setItr.next()).messages.size(); ++j) {
			  	// 		messagesOnWall.add( infoDict.get(setItr.next()).messages[j] );
			  	// 	}
			  	// }
			  	// TODO: Sort messagesOnWall
			  	// for (int k = 0; k < messagesOnWall.size(); ++k) {
			  	// 	// TODO: add to cumulative messages
			  	// }
			   // TODO: Add the rest of functionality switch cases
			  	break;
			  default:
			    
			}
		}
    	
        System.out.println( cumulativeMessage );
        return cumulativeMessage;
    }
}
