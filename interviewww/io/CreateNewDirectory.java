package com.raystech.core.io;

import java.io.File;
import java.io.IOException;

public class CreateNewDirectory {

	public static void main(String[] args) throws IOException {
		File theDir = new File("F:/New Folder 3333");

		// if the directory does not exist, create it
		if (!theDir.exists()) {
		    System.out.println("creating directory: " + theDir.getName());
		    boolean result = false;

		    try{
		        theDir.mkdir();
		        result = true;
		    } 
		    catch(SecurityException se){
		        //handle it
		    }        
		    if(result) {    
		        System.out.println("DIR created");  
		    }}}}