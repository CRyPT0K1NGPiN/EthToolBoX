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
	public static void main(final String[] args) throws IOException {
		
		//Initialization dialogue
		String ETproj = "Ethereum Toolbox v";
		int ver = 0;
		System.out.println(".Welcome to " + ETproj + ver );
		if (ver < 1) {
		System.out.println("..This is the author's pre-release development enviroment.");
		}
		else { 
		System.out.println(".Even though this c0de has been released in the wild,");
		System.out.println("..This thing is experimental, and you can lose money fast if you dont monitor it.");
		}
		System.out.println(".Proceed at your own risk!!");
		System.out.println("..");
		
		//Loads 'properties/config.properties' file
		c0nfig.initconfig(args);
		}

	}