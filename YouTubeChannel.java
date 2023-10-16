package observer_Design_pattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

	List<Observer> subscriber = new ArrayList<Observer>();

	@Override
	public void subscribe(Observer ob) {
		this.subscriber.add(ob);
	}

	@Override
	public void unsubscribe(Observer ob) {
		this.subscriber.remove(ob);
		ob.unsubscribe();
		
	}

	@Override
	public void newVideoUploaded(String title) {
		for (Observer ob : this.subscriber) {
			ob.notified(title);
		}

	}

	

}
