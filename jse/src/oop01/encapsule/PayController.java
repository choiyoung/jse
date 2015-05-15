package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	
	public static void main(String[] args) {
		
		PayService service = new PayService();
		Scanner scanner = new Scanner(System.in);
		
		/*
		 공식...
		 income = salary - salary*TAX; 
		 static final double TAX = 0.1;
		 PayVO : get,set
		 PayService : 계산 로직
		 PayController  : 입출력
		 로 분할
		 이름과 급여는 입력받아서
		 세율 뺀 실 소득을 구하는 로직입니다.
		 */
		System.out.print("이름을 입력해주세요 : ");
		String name = scanner.nextLine();
		System.out.print("급여을 입력해주세요 : ");
		int salary = scanner.nextInt();
	
		
		System.out.println("===== 급여내역 ====");
		System.out.println(name+"님의");
		System.out.println("급여: " + salary);
		System.out.println("세금 : " +service.Tax());			
		System.out.println("실수령액 : "+service.Incom(name, salary));
	

	}

}
