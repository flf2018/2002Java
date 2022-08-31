/**
 * @author mypc
 * @date 2022-08-31
 * @desc LinkedList手写
 */

public class LinkedListTest<E> {

    private int size;
    /**
     * 首节点
     */
    private Node<E> first;
    /**
     * 尾节点
     */
    private Node<E> last;

    private class Node<E> {
        //当前节点值
        E item;
        //下一个节点
        Node<E> next;
        //上一个节点
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

    }

    /**
     * 新增
     *
     * @param e
     */
    public void add(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<E>(l, e, null);
        last = newNode;
        if (l == null) {
            //首次新增
            first = last;
        } else {
            //尾节点添加
            l.next = newNode;
        }
        size++;
    }

    /**
     * 查询
     * @param index
     * @return
     */
    Node<E> node(int index) {
        //从首节点查询到当前节点
        if (index < size >> 1) {
            Node<E> f = first;
            for (int i = 0; i < index; i++) {
                f = f.next;
            }
            return f;
        } else {
            //从尾节点查询到当前节点
            Node<E> l = last;
            for (int i = index; i < size - 1; i++) {
                l = l.prev;
            }
            return l;
        }
    }

    public Object  get(int index){
        if (index > size-1){
            return  "ArrayIndexOutOfBoundsException";
        }else {
            return node(index).item;
        }
    }

    public static void main(String[] args) {
        LinkedListTest<String> list = new LinkedListTest<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.get(3));

    }

}
