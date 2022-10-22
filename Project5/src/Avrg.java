import java.util.Scanner;
public class Avrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;// 입력된 정수 저장할 변수
		
		double sum = 0;
		int count = 0; // 입력된 수의 개수
		System.out.print("정수를 입력하고 마지막에 0을 입력하세요.");
		
		while((n=s.nextInt())!=0) {
			sum += n;
			count++;
		}
		System.out.println("수의 개수는 " + count + " 입니다.");
		System.out.println("평균은 " + (double) sum/count + " 입니다.");
		s.close();
	}

}
