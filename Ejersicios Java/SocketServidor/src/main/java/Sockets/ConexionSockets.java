/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Lisan
 */
public class ConexionSockets {
    private final int puerto = 8080; //Puerto para conectar
    private final String host = "localhost"; //direcci6n ip para la conexién
    protected String mensajeServidor; //variable para msjes recibidos en el servidor
    protected ServerSocket socketServidor; //Socket del servidor
    protected Socket socketCliente; //Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente; //variables de salida
    
    public ConexionSockets (String tipo) throws IOException {//Constructor
        if(tipo.equalsIgnoreCase ("servidor")){
            socketServidor = new ServerSocket (puerto);
            socketCliente = new Socket ();
        } 
        else
        {
        socketCliente = new Socket (host, puerto);
        }
    }
}
