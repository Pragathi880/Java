package com.xworkz.september.driver;

import com.xworkz.september.things.Accounts;

public class Bank1Runner {
	public static void main(String[] args) {
		Accounts accounts = new Accounts();
		accounts.setName("Canara");
		accounts.setBranch("Huliyar");
		accounts.setIFSECode("IFSENO37544342");
		accounts.setNetBanking(true);

		String name = accounts.getName();
		System.out.println("Name of the branch:"+name);
		String branch = accounts.getIFSECode();
		System.out.println("Branch name of the bank:"+branch);
		String ifseCode = accounts.getIFSECode();
		System.out.println("IFSE CODE:"+ifseCode);
		boolean netBanking = accounts.isNetBanking();
		System.out.println("Is net banking present:"+netBanking);
	}

}
