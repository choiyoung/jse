package oop02.syntax;

public class AverageA {
	private String name;
	private int kor;
	private int eng;
	
	public static void main(String[] args) {
		
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA thor = new AverageA();
		
		hulk.name="��ũ";
		hulk.kor = 100;
		hulk.eng = 70;
		int tot1=hulk.kor+hulk.eng;
		double avg1=tot1/2.0;
		iron.name="���̾�";
		iron.kor = 50;
		iron.eng = 100;
		int tot2=iron.kor+iron.eng;
		double avg2=tot2/2.0;
		thor.name="�丣";
		thor.kor = 60;
		thor.eng = 75;
		int tot3=thor.kor+thor.eng;
		double avg3=tot3/2.0;
		// tot, avg ���������� �����ϰ�
		// �Ʒ��� ���� ��µǵ��� �϶�.

		System.out.println("==="+hulk.name+"�� ����ǥ====");
		System.out.println("���� : "+hulk.kor+" ��");
		System.out.println("���� : "+hulk.eng+"��");
		System.out.println("���� : "+tot1+"��");
		System.out.println("��� : "+avg1+"��");
		System.out.println();
		//���̾�
		//�丣
		System.out.println("==="+iron.name+"�� ����ǥ====");
		System.out.println("���� : "+iron.kor+" ��");
		System.out.println("���� : "+iron.eng+"��");
		System.out.println("���� : "+tot2+"��");
		System.out.println("��� : "+avg2+"��");
		System.out.println();
		
		System.out.println("==="+thor.name+"�� ����ǥ====");
		System.out.println("���� : "+thor.kor+" ��");
		System.out.println("���� : "+thor.eng+"��");
		System.out.println("���� : "+tot3+"��");
		System.out.println("��� : "+avg3+"��");
		System.out.println();
	}

}
