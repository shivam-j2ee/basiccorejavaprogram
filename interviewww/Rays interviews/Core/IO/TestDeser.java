package com.raystech.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeser {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		FileInputStream i = new FileInputStream("D:/C Data/hukumchand_pal.ser");
        ObjectInputStream out = new ObjectInputStream(i);
        
        SerNdDeser d = (SerNdDeser)out.readObject();
		
        System.out.println(d.getName());
        System.out.println(d.getPhysics());
        System.out.println(d.getChemistry());
        System.out.println(d.getMaths());
		System.out.println("Deserialization Success");
				
	}

}
