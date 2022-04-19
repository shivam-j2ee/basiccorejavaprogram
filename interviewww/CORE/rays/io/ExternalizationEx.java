package in.co.rays.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * Transient variable Read and Write and Externalization
*/
public class ExternalizationEx implements Externalizable{
	
	private String name;
	private transient int age;
	public ExternalizationEx()
	{
		
	}
	
	public ExternalizationEx(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(age);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		age = in.readInt();
		
	}

}
