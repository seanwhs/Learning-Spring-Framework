# Spring Framework Learning: README.md

## Overview

Let's analyse the "AppGamingSpringBeans.java" and "GamingConfiguration.java" code.

## Code Breakdown

```
// AppGamingSpringBeans.java
package learn.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import learn.springframework.game.GamingConsole;
import learn.springframework.game.GameRunner;

public class AppGamingSpringBeans {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            // Choose the @Primary in GamingConfiguration GamingConsole Type which is pacman()
            context.getBean(GamingConsole.class).up();
            // @Qualifier supersedes @Primary in GamingConfiguration  
            // Hence GameRunner chooses GamingConsole Type SupraContra
            context.getBean(GameRunner.class).run();
        }
    }
}
```

```
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

```
## Code Explanation

1. **Primary Bean Selection (`context.getBean(GamingConsole.class).up();`):**
   - Requests a bean of type `GamingConsole` without specifying a qualifier.
   - When multiple beans of the same type exist, Spring uses the one marked with `@Primary`.
   - In `GamingConfiguration`, the `@Primary` bean is `Pacman`, so it prints "Pacman--Up!!!".

2. **Qualifier Annotation Usage (`context.getBean(GameRunner.class).run();`):**
   - Requests a bean of type `GameRunner`.
   - In `GamingConfiguration`, the `GameRunner` bean has a dependency of type `GamingConsole`.
   - The dependency is explicitly qualified with `@Qualifier("Supra")`.
   - It injects the `SupraContra` bean into `GameRunner`, and it prints the methods from the `SupraContra` class.
   - In this context, the `@Qualifier` takes precedence over `@Primary`.

