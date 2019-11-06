package sample;


public class Polynom {

    double[] coef;

    public Polynom(double[] coef) {
        this.coef = coef;
    }

    public int getlength() {
        return coef.length;
    }

    @Override

    public String toString() {
        String result = "";
        result = "" + coef[0];
        if (coef.length >= 2) {
            if (coef[0] < 0) {
                if (coef[1] == 1) {
                    result = "x" + " - " + -1 * coef[0];
                } else if (coef[1] == -1) {
                    result = " - x" + " - " + -1 * coef[0];
                } else if (coef[1] == 0) {
                    result = " - " + -1 * coef[0];
                } else {
                    result = coef[1] + "x" + " - " + -1 * coef[0];
                }
            } else if (coef[0] == 0) {
                if (coef[1] == 1) {
                    result = "x";
                } else if (coef[1] == -1) {
                    result = " - x";
                } else if (coef[1] == 0) {
                    result = " 0 ";
                } else {
                    result = coef[1] + "x";
                }
            } else if (coef[1] == 1) {
                result = "x" + " + " + result;
            } else if (coef[1] == -1) {
                result = " - x" + " + " + result;
            } else {
                result = coef[1] + "x" + " + " + coef[0];
            }
        }

        for (int i = 2; i < coef.length; i++) {
            if (coef[i] == -1) {
                if (coef[i - 1] < 0) {
                    result = " - " + "x^" + i + " " + result;
                } else {
                    result = " - " + "x^" + i + " + " + result;
                }
            } else if (coef[i] == 1) {
                if (coef[i - 1] < 0) {
                    result = "" + "x^" + i + " " + result;
                } else {
                    result = "" + "x^" + i + " + " + result;
                }
            } else if (coef[i] == 0) {
                if (coef[i - 1] < 0) {
                    result = "" + result;
                } else {
                    result = "" + result;
                }
            } else if (coef[i - 1] < 0) {
                result = "" + coef[i] + "x^" + i + " " + result;
            } else {
                result = "" + coef[i] + "x^" + i + " + " + result;
            }
        }
        return result;
    }

    public static Polynom sum(Polynom a, Polynom b) {
        int alenght;
        int blenght;
        alenght = a.getlength();
        blenght = b.getlength();
        int clength;
        if (alenght > blenght) {
            clength = alenght;
        } else clength = blenght;
        double rez[] = new double[clength];
        for (int i = 0; i < alenght; i++) {
            rez[i] += a.coef[i];
        }
        for (int i = 0; i < blenght; i++) {
            rez[i] += b.coef[i];
        }
        Polynom c = new Polynom(rez);
        return c;
    }


    public static Polynom mult(Polynom a, Polynom b) {
        int rez = b.getlength() + a.getlength() - 1;
        double[] result = new double[rez];
        for (int i = 0; i < b.getlength(); i++) {
            for (int j = 0; j < b.getlength(); j++) {
                result[i + j] += b.coef[i] * a.coef[j];
            }
        }
        return new Polynom(result);
    }

    public static Polynom multint(Polynom a, double c) {
        double[] mas = new double[a.coef.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = a.coef[i] * c;
        }
        return new Polynom(mas);
    }

    public static Polynom divint(Polynom a, double c) {
        double[] mas = new double[a.coef.length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = a.coef[i] * (1/c);
        }
        return new Polynom(mas);
    }
}