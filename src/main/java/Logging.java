import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
	public static final Logger logger = LogManager.getLogger(Logger.class.getName());

	public void logger_level(String msg){
		logger.info(msg);
	}


}
