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
     *         "publish" : "message to publish"
     *         "viewTimeline" : "Account's timeline you want to view"
     *         "follow" : "Account you are trying to follow"
     *         "viewWall" : ""
     *
     */
    public void testApp()
    {
        new App();
        String[] action = { "Rex", "publish", "viewTimeline", "follow", "viewWall"};
        String[] data = {"", "Hello everybody", "Rex", "Charlie", ""};
        App.main(action, data);
        assertTrue( true );
    }
}