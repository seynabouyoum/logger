
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractLoggerFactory factory = new LoggerFactory(true);
		
		ILogger logger = factory.createLogger();
		
		logger.log(Test.class.toString(), "Bonjour");
		logger.log(Test.class.toString(), "tout le");
		logger.log(Test.class.toString(), "monde");
	}

	

}
