package ro.sda.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.ls.LSOutput;

public class Main {
    static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {

        User u1 = new User("Beinur", 36);
        serializeAndPrint(u1);

        deSerializeAndPrint("{\"name\":\"Emel\",\"age\":33}");


    }

    private static void serializeAndPrint(User u) throws JsonProcessingException {

        //serializing an object means to transform it from a java object to a jason object
        String serialized = mapper.writeValueAsString(u);

        System.out.println(serialized);
    }

    private static void deSerializeAndPrint(String jsonObject) throws JsonProcessingException {
        //  transform from json to java object
        User user = mapper.readValue(jsonObject, User.class);
        System.out.println(user);

    }
}