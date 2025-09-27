package org.example.patterns.singleton;

public class SingletonMethodCall {

    public static void main(String[] args) {
        Object obj1= SingletonNotThreadSafe.getSingletonInstance();
        System.out.println("First Call Obj1"+ " "+ obj1.hashCode());
        Object obj2= SingletonNotThreadSafe.getSingletonInstance();
        System.out.println("First Call Obj2"+ " "+ obj2.hashCode());

        if (obj1.hashCode() == obj2.hashCode()){
            System.out.println("Singleton Successfully achieved");
        } else {
            throw new RuntimeException("Failure of Singleton Approach");
        }
    }
}
