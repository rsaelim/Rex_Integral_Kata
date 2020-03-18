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
        String[] action = { "Rex", "publish", "viewTimeline", "follow" };
        String[] data = {"", "Hello everybody", "Rex", "Charlie"};
        String actualOutput = App.main(action, data);
        String expectedOutput = "Hello everybody (1)\n";
        System.out.println(expectedOutput);
        assertTrue( actualOutput.equals(expectedOutput) );
        if (actualOutput.equals(expectedOutput)) { System.out.println("Noice"); }
        else { System.out.println("DAFUQ"); }
    }

    public void testSwitchAccountFunction()
    {
        // tests switching accounts and viewing timelines of different accounts
        String[] action = { "Rex", "publish", "switch", "publish", "viewTimeline", "viewTimeline" };
        String[] data = {"", "Hello everybody", "Charlie", "Ay, it's Charlie", "Rex", "Charlie" };
        String actualOutput = App.main(action, data);
        String expectedOutput = "Hello everybody (1)\nAy, it's Charlie (3)\n"; // TODO: replace with expectedOutput
        assertTrue( actualOutput.equals(expectedOutput) ); // TODO: replace with assertTrue( actualOutput == expectedOutput )
    }

    public void testFollowing()
    {
        // tests follow and viewWall
        String[] action = { "Alice", "publish", "follow", "switch", "publish", "switch", "viewWall" };
        String[] data = { "", "Alice in wonderland" , "Charlie", "Charlie", "Charlie's timeline", "Alice", "" };
        String actualOutput = App.main(action, data);
        String expectedOutput = "Charlie - Charlie's timeline (4)\nAlice - Alice in wonderland (1)\n"; // TODO: replace with expectedOutput
        assertTrue( true ); // TODO: replace with assertTrue( actualOutput == expectedOutput )
    }
    // Reflection: There is A LOT of Java specific stuff I needed to look up:
    //  -Maven set up
    //  -Jave files set up
    //  -Java class object declarations
    //  -Java string concatenation
    //  -Java string comparison ! use .equals function
    //  -Java HashSet, ArrayList, Hashtable
    //  -Java class public vs private vs protected, final keyword
    //  -
}
