package singleton;

public class Client {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        Singleton instance4 = Singleton.getInstance();

        System.out.println("Connection count : "+instance1.getConnectionCount());
        System.out.println("Connection count : "+instance2.getConnectionCount());
        System.out.println("Connection count : "+instance3.getConnectionCount());
        System.out.println("Connection count : "+instance4.getConnectionCount());

    }
}
