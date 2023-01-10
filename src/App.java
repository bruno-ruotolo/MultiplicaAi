import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Qual o número gostaria de ver a tabela de multiplicação?3");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int[] multiplicationTable = new int[11];
        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 1; i < 11; i++){
            multiplicationTable[i] = number*i;
            System.out.println(i + "*" + number + " = " +  multiplicationTable[i]);
        }

        sc.close();
        
    }
}
