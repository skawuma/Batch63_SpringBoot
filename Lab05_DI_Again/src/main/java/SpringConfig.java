import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;





@Configuration
public class SpringConfig {
	
	@Bean
	public Car getCar(){
		
		return new Car();
	}
	@Bean
	public Engine getEngine()
	{
		return new Engine();
	}
}
