package practice.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	    if (System.getProperty("h2.implicitRelativePath") == null) {
	        // keep compatibility with H2 1.3
	        // prevent http://www.h2database.com/javadoc/org/h2/api/ErrorCode.html#c90011
	        System.setProperty("h2.implicitRelativePath", "true");
	    }
		SpringApplication.run(DemoApplication.class, args);
	}
}
