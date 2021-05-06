import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Sales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game game = new Game();
		game.setGameName("Pubg");
		game.setGamePrice("100");
		game.setId(1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
	        
        
		Campaign campaign  = new Campaign();
		campaign.setCampaignName(" Çekiliş ");
		campaign.setDiscountAmount(100);
		campaign.setId(2);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.update(campaign);
		
		Sales sales = new  Sales();
		sales.setId(1);
		sales.setSalesAmount("100 TL");
		
		SalesManager salesManager = new  SalesManager();
		salesManager.pricing(sales);
		
		
		
		BaseCustomerManager customerManager = new UserManager(new MernisServiceAdapter());
	    
		customerManager.save(new Customer("taha","can",1,123456,45));
			
		
		
		

	}

}
