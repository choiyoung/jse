package cmm03.flow;

public class No06_Star {

	public static void main(String[] args) {

		// ��
		char star = '��';
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			}

			System.out.println();
		}
	}
}
