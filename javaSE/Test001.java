import java.util.ArrayList;
import java.util.List;

/**
 * @author mypc
 */
public class Test001  extends  Object {
    public static void main(String[] args) {
        List<String>  list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.remove(1);
        System.out.println(list.get(3));

    }

}
