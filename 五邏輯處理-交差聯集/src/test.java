//資料處理五-交差聯集
import java.util.ArrayList;
import java.util.Arrays;


public class test {
	
	
	static int add_i(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {

	    int a[] = {77, 5,5,22,13,55,97,4,796,1,0,9};

	    int b[] = {0,1,2,3,4,5,6,7,8,9};
	    
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
	    ArrayList<Integer> c = new ArrayList<Integer>();
	    ArrayList<Integer> d = new ArrayList<Integer>();
	    ArrayList<Integer> e = new ArrayList<Integer>();
	    
	    
	  //先將a排序    
	    boolean sorted = false;
	    int temp;	    
	    while(!sorted) {
	        sorted = true;
	        for(int i=0; i<a.length-1; i++) {
	        	if(a[i]>a[i+1]) {
	        	    temp = a[i];
	        	    a[i] = a[i+1];
	        	    a[i+1] = temp;
	        	    sorted = false;
	        	}
	        }
	    }
	    
	    System.out.println(Arrays.toString(a));
	    
	    //去除重複出現的數來求後面的集合
	   int temp2 = -1; 		//先將暫存的變數設為一個不在array裡的數
	   for(int i=0; i<a.length; i++) {
		   if(a[i] != temp2) {
			   a2.add(a[i]);
		   }
		   temp2 = a[i];
	   }
	   
	   
	   System.out.println(a2);
	   
	    

	    //陣列c = a 交集 b
	    
	    for(int i=0; i<a.length; i++) {
	        for(int j=0; j<b.length; j++) {
		        if(a[i] == b[j]) {
		        	c.add(a[i]);
		        }
	        }
	    }
	    System.out.println(c);

	    //陣列d = a 差集 b

	    for(int i=0; i<a.length; i++) {
	    	d.add(a[i]);
	    }
	    
//	    System.out.println(d);
	    
	    for(int i=0; i<a.length; i++) {
	    	for(int j=0; j<b.length; j++) {	
	    		if(a[i] == b[j]) {
	    			int idex = d.indexOf(a[i]);
	    			d.remove(idex);
	    			//d.remove(a[i]);
	    		}
	    	}
	    }
	   
	    System.out.println(d);

	    //陣列e = a 聯集 b
	    //(a聯集b) = (a差集b) + b集
	    for(int i=0; i<d.size(); i++) {
	    	e.add(d.get(i));
	    }
	    
	    for(int i=0; i<b.length; i++) {
	    	e.add(b[i]);
	    }
	    System.out.println(e);
	    	 
	     
	    }
	
	
 }
