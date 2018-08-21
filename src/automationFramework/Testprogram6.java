package automationFramework;

//You can print the values to stdout for debugging
public class Testprogram6 {  
public static char checkGrade( int marks ){  
  if( marks <= 60 )
     return 'D';
  else
     if( ( 61<=marks ) && ( marks <= 75 ) )
        return 'C';
     else
        if( ( 76 <= marks ) && ( marks <= 90 ) )
          return 'B';
        else
          return 'A';      
}  

	public static void main(String args[]) {
		
		char marks = checkGrade(95);
		System.out.println("Marks:" + marks);
	}

}