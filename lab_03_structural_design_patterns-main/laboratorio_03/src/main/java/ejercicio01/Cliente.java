/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jacks
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //GameCreator creator = new GameCreator();
        Game juego=GameFactory.playGame("Puzzle");
        juego.start();
        //Game rpg = creator.createGame("RPG");
        //rpg.start();

        //Game fps = creator.createGame("FPS");
        //fps.start();
    }
    
}
