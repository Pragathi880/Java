package com.xworkz.september.driver;

import com.xworkz.september.things.OS;

public class OsRunner {
	public static void main(String args[]) {
		OS.getVersion();
		OS.getOsInformation(8.0f, "windows");
		OS.getVersion();
		System.out.println("Os version:"+OS.getVersion());
	}

}
