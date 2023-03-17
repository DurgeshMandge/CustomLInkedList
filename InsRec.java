public class InsRec {
    private Node head;
    private int size;

    class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value=val;
        }
        
        public Node(int val, Node next){
            this.value=val;
            this.next=next;
        }
    }

    public void insert(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size++;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            size++;
            return;
        }
        node.next=head;
        head=node;
        size++;
    }

    public void print(){
        Node node = head;
        while(node!=null){
            System.out.print(node.value + " -> ");
            node=node.next;
        }
        System.out.println("End");
    }

    public void insInd (int val, int ind){
        head=insRec(val, ind, head);
    }

    public Node insRec (int val, int ind, Node node){
        if(ind==0){
            Node newNode = new Node (val);
            newNode.next=node;
            size++;
            return newNode;
        }

        node.next=insRec(val, --ind, node.next);
        return node;
    }

    public InsRec merge(InsRec first, InsRec sec){
        Node head1=first.head;
        Node head2=sec.head;
        InsList ans=new InsList();
        while(head1.next!=null || head2.next!=null){
            if(head1.value<head2.value){
                if(ans.head==null){ans.head=head1;}
                else{ans.head.next=head1;ans.head=ans.head.next;}
            }else{
                if(ans.head==null){ans.head=head1;}
                else{}
            }
        }
    }

    public static void main(String[] args) {
        InsRec list = new InsRec();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insInd(41, 1);
        list.print();
    }
  
}
