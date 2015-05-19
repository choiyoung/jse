package oop02.syntax;

public class AverageD {

	public static void main(String[] args) {
		
		AverageService service = new AverageService();
		String name = "ÇæÅ©";
		int kor = 65;
		int eng = 90;
		service.jumsu(name, kor, eng);
	
		
		System.out.println("==="+name+"ÀÇ ¼ºÀûÇ¥====");
		System.out.println("±¹¾î : "+kor+" Á¡");
		System.out.println("¿µ¾î : "+eng+"Á¡");
		System.out.println("ÃÑÁ¡ : "+service.Tot()+"Á¡");
		System.out.println("Æò±Õ : "+service.Avg(service.Tot())+"Á¡");
		System.out.println();

	}

}
