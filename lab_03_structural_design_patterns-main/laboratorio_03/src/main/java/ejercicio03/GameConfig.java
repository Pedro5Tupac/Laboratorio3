/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jacks
 */
public class GameConfig {
    
    
    private static GameConfig instance;
    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;
    
    

    // Constructor público permite múltiples instancias
    private GameConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/gamedb";
        this.debugMode = false;
        this.maxPlayers = 100;
    }
    
    public static GameConfig getInstance(){
        if(instance==null){
            instance=new GameConfig();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String url) {
        this.databaseUrl = url;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debug) {
        this.debugMode = debug;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int max) {
        this.maxPlayers = max;
    }
}
