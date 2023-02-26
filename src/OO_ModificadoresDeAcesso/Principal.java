package OO_ModificadoresDeAcesso;

import OO_ModificadoresDeAcesso.discentes.AlunoSuperior;

public class Principal {
    public static void main(String[] args) {
        AlunoSuperior aluno = new AlunoSuperior();
        
        // aluno.nome="Kelven";
        aluno.setNome("Kelven");
        aluno.setTeste(9);
        aluno.setProva(10);

        System.out.println(aluno.getMedia());
    }
    
}
