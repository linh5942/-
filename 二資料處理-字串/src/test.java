//二資料處理-字串

import java.util.ArrayList;
import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "人易科技:上 機 測 驗 - 演算法";
		System.out.println(text);
		
		String replaced = text.replaceFirst(":", "："); // ":" + 65248  =  "："
		
		System.out.println(replaced);
		
		String trim = replaced;
		int length = trim.length();
	//	System.out.println(length);
		for(int i=0;i<trim.length();i++)
		{
			//System.out.println((int)text.charAt(i));
				int preIndex = i -1;
				int nextIndex = i+1;
				if(preIndex<0)
					preIndex=0;
				if(nextIndex > length)
					nextIndex =length;
				
				char PreValue = trim.charAt(preIndex);
				char NextValue = trim.charAt(nextIndex);
					if( ( (int)PreValue - (int)trim.charAt(i) >10000) && ( (int)NextValue - (int)trim.charAt(i)>10000))
					{
						trim =trim.replaceFirst(" ", "");
						length = trim.length()-1;
					//	System.out.println(trim);
					}
						
		}
		System.out.println(trim);
		
	}

}