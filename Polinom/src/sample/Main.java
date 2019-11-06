package sample;



public class Main {

    public static void main(String[] args) {

        int c = 3;

        double[] m = new double[8];
        m[0] = -1;
        m[1] = -1;
        m[2] = -7;
        m[3] = 1;
        m[4] = 0;
        m[5] = -6;
        m[6] = 2;
        m[7] = -8.5;

        Polynom a = new Polynom(m);
        System.out.println(a);

        double[] m2 = new double[8];
        m2[0] = 0;
        m2[1] = 2;
        m2[2] = 3;
        m2[3] = -4;
        m2[4] = 4;
        m2[5] = 0;
        m2[6] = -1;
        m2[7] = 1;

        Polynom b = new Polynom(m2);
        System.out.println(b);

        Polynom addition = Polynom.sum(a, b);
        System.out.println(addition);

        Polynom mult = Polynom.mult(a, b);
        System.out.println(mult);

        Polynom multint = Polynom.multint(a, c);
        System.out.println(multint);

        Polynom divint = Polynom.divint(a, c);
        System.out.println(divint);











    }



}