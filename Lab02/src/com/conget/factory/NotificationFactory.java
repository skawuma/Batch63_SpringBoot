package com.conget.factory;

public class NotificationFactory {
	
	public Notification getTheNotification(String channel) {
	Notification notification=null;
	
	if (channel.equals("mobile")) {
		notification = new SMSNotification();
	}
	else if( channel.equals("Laptop")) {
		notification = new EmailNotification();
	}
		
		return notification;
	}

}
