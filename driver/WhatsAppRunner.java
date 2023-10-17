package com.xworkz.september.driver;

import com.xworkz.september.things.WhatsApp;

public class WhatsAppRunner {
	public static void main(String args[]) {
		WhatsApp.chat();
		WhatsApp.chat("Hii.....This ia Pragathi R");
		WhatsApp.chat(1,"How are you" );
		WhatsApp.chat("I am good", 2, 10.26f);
		WhatsApp.chat(false, 3);
		WhatsApp.chat(0, "What degree are you studying");
		WhatsApp.chat(11.45f , 1, "Hyyyy...I just completed my Engineering");
		WhatsApp.chat(4, "Pragthi", 12.34f);
		WhatsApp.chat(3, "Rahul", "Pragthi");
		WhatsApp.chat("Nidhi", 10.02f, false);
		WhatsApp.chat("Pragthi", 02.34f, 4);
		WhatsApp.chat("ok byee", 2, 01.23f);
		WhatsApp.chat(true, 5, 12.56f, "Rahul", true, "Pragathi");
		
		
	}

}
