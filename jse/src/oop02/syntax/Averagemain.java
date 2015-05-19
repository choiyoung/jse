package oop02.syntax;

public class Averagemain {
	
	public static void main(String[] args) {
		AverageVO hulk = new AverageVO();
		hulk.setName("ÇæÅ©");
		hulk.setKor(60);
		hulk.setEng(55);
		
		System.out.println("==="+hulk.getName()+"ÀÇ ¼ºÀûÇ¥====");
		System.out.println("±¹¾î : "+hulk.getKor()+" Á¡");
		System.out.println("¿µ¾î : "+hulk.getEng()+"Á¡");
		System.out.println("ÃÑÁ¡ : "+hulk.tot()+"Á¡");
		System.out.println("Æò±Õ : "+hulk.avg(hulk.tot())+"Á¡");
		System.out.println();
	}

}
