import java.util.Scanner;

public class Lista15 {
    public static void main(String[] args) {
        double horas, ganho, salarioBruto, ir, inss, sindicato, salarioLiquido;
        Scanner input =  new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        ganho = input.nextDouble();
        System.out.println("Quantas horas você trabalhou no mês?");
        horas = input.nextDouble();
        

        salarioBruto = horas * ganho;
        ir =  0.11 *salarioBruto ;
        inss =  0.08 * salarioBruto ;
        sindicato = 0.03 * salarioBruto ;
        salarioLiquido = salarioBruto - ir - inss - sindicato;


        System.out.println(" + Salário Bruto : R$" + salarioBruto);
        System.out.println("- IR (11%) : R$" + ir );
        System.out.println("- INSS (8%) : R$" + inss);
        System.out.println("- Sindicato (5%) : R$" +  sindicato);
        System.out.println("= Salário Liquido : R$" + salarioLiquido);

        
        input.close();
    }
}

