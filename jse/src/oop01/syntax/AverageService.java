package oop01.syntax;

public class AverageService {
	
	AverageDVO vo = new AverageDVO();
	public void jumsu(String name, int kor,int eng){
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
	}
	
	public int Tot(){		
		return vo.getKor()+vo.getEng();
	}
	public double Avg(int tot){
		double avg;
		return avg = tot/2.0; 
	}
}
