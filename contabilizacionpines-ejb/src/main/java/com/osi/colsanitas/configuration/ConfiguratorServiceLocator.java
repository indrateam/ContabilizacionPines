package com.osi.colsanitas.configuration;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.ConfigurationFactory;

public class ConfiguratorServiceLocator {
	
	//Ruta del archivo config.xml
		private final String CONFIG_NAME_FILE = "config.xml";
		
		//Singleton
		private static ConfiguratorServiceLocator instance; 
		
		//Parte estatica
		static{
			instance = null;
		}
		
		//Objeto con los valores de la propiedades
		private Configuration conf;
		
		/**
		 * Constructor
		 */
		private ConfiguratorServiceLocator(){
			this.lookup();
		}
		
		/** Metodo que carga las propiedades del sistema
		 */
		private void lookup(){
			try {
				ConfigurationFactory factory = new ConfigurationFactory(CONFIG_NAME_FILE);
				conf = factory.getConfiguration();
			} catch (ConfigurationException e) {
				conf = null;
			}
		} 
		
		/** Metodo que retorna el Configuration
		 * 
		 * @return Configuration
		 */
		public synchronized Configuration getConfiguration(){
			return conf;
		}
		
		/**
		 * Metodo que resetea el ConfiguratorServiceLocator
		 */
		public synchronized static void resetConfiguration(){
			if(instance != null){
				instance.finalize();
			}
			
			instance = null;
		}
		

		public synchronized static ConfiguratorServiceLocator getInstance(){
			if(instance == null){
				instance = new ConfiguratorServiceLocator();
			}
			return instance;
		}
		
		/**
		 * Destructor
		 */
		public void finalize(){
			if(this.conf != null){
				this.conf.clear();
			}
			
			this.conf = null;
		}
		
		/** Interface de tipo Inner que contiene las claves de las propiedades del sistema
		 */
		public interface ConfiguratorSystemKeys {
			// Web Service ContratoMP
			public static final String PROP_WS_CONTRATOMP_WSDL_LOCATION = "contabilizacionpines.ws.contratomp.WsdlLocation";
			// Web Service ProxyPersona
			public static final String PROP_WS_PROXYPERSONA_WSDL_LOCATION = "contabilizacionpines.ws.proxypersona.WsdlLocation";
		}
	
}
