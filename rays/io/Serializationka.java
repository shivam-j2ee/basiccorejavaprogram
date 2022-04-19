package in.co.rays.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//object to byte
public class Serializationka implements Serializable {
	String name=null;
	int maths=0;
	int phy=0;
	int total=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaths() {
		
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getTotal() {
		total=maths+phy;
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public static void main(String[] args) throws IOException, IOException {
		FileOutputStream fm=new FileOutputStream("C:/Users/admin/Desktop/a.txt");
		ObjectOutputStream out=new ObjectOutputStream(fm);
		Serializationka ka=new Serializationka();
		ka.setName("Aman");
		ka.setMaths(80);
		ka.setPhy(80);
	
		out.writeObject(ka);
	} 

}