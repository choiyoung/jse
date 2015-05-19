package oop02.syntax;

public class AverageE {

	public static void main(String[] args) {
		AverageEVO evo = new AverageEVO();
		String name="ÇæÅ©";
		int kor = 65;
		int eng = 90;
		evo.AverageEVO(name, kor, eng);
		System.out.println("==="+name+"ÀÇ ¼ºÀûÇ¥====");
		System.out.println("±¹¾î : "+kor+" Á¡");
		System.out.println("¿µ¾î : "+eng+"Á¡");
		System.out.println("ÃÑÁ¡ : "+evo.Tot()+"Á¡");
		System.out.println("Æò±Õ : "+evo.Avg(evo.Tot())+"Á¡");
		System.out.println();
	}
}
