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
        
        final int stopValue = -1;
        final int offset = 1;
        
    // ********** declaration of variables **********
        int MAX = 20;
        int amount = 0;
        int list[] = new int[MAX];           //array of ints
        int num = 0;
        int seeNum = 0;
        
        boolean change = false;
        String changeString = null;
    // create an instance of the ConsoleReader so that we can read data from the keyboard
    
    	//ConsoleReader console = new ConsoleReader(System.in);
        ProgramInfo programInfo3 = new ProgramInfo(" Array Exercise" + " 1");
        ProgramInfo endOfProgram = new ProgramInfo(" Array Exercise" + " 1");
        
    // ********** Print output Banner **********
    
        System.out.println(programInfo3.toString());
        
    // ************************ get input **********************
    
       //list[n] = console.readInt();
        amount = Integer.parseInt(JOptionPane.showInputDialog("Enter number of numbers to be entered (Maximum 20)"));
        
    	for(int n = 0; n < amount; n++){//start input for "for loop"
            //list[n] = console.readInt();
            list[n] = Integer.parseInt(JOptionPane.showInputDialog ("Enter a Number"));
        }// end getting input

    // ************************ processing ***************************
    
        System.out.print("Original Order: ");
        for(int n = 0; n < amount; n++ ){
            System.out.print(list[n] + ", ");
        }
        
        System.out.print("\nReverse Order: ");
        for(int n = amount - 1; n>= 0; n-- ){
            System.out.print(list[n] + ", ");
        }
        
        num = Integer.parseInt(JOptionPane.showInputDialog ("Which place value of the array do you want to see? Type -1 to stop!"));
        
        while (num != stopValue){ 
           seeNum = num - offset;
           System.out.print("\n\nPlace Value: " + num + " = Number: " + list[seeNum]);int maxValue = list[0]; 
        for(int n = 1; n < list.length; n++){ 
            if(list[n] > maxValue){ 
             maxValue = list[n];             
            } 
        } 
        int minValue = list[0];
        for(int n = 1; n < list.length; n++){ 
            if(list[n] < minValue){ 
            minValue = list[n];   
            } 
        }
           changeString = JOptionPane.showInputDialog("Do you want to change the number? \nEnter 'true' or 'false' ");
           if (changeString.equals("true")){
             change = true;
             list[num] = Integer.parseInt(JOptionPane.showInputDialog ("Which number do you want it to be changed into?"));
             System.out.println("\n\nThe number you wanted to see is: " + num);
             System.out.println("You changed it to: " + list[num]);
             }
           else{
             change = false;
             }
           num = Integer.parseInt(JOptionPane.showInputDialog ("Which number do you want to see? Type -1 to stop!")); 
        }
        
        int minValue = list[0];
        for(int n = 1; n < amount; n++){ 
            if(list[n] < minValue){ 
            minValue = list[n];   
            } 
        }
        int maxValue = list[0]; 
        for(int n = 1; n < amount; n++){ 
            if(list[n] > maxValue){ 
             maxValue = list[n];             
            } 
        } 

    // ************************ print output -****************************
    
        System.out.println("\nMaximum Value: " + maxValue);
        System.out.println("Minimum Value: " + minValue);
        
    // ************************* closing message ************************
        System.out.println("\n\nhttps://github.com/parmeetgill1313/Array-Exercises-1");
        System.out.println(endOfProgram.endProgram());
        
    }  // end main
}  // end class