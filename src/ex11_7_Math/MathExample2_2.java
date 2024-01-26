package ex11_7_Math;

// 방법2) Arrays. sort 사용하기
// import java.util.Arrays;

class MathExample2_2 {
	public static void main(String args[]) {
		
		int num;
		int arr[] = new int[6];
		
		for (int i=0;i<arr.length;i++) {
			num = (int) (Math.random()* 45+1);
			arr[i] = num;
			for(int j=0;j<i;j++) {
				if (arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			//System.out.print(arr[i]+"\t");
		}
		
		 // 방법2배열 정렬
        // Arrays.sort(arr);
        
		for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 두 숫자를 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
	}
}
	

/*
		 * 0부터 9까지의 정수 범위에 속하는 난수를 만들기
		 * 1. 0<= 난수 < 1
		 * 2. 0<= 난수*10 < 10
		 * 3. 0<= (int)(난수*10) < 10 ==> 정수로 만들기
		 */
		// 공식 : (정수화)((상한값-하한값+1)*난수 + 하한값)
		// (int)((9-0+1)*난수 + 0)
		
		// 목표 1부터 45까지 정수 범위에 속하는 난수 만들기

		/*
		num = (int) (Math.random()*44+1);
		System.out.print(num+"\t");
		num2 = (int) (Math.random()*44+1);
		System.out.print(num2+"\t");
		num3 = (int) (Math.random()*44+1);
		System.out.print(num3+"\t");
		num4 = (int) (Math.random()*44+1);
		System.out.print(num4+"\t");
		num5 = (int) (Math.random()*44+1);
		System.out.print(num5+"\t");
		num6 = (int) (Math.random()*44+1);
		System.out.print(num6+"\t");
		
		*/

/*
 * package ex11_7_Math;

class MathExample2_2 {
    public static void main(String args[]) {

        int num;
        int arr[] = new int[6];

        // 배열에 무작위 숫자 채우기
        for (int i = 0; i < arr.length; i++) {
            num = (int) (Math.random() * 45 + 1);
            arr[i] = num;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        // 버블 정렬로 배열 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 두 숫자를 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 정렬된 배열 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
 */
		