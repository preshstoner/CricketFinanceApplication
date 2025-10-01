/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricketfinanceapplication;
import java.util.Scanner; 

/**
 *
 * @author USER
 */
public class PlayerTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Input player details
        System.out.print("Enter Player Name: ");
        String name = scanner.nextLine(); 
        System.out.print("Enter Player age: ");
        int age = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Enter Player Gender: ");
        String gender = scanner.nextLine(); 
        System.out.print("Enter Player Grade(A/B): ");
        String grade = scanner.nextLine(); 
        System.out.println();
        
        
        //The player Object
        Player player = new Player(name, age, gender, grade);
        
        //Input match details
        System.out.print("Enter Match Type(Test Match/ World Cup): ");
        String matchType = scanner.nextLine(); 
        System.out.print("Enter Numbers of Match Played: ");
        String numGames = scanner.nextLine(); 
        System.out.print("Enter Performance(Best/Good/Average): ");
        String performance = scanner.nextLine(); 
        System.out.println();
        
        // Now to display player and match details
        System.out.println("\nCalculating Details.....");
        player.displayDetails(matchType, numGames, performance);
        
        
        scanner.close();
    }
}
