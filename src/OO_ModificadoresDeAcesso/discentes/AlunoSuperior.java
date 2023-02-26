package OO_ModificadoresDeAcesso.discentes;

public class AlunoSuperior extends AlunoII {
    
    public double getMedia(){
        return (getProva() + getTeste())/2;

    }
}
