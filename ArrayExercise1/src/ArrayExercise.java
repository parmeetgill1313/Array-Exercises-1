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

        int MAX = 20;
        
    // ********** declaration of variables **********
    
        int amount = 0;
        //int[] MAX = new int[5];
        int list[] = new int[MAX];           //array of ints
        int n = 0;
        
    // create an instance of the ConsoleReader so that we can read data from the keyboard
    
    	//ConsoleReader console = new ConsoleReader(System.in);
        ProgramInfo programInfo3 = new ProgramInfo(" Array Exercise" + " 1");
        ProgramInfo endOfProgram = new ProgramInfo(" Array Exercise" + " 1");
        
    // ********** Print output Banner **********
    
        System.out.println(programInfo3.toString());
        
    // ************************ get input **********************
    
       //list[n] = console.readInt();
        amount = Integer.parseInt(JOptionPane.showInputDialog("Enter number of numbers to be entered (Maximum 20)"));
        
    	for(n = 0; n < amount; n++){//start input for "for loop"
            //list[n] = console.readInt();
            list[n] = Integer.parseInt(JOptionPane.showInputDialog
                ("Enter a Number"));
        }// end getting input

    // ************************ processing ***************************
        System.out.print("Original Order: ");
        for(n = 0; n < amount; n++ ){
            System.out.print(list[n] + ", ");
        }
        System.out.print("\nReverse Order: ");
        for(n = amount - 1; n>= 0; n-- ){
            System.out.print(list[n] + ", ");
        }
    // ************************ print output ****************************

    // ************************* closing message ************************
        System.out.println("\n\nhttps://github.com/parmeetgill1313/Array-Exercises-1");
        System.out.println(endOfProgram.endProgram());
        
    }  // end main
}  // end class