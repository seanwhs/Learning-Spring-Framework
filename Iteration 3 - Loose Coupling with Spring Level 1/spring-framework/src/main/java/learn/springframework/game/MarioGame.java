package learn.springframework.game;

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
