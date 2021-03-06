package ai.jobiak.streams;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
public class TestStreams {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Grapes");
		/*Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String ele = iter.next();
			System.out.println(ele);*/
		//java 8 streams are all about collections
		list.stream().forEach(System.out::println);
		//a Stream has three operations 1 filter(Predicate Interface) 2. map function(Function Interface) and 3 terminal operation(Consumer Interface)
		
		Consumer<String> consumer = (String str)->{System.out.println(str);};
		list.stream().forEach(consumer);
		
		long count = list.stream().count();
		System.out.println(count);
		List<String>letterBList = list.stream().filter(e -> (e.charAt(0) == 'B')).collect(Collectors.toList());
		System.out.println(letterBList);
			
		list.stream().map(e-> e.toUpperCase()).forEach(consumer);
		}
		Function<String,String> upperCaseFunction = (e)->{return e.toUpperCase();};
		}
		

	


