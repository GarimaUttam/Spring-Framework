package com.example.autowire.type;

public class Car {
<<<<<<< HEAD
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
=======
    private Specification specification1;

    public void setSpecification1(Specification specification) {
        this.specification1 = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: " + specification1.toString());
>>>>>>> 6580bd9 (autowiring by type)
    }
}
