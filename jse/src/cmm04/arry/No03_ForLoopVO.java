package cmm04.arry;

public class No03_ForLoopVO {
 private int a, b ,c, d, e;


	void loop(int a, int b, int c, int d, int e){
		setA(a);
		setB(b);
		setC(c);
		setD(d);
		setE(e);
		int[] arr = {getA(),getB(),getC(),getD(),getE()};
		int hap = 0;		
		for(int i = 0; i <arr.length;i++){
			hap += arr[i];
		}
		/*
		 
		 �Է� ���� 5���� ���ڵ��� ���� ���ϼ���
		 
		 
		 */
	
		System.out.println(" ���� 5���� ���ڵ��� ���� : "+hap);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}
	
}
