import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int op=0,qtd;
    double p;
    // Criando medicamento
    Data d = new Data(2,8,2020);
    Laboratorio l = new Laboratorio("Ultrafarma", "Sei lá", "92.948.841/0001-43", "Antônio", "Rua Rui Barbosa", "(49) 99999-9999");
    Medicamento m = new Medicamento("Dimetil propeno", 26.5, d, l, true, 45);
    do {
      System.out.println("-----------------------------------");
      System.out.println("1 - Vender");
      System.out.println("2 - Comprar");
      System.out.println("3 - Aumetar preço");
      System.out.println("4 - Reduzir preço");
      System.out.println("5 - Mostrar medicamento");
      System.out.println("0 - Sair");
      System.out.println("-----------------------------------");
      System.out.print("Digite a opção: ");
      op = scanner.nextInt();
      System.out.println("-----------------------------------");
      switch (op){
        case 1:
          System.out.print("Digite a quantidade: ");
          qtd = scanner.nextInt();
          if(m.vender(qtd))
            System.out.println("Venda concluída com sucess      System.out.println("-----------------------------------");
o!");
        break;
        case 2:
          System.out.print("Digite a quantidade: ");
          qtd = scanner.nextInt();
          if(m.comprar(qtd))
            System.out.println("Compra concluída com sucesso!");
        break;
        case 3:
          System.out.print("Digite a porcentagem (20 para 20%): ");
          p = scanner.nextDouble();
          m.reajustarPrecoVenda(p);
        break;
        case 4:
          System.out.print("Digite a porcentagem (20 para 20%): ");
          p = scanner.nextDouble();
          m.reajustarPrecoVenda(-p);
        break;
        case 5:
          m.mostra();
        break;
        case 0:
        break;
        default:
          System.out.println("Opção inválida!");
      }
    } while (op != 0);
  }
}
