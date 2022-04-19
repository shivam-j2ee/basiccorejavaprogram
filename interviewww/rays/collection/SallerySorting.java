package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SallerySorting implements Comparator<SallerySorting> {

	private int sallery;
	private String name;
	
	public  SallerySorting() {
	}
	
	public SallerySorting(int sallery, String name){
		this.sallery = sallery;
		this.name = name;
	}
	public int getSallery() {
		return sallery;
		
	}public String getName() {
		return name;
		
	}
	@Override
	public String toString() {
		return sallery+" "+name;
	}
	@Override
	public int compare(SallerySorting a, SallerySorting b) {
		// TODO Auto-generated method stub
		return b.sallery-a.sallery;
	}
	
		
		
	}


