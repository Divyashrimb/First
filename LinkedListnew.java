class LinkedList{
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list, int data)
    {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void print(LinkedList list)
    {
        Node n = list.head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l = insert(l, 11);
        l = insert(l, 12);
        l = insert(l, 13);
        print(l);
    }
}

