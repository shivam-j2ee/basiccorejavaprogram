package Basic;

public class Harmonic {
public static void main(String[] args) {
	/*int n=4;
	float f=1;
	String s="1";
	
	for(int i=1;i<=n;i++) {
		f=f+(float)1/n;
		s=s+"+(1/"+i+")";
	}
	System.out.println(s+"="+f);*/
	
	
	
	int num=6,i=1;
	int n=1,sum=0;
	
	while(i<=num) {
		System.out.println(n+"/"+i+"+");
		sum=sum+n/i;
		i++;
	}System.out.println(sum);
	}
}

