package oop01.syntax;

public class AverageVO {
	private String name;
	private int kor;
	private int eng;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int tot(){
		int tot;
		return tot = getKor()+getEng();
	}
	public double avg(int tot){
		double avg;
		return avg = tot/2.0; 
	}
}
