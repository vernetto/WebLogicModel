package com.burrosoft.weblogic.utils;

import com.burrosoft.weblogic.model.Domain;
import com.burrosoft.weblogic.model.Server;
/**
 * Collection of utility methods to generate basic elements of a Domain
 * @author vernettop
 *
 */

public class DomainGenerator {
	
	/**
	 * Generate a basic domain with all the defaults
	 * @return
	 */
	public Domain generateBasicDomain() {
		Domain domain = new Domain();
		domain.addServer(generateBasicAdmin());
		return domain;
	}
	
	
	/**
	 * Generate default Admin server
	 * @return
	 */
	public Server generateBasicAdmin() {
		Server server = new Server();
		server.setAdmin(true);
		server.setDefaults();
		return server;
	}
}
