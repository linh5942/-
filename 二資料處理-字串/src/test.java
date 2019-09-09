//二資料處理-字串

import java.util.ArrayList;
import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		String text= "人易科技:上 機 測 驗 - 演算法";	
//		char result = text.charAt(4);
//		int result2 = (int)result+65248;
//		System.out.println(result);
//		System.out.println((char)result2);
//		System.out.println((int)result);
		
		String replaced = text.replaceFirst(":", "：");
		System.out.println(replaced);
		
//		char result3 = text.charAt(13);
//		System.out.println((int)result3);
		
		String trim = replaced;		
		for(int i=0; i<trim.length(); i++) {
			for(int j=i+2; j<trim.length(); j++) {
				char result4 = trim.charAt(i);
				char result5 = trim.charAt(j);
//				System.out.println((int)result4);
//				System.out.println((int)result5);
				
				if( ((int)result4>10000)&&((int)result5>10000) ) {
					trim = trim.replaceFirst(" ", "");
				}
			}
		}
		
//		String remove = text.replaceFirst(" ", "");
		System.out.println(trim);
		
		String printString = trim.substring(5,9);
		System.out.println(printString);
		
	}

}