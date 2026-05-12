package variable;

public class ABC {
      
	   int a = 20;
	   static int b = 50;
	public static void main(String[] args) {

   ABC abc = new ABC();
   System.out.println(abc.a); //20
   System.out.println(abc.b); //50
   
   abc.a= 1000;
   abc.b =2000;
   
   System.out.println(abc.a); //1000
   System.out.println(abc.b); //2000
   
   ABC abc2 = new ABC();
   System.out.println(abc2.a);
   System.out.println(abc2.b);

	}

}
