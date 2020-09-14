package EthToolboX;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * @author oHFkNo
 *
 */
public class main {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void initialization(String[] args) throws IOException {
		
		
		String ETproj = "Ethereum Toolbox v";
		int ver = 0;
		System.out.println("Welcome to " + ETproj + ver );
		if (ver < 1) {
		System.out.println("This is the author's pre-release development enviroment.");
		}
		else { 
		System.out.println("Even though this c0de has been released in the wild,");
		System.out.println("This thing is experimental, and you can lose money fast if you dont monitor it.");
		}
		System.out.println("Proceed at your own risk!!");
		System.out.println("");
		main.initconfig(args);
		}

	
	   public static void initconfig(String args[]) throws IOException {
	      Properties prop = readPropertiesFile("config.properties");
		   // ~The Username/Password are just being used for 
		   // ~testing purposes. The final configuration settings
		   // ~Will be things like wallet.address, wallet.key, and whatever
	      System.out.println("username: "+ prop.getProperty("username"));
	      System.out.println("password: "+ prop.getProperty("password"));
	   }
	   public static Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
	}
