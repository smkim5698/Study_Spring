package TightCoupling;

public class Programmer {

	// ClassA 객체가 어떤 일을 처리하기 위해서 
	// ClassB 객체의 도움을 받아야 일을 처리할 수 있다면
	// “ClassA는 ClassB에 의존한다.” 라고 표현

	// 강한 결합 : Java, Python 클래스에 의존적임.
	// 여기서는 Programmer가 Desktop 클래스에 의존성을 가지고 있음.

	// 1. 타입 의존성
	private Java language;

	// 2. 객체 생성 의존성
	public Programmer() {
		language = new Java();
	}

	public void programming() {
		System.out.println("Tight Coupling");
		System.out.println("Programming using " + language.getInfo());
	}
}
