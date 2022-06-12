public class Delcia
{



    double delta;
    double a;
    double b;
    double c;
    double liczDelta() {
        delta = b*b -(4*a*c);
        return 0;
    }
    double deltaPierwiastek;
    double liczPierwiastek(){
        deltaPierwiastek = Math.sqrt(delta);
        return 0;
    }


    double x1;
    double liczX1() {
        x1 = (-b+deltaPierwiastek) / (2*a);
        return 0;
    }
    double x2;
    double liczX2() {
        x2 = (-b-deltaPierwiastek) / (2*a);
        return 0;
    }

    double d1;
    double d2;
    public boolean x1s(){
        return d1 <= x1 & x1 <= d2;
    }
    public boolean x2s(){
        return d1 <= x2 & x2 <= d2;
    }








}

