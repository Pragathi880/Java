package com.xworkz.september.things;

public class Online {
	private String onlineAppName;
	private boolean availableInPlayStore;
	private float rating;
	
	public Online() {
		System.out.println("no-args constructor");
	}
	public Online(String onlineAppName, boolean availableInPlayStore, float rating) {
        System.out.println("all-args constructor");
		this.onlineAppName = onlineAppName;
		this.availableInPlayStore = availableInPlayStore;
		this.rating = rating;
	}
	
	public void setOnlineAppName(String onlineAppName) {
		this.onlineAppName = onlineAppName;
	}
	public String getOnlineAppName() {
		return onlineAppName;
	}
	
	public void setAvailableInPlayStore(boolean availableInPlayStore) {
		this.availableInPlayStore = availableInPlayStore;
	}
	public boolean isAvailableInPlayStore() {
		return availableInPlayStore;
	}
	
	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getRating() {
		return rating;
	}
	
	
	
	
	

}
