package oop02.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	public AverageEVO(){}// ����Ʈ������ ���� �ۼ�
	public void AverageEVO(String name, int kor, int eng){
				this.name = name;
				this.kor = kor;
				this.eng = eng;
			
				
	}

	
	public int Tot(){
		return this.kor+this.eng;
	}
	public double Avg(int Tot){
		return Tot/2.0;
	}
	//getter,setter�� ������� �ʰ�
	// �����ڷ� ó���϶�
	// ��, avg() tot()�� �ۼ��϶�
}
