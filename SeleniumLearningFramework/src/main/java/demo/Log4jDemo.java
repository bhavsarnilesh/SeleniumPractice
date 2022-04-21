package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		
		System.out.println("\n Hello Java \n");
		logger.trace("This is trace Message");
		logger.info("This info Message");
		logger.error("This is Error Message");
		logger.warn("This is warning meMessagessage");
		logger.fatal("This is fatal Message");
		
	}

}
