package ex13_7_Object_equals_test;

class Circle2 {
	int radius;
	Circle2(int radius) {			// 반지름
		this.radius = radius;
	}
	
	public String toString() {
		return "radius=" + radius;
	}
	
	// obj 가 Object 타입이므로 radius를 참조하기 위해서 Circle2 타입으로 형변환이 필요
	public boolean equals(Object obj) {
	// obj 클래스에는 radius가 없으므로 (업캐스팅된) obj에서 다운캐스팅 해줘야한다.
	
	/*
	 1. obj가 null이 아니고 obj를 Circle2로 형변환 가능한지 체크합니다.
	 2. 조건을 만족하면 obj를 Circle2로 형변환하고
	 	형변환한 obj의 radius 값과 현재 객체의 radius값을 비교해서 같으면
	 	true를 아니면 false를 리턴합니다.
	 	
	 3. 1번 조건을 만족하지 않으면 false 리턴합니다.
	 */
		
	if(obj instanceof Circle2 && obj != null) {
		Circle2 OtherCircle = (Circle2) obj;
		return this.radius == OtherCircle.radius;
	} else {
		return false;
	}
	}
}
