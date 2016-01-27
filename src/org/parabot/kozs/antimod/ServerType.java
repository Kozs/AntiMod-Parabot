package org.parabot.kozs.antimod;

public enum ServerType {
	PKHONOR("pkhmods", "PKHonor"),
	NEARREALITY("nrmods", "Near Reality"),
	GRINDERSCAPE("gsmods", "GrinderScape"),
	RUNIQUE("runiquemods", "Runique"),
	ZAMORAK("zammods", "Zamorak");
	
	private String fileName;

	private String name;
	
	private ServerType(String serverURL, String serverName) {
		this.fileName = serverURL;
		this.name = serverName;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFileName() {
		return fileName;
	}
    
}
