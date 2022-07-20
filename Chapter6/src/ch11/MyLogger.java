package ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

	Logger logger = Logger.getLogger("mylogger");	// mylogger == 식별자 / 식별자 기준으로 매핑 
	private static MyLogger instance = new MyLogger();
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;
	
	private MyLogger() {
		
		try {
			logFile = new FileHandler(errorLog, true);		// filename & true == Uphand
			warningFile = new FileHandler(warningLog, true);
			fineFile = new FileHandler(fineLog, true);
			
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());
		
		// Log Level Setting
		logger.setLevel(Level.ALL);				// severe ~ finest
		fineFile.setLevel(Level.FINE);			// severe ~ fine
		warningFile.setLevel(Level.WARNING);	// severe ~ warning
		
		logger.addHandler(logFile);
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);
		
	}
	
	public static MyLogger getLogger() {
		return instance;
	}
	
	public void log(String msg) {
		
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
		
	}
	
	public void fine(String msg) {
		logger.fine(msg);
	}
	
	public void warning(String msg) {
		logger.warning(msg);
	}
	
}
