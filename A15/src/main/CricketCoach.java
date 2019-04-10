package main;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice 15 minutes daily" ;
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
