package LooseCoupling;

public class Programmer {

	// 느슨한 결합 : Language 인터페이스를 만들어 자료형으로 사용함.

	// 1. 타입 의존성 제거
	private Language language;

	// 2. 객체생성 의존성 제거
	// Java에 대한 객체생성 의존성을 Programmer에서 Test로 변경
	// (의존관계 역전, 제어의 역전)
	public Programmer(Language language) {
		this.language = language;
	}

	public void programming() {
		System.out.println("Loose Coupling");
		System.out.println("Programming using " + language.getInfo());
	}
}
