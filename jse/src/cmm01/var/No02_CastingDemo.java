package cmm01.var;
/*
 
 Upcasting
 = ����(Conversion)
 = promotion
 = ������(implict)
 : �ڹٰ� �����ϴ� �ڵ���ȯ���� �������� ����
 ������ Ÿ���� ǥ�������� �����ʿ��� ���������� ��ȯ �ɴ븸
 �����ϴ�.
 
 * */
public class No02_CastingDemo {
	public static void main(String[] args){
	byte varByte = 1;
	int varInt = 123;
	double varDou = 123.456d;
	
	int upByte = varByte;
	double upInt = varInt;
	/*
Down-Casting
= ĳ����(Casting)
���� ����ȯ
: ���α׷����� ��������� �����ϴ� Ÿ�Ժ�ȯ.
��Һ�ȯ�� �Ǵ� ���� �ݵ�� ��������� ĳ�����Ͽ��� ��.
���� !!!! ������ �ջ��� �߻��� �� �ִ�.	
 
	 */
	float varFlo = 123.456f;
	int downFlo = (int) varFlo;
	System.out.println("�ٿ�ĳ���� ����� : "+ downFlo);
	

	}
	}
