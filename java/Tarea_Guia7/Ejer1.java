
package Tarea_Guia7;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author giama
 */
public class Ejer1 {
    
    public String user;
    public String password;

    public Ejer1(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String hash(String pass){
        
        return BCrypt.hashpw(password, BCrypt.gensalt());
        
    }   
}
