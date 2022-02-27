package com.rc.LearnSpringFrameworkApplication;

import com.rc.LearnSpringFrameworkApplication.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan("com.rc.LearnSpringFrameworkApplication1")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		// ApplicationContext/BeanFactory ---> are called Spring IOC Container which done Inversion Of Control,
		// i.e. Bean Object Creation and Dependency Injection
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class,args);
		final GameRunner runner = context.getBean(GameRunner.class);
		runner.runGame();

		/*No changes required in GameRunner class is required to call runGame() with different Game Objects*/
	/*	System.out.println("-----------------------------------------------------");
		MarioGame marioGame = new MarioGame();	// ---> Bean Object Creation
		GameRunner runner = new GameRunner(marioGame); // ---> Injecting Dependency Manual
		runner.runGame();
		System.out.println("-----------------------------------------------------");
		ContraGame contraGame = new ContraGame();	// ---> Bean Object Creation
		runner = new GameRunner(contraGame);		// ---> Injecting Dependency Manual
		runner.runGame();
		System.out.println("-----------------------------------------------------");*/
	}

}
