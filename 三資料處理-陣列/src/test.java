import java.util.Arrays;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		
		int array[] = {0,1,2,3,4,5,6,7,8,9};
		
		ArrayList evenArray = new ArrayList();
		ArrayList oddArray = new ArrayList();
		
		int oddSum = 0;
		int evenSum = 0;
		int answer=0;
		
		for(int i=0;i<array.length;i+=2) {
			evenSum += i;
			evenArray.add(array[i]);
			
		}
		
		for(int i=1;i<array.length;i+=2) {
			oddSum += i;
			oddArray.add(array[i]);
		}
		
		answer = oddSum - evenSum;
		
		System.out.println(answer);	
		System.out.println(evenArray);
		System.out.println(oddArray);
		
			
		}

}