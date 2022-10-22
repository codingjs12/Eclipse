import java.util.Scanner;

public class Twenties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이를 입력하십시오:");
		int age=s.nextInt();
		
		if (age < 30 && age >= 20)
		System.out.println("20대입니다.");
		else
			System.out.println("20대가 아닙니다.");
		s.close();
	}

}
