
package javamt08;

public class JavaMT08 {

    public static void main(String[] args) {
       double prviBroj = 42;
       double drugiBroj = 89.0;
       
       double p = proizvod(prviBroj, drugiBroj);
        System.out.println("Proizvodd je : " +p);
       
    }
    public static double proizvod(double a, double b){
    
    return a * b;
    }
    
}
