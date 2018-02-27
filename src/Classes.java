
// Simplificació de fraccions
class Fraction {
    long numerador;
    long denominador;

    Fraction(long n1, long n2) {
        this.numerador = n1;
        this.denominador = n2;

        int divisor = 2;
        int menor = 0;

        if (this.numerador < this.denominador){
            menor = (int) this.numerador;
        } else {
            menor = (int) this.denominador;
        }

        for (int i = 2; i < menor; i++) {
            if (this.numerador % divisor == 0 && this.denominador % divisor == 0){
                this.numerador /= divisor;
                this.denominador /= divisor;
            } else {
                divisor++;
            }
        }
    }
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}

// Joc: el jugador comença des de 1 i fins a N,
// ha de fer "CLAP" si el número és divisible entre 7, si té el 7 entre les seves xifres
// o bé la suma de les seves xifres és divisible per 7
class Clap {
    static int claps(int n) {
        //int  n = 25;
        int rslt = 0;
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                System.out.println("CLAP");
            } else if (i == 7) {
                System.out.println("CLAP");
            } else if (i == 10){
                String vlr = String.valueOf(i);
                for (int j = 0; j < vlr.length(); j++) {
                    rslt += vlr.charAt(j);
                    System.out.println(vlr.charAt(j));

                }
            }
        }
        return 0;
    }
}

// Trobar la màxima potència de 2 divisible pel número donat
class Pow2 {
    static int maxPow2(int n) {
       return 0;
    }
}

// Donada una adreça IP, tornar el número de port.
// El número de port es calcula sumant els dígits dels números que formen la IP
// I multiplicar pel primer dígit de l'adreça.
class IP {
    static int port(String ip) {
        String rslt = "";
        int result = 0;
        String valor1 = "";
        int vlr1 = 0;
        for (int i = 0; i < ip.length(); i++) {
            if (ip.charAt(i) == '.') {continue; }
            rslt += ip.charAt(i);
        }

        for (int i = 0; i < rslt.length(); i++) {
            valor1 = rslt.substring(0,1);
            vlr1 = Integer.parseInt(valor1);
            char vlr = rslt.charAt(i);
            String vl = String.valueOf(vlr);

            result += Integer.parseInt(vl);
        }
        return vlr1 * result;
    }
}

// Donades dues línies (3 coordenades), determinar els angles del triangle
class Triangle {
    Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

    }

    double[] angles() {
        return null;
    }
}
