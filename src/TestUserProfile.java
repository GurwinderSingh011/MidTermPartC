/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author lovel
 */
public class TestUserProfile {
    
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.next();
        System.out.println("Please enter your favourite actor");
        String actor= sc.next();
        System.out.println("Thank you " + name + " your profile is created");
    }

    
}
