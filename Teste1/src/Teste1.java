import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int first = leitor.nextInt();
        int last = leitor.nextInt();

        for(int i = first; i <= last; i++){
            if(i % 2!=0){
                System.out.print(i + " ");
            }
        }
    }
}
