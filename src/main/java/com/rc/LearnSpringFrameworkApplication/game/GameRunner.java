package com.rc.LearnSpringFrameworkApplication.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

// GameRunner class is tightly coupled with MarioGame/ContraGame classes

/*  private final ContraGame game;
    public GameRunner(ContraGame game) {
        this.game = game;
    }
        private final MarioGame game;
*/

//  Level-1: Loose Coupling -> Use of interface instead of class objects

    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }



    public void runGame() {
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
