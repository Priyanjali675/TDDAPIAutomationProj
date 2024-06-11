package ReusableMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Properties;

public class Utils {
	public static void loggerFile() throws IOException {

		PrintStream fio = null;
		try {
			fio = new PrintStream(Files.newOutputStream(new File("C:\\Users\\ullas\\eclipse-workspace\\APIAutomation\\PayPalApplicationLogger.txt").toPath()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		System.setOut(fio);	
	}
	public static String loadEnvironmentalProperties(String key) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		FileInputStream fio = new FileInputStream("src\\main\\resources\\env.properties");
		prop.load(fio);
		return prop.getProperty(key);
	}


}
