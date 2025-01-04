public class terminal {
    
/*
Terminal e Argumentos
     com a JVM dedidamente configurada, nós podemos criar um executável para nosso programa
     e disponibilizar o instalador para qualquer sistema operacional.

     No nosso caso, iremos aprender como executar um programa JAVA via terminal
     como MD - DOS ou terminal do VsCode.

    Observe que nosso projeto java criado por uma IDE, ele terá uma pasta chamada bin.
    É nesta pasta que ficarão os arquivos .class, o nosso bytecode.

    Mesmo usando uma IDE, nós sempre precisaremos idednticar onde se encontram as classes
    do nosso projeto.

Terminal
    Vamos ilustrar como executar uma classe, depois de compilada, sem precisar
    de uma IDE.

    1. Abra o MS-DOS ou Power Shell
    2. Localize o diretório do seu projeto.
    3. Acesse a pasta bin: cd bin
    4. Agora digite o comando: "java MinhaClasse (nome da sua classe sem a extensão .class)"


Argumentos
    Quando executamos uma classe que contenha o método main, o mesmo permite que 
    passemos uma array [] de argumentos do tipo String. Logo podemos após a definição da 
    classe a ser executada indormar estes parâmetros.

        java MinhaClasse argumentoUm argumentoDois

    Exemplo:
        public class AboutMe {
        public static void main (String[] args) {
        //os argumentos começam com indice 0

        String nome = args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        }
     }

*dá para colocar parâmetros diretamente do prompt de comando, não sei se é usado
mas é interessante.
*/


}
