package oop01.syntax;

public class Averagemain {
	
	public static void main(String[] args) {
		AverageVO hulk = new AverageVO();
		hulk.setName("��ũ");
		hulk.setKor(60);
		hulk.setEng(55);
		
		System.out.println("==="+hulk.getName()+"�� ����ǥ====");
		System.out.println("���� : "+hulk.getKor()+" ��");
		System.out.println("���� : "+hulk.getEng()+"��");
		System.out.println("���� : "+hulk.tot()+"��");
		System.out.println("��� : "+hulk.avg(hulk.tot())+"��");
		System.out.println();
	}

}
