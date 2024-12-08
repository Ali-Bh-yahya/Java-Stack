package Map;
import java.util.HashMap;


public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> trackList = new HashMap<String,String>();
		trackList.put("trackOne", "one");
		trackList.put("trackSecond", "Second");
		trackList.put("trackTheird", "Theird");
		trackList.put("trackFour", "Four");
		
		System.out.println(trackList.get("trackOne"));
		System.out.println(trackList.get("trackSecond"));
		
		System.out.println("All Your Tracks !!");
		for (String track : trackList.keySet()) {
			System.out.println("Track: "+track+" \t " +" |Lyrics:"+trackList.get(track));
		}

	}

}
