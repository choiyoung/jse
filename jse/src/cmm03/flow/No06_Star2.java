package cmm03.flow;

public class No06_Star2 {

	public static void main(String[] args) {
		
		char star = '¡Ú';
		for (int i = 0; i < 10; i++) {			
			for (int j = 1; j < (10-i); j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		for (int i = 1; i < 10; i++) {			
			for (int j = 10; j > i; j--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

}
