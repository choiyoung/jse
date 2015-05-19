package oop02.syntax;
class MilkCoffee{
	int money;
	public MilkCoffee(){	
		System.out.println("돈을 넣다");		
	}
	public MilkCoffee(int money) {
		this();
		System.out.println(money+"원");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		System.out.println("구매가능여부 : "+(exist == true?"커피종류선택" : "커피없음"));
	}
}
public class CoffeeB {
/*
 돈을 넣다
 500원
 구매가능여부 : 커피종류선택
 ...나오는데 생성자를 한번만 쓰세요...
 
 */
	public static void main(String[] args) {
		MilkCoffee milk = new MilkCoffee(500,true);
	}
}
