package oop02.syntax;

public class AverageE {

	public static void main(String[] args) {
		AverageEVO evo = new AverageEVO();
		String name="��ũ";
		int kor = 65;
		int eng = 90;
		evo.AverageEVO(name, kor, eng);
		System.out.println("==="+name+"�� ����ǥ====");
		System.out.println("���� : "+kor+" ��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+evo.Tot()+"��");
		System.out.println("��� : "+evo.Avg(evo.Tot())+"��");
		System.out.println();
	}
}
