import java.util.Arrays;

public class test {

	public static void main(String[] args) {

		int array[] = {77,5,5,22,13,55,97,4,796,1,0,9};

		boolean sorted = false;
		int temp;
		while(!sorted) {
			sorted = true;
			for(int i=0; i<array.length-1; i++) {
				if(array[i]>array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					sorted = false;
				}
			}
		}

		System.out.println(Arrays.toString(array));

		}

}
