package observer_Design_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args) throws NumberFormatException, IOException {

		YouTubeChannel channel = new YouTubeChannel();
		Subscriber ashu = new Subscriber("Ashu");
	

		channel.subscribe(ashu);
		
		channel.newVideoUploaded("learn design pattern");

		// ........................................................

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("press 1 to upload video");
			System.out.println("press 2 to create new subscriber");
			System.out.println("press 3 to exit");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// new video upload code
				System.out.println("enter video title");
				String videoTitle = br.readLine();
				channel.newVideoUploaded(videoTitle);
			} else if (c == 2) {
				// create new subscriber
				System.out.println("Enter name of subscriber : ");
				
				String subName = br.readLine();
				Subscriber subscriber = new Subscriber(subName);
				channel.subscribe(subscriber);
				
			} else if (c == 3) {
				// exit
				System.out.println("Thank you for using app");
				break;
			}else {
				System.out.println("wrong input");
			}

		}

	}
}