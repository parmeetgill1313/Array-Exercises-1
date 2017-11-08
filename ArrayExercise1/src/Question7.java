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
import java.util.Random;
 

public class Question7  {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
        final int MAX = 10;
        
        
    // ********** declaration of variables **********
    
        int[] list = new int[MAX];
        double sum = 0;
        double avg;
        int SENTINAL = 0;
        int amount = 0;
        
    // create an instance of the ConsoleReader so that we can read data from the keyboard
    
        ProgramInfo programInfo3 = new ProgramInfo(" Array Exercise" + " 1");
        ProgramInfo endOfProgram = new ProgramInfo(" Array Exercise" + " 1");
        
    // ********** Print output Banner **********
    
        System.out.println(programInfo3.toString());
        
    // ************************ get input **********************
           SENTINAL = Integer.parseInt(JOptionPane.showInputDialog (" Enter the sentinal value?")); 

    // ************************ processing ***************************

        for(int n = 0; n < MAX; n++){
            list[n] = (int) (Math.random() * 10);
            if(list[n] != SENTINAL){
                System.out.println(list[n]);
                amount = n;
            }
            else{
                amount = n;
                break;
            }
            
        }
        for(int n = 0; n < MAX; n++){
            sum += list[n];
        }

            avg = sum / amount;

        
        
        int maxValue = list[0]; 
        for(int n = 1; n < amount; n++){ 
            if(list[n] > maxValue){ 
             maxValue = list[n];             
            } 
        } 
        int minValue = list[0];
        for(int n = 1; n < amount; n++){ 
            if(list[n] < minValue){ 
            minValue = list[n];   
            } 
        }    
    
    // ************************ print output ****************************
    
        System.out.println("The Sum: " + sum);
        System.out.println("The Average: " + avg);
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Minimum Value: " + minValue);
        
        // ******** closing message *********
            System.out.println(endOfProgram.endProgram());
    }  // end main
}  // end class
