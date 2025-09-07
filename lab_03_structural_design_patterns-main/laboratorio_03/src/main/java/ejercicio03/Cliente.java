/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

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
        
        NetworkConfig net1= NetworkConfig.INSTANCE;
        NetworkConfig net2= NetworkConfig.INSTANCE;
        
        net1.conexion();
        net2.conexion();
        
        GameSession session = new GameSession();
        NetworkManager network = new NetworkManager();
        DatabaseManager database = new DatabaseManager();

        session.startSession();    // maxPlayers = 50, debug = false
        network.connect();         // debug = true (inconsistente!)
        database.saveData();       // databaseUrl diferente (inconsistente!)
        
        System.out.println("//////");
        GameSession session2 = new GameSession();
        NetworkManager network2 = new NetworkManager();
        DatabaseManager database2 = new DatabaseManager();
        
        session2.startSession();
        network2.connect();
        database2.saveData();
    }   
    
}
