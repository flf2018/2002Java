/**
 * @author mypc
 * @date 2022-08-31
 * @desc LinkedList手写
 *
 */

public class LinkedListTest {

    private class Node<E>  {
        E item;
        Node<E> next;
        Node<E> prev;
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }


}
