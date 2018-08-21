package automationFramework;

public class TestProgram5{  
	  public static int[] deleteDuplicate( int arr[] ){  
	    int count = 0 , p , len = arr.length , i , j , k , originalLength = len;	
	    System.out.println("length"+len);
	    for( i = 0 ; i < len ; i ++ ){
	    	 System.out.println("length"+len);
	      for( j = i + 1 ; j < len ; j ++ ){
	    	  System.out.println("length"+len);
	        if( arr[j] == arr[i] ){
	            for( k = j ; k < len-1 ; k ++ ){
	            	 System.out.println("k index"+k);
	            	 System.out.println("k array"+arr[k]);
	                arr[ k ] = arr[ k + 1 ] ;
	                System.out.println("k array"+arr[k]);
	              }
	            	
	          len = len - 1;
	          count = count + 1;
	          System.out.println("length"+len);
	  	      System.out.println("count"+count);
	          //j = i;
	        }
	      }
	    }  
	    int newLength = originalLength - count;
	    int newArr[] = new int[ newLength ];
	    for( i = 0 ; i < newLength ; i ++ )
	    {
	      newArr[i] = arr[i];
	    System.out.println("newarr"+newArr[i]);
	    }
	    return newArr;  
	  }     
	  
	  public static void main(String args[])
	  {
		  int arr1[] = {3,2,2,5};
		  
		 int new_arr[] =deleteDuplicate(arr1);
		 
	  }
}

