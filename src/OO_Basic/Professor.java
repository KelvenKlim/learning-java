package OO_Basic;

public class Professor extends Pessoa{
    double salario;
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getsalario(){
        return this.nome;
    }


    double getInss(){
        return salario * 0.11;
    }

    double getSalarioLiquido(){
        return salario - getInss();
    }

}
