package volodymyr;

public class Application {

	public static void main(String[] args) {
		
		MyMap<Integer, String> myMap = new MyMap<>();
		
		myMap.addNewObject(5, "Five");
		myMap.addNewObject(4, "Four");
		myMap.addNewObject(3, "Three");
		myMap.addNewObject(2, "Two");
		myMap.addNewObject(1, "One");
		
		System.out.println(myMap.getEntryMap());
		
		myMap.deleteObjectForKey(2);
		
		System.out.println(myMap.getEntryMap());
		
		myMap.deleteObjectForValue("Four");
		
		System.out.println(myMap.getEntryMap());
		
		myMap.showSetKeys();
		
		myMap.showListOfValues();
		
		myMap.showMyMap();
		
	}
	
}
