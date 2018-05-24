package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "Shopping Task";
    public static final String DRIVINGTASK= "Driving Task";
    public static final String PAINTINGTASK = "Painting Task";


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("The shopping task", "apple", 3.0);
            case DRIVINGTASK:
                return new DrivingTask("The driving task", "New York", "plain");
            case PAINTINGTASK:
                return new PaintingTask("The painting task", "blue", "Sea");
            default:
                return null;
        }

    }
}

