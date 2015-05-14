package oop01.game;

import java.util.Scanner;

public class KaupVO {	
	private double height, weight;	
	private int idx;
	private String msg ;
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;

	}
	public int getIdx() {
		return idx;
	}

	public void setIdx(double weight, double height) {
		this.idx = (int) ((weight / (height * height)) * 10000);
	}
	
	public void setMsg(String msg){			
		if(getIdx()>30){this.msg = "비만";
		}else if(getIdx()>24){ this.msg = "과체중";
		}else if(getIdx()>20){ this.msg = "정상";
		}else if(getIdx()>15){ this.msg = "저체중";
		}else if(getIdx()>13){ this.msg = "마름";
		}else if(getIdx()>10){ this.msg = "영양실조";
		}else {this.msg = "소모증";}
		
	}
	public String getMsg() {
		return msg;
	}
	
	@Override
	public String toString() {
		return "Kaup [height=" + getHeight() + "cm , weight=" + getWeight()+ " kg, 카우프지수 = "
				+ getMsg() + "]";
	}
}
