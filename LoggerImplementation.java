package org.xyz;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class LoggerImplementation {
	
	private Logger logger;
	
	public LoggerImplementation(Class clazz) {
		LoggerContext context = (LoggerContext) LogManager.getContext(false);
		try {
			context.setConfigLocation(new URI("../conf/log4j2.xml"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		this.logger = LogManager.getLogger(clazz);
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
}
