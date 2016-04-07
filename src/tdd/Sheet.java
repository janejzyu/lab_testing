package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
    Map<String, String> myMap = new HashMap<String, String>();
    
	public String get(String string) {
		String value = myMap.get(string)== null? "" : myMap.get(string);
		String trimedValue = value.trim();
		try{
			Integer.parseInt(trimedValue);
			return trimedValue;
		}
		catch(Exception e) {
			return value;
		}
	}

	public void put(String theCell, String string) {
		myMap.put(theCell, string);		
	}

}
