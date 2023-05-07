/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import Sockets.Cliente;
import java.io.IOException;

/**
 *
 * @author Lisan
 */
public class SocketCliente {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Cliente cli = new Cliente(); //Se crea el
        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente

    }
    
}
