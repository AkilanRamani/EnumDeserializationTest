package Test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class NumericStringSerializer  extends JsonSerializer<Boolean> {  
  
    // override serialize() method of JsonSerializer  
        



		@Override
		public void serialize(Boolean value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
			// TODO Auto-generated method stub
			gen.writeString(value ? "1" : "0"); //true 
		}
}