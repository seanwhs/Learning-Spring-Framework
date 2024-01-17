//MarioGame.java
package learn.springframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Marios-Jump!!!");
    }
    public void down(){
        System.out.println("Marios-Go into a hole!!!");
    }
    public void left(){
        System.out.println("Marios-Go Back!!!");
    }
    public void right(){
        System.out.println("Marios-Accelerate!!!");
    }
}
