import org.apache.log4j.Logger;

public class Logging {
	public static final Logger logger = Logger.getLogger(Logger.class);

	public void logger_level(String msg){
		logger.info(msg);
	}

	public static Logger getLogger() {
		return logger;
	}
}
