package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	
	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		
		System.out.println(campaign.getCampaignName()+ " Kampanya eklendi");
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + "Kampanya silindi");
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + "Kampanya güncellendi");
	}

	

}
