package operator;

public class AnotherExample {

	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println(a++);//10
		System.out.println(a++);//11
		System.out.println(a--);//12
		System.out.println(--a);//10
		System.out.println(a--);//10
		System.out.println(++a);//10
		System.out.println(a++);//10
		System.out.println(a--);//11
		System.out.println(a++  +  ++a);//22
		System.out.println(--a  -  ++a);//-1
		
		
	}

}
