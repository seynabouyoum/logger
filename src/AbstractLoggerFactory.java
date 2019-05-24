
public abstract class AbstractLoggerFactory {
	
			private boolean ecrire;
            public AbstractLoggerFactory(boolean ecrire)
            {
            			this.ecrire=ecrire;
	        }

	        public boolean getEcrire() 
	        {
	        		return this.ecrire;
	        }

	        public void setEcrire(boolean ecrire) 
	        {
	        		this.ecrire = ecrire;
	        }
	
	        public abstract ILogger createLogger();
	

}
