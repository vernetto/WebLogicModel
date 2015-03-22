package com.burrosoft.weblogic.model;

public class Domain {
	String domainName;
	ServerList serverList;
	public void addServer(Server server) {
		serverList.add(server);
	}
	

}
