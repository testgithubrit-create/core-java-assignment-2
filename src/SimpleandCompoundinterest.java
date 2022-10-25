     import java.util.*;
public class SimpleandCompoundinterest{
    public static void main(String args[]){
        double p, r, t, s_interest, c_interest;
        p = 25000;
        r = 10;
        t = 4;
        System.out.println("principal = "+p);
        System.out.println("annual rate of interest = "+r);
        System.out.println("time (years) = "+t);
        s_interest = (p * r * t)/100;
        c_interest = p * Math.pow (1.0+r/100.0, t)  - p;
        System.out.println("simple interest: "+s_interest);
        System.out.println("compound interest: "+c_interest);
        
    }

}
