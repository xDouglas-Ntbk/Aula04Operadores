
/*
public class Aula04Operadores {
    public static void main(String[] args){
        // + - / *
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 /(double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > < = > = == !=     Operados de comparaçao

        boolean isDezMaiorQueVinte = 10 > 20 ;
        boolean isDezMenorQueVinte = 10 < 20 ;
        boolean isDezIgualVinte = 10 == 20 ;
        boolean isDezIgualDez= 10 == 10 ;
        boolean isDezDiferente= 10 != 10 ;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezIgualDez " +isDezIgualDez);
        System.out.println("ISDezDiferente "+isDezDiferente);
    }
}

*/

/*
Crie duas variáveis int:

numero1 = 20

numero2 = 5

Imprima:

soma

subtração

multiplicação

divisão
 */

/*

// Exercicio 1 basico pedindo impressao dos calculos com operaçoes aritimeticas Nivel Fácil

public class Aula04Operadores{
    public static void main(String[] args ){
        int numero = 20;
        int numero2 = 5;
        int soma =numero+numero2;
        int subtracao = numero-numero2;
        int multiplicacao = numero*numero2;
        int divisao = numero/numero2;
        System.out.println("A soma dos numero é " +soma);
        System.out.println("A subtraçao dos numero é " +subtracao);
        System.out.println("A multiplicaçao dos numero é " +multiplicacao);
        System.out.println("A divisao dos numeros é " +divisao);
    }
}

 */

/*
   // Exercicio 2 - achei facil ainda apenas com um pouco mais de variavel

public class Aula04Operadores{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 3;
        int num3 = 2;
        int somaNumeros = num1+num2+num3;
        int multNumeros = num1+num2+num3;
        int resultadoMult = (num1 + num2) * num3;
        System.out.println("A soma dos três números é :"+somaNumeros);
        System.out.println("A multiplicação dos três números é :"+multNumeros);
        System.out.println("O resultado final é de : "+resultadoMult);
    }
}
 */

/*
public class Aula04Operadores {
    public static void main(String[] args) {
        int precoProduto = 50;
        int quantidade = 3;
        int totalProduto = (precoProduto * quantidade);

        System.out.println("O valor total do seu produto é : "+totalProduto);
    }
}
 */


//Essa parte aqui é sobre Operadores de Atribuiçao !!!
/*
public class Aula04Operadores {
    public static void main(String[] args) {
        // & (AND) || (or)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorqueTrinta = idade >=30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorqueTrinta "+isDentroDaLeiMenorqueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel  = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca >valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //Valores de atribuiçao

        // = += -= *= /= %=     obejetivo economizar um pouco de codigo

        double bonus = 1800; // 1800
        bonus += 1000;  // 2800
        bonus -= 1000;  //1800
        bonus *= 2;
        bonus /= 2;
        bonus %=2;
        System.out.println(bonus);

        //
        int contador =0;
        contador += 1;
        System.out.println(contador);
    }
}

 */

/*
public class Aula04Operadores {
    public static void main(String[] args) {
        double salario =2000;

        salario += 500;
        salario -= 300;
        salario *= 2;
        salario /= 2;

        System.out.println(salario);
    }
}

 */

/*
public class Aula04Operadores{
    public static void main(String[] args) {

        int pontos = 10;
        pontos += 5;
        pontos -= 3;
        pontos *= 4;
        System.out.println(pontos);
    }
}
 */

/*
public class Aula04Operadores {
    public static void main(String[] args) {

        double numero = 15;

        numero += 5;
        numero *= 3;
        numero -= 10;
        numero /= 2;
        numero %= 4;
        System.out.println(numero);
        System.out.println("O numero final é de : " +numero);
    }
}


 */

/*
public class Aula04Operadores {
    public static void main(String[] args) {
        int contador = 0;
        contador += 1;
        contador += 1;
        contador += 1;
        contador += 1;
        contador += 1;
        contador -= 2;
        System.out.println(contador);
    }
}

 */

/*
public class Aula04Operadores {
    public static void main(String[] args) {

        double bonus = 1000;
        bonus += 50;
        bonus -= 25;
        bonus %= 3;
        System.out.println("O bonus final é no valor de : " +bonus+ "%");
    }
}
*/
