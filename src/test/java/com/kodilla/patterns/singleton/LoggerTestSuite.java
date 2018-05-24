package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class LoggerTestSuite {

    @BeforeClass
    public static void printLogs() {
        Logger.getInstance().log("Test nr 1 dla metody log().");
        Logger.getInstance().log("Test nr 2 dla metody log().");
        Logger.getInstance().log("Test nr 3 dla metody log().");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String getLastLog = Logger.getInstance().getLastLog();
        System.out.println("Wiadomość z ostatniego loga: " + getLastLog);
        //Then
        Assert.assertEquals("Test nr 3 dla metody log().", getLastLog);

    }
}

