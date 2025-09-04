/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Pedro
 */
public class PuzzleFactory extends GameFactory{

    @Override
    public Game createGame() {
       return new PuzzleGame();
    }

    
}
