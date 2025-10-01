/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricketfinanceapplication;

/**
 *
 * @author USER
 */
public class Player {
    private String name;
    private int age;
    private String gender;
    private String grade;
    
    // Constructor
    public Player(String name, int age, String gender, String grade){
        this.name = name; 
        this.age = age; 
        this.gender = gender; 
        this.grade = grade; 
    }
    
    //Method to display player details
    public void displayDetails(String matchType, String numGames, String performance){
        Game match; 
        
        // Determine the type of match 
        if(matchType.equalsIgnoreCase("test match")){
            match = new TestMatch();
        }else if(matchType.equalsIgnoreCase("World cup")){
            match = new WorldCup();
        }else{
            System.out.println("Invalid match type");
            return; 
        }
        
        // To calculate income and bonus 
        double income = match.calculateIncome(numGames);
        double bonus = match.calculateBonus(performance, grade);
        
        // Displaying player details and income information
        System.out.println("Player Details: ");
        System.out.println("Name: " +name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Grade: "+grade);
        System.out.println("Match Type: "+matchType);
        System.out.println("Number of Matches: "+numGames);
        System.out.println("Performance: "+performance);
        System.out.println("Total Income: "+income);
        System.out.println("Bonus: $"+bonus);
    }
}
