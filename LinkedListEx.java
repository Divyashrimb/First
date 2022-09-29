class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class MyLinkedList {
    Node add(int data){
        Node n = new Node(data);
        return n;
    }
    int findLastNode(Node n){
        int temp = n.next.next.next.data;
        return temp;
    }

}
class Node1{
    public static void main(String[] args) {
        System.out.println("Linked List");
        MyLinkedList l1 = new MyLinkedList();//created object
        Node n1 = l1.add(5); //reference of an object
        Node n2 = l1.add(6);
        Node n3 = l1.add(7);
        Node n4 = l1.add(8);
        Node n5 = l1.add(9);
        n1.next = n2; //connected
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        int i = l1.findLastNode(n1);//calling the function
        System.out.println(i);
    }
}
