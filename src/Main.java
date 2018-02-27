import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int numerador = (int) 6100413547l;
        int denominador = (int) 6080359541l;
        int divisor = 2;
        int menor = 0;

        if (numerador < denominador){
            menor = numerador;
        } else {
            menor = denominador;
        }

        for (int i = 2; i < menor; i++) {
            while (numerador % i == 0 && denominador % i == 0){
                numerador /= i;
                denominador /= i;
            }
        }

        System.out.println("Numera " + numerador + "  Deno  " + denominador);


        //CLAP
        /*int  n = 25;
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
        }*/


        //-- IP
        /*String ip  = "216.58.214.164";

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
        System.out.println(vlr1 * result);
        System.out.println(result);*/


    }
}
