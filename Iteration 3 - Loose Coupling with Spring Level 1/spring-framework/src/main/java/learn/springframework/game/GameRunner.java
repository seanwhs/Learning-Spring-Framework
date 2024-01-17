package learn.springframework.game;

public class GameRunner {
    GamingConsole console;

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
