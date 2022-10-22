import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager {

	
	public static void main(String[] args) {
		//SPRING WAY!!
		 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Car car = context.getBean(Car.class);
		car.letsGo();
		
		/**
		//Java Way
		Engine engine = new Engine();
		Car car = new Car();
		car.setEngine(engine);
		**/
	}
}
