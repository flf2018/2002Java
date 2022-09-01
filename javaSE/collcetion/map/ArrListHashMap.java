package collcetion.map;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author mypc
 * @desc 基于arraylist手写hashmap
 * @date 2022-09-01
 */
public class ArrListHashMap<K, V> {

    ArrayList<Entry<K, V>> list = new ArrayList<>();

    class Entry<K, V> {
        K k;
        V v;

        Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Entry<?, ?> entry = (Entry<?, ?>) o;
            return Objects.equals(k, entry.k) &&
                    Objects.equals(v, entry.v);
        }

        @Override
        public int hashCode() {
            return Objects.hash(k, v);
        }
    }

    /**
     * 新增
     * @param k
     * @param v
     */
    public void put(K k, V v) {
        list.add(new Entry(k, v));
    }

    /**
     * 查询
     * @param k
     * @return
     */
    public V get(K k) {
        for (Entry<K, V> entry :list){
            if (entry.k.equals(k)){
                return  entry.v;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        ArrListHashMap list= new ArrListHashMap();
        list.put("1","2");
        list.put("1","2");
        System.out.println(list.get("1"));
    }

}
