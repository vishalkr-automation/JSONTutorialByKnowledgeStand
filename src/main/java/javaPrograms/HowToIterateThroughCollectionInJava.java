package javaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class HowToIterateThroughCollectionInJava {
	List<Integer> list;

	public void readList() {
		list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}

	@Test(enabled = false)
	public void f1() {
		readList();
		// For Loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	@Test(enabled = false)
	public void f2() {
		readList();
		// For Each Loop
		for (Integer i : list) {
			System.out.println(i);
		}

	}

	@Test(enabled = false)
	public void f3() {
		readList();
		//Lambda Expression
		list.forEach(item->System.out.println(item));
	}
	
	@Test(enabled = false)
	public void f4() {
		Set<String> set=new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("10");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	@Test(enabled = true)
	public void f5() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("Name", "Anup");
		map.put("Id", 101);
		map.put("Amount", 1000.1);
		
		for(Map.Entry<String, Object> entry:map.entrySet()) {
			String key=entry.getKey();
			Object value=entry.getValue();
			
			System.out.println("Key: "+key+" Value: "+value);
			
		}
		
	}
}
