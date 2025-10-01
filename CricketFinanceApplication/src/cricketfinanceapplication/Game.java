/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricketfinanceapplication;

/**
 *
 * @author USER
 */

//The Abstract base class
public abstract class Game {
    public abstract double calculateIncome(String numGames);
    public abstract double calculateBonus(String perfomance, String grade);
}
