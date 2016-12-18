/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetostack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author mahith
 */
public class QueuetoStack<E> {

    /**
     * @param args the command line arguments
     */
    
     Queue queueA = new LinkedList();
     Queue queueB = new PriorityQueue();
     
     public void add(int value){
     
         queueA.add(value);
         //System.out.println();
     
     }
     
     public void remove(){
     
        while(queueB.isEmpty()){
      
            while(!queueA.isEmpty()){
                 
                if(queueA.size()==1){
                     
                     System.out.println(queueA.remove());
                     break;
                }
                queueB.add(queueA.poll());
                 
             }
             
            
        }
        while(queueA.isEmpty()){
        
            while(!queueB.isEmpty()){
             
                queueA.add(queueB.poll());
                 
             }
        }
        
     }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueuetoStack a=new QueuetoStack();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.remove();
        a.remove();
        a.remove();
        a.remove();
    }
    
}











