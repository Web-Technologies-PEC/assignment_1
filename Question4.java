public class Question4 {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 10;

        System.out.println("Using Temporary Variable");
        System.out.println("n1 = " + n1 + " & " + "n2 = " + n2);
        int var;
        var = n1;
        n1 = n2;
        n2 = var;
        System.out.println("After Swapping " + "n1 = " + n1 + " & " + "n2 = " + n2);
        System.out.println();

        int m1 = 14;
        int m2 = 7;
        System.out.println("Without using Temporary Variable");
        System.out.println("m1 = " + m1 + " & " + "m2 = " + m2);
        m1 = m1 + m2;
        m2 = m1 - m2;
        m1 = m1 - m2;
        System.out.println("After Swapping " + "m1 = " + m1 + " & " + "m2 = " + m2);
    }
}
