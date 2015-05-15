package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	
	public static void main(String[] args) {
		
		PayService service = new PayService();
		Scanner scanner = new Scanner(System.in);
		
		/*
		 ����...
		 income = salary - salary*TAX; 
		 static final double TAX = 0.1;
		 PayVO : get,set
		 PayService : ��� ����
		 PayController  : �����
		 �� ����
		 �̸��� �޿��� �Է¹޾Ƽ�
		 ���� �� �� �ҵ��� ���ϴ� �����Դϴ�.
		 */
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = scanner.nextLine();
		System.out.print("�޿��� �Է����ּ��� : ");
		int salary = scanner.nextInt();
	
		
		System.out.println("===== �޿����� ====");
		System.out.println(name+"����");
		System.out.println("�޿�: " + salary);
		System.out.println("���� : " +service.Tax());			
		System.out.println("�Ǽ��ɾ� : "+service.Incom(name, salary));
	

	}

}
