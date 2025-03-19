//Polymorphism in java:
package polymorpssm;

//compile time polym(method overloading)

//public class Main {
//	public static int add(int a,int b) {
//		return a+b;
////		System.out.println("Addition:"+(a+b));
//		
//	}
//	public static void add(String a,String b) {
//		System.out.println("Addition:"+(a+b));
//	}
//	public static void main(String[] args) {
//		System.out.println(add(10,20));
//		//add(100,200);
//	}
//
//}

//Runtime polymorphism (method overriding)
//package my_package;
class Poly{
	public void poly_method() {
			System.out.println("Parent Method");
	}
}
class Poly_Child extends Poly{
	public void poly_method() {
		System.out.println("Child Method");
	}
}
public class Main{
	public static void main(String[]args) {
		Poly_Child p = new Poly_Child();
		p.poly_method();
	}
}

//diifrnc of method ovrridng  and ovrloading  //impt MSE