package Tarea_Guia7;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

public class Ejer1MainTest {

    public static void main(String[] args) {
       
        
        Scanner teclado = new Scanner(System.in);
        String user;
        String pass, check, hash;
        
        System.out.println("CREACIÓN DE UNA CUENTA:");
        System.out.println("Usuario:");
        user = teclado.nextLine();
        System.out.println("Contraseña:");
        pass = teclado.nextLine();
        System.out.println("Confirmación:");
        check = teclado.nextLine();
        
        Ejer1 us = new Ejer1(user, null);
        us.setPassword(us.hash(pass));
        
        System.out.println("Contraseña:" + us.password);
        System.out.println("Confirmación:" + us.hash(check) + "\n");
        
        if(BCrypt.checkpw(check, us.getPassword())){
            System.out.println("Las contraseñas no coinciden.");
        } else {
            System.out.println("¡Cuenta creada con éxito!");
        }
    }
    
}
