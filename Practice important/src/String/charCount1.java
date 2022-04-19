package String;

public class charCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "jai shree mahankal";
		int count =0;
		
		for(int i=0 ; i<s.length();i++){
			s.charAt(i);
			count=0;
			if(!s.substring(0, i).contains(s.charAt(i)+"")){
			for(int j=0;j<s.length();j++){
				s.charAt(j);
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}
			System.out.println("The Character "+s.charAt(i)+" Occurse "+count+ "times");
			}
		}

	}

}
