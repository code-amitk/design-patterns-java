package org.example.patterns.singleton;

public class SingletonNotThreadSafe {

    private static SingletonNotThreadSafe singletonClass;

    private SingletonNotThreadSafe() {
    }

    public static SingletonNotThreadSafe getSingletonInstance(){
        if (singletonClass == null) {
            singletonClass = new SingletonNotThreadSafe();
        }
        return singletonClass;
    }
}
