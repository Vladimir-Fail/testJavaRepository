package ru.mpei.fail.threat;

import java.util.HashSet;
import java.util.Objects;

public class Phone {
    /* задача из какого cайта на ооп */
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
        weight = 100;
    }
    
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    
    public Phone(){
        number = "11111111111";
        model = "Китайская поделка";
        weight = 100;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void receiveCal(String name){
        System.out.println("Звонок от: " + name);
    }
    
    public void receiveCal(String name, String number){
        System.out.println("Звонок от: " + name +"\nномер: "+ number);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return weight == phone.weight && Objects.equals(number, phone.number) && Objects.equals(model, phone.model);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }
}
