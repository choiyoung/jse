package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {
	double height;// 맴버 변수
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
	
	No07_Kaup() {
		this(0,0);
	}
	No07_Kaup(double i, double j) {
		this.height = i ;// 지역변수에 맴버변수를 대입
		this.weight = j ;
		this.idx = (int)((weight/(height*height)));
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = scanner.nextDouble();
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = scanner.nextDouble();
	}
	String getMsg(){
		String msg = "";
		if(idx>30){ msg = "비만";
		}else if(idx>24){ msg = "과체중";
		}else if(idx>20){ msg = "정상";
		}else if(idx>15){ msg = "저체중";
		}else if(idx>13){ msg = "마름";
		}else if(idx>10){ msg = "영양실조";
		}else {msg = "소모증";}
	
		return msg;
	}
	@Override
	public String toString() {
		return "No07_Kaup [height=" + height + "cm , weight=" + weight + " kg, 카우프지수 = "
				+ getMsg() + "]";
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		double height = scanner.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight = scanner.nextDouble();
		
		
		No07_Kaup aa = new No07_Kaup(height, weight);
		System.out.println(aa.idx);
		System.out.println(aa.toString());
		
		
		
		
	}
	
}

