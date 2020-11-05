import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class LoggerTest {

	@Test
	@DisplayName("Displays logger levels printed to console from lowest priority to highest ")
	public void loggerLevel() {
		Logger logger = LogManager.getLogger(LoggerTest.class.getName());
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.trace("trace");
		logger.error("error");

	}
}


