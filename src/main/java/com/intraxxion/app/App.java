/**
 * Hello world!
 *
 */
package com.intraxxion.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App
{
    // Use SLF4J for logging
    // and logback for logging implementation to logs/app.log
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.info("Hello World!");
        logger.debug("Hello World DBG!");
    }
}



