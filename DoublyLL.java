public class DoublyLL {
    private Node head;
    public int size;

    public DoublyLL(){
        this.size=0;
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }
    }

    public void add(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            head.prev=null;
            size+=1;
        }
        Node last=get(size-1);
        last.next=node;
        node.prev=last;
        node.next=null;
        size+=1;
    }

    public Node get(int n){
        Node node=head;
        while(node.next!=null){
            node=node.next;
        }
        return node;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        head.prev=node;
        head=node;
        size+=1;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        Node last=get(size-1);
        last.next=node;
        node.prev=last;
        node.next=null;
        size+=1;
    }

    public void display(){
        Node node=head;
        for(int i=0;i<size-1;i++){
            System.out.print(node.value + " -> ");
            node=node.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.add(1);
        list.add(1);
        list.display();
        System.out.println(list.size);
    }

}
