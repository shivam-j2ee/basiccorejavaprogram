package com.raystech.IO;

import java.io.Serializable;

public class SerNdDeser implements Serializable{

	/**
	 * 
	 */
	/*private static final long serialVersionUID = 1L;*/
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	
	public SerNdDeser(String name,int physics,int chemistry,int maths) {

	      this.name=name;
	      this.physics=physics;
	      this.chemistry=chemistry;
	      this.maths=maths;
	
	}

	public String getName() {
		return name;
	}

	public int getPhysics() {
		return physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public int getMaths() {
		return maths;
	}
	
}
