package Test;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListArray {

	public static void main(String[] args) throws JsonProcessingException {
		  List<Integer> l1 = new ArrayList<Integer>();
		  l1.add(1);
		  l1.add(2);
			 System.out.println(l1);

		  ObjectMapper map = new ObjectMapper();
		 String a =  map.writeValueAsString(l1);
		 System.out.println(a);

	}

}
