package automationFramework;

public class Testprogram3{
	  public static int getArraySum(int arr[]){
	    int sum = 0 , i , len= arr.length;
	    for( i = 0 ; i < len ; i = i + 1 ){
	      sum = sum + arr[i];
	    }
	    return sum;
	  }
	  public static void main(String args[])
	  {
		  int arr_min[] = {12,11,33,44};
		  int Sum = getArraySum(arr_min);
		  System.out.println("result:"+Sum);
	  }
	}

