package observer_Design_pattern;

public class Subscriber implements Observer {
	
	@Override
	public void notified(String title) {

		System.out.println("  Hello " + this.name + " new video uploaded : " + title);
		
	}

	@Override
	public void unsubscribe() {
		System.out.println("channel unsubscribe successfull");
	}

	String name;

	public Subscriber(String name) {
		this.name = name;
	}
}