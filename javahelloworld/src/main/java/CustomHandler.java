import com.amazonaws.services.lambda.runtime.Context;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Map;

public class CustomHandler {

        public String handler(Map<String, String> input, Context context)
            throws JsonProcessingException
        {
            return "Hello world from custom handler";
        }

}
