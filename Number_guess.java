/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number_guessing_programm;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Number_guess {
    
    public static void main(String[] args){
        Main_number_guess main_number_guess = new Main_number_guess();
        main_number_guess.number_guess();
        
    }
}

class Main_number_guess{
    public void number_guess(){
        Scanner sobj1 = new Scanner(System.in);
//        Random robj1 = new Random();
        int number = 1* (int)(1*Math.random());
        System.out.println("guess th number : \n");
        int trial = 5;
            for(int iterator=0; iterator<trial; iterator++ ){
                int User_num = sobj1.nextInt();
            if(User_num!=number){
                  System.out.println("oops try again you have use "+iterator+ " of your trials");
//                   Scanner sobj2 = new Scanner(System.in);
//                  int User_num2 = sobj2.nextInt();
        }
//                  if(User_num==number){
//                             System.out.println("congratulations you got the lucky number right "  + number);
//              
//                  }
            else{
                        System.out.println("congratulations you got the lucky number right "  + number);
                        break;
                }
            
            }     
        
      
      
    }
//      public void number(){
//            
//        }
}