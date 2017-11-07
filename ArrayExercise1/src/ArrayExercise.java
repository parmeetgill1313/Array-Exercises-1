/********************************************************************
 * Programmer:         Parmeet Gill
 * 
 * Class:              CS30S
 *
 * Assignment:         Array Exercise 1
 *
 * Description:        brief description of program
 *
 * Input:              data to be input
 *
 * Output:             results to be output
 ***********************************************************************/
 
 // import java libraries here as needed
 import java.io.*;
 import javax.swing.*;
 import java.text.DecimalFormat;

public class ArrayExercise {  // begin class
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
        int[] MAX = new int[5];
    
    // ********** declaration of variables **********

        int list[] = MAX;           //array of 5 ints
        int n = 0;
        
    // create an instance of the ConsoleReader so that we can read data from the keyboard
    
    	//ConsoleReader console = new ConsoleReader(System.in);
        ProgramInfo programInfo3 = new ProgramInfo("Array Exercise" + " 1");
        ProgramInfo endOfProgram = new ProgramInfo("Array Exercise" + " 1");
        
    // ********** Print output Banner **********
    
        System.out.println(programInfo3.toString());
        
    // ************************ get input **********************
    
       // list[n] = console.readInt();
      //  list[n] = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number"));
        
    	for(n = 0; n < 5; n++){//start input for "for loop"
            //list[n] = console.readInt();
            list[n] = Integer.parseInt(JOptionPane.showInputDialog
                ("Enter a Number"));
        }// end getting input

    // ************************ processing ***************************
    
            System.out.println("Original Order: " + (list[0] + ", ") + (list[1]+ ", ") + 
                    (list[2]+ ", ") + (list[3]+ ", ") + (list[4]));
            System.out.println("Reverse Order: " + (list[4] + ", ") + (list[3]+ ", ") + 
                    (list[2]+ ", ") + (list[1]+ ", ") + (list[0]));

            
    // ************************ print output ****************************
    
        
    
    // ************************* closing message ************************
        System.out.println("");
        System.out.println(endOfProgram.endProgram());
        
    }  // end main
}  // end class
