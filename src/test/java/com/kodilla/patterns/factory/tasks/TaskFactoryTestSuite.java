package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory shopping = new TaskFactory();
        //When
        Task shoppingTask = shopping.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("The shopping task", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory driving = new TaskFactory();
        //When
        Task drivingTask = driving.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("The driving task", drivingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory painting = new TaskFactory();
        //When
        Task paintingTask = painting.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("The painting task", paintingTask.getTaskName());
    }
}

