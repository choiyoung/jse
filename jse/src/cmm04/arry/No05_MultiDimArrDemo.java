package cmm04.arry;
/*
 Java �� ���� ���� 5-10
 * */
public class No05_MultiDimArrDemo {
	public static void main(String[] args) {
		int[][] score ={
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		int korTotal = 0 ;
		int engTotal = 0 ;
		int mathTotal = 0;
		
		System.out.println("��ȣ	����	����	����	����	���");
		System.out.println("============================================");
		
		for(int i = 0 ;i<score.length;i++){
			int sum = 0;
			int avg = 0 ;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.print(" "+ ( i + 1 ) + "	");
			for(int j = 0; j<score[i].length;j++){
				avg = score[i][j];
				sum += score[i][j];
				System.out.print(score[i][j]+"	");
			}
			System.out.println(sum+"	"+avg);
			
		}
		System.out.println("============================================");
		// �Ʒ� �������� ����, ����, ���� ������ ������ �ϼ���
		System.out.println("����:	"+korTotal+"	"+engTotal+"	"+mathTotal);
	}
}
