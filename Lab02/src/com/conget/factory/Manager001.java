package com.conget.factory;

public class Manager001 {
	public static void main(String[] args) {
		
		
		
		
		String channel ="mobile";
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.getTheNotification(channel);
	notification.notifyUser();
	}

}
