package OO_Basic;

public class Principal {
    public static void main(String[] args) {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
        Professor professor = new Professor();


        alunoEnsinoMedio.nome = "Joao";
        alunoEnsinoMedio.teste = 8;
        alunoEnsinoMedio.prova = 9;

        System.out.println("Aluno Nível Médio");

        System.out.println("Nome: " + alunoEnsinoMedio.getNome());
        System.out.println("Media: " + alunoEnsinoMedio.getMedia());

        alunoEnsinoSuperior.nome = "Kelven";
        alunoEnsinoSuperior.teste = 8;
        alunoEnsinoSuperior.prova = 9;

        System.out.println("Aluno Nível Superior");

        System.out.println("Nome: " + alunoEnsinoSuperior.getNome());
        System.out.println("Media: " + alunoEnsinoSuperior.getMedia());
        
    }        
}
