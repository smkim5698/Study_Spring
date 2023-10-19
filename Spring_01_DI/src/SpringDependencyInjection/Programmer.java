package SpringDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("p")

// 1. @Component : Bean 생성 및 설정.
// 객체를 생성할 대상 클래스에 작성해주는 Annotation.
// 생성되는 Bean의 이름은 클래스의 첫 글자를 소문자로 바꾼 것이다.
// @Component(value="bean-name")으로 이름 지정 가능 (여기서 기본값은 'programmer')

public class Programmer {

	private Language language;

	@Autowired

	// 2. @Autowired : 의존성 주입.
	// 의존성을 주입할 대상에 작성해주는 Annotation.
	// 작성 가능 위치는 생성자, 설정자, 필드.

	public Programmer(@Qualifier("python") Language language) {
		this.language = language;
	}

	// 3. @Qualifier
	// 같은 타입이 여러 개일 경우 Bean을 지정하여 식별 가능하도록 해주는 Annotation.

	public void programming() {
		System.out.println("Spring Dependency Injection");
		System.out.println("Programming using " + language.getInfo());
	}
}
