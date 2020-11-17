

package finalqueue;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author abdelaziz
 */
public class FinalQueue {

  
    public static void main(String[] args) {
        queue q= new queue();
        Scanner sc = new Scanner(System.in);
        int x ;
        do{
            System.out.println("enter your job number");
            x=sc.nextInt();
            q.enqueue(x);
        
        }while(x!=-99);
    }
    
}
