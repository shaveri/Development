public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
		//core changes
		private static Log log = LogFactory.getLog(HelloWorld.class);
        String root = System.getProperty("user.dir");		
    }
}
