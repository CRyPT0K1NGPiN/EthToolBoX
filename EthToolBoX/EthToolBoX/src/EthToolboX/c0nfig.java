package EthToolboX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class c0nfig {

		   public static void initconfig(String args[]) throws IOException {
				  System.out.println("Loading propertied from src/properties/c0nfig.properties...");
				   
			      Properties prop = readPropertiesFile("C:\\Users\\oHFkNo\\Desktop\\EthToolBoX\\EthToolBoX\\src\\EthToolboX\\properties\\c0nfig.properties");
			      System.out.println("username: "+ prop.getProperty("username"));
			      System.out.println("password: "+ prop.getProperty("password"));
			      
			      String wallet_address = prop.getProperty("wallet.address");
			      if (wallet_address == "YOUR_WALLET_ADDRESS") {
			    	  System.out.println("You still need to configure 'wallet.address' in 'properties/c0nfig.properties'.");
			      }
			      else {
			      System.out.println("Wallet address: " + wallet_address);
			      
			      System.out.println("c0nfig.properties loaded successfully!");
			      }
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
