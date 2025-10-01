/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricketfinanceapplication;

/**
 *
 * @author USER
 */

    public class TestMatch extends Game{
        @Override
        public double calculateIncome(String numGames){
            int matches = Integer.parseInt(numGames);
            return matches * 5000; // Just an example to calculate test match 
        }
        
        @Override
        public double calculateBonus(String performance, String grade){
            double bonus = 0; 
            
            switch (performance.toLowerCase()){
                case "best":
                    bonus = grade.equalsIgnoreCase("A")? 2000 : 1500;
                    break;
                case "good": 
                        bonus = grade.equalsIgnoreCase("B") ? 1500 : 1000;
                        break; 
                case "average":
                    bonus = 500; 
                    break; 
                default: 
                    bonus = 0; 
            }
            
            return bonus; 
        }
    }

