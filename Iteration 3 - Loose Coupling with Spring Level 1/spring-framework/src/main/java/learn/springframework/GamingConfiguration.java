package learn.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learn.springframework.game.GameRunner;
import learn.springframework.game.GamingConsole;
import learn.springframework.game.Pacman;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole gamingConsole(){
        GamingConsole game = new Pacman(); 
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole gamingConsole){
        GameRunner gameRunner = new GameRunner(gamingConsole); 
        return gameRunner;
    }
}
