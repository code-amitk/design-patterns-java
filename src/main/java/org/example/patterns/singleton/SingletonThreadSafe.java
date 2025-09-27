package org.example.patterns.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe() {}

 synchronized static SingletonThreadSafe getThreadSafeInstance() {
        if(singletonThreadSafe == null){
            System.out.println("New Instance Created");
            singletonThreadSafe = new SingletonThreadSafe();
        }
     return singletonThreadSafe;
 }
}
