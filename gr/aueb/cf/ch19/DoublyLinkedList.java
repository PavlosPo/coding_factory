package gr.aueb.cf.ch19;

public class DoublyLinkedList<T> {
    // pointers, just pointers.
    private NodeGeneric<T> head;
    private NodeGeneric<T> tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public void insertFront(T t) {
        NodeGeneric<T> tmp = new NodeGeneric<>();
        tmp.setValue(t);
        tmp.setPrev(null);
        tmp.setNext(head);

        head = tmp;
        if (tmp.getNext() == null) {
            tail = tmp;
        } else  {
            tmp.getNext().setPrev(tmp);
        }
    }

    public void insertEnd(T t) {
        NodeGeneric<T> tmp = new NodeGeneric<>();
        tmp.setValue(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail = tmp;
        if (tmp.getPrev() == null) {
            head = tmp;
        } else {
            tmp.getPrev().setNext(tmp);
        }
    }

    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    /**
     * Time Complexity -> O(1)
     */
    public void deleteFront() {
        if (isEmpty()) return;
        // one item in the list
        if (head.getNext() == null) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void deleteEnd() {
        if (isEmpty()) return;
        // if only one element in the list
        if (head.getNext() == null) {
            head = tail = null;
        } else {    // more than one element in the list
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    /**
     * Time complexity -> O(n)
     * @param t
     * @return
     */
    public NodeGeneric<T> get(T t) {
        for (NodeGeneric<T> n = head; n != null; n = n.getNext()){
            if (n.getValue().equals(t)) {
                return n;
            }
        }
        return null;
    }

    public void traverse() {
        for (NodeGeneric<T> n = head; n != null; n.getNext()) {
            System.out.println(n);
        }
    }
}
