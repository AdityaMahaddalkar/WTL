package main;

public class BaseballCoach implements Coach {

	FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily 30 minutes practice";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	

}
