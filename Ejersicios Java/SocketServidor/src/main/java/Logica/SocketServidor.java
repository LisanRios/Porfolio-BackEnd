/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Sockets.Servidor;
import java.io.IOException;

/**
 *
 * @author Lisan
 */
public class SocketServidor {
    public static void main(String[] args) throws IOException{
        Servidor servi = new Servidor();
        System.out.println("Iniciando cliente\n");
        servi.startServer();
    }
}
