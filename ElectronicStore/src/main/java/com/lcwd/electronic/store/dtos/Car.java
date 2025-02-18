package com.lcwd.electronic.store.dtos;

public class Car {
    private String model;
    public Car(String model){
        this.model=model;
    }
    public  void drive(){
       System.out.println("Driving a :"+model);
    }
}
