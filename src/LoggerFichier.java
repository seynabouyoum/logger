import java.io.FileWriter;
import java.io.PrintWriter;

public class LoggerFichier implements ILogger {

	@Override
	public void log(String c, String i) {
		// TODO Auto-generated method stub
		try {
			PrintWriter fichier = new PrintWriter(new FileWriter("projetfab.txt" , true));
			fichier.append(c + " : " + i + "\n");
			fichier.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
