package in.co.rays.collection;
public class HashCodeAndEquals {
	
	private String name;
	private int age;

	/*
	 * It is assumed that combination of Name and Age will be unique thus key is
	 * made by concatenating Name and Age
	 */

	public HashCodeAndEquals(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		String key = name + age;
		return key.hashCode();
	}

	// Return true only if Name and Age of both objects are equal.
	public boolean equals(Object obj) {
		
		if (obj == null){
			return false;
		}
		if (!(obj instanceof HashCodeAndEquals)){
			return false;
		}
		HashCodeAndEquals rhs = (HashCodeAndEquals) obj;

		if (name.equals(rhs.name) && age == rhs.age) {
			return true;
		} else {
			return false;
		}
 	}

	public static void main(String[] args) {
		HashCodeAndEquals p = new HashCodeAndEquals("aman", 17);
		HashCodeAndEquals r = new HashCodeAndEquals("ram", 20);
		/* p.hashCode(); */
		System.out.println(p.hashCode());
		System.out.println(p.equals(p));
		System.out.println(r.equals(p));
	}
 }