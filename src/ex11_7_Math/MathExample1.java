package ex11_7_Math;

class MathExample1 {
	public static void main(String args[]) {
		
		System.out.println("12.45 반올림=> " + Math.round(12.45)); // 12 (정수로 반환)
		System.out.println("124.5 반올림=> " + Math.round(124.5)); // 125
		
		System.out.println("12.45 반올림=> " + (float)Math.round(12.45*10)/10 );
	}
}