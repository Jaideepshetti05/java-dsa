public class JsonStudentParser {

    public static void main(String[] args) {

        String json =
                "{\"name\":\"Rahul\",\"age\":21,\"course\":\"BTech\"}";

        json = json.replace("{", "")
                   .replace("}", "")
                   .replace("\"", "");

        String[] pairs = json.split(",");

        for (String pair : pairs) {

            String[] data = pair.split(":");

            System.out.println(data[0] + " : " + data[1]);
        }
    }
}