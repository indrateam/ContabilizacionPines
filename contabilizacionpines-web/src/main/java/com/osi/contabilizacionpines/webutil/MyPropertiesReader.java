package com.osi.contabilizacionpines.webutil;

import org.jboss.seam.core.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropertiesReader {

	private ResourceLoader resourceLoader;

	public MyPropertiesReader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	public String readProperty(String propertyName) {
		Properties properties = new Properties();
		InputStream inputStream = resourceLoader
				.getResourceAsStream("app.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(propertyName);
	}
}
