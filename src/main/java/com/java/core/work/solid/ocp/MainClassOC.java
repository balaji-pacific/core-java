/**
 * 
 */
package com.java.core.work.solid.ocp;

/**
 * @author balajisoundarrajan
 *
 */
public class MainClassOC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NotificationService notificationService = new NotificationService();
		notificationService.sendOTP("EMAIL");
		notificationService.sendWhatsAppNotification();

	}

}
