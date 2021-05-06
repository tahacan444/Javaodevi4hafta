package Entities;

public class Game {

	private int id;
	private String gameName;
	private String gamePrice;
	public Game(int id) {
		super();
		this.id = id;
	}
	public Game() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(String gamePrice) {
		this.gamePrice = gamePrice;
	}
	
}
