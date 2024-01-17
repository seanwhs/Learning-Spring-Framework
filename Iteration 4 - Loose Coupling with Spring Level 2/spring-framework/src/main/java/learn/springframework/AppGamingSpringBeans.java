//AppGamingSpringBeans.java
package learn.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learn.springframework.game.GamingConsole;
import learn.springframework.game.GameRunner;

public class AppGamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            //Choose the @Primary in GamingConfiguration GamingConsole Type which is pacman()
            context.getBean(GamingConsole.class).up(); 
            //@Qualifier supercedes @Primary in GamingConfiguration  
            // Hence GameRunner chooses GamingConsole Type  SupraContra
            context.getBean(GameRunner.class).run();

        }
    }
}
