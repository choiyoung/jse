package oop01.syntax;

public class AverageD {

	public static void main(String[] args) {
		
		AverageService service = new AverageService();
		String name = "��ũ";
		int kor = 65;
		int eng = 90;
		service.jumsu(name, kor, eng);
	
		
		System.out.println("==="+name+"�� ����ǥ====");
		System.out.println("���� : "+kor+" ��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+service.Tot()+"��");
		System.out.println("��� : "+service.Avg(service.Tot())+"��");
		System.out.println();

	}

}
