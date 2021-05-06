package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	
	
	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() +  " : Oyun eklendi ");
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() +  " : Oyun silindi ");
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() +  " : Oyun güncellendi ");
	}



}
