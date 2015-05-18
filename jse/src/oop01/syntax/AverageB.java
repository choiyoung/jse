package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	//메소드를 여기에 정의해서
	//메소드의 객체화를 하여라.
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

		
		hulk.name="헐크";
		hulk.kor = 100;
		hulk.eng = 70;
		

		// tot, avg 지역변수를 선언하고
		// 아래와 같이 출력되도록 하라.
		System.out.println("==="+hulk.name+"의 성적표====");
		System.out.println("국어 : "+hulk.kor+" 점");
		System.out.println("영어 : "+hulk.eng+"점");
		System.out.println("총점 : "+hulk.tot()+"점");
		System.out.println("평균 : "+hulk.avg(hulk.tot())+"점");
		System.out.println();
		
	

	}

	


}
