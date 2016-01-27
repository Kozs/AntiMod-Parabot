package org.parabot.kozs.antimod;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class AntiMod {

	private ArrayList<String> mods = new ArrayList<String>();
	
	private final ServerType serv;
	
	public boolean compareName(String name) {
		if (mods.contains(name)) {
			return true;
		}
		return false;
	}
	
	public AntiMod(ServerType serverType) {
		this.serv = serverType;
		URL url;
		try {
			url = new URL("http://zachsmith.tech/pbresources/" + serv.getFileName() + ".txt");
			try {
				Scanner s = new Scanner(url.openStream());
				while (s.hasNext()) {
					if (s.hasNext()) {
						mods.add(s.nextLine());
					}
				}
				System.out.println("[AntiMod] " + serv.getName() + " has been loaded.");
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void printNames() {
		for (String s: mods) {
			System.out.println("Mod: " + s);
		}
	}
	
	public ServerType getServ() {
		return serv;
	}
	
	public ArrayList<String> getModList() {
		return mods;
	}

}
