package innerclass;

public class oneclass {
	private int a=10;
	
	class Inner
	{
		void display()
		{
			System.out.print("welcome to Inner class");
			System.out.print("lue of a" +a);
		}
	}
}

     public static void main(String[] args) {
    	 oneclass outer=new oneclass();
    	 oneclass.inner=outer.new inner
    			 
    	 
     }