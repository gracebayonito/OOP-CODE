/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runquad; 

import java.util.Scanner;

public class RunQuad {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Press R for reactangle or S for Square");
      String choice = scn.nextLine();
       
        if (choice.equalsIgnoreCase("R")){
           Rectangle re = new Rectangle();
           re.showDescription();
    
        }else if(choice.equalsIgnoreCase("S")){
           Square sq = new Square(); 
           sq.showDescription();

        }else{
        System.out.println("Invalid Input");
        }
     
    }
       
}