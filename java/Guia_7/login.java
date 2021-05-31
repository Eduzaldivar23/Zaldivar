package Guia_7;

import org.mindrot.jbcrypt.BCrypt;

public class Login{
    
    private String nombre;
    private String apellidos;
    private float edad;
    private String departamento;
    private String email;
    private String id_usuario;
    private String password;

    public Login(String nombre, String apellidos, float edad,String departamento, String email, String id_usuario, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.departamento = departamento;
        this.email = email;
        this.id_usuario = id_usuario;
        this.password = password;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public float getEdad() {
        return edad;
    }
    public void setEdad(float edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
        public static String encriptar(String pass){
            
            return BCrypt.hashpw(pass, BCrypt.gensalt());
    
        }
}
