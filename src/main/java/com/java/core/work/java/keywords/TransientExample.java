/**
 * 
 */
package com.java.core.work.java.keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Balaji Soundarrajan
 *
 */
public class TransientExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String filename = "Student.ser";
		serializeObject(filename);
		deSerializeOject(filename);

	}
	
	public static void serializeObject(String filename) {
		try {
			ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream(new File(filename)));
			fos.writeObject(new Student("Balaji", "Pass@123", 38, "balajisn"));
			System.out.println("Object Serialized");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void deSerializeOject(String filename) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)));
			Student student = (Student)(ois.readObject());
			System.out.println(student);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
