package com.xworkz.september.driver;

import com.xworkz.september.things.Channel1;

public class Television1Runner {
	public static void main(String[] args) {
		Channel1 channel = new Channel1();
		channel.name = "Samsung";
		channel.price = 40 ;
		channel.tVNumber ="RD265234516";
		channel.numOfLanguages = 100;
		channel.nameOfChannel = "ZEE KANNADA";
		channel.channelNumber = 2843;
		System.out.println(channel.name);
		System.out.println(channel.price);
		System.out.println(channel.tVNumber);
		System.out.println(channel.numOfLanguages);
		System.out.println(channel.nameOfChannel);
		System.out.println(channel.channelNumber);
	}

}
