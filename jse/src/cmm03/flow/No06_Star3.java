package cmm03.flow;

public class No06_Star3 {

	public static void main(String[] args) {
		char star = '¡Ú';
		
		for (int i = 0; i < 10; i++) {			
			for (int j = 0; j < 10 ; j++) {
				if(i>j){
				System.out.print("    ");
				}else{
				System.out.print(star);
				}
			}
			System.out.println();
		}

	}

}
