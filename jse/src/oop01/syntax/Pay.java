package oop01.syntax;



public class Pay {
	private String name;
	private int salary;
	static final double TAX = 0.1;


	public static void main(String[] args) {
		
		Pay hulk = new Pay();
		Pay iron = new Pay();
		Pay thor = new Pay();
		hulk.name = "헐크";
		iron.name =  "아이언";
		thor.name = "토르";
		hulk.salary= 300;		
		 iron.salary = 500;		
		 thor.salary = 100;		
		System.out.println("===="+hulk.name+"의 5월달 실급여는 "+(int)(hulk.salary-(hulk.salary*Pay.TAX))+"만원 입니다.");		
		System.out.println("===="+iron.name+"의 5월달 실급여는 "+(int)(iron.salary-(iron.salary*Pay.TAX))+"만원 입니다.");
		System.out.println("===="+thor.name+"의 5월달 실급여는 "+(int)(thor.salary-(thor.salary*Pay.TAX))+"만원 입니다.");
		
		
	}

}
