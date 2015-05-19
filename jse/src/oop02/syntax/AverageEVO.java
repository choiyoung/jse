package oop02.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	public AverageEVO(){}// 디폴트생성자 직접 작성
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
	//getter,setter를 사용하지 않고
	// 생성자로 처리하라
	// 단, avg() tot()은 작성하라
}
