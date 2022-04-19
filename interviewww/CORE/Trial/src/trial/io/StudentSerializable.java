package trial.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentSerializable implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private transient String value;

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public StudentSerializable(String name, String value) {
		this.name = name;
		this.value = value;
	}

	// Customize Serialization
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		String evalue = "1234" + value;
		out.writeObject(evalue);

	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		String evalue = (String) in.readObject();
		value = evalue.substring(4);
	}
}
