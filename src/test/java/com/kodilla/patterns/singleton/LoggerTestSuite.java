package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testLog() {
        Logger.getInstance().log("Test metody log().");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String getLastLog = Logger.getInstance().getLastLog();
        System.out.println("Wiadomość z ostatniego loga: " + getLastLog);
        //Then
        Assert.assertEquals("Test metody log().", getLastLog);

    }
}

