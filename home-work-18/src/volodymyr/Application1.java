package volodymyr;

import java.util.ArrayList;
import java.util.List;

public class Application1 {

	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		listAdd(list);
		System.out.println(list);

	}

	@SuppressWarnings("unchecked")
	public static <S> void listAdd(List<S> list) {
				
		list.add((S) (Integer) 5);
		list.add((S) "String");
		
	}

}
