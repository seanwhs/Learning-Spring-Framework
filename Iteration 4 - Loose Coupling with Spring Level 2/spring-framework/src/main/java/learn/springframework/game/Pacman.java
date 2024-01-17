//Pacman.java
package learn.springframework.game;

import org.springframework.stereotype.Service;

@Service
public class Pacman implements GamingConsole{
    public void up(){
        System.out.println("Pacman--Up!!!");
    }
    public void down(){
        System.out.println("Pacman--Down!!!");
    }
    public void left(){
        System.out.println("Pacman--Left!!!");
    }
    public void right(){
        System.out.println("Pacman--Right!!!");
    }
}
