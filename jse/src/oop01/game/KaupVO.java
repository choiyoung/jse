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
		if(getIdx()>30){this.msg = "��";
		}else if(getIdx()>24){ this.msg = "��ü��";
		}else if(getIdx()>20){ this.msg = "����";
		}else if(getIdx()>15){ this.msg = "��ü��";
		}else if(getIdx()>13){ this.msg = "����";
		}else if(getIdx()>10){ this.msg = "�������";
		}else {this.msg = "�Ҹ���";}
		
	}
	public String getMsg() {
		return msg;
	}
	
	@Override
	public String toString() {
		return "Kaup [height=" + getHeight() + "cm , weight=" + getWeight()+ " kg, ī�������� = "
				+ getMsg() + "]";
	}
}
