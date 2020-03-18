package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Defining input format for tests
     * Example:
     *      Input of the program: ["Rex", "publish", "viewTimeline", "follow", "viewWall"]
     *                            ["", "message to publish", "Rex", "Charlie", "", ]
     * First array:
     *         1. First item should be who you are as the user
     *         2. The rest of the inputs:
     *         "publish" : "message to publish"
     *         "viewTimeline" : "Account's timeline you want to view"
     *         "follow" : "Account you are trying to follow"
     *         "viewWall" : ""
     *
     */
    public void testbasic()
    {
        // tests publish and viewTimeline basic functionality
        new App();
        String[] action = { "Rex", "publish", "viewTimeline", "follow", "viewWall"};
        String[] data = {"", "Hello everybody", "Rex", "Charlie", ""};
        String actualOutput = App.main(action, data);
        String expectedOutput = "Hello everybody\nRex - Hello everybody\n";
        assertTrue( true ); // TODO: replace with assertTrue( actualOutput == expectedOutput)
    }

    public void testSwitchAccountFunction()
    {
        // tests switching accounts and viewing timelines of different accounts
        String[] action = { "Rex", "publish", "switch", "publish", "viewTimeline", "viewTimeline"};
        String[] data = {"", "Hello everybody", "Charlie", "Ay, it's Charlie", "Rex", "Charlie"};
        String actualOutput = App.main(action, data);
        String expectedOutput = ""; //TODO: replace with expectedOutput
        assertTrue( true ); // TODO: replace with assertTrue( actualOutput == expectedOutput)
    }

    public void testFollowing()
    {
        // tests follow and viewWall
        String[] action = { "Alice", "publish", "follow", "switch", "publish", "switch", "viewWall"};
        String[] data = { "", "Alice in wonderland" , "Charlie", "Charlie", "Charlie's timeline", "Alice", ""};
        String actualOutput = App.main(action, data);
        String expectedOutput = ""; //TODO: replace with expectedOutput
        assertTrue( true ); // TODO: replace with assertTrue( actualOutput == expectedOutput)
    }
}
