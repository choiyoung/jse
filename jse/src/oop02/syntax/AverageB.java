package oop02.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	//�޼ҵ带 ���⿡ �����ؼ�
	//�޼ҵ��� ��üȭ�� �Ͽ���.
	int tot(){
		int tot=kor+eng;
		return tot;
	}
	double avg(int tot){
		double avg=tot/2.0;
		return avg;
	}

	public static void main(String[] args) {
		
		
		AverageB hulk = new AverageB();

		
		hulk.name="��ũ";
		hulk.kor = 100;
		hulk.eng = 70;
		

		// tot, avg ���������� �����ϰ�
		// �Ʒ��� ���� ��µǵ��� �϶�.
		System.out.println("==="+hulk.name+"�� ����ǥ====");
		System.out.println("���� : "+hulk.kor+" ��");
		System.out.println("���� : "+hulk.eng+"��");
		System.out.println("���� : "+hulk.tot()+"��");
		System.out.println("��� : "+hulk.avg(hulk.tot())+"��");
		System.out.println();
		
	

	}

	


}
