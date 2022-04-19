package Basic.Repeat;

public class FactoryMethod {
	    public static FactoryMethod fm;
	    public static  FactoryMethod getInstance() {
	    	if(fm==null) {
	    		fm=new FactoryMethod ();
	    	}
			return fm;
	    }
	    public static void main(String[] args) {
			FactoryMethod fmethod=fm.getInstance();
			System.out.println(fmethod);
		}
	    
		}
	


