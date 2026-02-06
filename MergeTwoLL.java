public class MergeTwoLL {
    public class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //insert function to inster into linked list
    public Node insert(Node head , int data){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node temp = null;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public static void printList(Node n){
        Node head = n;
        while(head != null || head.next != null){
           System.out.println(head.data +"-->");
           head = head.next;
        }
    }

    public Node mergeTwoLinkedList(Node n , Node m){
        Node head1 = n;
        Node head2 = m;

        Node ans = new Node(0);
        Node temp = ans;

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }else{
                temp.next = head2.next;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        if(head1 != null){
            temp.next = head1;
        }else{
            temp.next = head2;
        }

        return ans.next;
    }
    public static void main(String[] args) {

        MergeTwoLL obj = new MergeTwoLL();

        Node n = null;
        Node m = null;

        for(int i= 1;i<7 ;i++){
            n = obj.insert(n, i);
        }

        for(int i =2 ; i<9;i=i+2){
            m = obj.insert(m, i);
        }

        printList(n);
    }
}
