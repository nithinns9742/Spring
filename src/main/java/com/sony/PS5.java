package com.sony;

public class PS5 {
	
	public Game game;
	
	public PS5() {
		System.out.println("0-para");
	}
	
	public PS5(Game game) {
		this.game=game;
		System.out.println("para cons");
	}
	
	public void setGame(Game game) {
		this.game=game;
		System.out.println("setter() called");
	}
	
	void playGames() {
	System.out.println("play started to play");
	}

}
