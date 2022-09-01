import java.util.HashMap;

/**
 * @desc Hashset 手写
 * @author mypc
 * @date 2022-09-01
 *
 */
public class HashSetTest<E> {
    private  HashMap map;

    /**
     * hashset 底层是hashmap
     */
    public HashSetTest() {
        map = new HashMap<>();
    }

    /**
     *  hsahset 中的元素值是map集合的key
     *  所以不允许重复、可以为null
     *  所有元素无序
     * @param e
     */
    void add(E e){
        map.put(e,new Object());
    }

    @Override
    public String toString() {
        return "HashSetTest{" +
                "map=" + map +
                '}';
    }

    public static void main(String[] args) {
        HashSetTest<String> set = new HashSetTest<>();
        set.add("a");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add(null);
        System.out.println(set.toString());
    }
}
