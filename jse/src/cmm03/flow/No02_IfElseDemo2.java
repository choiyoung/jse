package cmm03.flow;

public class No02_IfElseDemo2 {

	public static void main(String[] args) {
		int kor = 90, eng = 85, sum =0;
		double avg = 0.0;
		String msg = "메세지";
		sum = kor + eng;
		avg = sum/2;
		// 조건에 따라 if 처리
		/*
		   평균이 100점이면 "보너스 지급"
		   평균이 70 이상이면 "시험 합격"
		   평균이 70 미만이면 "재시험을 보세요."		  
		 */
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		if (avg == 100) {
			msg = "보너스가 지급됩니다.";
			System.out.println(msg);
		} else if (avg >= 70) {
			msg = "시험에 합격하셨습니다.";
			System.out.println(msg);
		} else {
			msg = "재시험을 보세요";
			System.out.println(msg);
		}

	}

}
