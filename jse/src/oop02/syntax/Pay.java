package oop02.syntax;



public class Pay {
	private String name;
	private int salary;
	static final double TAX = 0.1;


	public static void main(String[] args) {
		
		Pay hulk = new Pay();
		Pay iron = new Pay();
		Pay thor = new Pay();
		hulk.name = "��ũ";
		iron.name =  "���̾�";
		thor.name = "�丣";
		hulk.salary= 300;		
		 iron.salary = 500;		
		 thor.salary = 100;		
		System.out.println("===="+hulk.name+"�� 5���� �Ǳ޿��� "+(int)(hulk.salary-(hulk.salary*Pay.TAX))+"���� �Դϴ�.");		
		System.out.println("===="+iron.name+"�� 5���� �Ǳ޿��� "+(int)(iron.salary-(iron.salary*Pay.TAX))+"���� �Դϴ�.");
		System.out.println("===="+thor.name+"�� 5���� �Ǳ޿��� "+(int)(thor.salary-(thor.salary*Pay.TAX))+"���� �Դϴ�.");
		
		
	}

}
