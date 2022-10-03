import java.util.Locale;

public class ex01 extends AuxScanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[][] mat = new double[3][3];
        double soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                mat[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" | ");
            }
            System.out.println();
        }
        for (int i = 0; i < mat.length; i++) {
            soma += mat[i][i];
        }
        System.out.println("Soma: " +soma);

        sc.close();
    }
}
