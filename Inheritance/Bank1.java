package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Bank1 {
	private String name;
	private String branch;
	private String iFSECode;
	private boolean netBanking;
	public Bank1(String name, String branch, String iFSECode, boolean netBanking) {
		super();
		this.name = name;
		this.branch = branch;
		this.iFSECode = iFSECode;
		this.netBanking = netBanking;
	}

}
