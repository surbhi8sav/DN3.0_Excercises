import java.io.*;
//class Singleton {
//    // static class
//    private static Singleton instance;
//    private Singleton()
//    {
//        System.out.println("Singleton is Instantiated.");
//    }
class Logger{
    private static volatile Logger obj = null;
    private Logger() {
    	System.out.println("It is an Singleton Logger Instance");
    }

    public static Logger getInstance()
    {
        if (obj == null) {
            // thread safe
            synchronized (Logger.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj == null)
                    obj = new Logger();
            }
        }
        return obj;
    }
    public static void testLogger()
    {
        System.out.println("Testing Singleton pattern");
    }
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger.getInstance().testLogger();
	}

}
