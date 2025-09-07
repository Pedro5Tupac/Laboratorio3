/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Pedro
 */
public enum NetworkConfig {
    INSTANCE;
    private String ip = "192.168.10.1";
    private int port= 8080;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    
    public void conexion() {
        System.out.println("NetworkConfig{" + "ordinal=" + ordinal() + ", name=" + name() + ", ip=" + ip + ", port=" + port + '}'); 
    }
    
    
}
