package in.co.rays.io;

import java.io.Serializable;

public class StudentSerializable implements Serializable{
	
	/**
	 * 
	 */
		private String name;
	private transient String value;

	public StudentSerializable(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}
	
}
