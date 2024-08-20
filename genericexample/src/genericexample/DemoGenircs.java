package genericexample;

public class DemoGenircs {

	public static void main(String[] args) {

//		Sender <Integer,Integer> s1 = new Sender<Integer,Integer>();
//		s1.setData(12);
//		s1.setData1(20);
//		System.out.println(s1.getData()+s1.getData1());
//		Sender <String,Float> s2 = new Sender<String,Float>();
//		s2.setData("Hello");
//		s2.setData1((float) 15.6);
//		System.out.println(s2);
//		
		
		Testgenericsmethod tm = new Testgenericsmethod();
		Integer [] arr = {11,22,33,44,55,4};
		tm.showdata(arr);
	}

}
