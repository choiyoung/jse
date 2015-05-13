package cmm03.flow;

import java.util.Scanner;

public class No08_NumberMath {

	public static void main(String[] args) {
	No08_NumberMathVO vo = new No08_NumberMathVO();
	System.out.println("ÃÑ 3È¸¸¸ ÀÔ·Â°¡´ÉÇÕ´Ï´Ù.");
	Scanner  scanner = new Scanner(System.in);
	int result = 0;
	for(int i = 0;i<3;i++){
		System.out.println("1ºÎÅÍ 5°¡Áö Á¤ºÎ¸¸ ÀÔ·ÂÇÏ¼¼¿ä");
			
	
	
	try {
		  int input = scanner.nextInt();
		  vo.setPlayer(input);
	} catch (Exception e) {
		System.out.println("¹®ÀÚ´Â ¾ÈµË´Ï´Ù.");
	}
	
	if(vo.getPlayer()==0){
		System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ½Ê½Ã¿À.");
	}else{
		vo.setCom();
		result = vo.game(vo.getCom(),vo.getPlayer());
	}
	if(result == 1){
		System.out.println("¸Â­Ÿ½À´Ï´Ù."+"°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
	}else if(i==2){
		System.out.println("3È¸ ¸ðµÎ Âü¿©Çß½À´Ï´Ù."+""
				+ "\n°ÔÀÓ¿¡¼­ ÆÐ¹èÇß½À´Ï´Ù."
				+"\n°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
		break;
	
	}
	}
	
	
	}	
}
