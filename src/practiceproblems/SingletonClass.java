/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

/**
 *
 * @author Jagadheesan Balu
 */
 class SingletonClass {
    
    private static SingletonClass obj;
    
    private int i;
    
    private SingletonClass() {
        
    }
    
    public static SingletonClass getInstance() {
        if(obj == null) {
            obj = new SingletonClass();
        }
        return obj;
        
    }
    
    public static void main(String[] args) {
        SingletonClass object = SingletonClass.getInstance();
        object.i = 10;
        System.out.println(object.i);
        
         SingletonClass object2 = SingletonClass.getInstance();
        //object2.i = 10;
        System.out.println(object2.i);
    }
}
