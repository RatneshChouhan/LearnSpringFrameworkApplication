package com.rc.LearnSpringFrameworkApplication;

import com.rc.LearnSpringFrameworkApplication.game.ContraGame;
import com.rc.LearnSpringFrameworkApplication.game.GameRunner;
import com.rc.LearnSpringFrameworkApplication.game.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		/*No changes required in GameRunner class is required to call runGame() with different Game Objects*/
		System.out.println("-----------------------------------------------------");
		MarioGame marioGame = new MarioGame();
		GameRunner runner = new GameRunner(marioGame);
		runner.runGame();
		System.out.println("-----------------------------------------------------");
		ContraGame contraGame = new ContraGame();
		runner = new GameRunner(contraGame);
		runner.runGame();
		System.out.println("-----------------------------------------------------");
	}

}
