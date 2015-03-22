package com.burrosoft.weblogic.model;

public class Server {
	
	Domain domain;
	Cluster cluster;
	
	static String defaultMSName = "ms";
	static String defaultAdminName = "AdminServer";
	static int defaultAdminPort = 7001;
	static int defaultMSPort = 8001;
	
	
	String name;
	boolean isAdmin = false;
	int listenPort;
	String listenAddress;
	public static String getDefaultMSName() {
		return defaultMSName;
	}
	public static void setDefaultMSName(String defaultMSName) {
		Server.defaultMSName = defaultMSName;
	}
	public static String getDefaultAdminName() {
		return defaultAdminName;
	}
	public static void setDefaultAdminName(String defaultAdminName) {
		Server.defaultAdminName = defaultAdminName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getListenPort() {
		return listenPort;
	}
	public void setListenPort(int listenPort) {
		this.listenPort = listenPort;
	}
	public String getListenAddress() {
		return listenAddress;
	}
	public void setListenAddress(String listenAddress) {
		this.listenAddress = listenAddress;
	}
	
	
	
	public void setDefaults() {
		if (isAdmin()) {
			setName(getDefaultAdminName());
			setListenPort(defaultAdminPort);
		}
		else {
			setName(getDefaultMSName());
			setListenPort(defaultMSPort);
		}
	}

}
