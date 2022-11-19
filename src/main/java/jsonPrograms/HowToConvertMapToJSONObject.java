package jsonPrograms;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class HowToConvertMapToJSONObject {
	
	@Test
	public void f1() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("Name", "Mahesh");
		map.put("Age", 1);
		map.put("Amount", 200.12);
		
		System.out.println("Map Items: "+ map);
		
		JSONObject obj=new JSONObject(map);
		
		System.out.println("JSON Items: "+ obj);
	}

}
