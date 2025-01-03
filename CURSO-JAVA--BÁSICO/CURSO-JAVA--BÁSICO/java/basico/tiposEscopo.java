public class tiposEscopo {
    
/* O escopo pode ser entendido como o anbiente onde uma variável pode ser acessada. Em Java
    o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.

    A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador
    sair do bloco de execução ao qual ela pertence. Portanto, esta variável não pode ser lida 
    ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora
    do escopo da variável.

    Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados
    no corpo principal da Classe, sendo portanto acessíveis por todos os métodos.

    Caso voccê declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao 
    corpo desse método, ou seja, dentro das chaves que limitam o método.

    Uma parte fundamental na elaboração de algoritimos simples ou complexos é determinar a localozação
    do código em questão. Sem um domínio sobre escopo de códigos, seu projeto tende a conter falhas 
    estruturais e comprometer a proposta principal da aplicação.


        public class Conta {
        //variavel da classe conta
        double saldo = 10.0;

            public void sacar(double valor) {
            //variável local de método
            double novoSaldo = saldo - valor;
            }
            public void imprimirSaldo(){
            //disponivel em toda classe
            System.out.println(saldo);
            //somente o método sacar conhece esta variável
            System.out.println(novoSaldo);
            }
        }
    ==============================================================================================
    
    Segundo cenário:

    public double calcularDividaExponencial(){
    //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; //começando a variável
        for(int x=1; x<=5; x++)  // x variável de escopo 

        double valorCalculado = valorParcela * x;
        valorMontante = valorMontane + valorCalculado

    }
        return valorMontante;

        //escopo de fluxo
        // x valorCalculado nunca estarão disponível fora do escopo.

 */ 

}
