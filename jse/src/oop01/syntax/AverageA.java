package oop01.syntax;

public class AverageA {
	private String name;
	private int kor;
	private int eng;
	
	public static void main(String[] args) {
		
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA thor = new AverageA();
		
		hulk.name="헐크";
		hulk.kor = 100;
		hulk.eng = 70;
		int tot1=hulk.kor+hulk.eng;
		double avg1=tot1/2.0;
		iron.name="아이언";
		iron.kor = 50;
		iron.eng = 100;
		int tot2=iron.kor+iron.eng;
		double avg2=tot2/2.0;
		thor.name="토르";
		thor.kor = 60;
		thor.eng = 75;
		int tot3=thor.kor+thor.eng;
		double avg3=tot3/2.0;
		// tot, avg 지역변수를 선언하고
		// 아래와 같이 출력되도록 하라.

		System.out.println("==="+hulk.name+"의 성적표====");
		System.out.println("국어 : "+hulk.kor+" 점");
		System.out.println("영어 : "+hulk.eng+"점");
		System.out.println("총점 : "+tot1+"점");
		System.out.println("평균 : "+avg1+"점");
		System.out.println();
		//아이언
		//토르
		System.out.println("==="+iron.name+"의 성적표====");
		System.out.println("국어 : "+iron.kor+" 점");
		System.out.println("영어 : "+iron.eng+"점");
		System.out.println("총점 : "+tot2+"점");
		System.out.println("평균 : "+avg2+"점");
		System.out.println();
		
		System.out.println("==="+thor.name+"의 성적표====");
		System.out.println("국어 : "+thor.kor+" 점");
		System.out.println("영어 : "+thor.eng+"점");
		System.out.println("총점 : "+tot3+"점");
		System.out.println("평균 : "+avg3+"점");
		System.out.println();
	}

}
