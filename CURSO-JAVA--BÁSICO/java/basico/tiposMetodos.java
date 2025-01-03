package basico;

public class tiposMetodos {
    
    public static void main(String[] args) {
        
        /* Métodos:
            Todas as ações das aplicações são consideradas métodos.

            Uma classe é definida por atributo e métodos. Já vimos que atributos são, em grande maioria
            variáveis de diferentes tipos e valores. Os métodos por sau vez, correspondem a funções ou
            sub-rotinas disponíveis dentro de nossas classes.


           Critério de nomeação de Métodos
           
            Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas
            convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa.
            Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas.
            Para métodos, os critérios são:

            * Deve ser nomeado como verbo
            * Seguir o padrão camelCase (Todas as letras minúsculas, com a exceção da primeira letra da segund
                palavra.)
            
            Exemplos sugeridos:
            
            abrirConexao(){}

            concluirProcessamento() {}

            findById( int id){} 

            calcularImprimir(){}

        ATENÇÃO!: Não existe em JAVA o conceito de métodos globais. Todos os métodos devem SEMPRE
        ser definidos dentro de uma classe.
            
            Critério de definição de métodos:
                Mas, como sabemos a melhor forma de definir os métodos das nossas classes: Para chegar à essa 
                conclução, somos auxiliados por uma convenção entrutural para todos os métodos. Essa convenção
                é determinada pelos aspectos abaixo.

            1. Qual a proposta principal do método?
                Você deve se perguntar constantemente até compreender a real finalidade do mesmo.

            2. Qual o tipo de retorno esperado após executar o método?
               Você deve analisar se o método será responsável por retornar algum valor ou não.
               
        
        Caso o método não retorne nenhum valor, ele será representado pela palavra-chave VOID.

            1. Quais os parâmetros serão necessários para a execução do método?
                Métodos as vezes precisão de argumentos como critérios para a execução.
            
            2. O método possui o risco de apresentar alguma exceção?
                Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a
                possível existência de uma exceção.
            
            3. Qual a visibilidade do método? 
                Será necessário que o método seja visível a toda aplicação, somente em mesmo pacotes,
                atravén de herança ou somente a nível a própria classe.
            
         */

        /*Abaixo temos um exemplo de uma classe com dois métodos e suas respectivas considerações. 

            public class MyClass {
                public double somar (int num1, int num2){
                //LOGICA - FINALIDADE DO MÉTODO
                return ... ;
                }
            }

            public void imprimir (String texto){
            //LOGICA - FINALIDADE DO MÉTODO
            //AQUI NÃO PRECISA DO RETURN
            }

        //throws Exception: indica que o método ao ser utilizado poderá gerar uma exceção
        public double dividir(int dividendo, int divisor) throws Exception

        // este método não pode ser visto por outra classes no projeto.
        private void metodoPrivado(){}

        //alguns equívocos estruturais
        public void validar(){}
            este método deverá retornar algum valor
            no caso boolean (true and false)
        
        //um método deve representar uma única responsabilidade
        public void calcularEnviar(){}
        

        //Este método tem a finalidade de gravar informações de uma cliente, por não criar um 
        //objeto cliente e passar como parâmetro?
        //veja abaixo

            public void gravarCliente(Cliente cliente){}
        OU
            public void gravar(Cliente cliente){}
    
        */

        
    }
}
