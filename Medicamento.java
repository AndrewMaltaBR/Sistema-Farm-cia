/*
  Autor: Andrew Malta
*/
class Medicamento{
  String nome;
  double precoVenda;
  Data dataValidade;
  Laboratorio laboratorio;
  boolean receitaObrigatoria;
  int qtdEstoque;

  public Medicamento(String nome, double precoVenda, Data dataValidade, Laboratorio laboratorio, boolean receitaObrigatoria, int qtdEstoque){
    this.nome = nome;
    this.precoVenda = precoVenda;
    this.dataValidade = dataValidade;
    this.laboratorio = laboratorio;
    this.receitaObrigatoria = receitaObrigatoria;
    this.qtdEstoque = qtdEstoque;
  }

  public void reajustarPrecoVenda(double percentual){ // 20 para aumentar e -20 para reduzir
    this.precoVenda = this.precoVenda + this.precoVenda*percentual/100;
  }

  public boolean vender(int quantidade){
    if(quantidade > this.qtdEstoque){
      System.out.println("Quantidade indisponível no estoque!");
      return false;
    }
    if(quantidade < 1){
      System.out.println("Quantidade inválida!");
      return false;
    }
    if(this.receitaObrigatoria)
      System.out.println("Receita médica obrigatória!");
    System.out.println("Valor total: "+(this.precoVenda*quantidade));
    this.qtdEstoque = this.qtdEstoque - quantidade;
    System.out.println("Estoque restante: "+this.qtdEstoque);
    return true;
  }

  public boolean comprar(int quantidade){
    if(quantidade < 1){
      System.out.println("Quantidade inválida!");
      return false;
    }
    this.qtdEstoque = this.qtdEstoque + quantidade;
    System.out.println("Estoque atual: "+this.qtdEstoque);
    return true;
  }

  public void mostra(){
    System.out.println("Nome: "+this.nome);
    System.out.println("Preço de venda: "+this.precoVenda);
    System.out.println("Data de Validade: "+this.dataValidade.mostra());
    System.out.println("Laboratório: "+this.laboratorio.nomeFantasia);
    System.out.println("Receita Obrigatória: "+this.receitaObrigatoria);
    System.out.println("Estoque: "+this.qtdEstoque);
  }
}
