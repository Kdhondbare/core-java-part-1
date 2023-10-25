import java.util.ArrayList;
import java.util.List;

public class ListExampleBeforeJava5 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Vikram");
        list.add(100);
        list.add(10.5);

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        String secondItem = (String) list.get(1);//we avoid compile ime type checking using explicit casting
        //But at run time this will fail
        //because right side value is Integer and left side is String
        //hence Integer cannot be converted to string
        //hence exception ClassCastException
    }
}
