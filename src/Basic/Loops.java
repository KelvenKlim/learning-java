package Basic;
import java.util.Scanner;

public class Loops {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int op;
        do {
            System.out.println("------------------");
            System.out.println("Menu Principal");
            System.out.println("------------------");
            System.out.println("Selecione uma das opções abaixo");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("1 - Coordenador");
            System.out.println("0 - Sair");

            System.out.println("Qual opção deseja?");
            op = input.nextInt();

            if(op == 0){
                break;
            }

            switch (op) {
                case 1:
                    System.out.println("Voce seleionou a opcao Aluno");
                    break;
                case 2:
                    System.out.println("Voce seleionou a opcao Professor");
                    break;
                case 3:
                    System.out.println("Voce seleionou a opcao Coordenador");
                    break;
                default:
                    System.out.println("Voce seleionou uma opção inválida");
                    break;
            }

        }while(op != 0);
        System.out.println("Fim");

    }    
}
