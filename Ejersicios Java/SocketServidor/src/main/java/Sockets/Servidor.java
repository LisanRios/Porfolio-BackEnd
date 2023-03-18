/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lisan
 */
public class Servidor extends ConexionSockets{
    public Servidor () throws IOException{
        super ("servidor");
    }
    public void startServer(){
        try {
            System.out.println("Esperando por una Conexién...");
            socketCliente = socketServidor.accept();
            System.out.println("Cliente en linea");
            salidaCliente = new DataOutputStream(socketCliente.getOutputStream());
            salidaCliente.writeUTF("Peticién recibida y aceptada");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            while ((mensajeServidor = entrada.readLine()) != null){
            System.out.println(mensajeServidor);
            }
            System.out.println("Fin de la conexién");
            socketServidor.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
