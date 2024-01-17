//SupraContra.java
package learn.springframework.game;

import org.springframework.stereotype.Service;

@Service
public class SupraContra implements GamingConsole {
    public void up(){
        System.out.println("SupraContra-Up!!");
    }
    public void down(){
        System.out.println("SupraContra-Sit Down!!!");
    }
    public void left(){
        System.out.println("SupraContra-Go Back!!!");
    }
    public void right(){
        System.out.println("SupraContra-Shoot a Bullet!!!");
    }
}
