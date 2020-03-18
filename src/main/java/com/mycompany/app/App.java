package com.mycompany.app;

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
    public static void main( String[] actions, String[] data ) {
		for (int i = 0; i < actions.length; ++i) {
			System.out.println( actions[i] );
		}
		for (int i = 0; i < data.length; ++i) {
			System.out.println( data[i] );
		}
    	
        System.out.println( "Hello World!" );
    }
}
