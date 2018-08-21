package automationFramework;

public class Testprogrm4 	 
{
  public static int[] sortArray(int[] arr) 
  { 
    int i=0,j=0,temp=0,index=0;
    for(i=0;i<arr.length;i++)
    {
      for(j=i+1;j<arr.length;j++)
      {
         if(arr[i]>arr[j])
         {
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
         }
      }
    }
    return arr;
  }   
  
  public static int findMinElement(int arr1[], int arr2[])
  {
    if(arr1[0]>arr2[0])
    {
    	return arr2[0];
    }
    else
    {
    	return arr1[0];
    }
  }
  
  public static void main(String args[])
  {
	  int arr1[] = {12,11,33,44};
	  int arr2[]={21,14,23,9};
	  int X[]=sortArray(arr1);
	  int Y[]=sortArray(arr2);
	  int minelement=findMinElement(X,Y);
	  System.out.println("Minimun element"+minelement);
  } 	

}

