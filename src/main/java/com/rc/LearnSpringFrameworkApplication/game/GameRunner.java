package com.rc.LearnSpringFrameworkApplication.game;

public class GameRunner {

    private final MarioGame game;
//  private final ContraGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    /*public GameRunner(ContraGame game) {
        this.game = game;
    }*/

    public void runGame() {
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
