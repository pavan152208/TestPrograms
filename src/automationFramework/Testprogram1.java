package automationFramework;

public class Testprogram1
{
  public static void getDigitSum(int arr[])
  {
    int result,len=arr.length;
    //int min = arr[0];
    for(int i=0,min=arr[1];i<len;i++)
     {
   
       if(arr[i]<min)
         min=arr[i];
       System.out.println(""+min);
       
     }
    
	//result=getSum(min);
   //return result;
  }
//  public static int getSum(int num)
//  {
//    int sum=0;
//    while(num!=0)
//     {
//       sum=sum+(num%10);
//       num=num/10;
//     }
//    return sum;
//  }
  
  public static void main(String args[])
  {
	  int arr_min[] = {12,11,33,44};
	 getDigitSum(arr_min);
	  //System.out.println("result:"+result);
  }
}
