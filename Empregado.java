public class Empregado{
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
  
    public double calculaSalario (){
      switch (tipo){
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
  
    public void setTipo(int tipo) {
      this.tipo = tipo;
    }
  
    public int getTipo() {
      return tipo;
    }
  
    public String getNome() {
      return nome;
    }
    public int getIdade() {
      return idade;
    }
    public void setIdade(int idade) {
      this.idade = idade;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public double getBonus() {
      return bonus;
    }
    public double getComissao() {
      return comissao;
    }
    public double getSalario() {
      return salario;
    }
    public void setBonus(double bonus) {
      this.bonus = bonus;
    }
    public void setComissao(double comissao) {
      this.comissao = comissao;
    }
    public void setSalario(double salario) {
      this.salario = salario;
    }
  }
  