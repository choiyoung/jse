package oop02.syntax;
/*
 Date :
 Author :
 Desc : static ����
 */
public class CardVO {
	public String kind;// ī���� ����
	public int number;// ī���� ����
	static int wiath = 100;// ī���� ��
	static int height = 250;// ī���� ����
	public String com;
	
	public  CardVO(String kind,int number){
		this.kind= kind;
		this.number=number;		
		this.com="spade 5";
	}
	
}
