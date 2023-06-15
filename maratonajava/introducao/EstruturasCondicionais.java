package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        // IF

        int age = 17;
        if (age >= 18) {
            System.out.println("Pode comprar bebida alcoolica");
        }
        System.out.println("Não pode comprar bebida alcoolica");

        // ELSE

        if (age >= 18) {
            System.out.println("Else IF pode comprar a bebida");
        } else {
            System.out.println("Else IF Não pode comprar bebida");
        }

        // ELSE IF

        int idade = 20;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

        // OPERADOR TERNARIO

        double salario = 5001;

        String resultado = salario > 5000 ? "Sim, vou doar pro dev dojo" : "Não, eu não posso doar pro devdojo";
        System.out.println(resultado);

        // exercicio

        int sal = 45000;
        double imposto;

        if (sal > 0 && sal <= 34712) {
            imposto = sal * 0.097;
        } else if (sal > 34712 && sal <= 68507) {
            imposto = sal * 0.3735;
        } else {
            imposto = sal * 0.4950;
        }
        System.out.println(imposto);

        // switch

        int diaDaSemana = 7;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Entrada invalida");
        }

        String sexo = "M";

        switch (sexo) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Entrada Invalida");
        }

        // exercicio

        int diaDaSeamanOuNao = 7;

        switch(diaDaSeamanOuNao){
            case 7:
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de Semana");
                break;
            default:
                System.out.println("Entrada Invalida");
        }


    }
}


