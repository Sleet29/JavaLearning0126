package test;
public class Student2 {
	private String name;
	private int kor, eng, math;
	public static int korTotal;
	public static int engTotal;
	public static int mathTotal;

	int getTotal() {
			return kor + eng + math;
	}
	
	float getAverage() {
		    return Math.round((float)getTotal()/3*10)/10.0f; 
	}	

	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;
	}


	// 학생별 총점을 기준으로 정렬하기
		static void sort(Student2[] students) {
			for(int i=0;i<students.length-1;i++) {
				for (int j=0;j<students.length-1-i;j++) {
					if(students[j].getTotal()<students[j+1].getTotal()) {
						Student2 temp = students[j];
						students[j]= students[j+1];
						students[j+1]=temp;
					}
				}
			}
		}

	public String toString() {
	      return String.format("%s\t%d\t%d\t%d\t%d\t%.1f" ,name,kor,eng,math,getTotal(),getAverage());
	}

}

/*
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
*/