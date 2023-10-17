package com.xworkz.september.things;

public class WhatsApp {
	public static void chat() {
		System.out.println("Chats in the WhatsApp:");
	}
	public static void chat(String voiceMessage) {
		System.out.println("Chats in the WhatsApp:"+voiceMessage);
	}
	public static void chat(int numberOfDays,String voiceMessage )  {
		System.out.println("Chats in the WhatsApp:"+numberOfDays+ "   "+voiceMessage);
	}
	public static void chat(String voiceMessage ,int numberOfDays,float time) {
		System.out.println("Chats in the WhatsApp:"+voiceMessage+ "  "+ numberOfDays+"  "+time);
	}
	public static void chat(int numberOfDays,String to,String from) {
		System.out.println("Chats in the WhatsApp:"+numberOfDays+"  "+to+"  "+from);
	}
	public static void chat(float time,int numberOfDays,String to) {
		System.out.println("Chats in the WhatsApp:"+time+"  "+numberOfDays+"  "+to);
	}
	public static void chat(String from,float time,int numberOfDays) {
		System.out.println("Chats in the WhatsApp:"+from+ "  "+time+ "  " +numberOfDays);
	}
	public static void chat(int numberOfDays,String from,float time) {
		System.out.println("Chats in the WhatsApp:"+numberOfDays+"  "+from+"  "+time);
	}
	public static void chat(String to ,float time,boolean messageSent) {
		System.out.println("Chats in the WhatsApp:"+to+"  "+time+"  "+messageSent);
	}
	public static void chat(boolean messageReceived,float time) {
		System.out.println("Chats in the WhatsApp:"+messageReceived+"  "+time);
	}
	public static void chat(boolean messageSent,int numberOfDays,float time, String to,boolean messageReceived,String from) {
		System.out.println("Chats in the WhatsApp:"+messageSent+"  "+numberOfDays+"  "+time+"  "+to+"  "+messageReceived+"  "+from);
	}
	
	


}
