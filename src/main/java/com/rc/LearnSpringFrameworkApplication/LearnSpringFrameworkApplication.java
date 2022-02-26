package com.rc.LearnSpringFrameworkApplication;

import com.rc.LearnSpringFrameworkApplication.game.GameRunner;
import com.rc.LearnSpringFrameworkApplication.game.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		MarioGame marioGame = new MarioGame();
		GameRunner runner = new GameRunner(marioGame);
	//	ContraGame contraGame = new ContraGame();
	//	GameRunner runner = new GameRunner(contraGame);
		runner.runGame();
	}

}
