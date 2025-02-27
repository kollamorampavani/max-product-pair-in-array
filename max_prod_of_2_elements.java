package arrays;

import java.util.Scanner;

public class max_prod_of_2_elements {
	public static int maxprod(int[] a) {
		int largest=Integer.MIN_VALUE,seclargest=Integer.MIN_VALUE;
		 for(int i=0;i<a.length;i++) {
        	if(a[i]>largest) {
        		seclargest=largest;
        		largest=a[i];
        	}
        	else if(a[i]>seclargest){
        		seclargest=a[i];
        	}
        	  }
	
	//minimum product
	int smallest=Integer.MAX_VALUE,secsmallest=Integer.MAX_VALUE;
	 for(int i=0;i<a.length;i++) {
     	if(a[i]<smallest) {
     		secsmallest=smallest;
     		smallest=a[i];
     	}
     	else if(a[i]<secsmallest){
     		secsmallest=a[i];
     	}
     	  }
	 int p1=largest*seclargest;
	 int p2=smallest*secsmallest;
      return p1>p2?p1:p2; //to find min prod pair return p1<p2?p1:p2
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     int n=scan.nextInt();
	     int[] a=new int[n];
	     for(int i=0;i<a.length;i++) {
	    	 a[i]=scan.nextInt();
	    	  }
	     int res=maxprod(a);
	     System.out.println(res);
	}

}
/*when we give input as combination of both +ve and -Ve values 
 */
