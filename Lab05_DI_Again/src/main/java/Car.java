import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	private Engine engine;//Dependency
	
	
	
public Engine getEngine() {
		return engine;
	}


@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}



public void letsGo() {

	engine.startEngine();
	System.out.println("We started our Journey ");
	System.out.println("we are travelling");
	System.out.println("we reached Our destination");
	engine.stopEngine();
}

}
