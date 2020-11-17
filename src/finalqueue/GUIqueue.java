

package finalqueue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Abdelaziz
 */
public class GUIqueue extends JFrame{
    JButton close,insert;
    JLabel ins,print,left,print2,left2;
    JTextField insertNum;
    JPanel main,p1,p2,p3,p4;
    queue q=new queue();
    int number;
      public Node head;
     int size=1;
     int t=1;
    
    public GUIqueue() throws HeadlessException {
         main=new JPanel(new BorderLayout());
         head = null;
         create();
         add(main);
    }

         public void create(){
             p1=new JPanel(new GridLayout(4, 1));
             p2=new JPanel(new GridLayout(1,3));
             ins=new JLabel("Insert");
             p2.add(ins);
             insertNum = new JTextField(25);
             p2.add(insertNum);
             insert=new JButton ("Insert");
             p2.add(insert);
             p1.add(p2);
              p3=new JPanel(new GridLayout(1,2));
             print=new JLabel("Print");
             p3.add(print);
             print2=new JLabel();
             p3.add(print2);
             p1.add(p3);
             p4=new JPanel(new GridLayout(1,2));
             left=new JLabel("Left");
             p4.add(left);
              left2=new JLabel();
             p4.add(left2);
             p1.add(p4);
             close=new JButton("Close");
             p1.add(close);
             main.add(p1,BorderLayout.CENTER);
             insert.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                number=Integer.parseInt(insertNum.getText());
                enqueue(number);
                insertNum.setText(" ");
            }
        });
//         oneCol=new JPanel(new GridLayout(4, 1));
//         req=new JLabel("reg");
//         oneCol.add(req);
//         twoCol=new JPanel(new GridLayout(1,2));
//            insertNum=new JTextField();
//         twoCol.add(insertNum);
//         insert=new JButton("insert");
//         twoCol.add(insert);
//         oneCol.add(twoCol);
//       
//         printTurn= new JLabel("printTurn");
//         oneCol.add(printTurn);
//         threeCol=new JPanel(new GridLayout(1,2));
//         printNum=new JTextField(25);
//         threeCol.add(printNum);
//         close=new JButton("Close");
//         threeCol.add(close);
//          oneCol.add(threeCol);
//      
//         main.add(oneCol);

//         }
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