package jsonPrograms;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class HowToCreateJSONObject {
	
	@Test(enabled =false,description="Creating JSON using JSON Class")
	public void f1() {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name", "Knowledge Stand");
		jsonObject.put("Age", "20");
		jsonObject.put("ID", "101");
		jsonObject.put("Mob", "9999999999");
		
		System.out.println(jsonObject);
		
	}
	
	@Test(enabled=true,description="Creating JSON using String")
	public void f2() {
		
		String str="{\"Mob\":\"9999999999\",\"ID\":\"101\",\"Age\":\"20\",\"Name\":\"Knowledge Stand\"}";
		
		JSONObject jsonObject=new JSONObject(str);
	
		System.out.println(jsonObject);
		
	}

}
