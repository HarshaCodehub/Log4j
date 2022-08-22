package beta;
import org.apache.logging.log4j.*;

public class Demo1 {
	private static Logger log=  LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				log.debug("im debugging");
				log.info("its present");
				log.error("its an error");
				log.fatal("its fatal");
			}

	
	}


