package in.co.rays.string;

public class SwapToVar {
	public static void main(String[] args) {
		String fname = "Siddharth";
		String lname = "Jain";
		fname = fname + lname;
		lname = fname.substring(0, fname.length() - lname.length());
		fname=fname.substring(lname.length());
	
		System.out.println(fname+" "+lname);

	}

}
