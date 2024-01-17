//GameRunner.java
package learn.springframework.game;
import org.springframework.stereotype.Service;

@Service
public class GameRunner {
    private GamingConsole console;

    public GameRunner(GamingConsole console){
        this.console = console;
    }

    public void run() {
        System.out.println("Running Game:: " + console);
        console.up();
        console.down();
        console.left();
        console.right();
    }
}
