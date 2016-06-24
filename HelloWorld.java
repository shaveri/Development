public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

		//atm changes
		private static SessionFactory defaultSessionFactory;
		private static Configuration defaultHibernateConfiguration;
		File hbConfFile = new File(hbConfig);	    		

		//core changes
		DOMConfigurator.configure( pRoot + "/abc-bo/test/data/log4j.xml");
		String  hbConfig = pRoot + "/abc-bo/test/data/hibernate.cfg.xml";    // configure HB

    }
}
