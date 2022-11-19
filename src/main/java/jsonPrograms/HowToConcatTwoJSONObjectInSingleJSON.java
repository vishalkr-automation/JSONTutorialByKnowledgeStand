package jsonPrograms;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class HowToConcatTwoJSONObjectInSingleJSON {
	
	@Test(enabled=true,description="Creating JSON using String")
	public void f2() {
		
		String str="{\"Mob\":\"9999999999\",\"ID\":\"101\",\"Age\":\"20\",\"Name\":\"Knowledge Stand\"}";
		
		JSONObject js1=new JSONObject(str);
	
		System.out.println(js1);
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("Name", "Mahesh");
		map.put("Age", 1);
		map.put("Amount", 200.12);
		JSONObject js2=new JSONObject(map);
		
		System.out.println(js2);
		
		for(String key:JSONObject.getNames(js1)) {
			js2.put(key, js1.get(key));
		}
		
		System.out.println(js2);
	}

}
