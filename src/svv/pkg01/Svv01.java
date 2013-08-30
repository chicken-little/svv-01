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
    public static String checkTriType(int a,int b,int c){
        String result =  "";
        if(a>0 && b>0 & c>0){
            if(((a+b)>c) || ((a+c)>b) || ((b+c)>a) ){
                if(a == b & b == c){
                    result = "Equilateral Triangle";
                }
                else if(a == b || a == c || b == c){
                    result = "Isolate Triangle";
                }
                else if(a != b & a != c){
                    result = "Scalene";
                }
                
            }
            else{
                result = "NOt Triangle";
            }
 
        }
        else{
            result = "Not triangle";
        }
        return result;
        
        
    }
    
    /*public static void nextDate(int d, int m,int y){
        if( int 1 <= d <= int 31 & int 1<= m<= int 12 & int 1812 <= y <= int 3000){
        
            
        }
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        checkTriType(2,2,2);
        checkTriType(2,2,4);
        checkTriType(1,2,-2);
        checkTriType(1,2,2);
        System.out.print(checkTriType(2,2,2) + checkTriType(2,2,4) + checkTriType(1,2,-2)+checkTriType(1,2,2));
        
    }
}
