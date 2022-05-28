package Class;

public abstract class Day8 {
	
	public void m1() {
		System.out.println("ff");
	}
	abstract void m2();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("a = "+a);
		System.out.println("b= "+b);
		System.out.println("sum= "+a+b);
		System.out.println(a+b+"= sum");
		System.out.println(a+b+"= sum"+a+b);

		Day8 obj = new Day8() {
			};
			obj.m1();
		
	}

}
