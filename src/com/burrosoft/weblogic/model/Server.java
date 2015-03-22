package com.burrosoft.weblogic.model;

public class Server {
	static String defaultMSName = "ms";
	static String defaultAdminName = "AdminServer";
	
	
	String name;
	boolean isAdmin = false;
	int listenPort;
	String listenAddress;

}
