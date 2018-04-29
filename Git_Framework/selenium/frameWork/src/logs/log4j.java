package logs;

import org.apache.log4j.Logger;

public class log4j {
	
	static Logger log=Logger.getLogger(log4j.class);
	
	public static void infologs(String text) {
		
		log.info(text);
	}
	
	public static void errorlogs(Exception e) {
		log.error(e);
		
	}

}
