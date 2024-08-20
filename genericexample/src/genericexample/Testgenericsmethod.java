package genericexample;

public class Testgenericsmethod {

	public <K> void showdata(K[] arr) {
		for(K a1 : arr) {
			System.out.println(a1);
		}
	//System.out.println();	
	};
}
