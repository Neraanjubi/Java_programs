package Inheritance;

class Animal{    //parent or super or derived class
	 public	void Animal_method() {   //PARENT METHOD
		 System.out.println("IAM Animal METHOD");
		 
	 }
	}
	class Dog extends Animal{  //child  or sub class
		public void Dog_method() { //CHILD METHOD
			 System.out.println("IAM Dog METHOD");
	}
	}

	class Cat extends Dog{  //child  or sub class
		public void Cat_method() { //CHILD METHOD
			System.out.println("IAM Cat METHOD");
		}
	}

public class Main2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Animal_method();
		d.Dog_method();
		Cat c = new Cat();
		c.Cat_method();
	}


}
//hieracacly inhertnce
//task applarence (p) 1. bulb ...turn on and  off  2 Tv .....on and off 3 AC ....room cool and and room nt cool
