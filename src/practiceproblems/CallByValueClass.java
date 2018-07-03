/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

/**
 *
 * @author Jagadheesan Balu
 */
public class CallByValueClass {
     
  int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the local variable only  
 }  
  void change2(CallByValueClass o){  
 o.data=100;//changes will be in the local variable only  
 }  
  static void swap(CallByValueClass o,CallByValueClass p){  
      CallByValueClass temp = p;
      p = o;
      o = temp;
      o.data = 55;
      System.out.println(o.data+","+p.data);
 }  
     
 public static void main(String args[]){  
   CallByValueClass op=new CallByValueClass();  
  CallByValueClass op1=new CallByValueClass(); 
  CallByValueClass op2=new CallByValueClass(); 
  op1.data = 150;
  op2.data = 200;
   System.out.println("before change "+op.data);  
   //op.change(500); 
   //op.change2(op);
   op.swap(op1, op2);
   
   System.out.println("after change "+op.data); 
   System.out.println("after change1 "+op1.data);
   System.out.println("after change2 "+op2.data);
  
   
}
}
