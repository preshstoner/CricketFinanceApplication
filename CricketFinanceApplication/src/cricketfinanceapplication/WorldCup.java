/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricketfinanceapplication;

/**
 *
 * @author USER
 */
public class WorldCup extends Game {
    @Override
    public double calculateIncome(String numGames){
        int matches = Integer.parseInt(numGames);
        return matches * 10000; // Just an example for a world cup match 
    }
    
    
    @Override
    public double calculateBonus(String performance, String grade){
        double bonus = 0; 
        
        switch (performance.toLowerCase()){
            case "best":
                bonus = grade.equalsIgnoreCase("A") ? 5000 : 4000;
                break; 
            case "good":
                bonus = grade.equalsIgnoreCase("B") ? 3000 : 2000; 
                break;
            case "average":
                bonus = 1000; 
                break; 
            default :
                bonus = 0; 
        }
        
        return bonus; 
    }
}
