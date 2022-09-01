package collcetion.map;


import java.util.Objects;

/**
 * @author mypc
 * @desc HashMap 手写
 * @date 2022-09-01
 */
public class HashMapTest<K, V> {

    /**
     * 1.7 数组+链表
     * 1.8 数组+链表+红黑树
     *
     * @param <K>
     * @param <V>
     */

    private Entry[] entrys = new Entry[1234];

    class Entry<K, V> {
        /**
         * key的hash值,内存地址转整型
         */
        int hash;

        K k;
        V v;
        Entry<K, V> next;

        Entry(K k, V v, int hash) {
            this.k = k;
            this.v = v;
            this.hash = hash;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry<?, ?> entry = (Entry<?, ?>) o;
            return Objects.equals(k, entry.k);
        }

        @Override
        public int hashCode() {
            return Objects.hash(k);
        }
    }

    /**
     * 新增
     *
     * @param k
     * @param v
     */
    public void put(K k, V v) {
        /**
         * 根节key的hashcode 取余 entrys.length key存放
         * index 为当前key在数组当中的下标
         * hashcode相同但是值不相同会产生hash冲突
         * 1.7 通过链表来解决hash冲突
         * 1.先判断index处是否存储链表
         * 2.取出该entry链表
         *
         */
        int index = k.hashCode() % entrys.length;
        int hash = k.hashCode();
        Entry entry = entrys[index];
        if (entry == null) {
            //没有hash冲突
            entrys[index] = new Entry<K, V>(k, v, hash);
        } else {
            entry.next = new Entry<K, V>(k, v, hash);
        }
    }

    /**
     * 查询
     *
     * @param k
     * @return
     */
    public V get(K k) {
        //通过hash值获取 index
        int index = k.hashCode() % entrys.length;
        int hash = k.hashCode();
        for (Entry<K, V> entry = entrys[index]; entry != null; entry = entry.next) {
            if (entry.hash == hash && (k.equals(entry.k) || k==entry.k )){
                return entry.v;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMapTest map = new HashMapTest();
        map.put("a", "97");
        map.put("97", "98");
        System.out.println(map.get("a"));
        System.out.println(map.get("97"));
    }


}
