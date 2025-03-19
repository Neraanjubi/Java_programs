package Abstraction;

abstract class Animal{    //abstract class
	
abstract void sound();  //abstract method
}
class Dog extends Animal{ //child class
	@Override
	void sound() {
		System.out.println("BOW BOW..!!");
	}
	
}

class Cat extends Animal{ //child class
	@Override
	void sound() {
		System.out.println("Meow Meow...!!");
	}
	
}

public class Abstraction {
	public static void main(String[]args){
		Dog d = new Dog();
		Cat c = new Cat();
		d.sound();
		c.sound();
		
		}
	}

