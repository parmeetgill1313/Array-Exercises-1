/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: Ax Qy
 * Program Name:  name of public class
 *
 * Description: brief description of program
 *
 * Input: data to be input
 *
 * Output: results to be output
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class Fibonacci  {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
        final int MAX = 20;
        
    // ********** declaration of variables **********
    
        int[] list = new int[MAX];
        
    // create an instance of the ConsoleReader so that we can read data from the keyboard
    
        ProgramInfo programInfo3 = new ProgramInfo(" Array Exercise" + " 1");
        ProgramInfo endOfProgram = new ProgramInfo(" Array Exercise" + " 1");
        
    // ********** Print output Banner **********
    
        System.out.println(programInfo3.toString());
        
    // ************************ get input **********************

    // ************************ processing ***************************

        list[0] = 0;
        list [1] = 1;
            
         for (int n = 2; n < MAX; n++){
             list[n] = list[n-1] + list[n-2];
         }
         for (int n = 0; n < 5; n++){
           System.out.print((list[n]) + "\n");
         }
         for (int n = 15; n < 20; n++){
           System.out.print((list[n]) + "\n");
         }
    
    // ************************ print output ****************************

    
        // ******** closing message *********
            System.out.println(endOfProgram.endProgram());
    }  // end main
}  // end class
