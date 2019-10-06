package singleton;

class Singleton
{ 
    private static Singleton obj; 
    private int count;

    private Singleton() {
        count = 0;
    }
  
    // Only one thread can execute this at a time 
    public static synchronized Singleton getInstance() 
    { 
        if (obj==null) 
            obj = new Singleton(); 
        return obj; 
    }

    public int getConnectionCount(){
        count++;
        return count;
    }
} 