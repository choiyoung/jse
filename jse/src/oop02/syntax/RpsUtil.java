package oop02.syntax;

public class RpsUtil {
	
	public String showRange(int a, int b){
		 a = RpsVO.a ;
		 b = RpsVO.b ;
		return a +"부터"+ b+"까지의 값만 입력하셔야 합니다.";
	}
	public String showWrongType(){
		return "정수값만 넣으시기 바랍니다.";
	}
}
