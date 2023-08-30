import java.util.Scanner;

public class Calc{
    static public void main(String[] args){

        Scanner scan = new Scanner(System.in);

            Num n1 = new Num();
            Num n2 = new Num();
            Num res = new Num();

            System.out.printf("Digite o valor 1: ");
            n1.setValor(scan.nextInt());

            System.out.printf("Digite o valor 2: ");
            n2.setValor(scan.nextInt());

            res.setValor(n1.getValor() * n2.getValor());
            System.out.println("O resultado é: " + res.getValor());

            res.setValor(scan.nextInt());

            

    }
    
}