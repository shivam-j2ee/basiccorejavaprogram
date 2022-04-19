package faltu.no.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationEx implements Externalizable {
	
	private String name;
	private transient  int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public ExternalizationEx() {}
	public ExternalizationEx(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
		name=(String)in.readObject();
		age=in.readInt();
	}
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
	}

}
