/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svv.pkg01;

/**
 *
 * @author chicken-little
 */
public class Svv01 {

    /**
     * @param args the command line arguments
     */
    public static void checkTriType(int a,int b,int c){
        if(a>0 && b>0 & c>0){
            if(((a+b)>c) || ((a+c)>b) || ((b+c)>a) ){
                if(a == b & b == c){
                    System.out.println("Equilateral Triangle");
                }
                else if(a == b || a == c || b == c){
                    System.out.println("Isolate Triangle");
                }
                else if(a != b & a != c){
                    System.out.println("Scalene");
                }
                
            }
            else{
                System.out.println("NOt Triangle");
            }
 
        }
        else{
            System.out.println("Not triangle");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        checkTriType(2,2,2);
        checkTriType(2,2,4);
        checkTriType(1,2,-2);
        checkTriType(1,2,2);
        
        
    }
}
