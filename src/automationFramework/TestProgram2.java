 package automationFramework;

 public class TestProgram2
 {
   public static void printColor(int num)
   {
     switch(num)
     {
       case 1:
       System.out.print("Red");
       break;
       case 2:
       System.out.print("Black");
       break;
       case 3:
       System.out.print("White");
       break;
       case 4:
       System.out.print("Green");
       break;
       default : 
       System.out.print("No color");  
       break;
     }
   }
   public static void main(String args[])
   {
 	 
 	 printColor(0);
 	  //System.out.println("result:"+result);
   }

 }

