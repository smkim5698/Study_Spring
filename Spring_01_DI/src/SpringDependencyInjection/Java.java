package SpringDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Java implements Language {
	public String getInfo() {
		return "Java";
	}
}
