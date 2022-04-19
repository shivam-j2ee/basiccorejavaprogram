package in.co.rays.oop;
/*a inner class declared without a class name is known as anonymous inner class.
in case of anonymous inner classes,we declared and instantiate them at the same time.
*/

interface Draw{
	public int add();
}
public class EnumClass {

	/*public int add(){
		System.out.println(10+5);
		return 0;*/
	
	public static void main(String[] args) {
		
		Draw d = new Draw() {
			
 			public int add() {
				System.out.println(10+1);
				return 0;
			}
		};
		d.add(); 
		}
	}

