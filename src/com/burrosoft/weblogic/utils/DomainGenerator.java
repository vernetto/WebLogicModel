package com.burrosoft.weblogic.utils;

import com.burrosoft.weblogic.model.Domain;
import com.burrosoft.weblogic.model.Server;

public class DomainGenerator {
	public Domain generateBasicDomain() {
		Domain domain = new Domain();
		domain.addServer(generateBasicAdmin());
		
		return domain;
	}
	
	
	public Server generateBasicAdmin() {
		Server server = new Server();
		return server;
	}
}
