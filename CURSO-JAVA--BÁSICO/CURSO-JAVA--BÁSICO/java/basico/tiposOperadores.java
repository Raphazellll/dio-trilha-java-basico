

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


    // ===================================================================================

   /*  //Operador Unários

    Esses operadores são aplicados juntamente com um outro operador aritmético.
    Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

     (+) Operador unário de valor positivo - números são positivos sem esse operador explicitamente;
     (-) Operador unário de valor negativo - nega um número ou expressão aritmética;
     (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;
     (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade;
     (!) Operador unário lógico de negação - nega o valor de uma expressão booleana.
     Exemplos abaixo: */

    int numero = 5;
    numero--;

        System.out.println(numero);

    boolean variavel = true;
    variavel = !variavel; //invertendo uma booleana

        System.out.println(variavel);

    // ===================================================================================

    /*Ternário
     O operador de condição Ternária é uma forma resumida para definir uma condição e escolher por
     um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condição IF
     normal, porém, de uma forma que toda a sua estrutura estará escrita numa unica linha.
      
     O operador ternário é representado pelos simbolos "?:" utilizados na seguinte estrutura de 
     seintaxe:

     <expressão condicional>  
     <Caso condição seja true> = ?
     <Caso condição seja false> = :
     */
int a, b;
    a = 6;
    b = 6;
    String resultado = a==b ?"verdadeiro" : "falso"; 
//uma outra maneira de usar o if, só que compactado.
    System.out.println(resultado);


// ===================================================================================

/* Operadores relacionais.
    os operadores relacionais avaliam a relação entre duas variáveis ou expressões.
    Neste cado, mais precisamente, definem-se o operando à esquerda é igual, diferente,
    menor ou igual. maior ou maior ou igual ao da direita, retornando um valor booleando como resultado

    * == Quando desejamos verificar se uma variável é IGUAL A outra.
    * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
    * >  Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    * <  Quando desejamos verificar se uma variável é MENOR QUE a outra.
    * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
 */

     int numero1 = 1;
     int numero2 = 2;

        if(numero1 < numero2) { //true
            System.out.println("a nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2; //false
        System.out.println("numero1 É IGUAL a numero2? " + simNao);

        simNao = numero1 != numero2; //true
        System.out.println("numero1 é DIFERENTE DE numero2? " + simNao);

        simNao = numero1 > numero2; //false
        System.out.println("numero1 é MAIOR QUE numero2? " + simNao);


    String nomeUm = "RAPHAEL";
    String nomeDois = "RAPHAEL";

          System.out.println(nomeUm == nomeDois);  


// ===================================================================================

/*Operadores Lógicos
        Os operadores lógicos representam o recurso que nos permite criar expressões lógicas
        maiores a partir da junção de duas ou mais expressões.

    * && Operador Lógico "E"
    * || Operador Lógico "OU"

 */


    
    boolean condicao1 = true;
    boolean condicao2 = false;

    if( condicao1 && condicao2 ){
        System.out.println("As duas condições são verdadeiras");
    }
    if( condicao1 || condicao2 ){
        System.out.println("Uma das condições são verdadeiras");
    }

    System.out.println("Fim.");
}
}
