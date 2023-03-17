public class LinkedList3 {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList3(){
        this.size=0;
    }

    class Node{
        private int value;
        private Node next;
        
        public Node(int value){
            this.value=value;
        }
        
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void insert(int ind , int value){
        if(ind > (size+1) || ind<0){
            return;
        }
        if(ind==0){
            insertFirst(value);
            size++;return;
        }
        if(ind==size){
            insertLast(value);
            size++;return;
        }
        Node temp=head;
        for(int i=1;i<ind;i++){
            temp=temp.next;
        }
        temp.next=new Node(value,temp.next);
        size++;

    }
    public void insertFirst(int value) {
        Node node=new Node(value);
        node.next=head;
        head=node;
        size++;
    }

    public void insertLast(int value) {
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void print(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.value + " => ");
            currentNode=currentNode.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();
        list.insert(0,0);
        list.insert(5,5);
        list.insert(1,1);
        list.insert(2,2);
        list.print();
    }

}
