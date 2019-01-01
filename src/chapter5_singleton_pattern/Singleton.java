package chapter5_singleton_pattern;

//in this chapter, various types of Singleton are discussed.

//classic
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {};

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classic Singleton";
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}

//static:
class Singleton_Static {
    private static Singleton_Static staticInstance = new Singleton_Static();

    private Singleton_Static() {};

    public static Singleton_Static getInstance() {
        return staticInstance;
    }

    public String getDescription() {
        return "I'm a statically initialized singleton";
    }

    public static void main(String[] args) {
        Singleton_Static singleton = Singleton_Static.getInstance();
        System.out.println(singleton.getDescription());
    }
}

//Thread-safe Singleton
class Singleton_ThreadSafe {
    private static Singleton_ThreadSafe uniqueInstance;

    // other useful instance variables here

    private Singleton_ThreadSafe() {}

    public static synchronized Singleton_ThreadSafe getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_ThreadSafe();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }

    //how to test this Thread-safe singleton
    public static void main(String[] args) {

    }
}

//dcl singleton