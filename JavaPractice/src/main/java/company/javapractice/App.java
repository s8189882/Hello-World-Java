package company.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class)
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOG.debug(message + "Will be printed on Debug");
        LOG.info(message + "Will be printed on Info");
        LOG.warn(message + "Will be printed on Warn");
        LOG.error(message + "Will be printed on Error");
        LOG.fatal(message + "Will be printed on Fatal");
        LOG.info("Appending string: {}.", message);
        System.out.println(message);

    }
}
