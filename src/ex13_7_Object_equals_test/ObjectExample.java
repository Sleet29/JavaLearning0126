/*
object클래스에 정의된 toString()은 인스턴스에 대한 정보를
문자열(String)로 제공할 목적으로 정의한 것입니다.
클래스 작성할 때 toSring()을 오버라이딩 하지 않으면 아래와 같이
정의된 내용이 그대로 사용될 것입니다.

public String toString(){
return getClass().getName() + "@" + Integer.toHexString(hashCode());
}

- getClass()메소드와 hashCode()메소드 역시 object클래스의 메소드이므로 호출할 수 있습니다.
  해시 코드는 인스턴스의 주소와 관련된 값입니다.
- hashCode()메서드는 해싱(hashing) 기법에 사용되는 해시함수(hash function)를 구현한 것입니다.
  (1) 해싱은 키를 이용해서 해시 테이블로 부터 데이터를 가져오는 과정으로
	  데이터 관리 기법 중의 하나로 다량의 데이터를 저장하고 검색하는 데 유용합니다.
  (2) 해시함수는 찾고자하는 값을 입력하면 그 값이 저장된 위치를 알려주는 해시코드를 반환합니다.
  (3) 해시테이블이란 키를 입력받아 해쉬 함수를 통해 얻은 해시코드에 대응하는 배열의 위치를 찾아 
  	  데이터에 접근하는 자료구조입니다.
 - Circle 인스턴스 두 개를 생성한 다음 각 인스턴스에 toString()을 호출한 결과를 출력했습니다.
   Circle 클래스에서 Object 클래스로부터 상속받은 toString()을
   오버라이딩 하지 않았기 때문에 Circle 인스턴스에 toString()을 호출하면
   Object 클래스의 toString()이 호출됩니다.
 */

package ex13_7_Object_equals_test;

class ObjectExample {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(10,30);
		Rectangle r2 = new Rectangle(10,30);
		
		
		System.out.println(r1);
		System.out.println(r2);
		
		//System.out.println(obj1.toString());
		//System.out.println(obj2.toString());
		
		if(r1==r2)
			System.out.println("r1==r2 같음");
		else
			System.out.println("r1!=r2 다름");
		
		if(r1.equals(r2))
			System.out.println("r1.equals(r2) 같음");
		else
			System.out.println("r1.equals(r2) 다름");
		/*
		if(obj1.equals(obj2))
			System.out.println("obj1.equals(obj2) : 같음");
		else
			System.out.println("obj1.equals(obj2) : 다름");

		
		if(obj1==obj2)
			System.out.println("obj1==obj2 : 같음");
		else
			System.out.println("obj1==obj2 : 다름");
		 */
		// 서로 각각의 주소를 가지니 :다름
		
	}

}
