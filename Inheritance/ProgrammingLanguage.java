package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ProgrammingLanguage {
	private String name;
	private String ideName;
	private boolean openSource;
	private String version;
	public ProgrammingLanguage(String name, String ideName, boolean openSource, String version) {
		super();
		this.name = name;
		this.ideName = ideName;
		this.openSource = openSource;
		this.version = version;
	}
	

}
