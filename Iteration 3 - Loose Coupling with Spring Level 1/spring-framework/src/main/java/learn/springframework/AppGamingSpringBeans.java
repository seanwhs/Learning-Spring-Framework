package learn.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learn.springframework.game.GamingConsole;
import learn.springframework.game.GameRunner;

public class AppGamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();

        }
    }
}
