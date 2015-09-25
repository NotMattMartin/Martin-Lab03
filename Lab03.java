// Lab03Dst.java
// The Visible Average Program
// This is the student, starting version, of Lab 03C.


public class Lab03
{
    public static void main(String args[])
    {
        System.out.println("Lab 03D");
        System.out.println();
        
        int num1 = 11;
        int num2 = 22;
        int num3 = 33;
        int num4 = 44;
        int num5 = 55;
        int total = 0;
        int average = 0;
        
        System.out.println("1st Integer: " + num1);
        System.out.println("2nd Integer: " + num2);
        System.out.println("3rd Integer: " + num3);
        System.out.println("4th Integer: " + num4);
        System.out.println("5th Integer: " + num5);
        System.out.println("-------------------");
        
        total = num1 + num2 + num3 + num4 + num5;
        System.out.println("Int Total: " + "  " + total);
        
        average = total / 5;
        System.out.println("Int Average: " + average);
        System.out.println();
        
        double realnum1 = 55.55;
        double realnum2 = 66.66;
        double realnum3 = 77.77;
        double realnum4 = 88.88;
        double realnum5 = 99.99;
        double realtotal;
        double realaverage;
        
        System.out.println("1st real num: " + realnum1);
        System.out.println("2nd real num: " + realnum2);
        System.out.println("3rd real num: " + realnum3);
        System.out.println("4th real num: " + realnum4);
        System.out.println("5th real num: " + realnum5);
        System.out.println("-------------------");
        
        realtotal = realnum1 + realnum2 + realnum3 + realnum4 + realnum5;
        System.out.println("Real Total: " + "  " + realtotal);
        
        realaverage = total / 5;
        System.out.println("Real Average: " + realaverage);

    }
}
