package org.parabot.kozs.antimod;

public class TestMain {

	public static void main(String[] args) 
	{
		AntiMod am = new AntiMod(ServerType.PKHONOR);
		System.out.println("------------------------------------------");
		System.out.println("Server Name: " + am.getServ().getName());
	}

}
