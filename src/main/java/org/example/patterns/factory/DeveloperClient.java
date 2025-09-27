package org.example.patterns.factory;

public class DeveloperClient {

    public static void main(String[] args) {
        /* This is called Factory Design Pattern where Factory Class Provide Subclassed Object
         dynamically according to client input*/
        Employee emp = FactoryClass.getEmployeeSalary("Java Developer") ;
        System.out.println("Java Developer :" + emp.salary());

        Employee emp1 = FactoryClass.getEmployeeSalary("Android Developer") ;
        System.out.println("Android Developer :"+emp1.salary());
    }
}
