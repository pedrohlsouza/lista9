import java.util.Locale;
import java.util.Random;

public class ex03{
    public static void main(String[] args) {
        int[][] cart = new int[5][5];
        Random random = new Random();
        int numero = 0;
        boolean verifica = true;
        for (int i = 0; i < cart.length; i++) {
            for (int j = 0; j < cart[i].length; j++) {
                do {
                    numero = random.nextInt(98) + 1;
                    for (int k = 0; k < cart.length; k++) {
                        for (int l = 0; l < cart[k].length; l++) {
                            if (numero == cart[k][l]) {
                                verifica = true;
                                break;
                            } else {
                                verifica = false;
                            }
                        }
                        if(verifica==true){
                            break;
                        }
                    }
                } while (verifica);
                cart[i][j] = numero;
            }
        }
        for (int i = 0; i < cart.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < cart[i].length; j++) {
                if((cart[i][j] % 10) == cart[i][j]){
                    System.out.print("0");
                }
                System.out.print(cart[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
