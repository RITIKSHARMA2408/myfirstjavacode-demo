public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data = data;
            this.next = null;
        }
    }

    // add first, last
    public void addfirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currNode = head;

        while(currNode.next != null){
          // System.out.print(currNode.data + "->");
          // jb yha p ye likha tha to do baar output me is a rha tha.
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }
    public void printlist(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    // delete first
    public void deleteFirst(){
        if(head ==null){
            System.out.println("The list is empty.");
           return;
        }
        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        if(head.next ==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    public static void main(String[] args){
        LL list = new LL();
        list.addfirst("name");
        list.addfirst("is");
        list.addlast("Ritik");
        list.addfirst("My");
        list.printlist();


        list.deleteFirst();
        list.printlist();


        list.deleteLast();
        list.printlist();
        // add, print, size, delete this is done above by scratch method.
    }
}
