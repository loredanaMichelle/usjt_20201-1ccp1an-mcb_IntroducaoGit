public class Empregado{
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    private String nome;
    private int idade;

    public int getTipo(){
        return tipo;
    }
    public void setTipo(int tipo) {
        this. tipo = tipo;
    }

    public double calcularSalario(){
        switch (tipo) {
            case 1:
                return salario;
            case 2:
                return salario + salario * comissao;
            case 3:
                return salario + bonus;
            default:
                return 0;
        }
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}