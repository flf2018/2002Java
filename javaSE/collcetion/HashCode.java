package collcetion;

import java.util.HashMap;


/**
 * @desc hashcode 重写
 * @author mypc
 * @date 2022-09-01
 */
public class HashCode {

    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>(2);
        String str1= "a";
        String str2= "a";
        /**
         * equals 默认继承object 比对象地址是否相对
         * 如果需要比较对象成员属性是否相等，需要重写hashcode
         * 重写 equals 必须重写 hashcode
         * equals 相等 hashcode一 定相同
         * hashcode相同不一定可以 equals
         * hashcode 相同 值不相同 hash冲突
         *
         */
        System.out.println(str1.equals(str2));
        Student student1 = new Student("a",20);
        Student student2 = new Student("a",20);
        //基本类型 == 与 equals一致
        System.out.println(str1 == str1);
        System.out.println(student1.equals(student2));
        //内存地址不一样
        System.out.println(student1 == student2);
        System.out.println(str1.hashCode());
        System.out.println(student2.hashCode());
    }
}
