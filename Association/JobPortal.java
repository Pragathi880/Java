package com.xworkz.september.things;

public class JobPortal {
	private String portalName;
	private boolean appAvailable;
	private float rating;
	private Naukri naukri;
	private Linkdin linkdin;
	
	public JobPortal() {
		System.out.println("No-args constructor");
	}
	public JobPortal(String portalName, boolean appAvailable, float rating, Naukri naukri, Linkdin linkdin) {
		System.out.println("All-args constructor");
		this.portalName = portalName;
		this.appAvailable = appAvailable;
		this.rating = rating;
		this.naukri = naukri;
		this.linkdin = linkdin;
	}
	public String getPortalName() {
		return portalName;
	}
	public void setPortalName(String portalName) {
		this.portalName = portalName;
	}
	public boolean isAppAvailable() {
		return appAvailable;
	}
	public void setAppAvailable(boolean appAvailable) {
		this.appAvailable = appAvailable;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Naukri getNaukri() {
		return naukri;
	}
	public void setNaukri(Naukri naukri) {
		this.naukri = naukri;
	}
	public Linkdin getLinkdin() {
		return linkdin;
	}
	public void setLinkdin(Linkdin linkdin) {
		this.linkdin = linkdin;
	}
	
	

}
