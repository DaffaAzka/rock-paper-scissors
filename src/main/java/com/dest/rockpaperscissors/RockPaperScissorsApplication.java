package com.dest.rockpaperscissors;

import com.dest.rockpaperscissors.service.Play;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RockPaperScissorsApplication {

	public static void main(String[] args) {
		Play play = new Play();
		play.play();
	}

}
