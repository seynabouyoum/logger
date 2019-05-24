
public class LoggerFactory extends AbstractLoggerFactory {

	public LoggerFactory(boolean ch) {
		super(ch);
		// TODO Auto-generated constructor stub
	}

	public ILogger createLogger() {
		// TODO Auto-generated method stub
		if(this.getEcrire())
			return new LoggerFichier();
		return new LoggerConsole();
		
	}

}
