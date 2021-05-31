
package Guia_7;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

public class Bcrypt {

    public static void main(String[] args) {
        String nombre;
        String apellidos;
        Float edad;
        String departamento;
        String email;
        String id_usuario;
        String password;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del usuario :");
        nombre = teclado.nextLine();
        System.out.println("Ingresa el apellido del usuario :");
        apellidos = teclado.nextLine();
        System.out.println("Ingresa la edad :");
        edad = Float.parseFloat(teclado.nextLine());
        System.out.println("Ingresa el departamento :");
        departamento = teclado.nextLine();
        System.out.println("Ingresa el email :");
        email = teclado.nextLine();
        System.out.println("Ingresa el id :");
        id_usuario = teclado.nextLine();
        System.out.println("Ingresa el password :");
        password = teclado.nextLine();
        
        String pass_hash;
        
        pass_hash = Login.encriptar(password);
        
        Login registro;
        registro = new Login(nombre, apellidos, edad, departamento, email, id_usuario, pass_hash);
        
        System.out.println("Los datos de registro son:");
        System.out.println("Nombre:" + registro.getNombre());
        System.out.println("Apellios:" + registro.getApellidos());
        System.out.println("Edad:" + registro.getEdad());
        System.out.println("Departamento:" + registro.getDepartamento());
        System.out.println("Email:" + registro.getEmail());
        System.out.println("Id:" + registro.getId_usuario());
        System.out.println("Password:" + registro.getPassword());
        
        String password_check;
        System.out.println("Ingresa el password a verificar :");
        password_check = teclado.nextLine();
        
        if (BCrypt.checkpw(password_check, registro.getPassword())){
            
            System.out.println("El password es correcto");
            
        } else {
            
            System.out.println("El password es incorrecto");
            
        }
        
    }
    
}
