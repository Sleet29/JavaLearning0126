package ex13_1_Object_toString;

class Circle2 {
	int radius;
	Circle2(int radius) {			// 반지름
		this.radius = radius;
	}
	
	public String toString() {
		return "radius=" + radius;
	}
}