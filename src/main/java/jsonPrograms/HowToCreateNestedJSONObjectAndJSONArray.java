package jsonPrograms;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class HowToCreateNestedJSONObjectAndJSONArray {

	public static void main(String[] args) {
		
String str="{\"Mob\":\"9999999999\",\"ID\":\"101\",\"Age\":\"20\",\"Name\":\"Knowledge Stand\"}";
		
		JSONObject child=new JSONObject(str);
		System.out.println(child);
			
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("Name", "Mahesh");
		map.put("Age", 1);
		map.put("Amount", 200.12);
		JSONObject parent=new JSONObject(map);
		
		System.out.println(parent);
		 
		//Nested Object
		parent.put("NestedObject", child);
		
		System.out.println(parent);
		
		JSONArray jsArr=new JSONArray();
		jsArr.put(10);
		jsArr.put(20);
		
		parent.put("NestedArray", jsArr);
		
		System.out.println(parent);
	

	}

}
