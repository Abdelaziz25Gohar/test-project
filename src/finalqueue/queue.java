

package finalqueue;

/**
 *
 * @author Abdelaziz
 */
public class queue {
     public Node head;
     int size=1;
     int t=1;
     
    public queue() {
    head = null;
    }
    
    public void addfist(int d){
    if (head==null)
        head=new Node(d, null);
    else 
    {
    Node n =new Node(d, head);
    head = n;
    }
    }
    public void dequeue(){
        if(head==null)
            System.out.println("removed");
        else
        {
            size--;
            System.out.println("job "+head.data+"is processed");
            head=head.next;
            
        }
    }
    public void enqueue(int d){
    if(head==null)
        head=new Node(d, null);
    else 
    {
        if (d == 0)
        {
            t=t+1;
            print(t);
        }
        else if (d==-99)
        {
          System.out.println("Company is now closing");
            System.out.println("remaining number of jobs in the queue "+ size );
        }
        else
        {
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        Node n=new Node(d, null);
        current.next=n;
        size++;
        t=t+1;
        print(t);
        }
    }
    }
    
    public void print(int t)
    {
        if (t%5==0)
        {
            dequeue();
        } }
}
