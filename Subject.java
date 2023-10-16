package observer_Design_pattern;

public interface Subject {

	void subscribe(Observer ob);

	void unsubscribe(Observer ob);

	void newVideoUploaded(String title);
	
	
	

}
