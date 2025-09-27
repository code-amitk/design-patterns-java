package org.example.patterns.factory;

public class FactoryClass {

      public static Employee getEmployeeSalary(String developer){
       return  switch (developer) {
              case "Android Developer" -> new AndroidDeveloper();
              case "Java Developer" -> new JavaDeveloper();
           default -> throw new IllegalStateException("Unexpected value: " + developer);
       };
      }
}
