class SinglyLL {

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head = null;
        Node tail = null;
       public void addNode(int data){

            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        void display()
    {
            Node current = head;
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of singly linked list: ");
            while (current != null) {

                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        SinglyLL sList = new SinglyLL();
        sList.addNode(101);
        sList.addNode(102);
        sList.addNode(103);
        sList.addNode(104);
       sList.display();
    }
    }





