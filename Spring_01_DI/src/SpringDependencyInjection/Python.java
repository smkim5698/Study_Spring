package SpringDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Python implements Language {
	public String getInfo() {
		return "Python";
	}
}
