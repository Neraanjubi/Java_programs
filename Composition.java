//using parent class we cn create using another differt class
//Q....the objct is able to creae
//inhertance has IS relationship
//composition has HAS relationship
package composition;

class Engine{       //parent1 class
	void start() {
		System.out.println("Engine is starting..");
	}
	
}
class Car {       //child class
	Engine e = new Engine();
	
	void stop() {
		System.out.println("Engine is stoping...");
		e.start();
	}
}
class Moving{   
	Car c = new Car();
	void move() {
		System.out.println("Car is moving");
		c.stop();
	}
	
}
public class Composition {
	public static void main(String[] args) {
		Moving m = new Moving();
		m.move();
	
		
	}

}


