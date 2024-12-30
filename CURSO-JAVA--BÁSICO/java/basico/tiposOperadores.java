package basico;

public class tiposOperadores {

public static void main(String[] args) {
        
    //Operadores aritméticos:
    // + (adição), - (subtração), * (multiplicação) e / (divisão).

   // double soma = 10. + 15.7;
   // int subtracao = 113 - 25;
   // int multiplicacao = 20 * 7;
   // int divisao = 15 / 3;
   // int modulo = 18 % 3;
   // double resultado = (10 * 7) + (20 / 4);

    // O operador de adição (+), quando utilizado em variáveis de tipo texto, 
    // realizará a "concatenação de textos", a junção das palavras.
    
    String nomeCompleto = "Raphael" + "Martins";
    System.out.println(nomeCompleto);

    //Operador Unários

    //Esses operadores são aplicados juntamente com um outro operador aritmético.
    //Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

    // (+) Operador unário de valor positivo - números são positivos sem esse operador explicitamente;
    // (-) Operador unário de valor negativo - nega um número ou expressão aritmética;
    // (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;
    // (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade;
    // (!) Operador unário lógico de negação - nega o valor de uma expressão booleana.
    // Exemplos abaixo:

    int numero = 5;
    
    System.out.println(numero);

    }
    
}
