/**
 * 
 */
package com.java.core.work.solid.ocp;

/**
 * @author Balaji Soundarrajan
 *
 */
public class NotificationService extends WhatsAppNotification{
	
	public static void sendOTP(String medium) {
		if("SMS".equalsIgnoreCase(medium)) {
			sendsms();
		}else if("EMAIL".equalsIgnoreCase(medium)) {
			sendemail();
		}
	}
	
	public static void sendemail() {
		System.out.println("Sending email logic and configuration");
	}
	
	public static void sendsms() {
		System.out.println("Sending sms logic and configuration");
	}

}
