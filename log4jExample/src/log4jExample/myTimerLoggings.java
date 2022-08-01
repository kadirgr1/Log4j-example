package log4jExample;

import org.apache.logging.log4j.*; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class myTimerLoggings {
	
	private static Logger logger = LogManager.getLogger( myTimerLoggings.class.getName());
	
	public static void main(String[] args) throws InterruptedException{
		logger.getLevel();
		while(true) {
			if(logger.getLevel()==Level.DEBUG) {
				LocalDateTime current = LocalDateTime.now();
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		        String formatted = current.format(formatter);
		        System.out.println( formatted);
				Thread.sleep(1000);
			}
			if(logger.getLevel()==Level.WARN) {
				LocalDateTime current = LocalDateTime.now();
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		        String formatted = current.format(formatter);
		        System.out.println( formatted);
		        Thread.sleep(60000 );
			}
			if(logger.getLevel()==Level.ERROR) {
				LocalDateTime current = LocalDateTime.now();
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
		        String formatted = current.format(formatter);
		        System.out.println( formatted);
		        Thread.sleep(3600000);
				
			}
		}
		
	}
}