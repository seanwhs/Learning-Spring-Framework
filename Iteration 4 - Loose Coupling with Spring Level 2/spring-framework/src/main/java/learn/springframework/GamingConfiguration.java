// GamingConfiguration.java
package learn.springframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import learn.springframework.game.GameRunner;
import learn.springframework.game.GamingConsole;
import learn.springframework.game.MarioGame;
import learn.springframework.game.Pacman;
import learn.springframework.game.SupraContra;

@Configuration
public class GamingConfiguration {

    @Bean
    @Primary
    public GamingConsole pacman() {
        return new Pacman();
    }

    @Bean
    public GamingConsole marioGame() {
        return new MarioGame();
    }

    @Bean
    @Qualifier("Supra")  // Use the same qualifier name here
    public GamingConsole supraContra() {
        return new SupraContra();
    }

    @Bean
    public GameRunner gameRunner(@Qualifier("Supra") GamingConsole gamingConsole) {
        return new GameRunner(gamingConsole);
    }
}
