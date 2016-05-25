/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annoyin
 */
import java.util.Scanner;
public class calc {
   
    
    public static void main(String[] args){
        System.out.println("Enter two no.");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        System.out.println("Choose no. to perform calc");
        System.out.println("1.ADD");
        System.out.println("2.SUBTRACT");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDE");
        System.out.println("Enter your choice");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Sum="+(x+y));
                break;
            case 2:
                System.out.println("Sub="+(x-y));
                break;
            case 3:
                System.out.println("Mul="+(x*y));
                break;
            case 4:
                System.out.println("Div="+(x/y));
                break;
            default:
                System.out.println("Not in option");
                              
        }
            
        
        
        
    }
    
}
