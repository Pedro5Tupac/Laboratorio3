/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Pedro
 */
public abstract class GameFactory {
    public GameFactory() {
    }
    public abstract Game createGame();
    public static Game playGame(String juego) {
        Game game = null;
        if ("RPG".equals(juego)) {
            game = new RPGFactory().createGame();
        }
        if ("FPS".equals(juego)) {
            game = new FPSFactory().createGame();
        }
        if ("Puzzle".equals(juego)) {
            game = new PuzzleFactory().createGame();
        }
        return game;
    }
}

