package learn.springframework;

import learn.springframework.game.GameRunner;
import learn.springframework.game.MarioGame;
import learn.springframework.game.Pacman;
import learn.springframework.game.SupraContra;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SupraContra();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
