package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{

    final String taskName;
    final String whatToBuy;
    final double quantity;


   public ShoppingTask(String taskName, String whatToBuy, double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
   }

    @Override
    public String executeTask() {
       return whatToBuy + " " + quantity + "sztuki";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(whatToBuy + " " + quantity + "sztuk" == "bułka 3.0 sztuki");
        return true;
        }

}
