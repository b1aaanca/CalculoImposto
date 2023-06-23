
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("digite o valor total da sua conta: ");
        double bankAccount = value.nextDouble();
        double percentual10 = 10.0 / 100.0;
        double percentual15 = 15.0 / 100.0;
        double percentual20 = 20.0 / 100.0;

        NumberFormat real = NumberFormat.getCurrencyInstance();
        String valuePercentual10 = real.format(bankAccount - (percentual10 * bankAccount)) ;
        String valuePercentual15 = real.format(bankAccount - (percentual15 * bankAccount)) ;
        String valuePercentual20 = real.format(bankAccount - (percentual20 * bankAccount)) ;


        if ( bankAccount >= 0 && bankAccount <= 10000 )
            System.out.println("O imposto sobre esse valor é de 10% \n entao o valor da sua conta vai ficar " + valuePercentual10);
        else if ( bankAccount >= 10001 && bankAccount <= 20000)
            System.out.println("O imposto sobre esse valor é de 15% \n entao o valor da sua conta vai ficar " + valuePercentual15);
        else if ( bankAccount > 2000)
            System.out.println("O imposto sobre esse valor é de 20% \n entao o valor da sua conta vai ficar " + valuePercentual20);

    }
}