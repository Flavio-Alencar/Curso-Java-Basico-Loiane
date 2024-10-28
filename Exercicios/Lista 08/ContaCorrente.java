//Exercício 02 - Lista 08
//Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, 
//métodos getters e setters e construtores. Os métodos que serão utilizados pela
//classe de teste devem ser públicos. Se necessário, crie métodos privados como
//auxiliares para organizar melhor o código fonte também. 
//Cria uma classe para representar uma conta corrente que possui um número, um saldo,
//um status que informa se ela é especial ou não, um limite. Desenvolva métodos
//para realizar saque (verificando se o cliente pode realizar saques), despositar
//dinheiro, consultar saldo e verificar se o cliente está usando cheque especial 
//ou não. Desenvolva um programa para testar essa classe.
//Autor: Flávio Alencar - 26OUT24 - 12h00 AM

package exercicios.Lista08;

public class ContaCorrente {
    
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String numConta;
    private String agencia;
    private double saldo;
    private double limite;
    private boolean especial;
    //--------------------------------------------------------------------------

    public ContaCorrente(String numConta, String agencia, double saldo, double limite, boolean especial) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.especial = especial;
    }
    
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) { 
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean getEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
    public void mostrarConta(){
        System.out.println("            BANCO TABAJARA            ");
        System.out.println("--------------------------------------");
        System.out.println("Conta: " +this.numConta);
        System.out.println("Agencia: " +this.agencia);
        System.out.printf("Saldo: R$%.2f%n", this.saldo);
        System.out.printf("Limite: R$%.2f%n", this.limite);
        System.out.println();
    }
    
    public boolean realizarSaque(double saque){
        
        if(saque > saldo+limite){
            System.out.println("Saldo Insuficiente");
        }
        else{
            saldo -= saque;
            this.saldo = saldo;
            System.out.println("Saldo: " +saldo);
        }
        return true;
    }
    
    public boolean realizarDeposito(double deposito){
        saldo += deposito;
        this.saldo = saldo;
        System.out.println("Saldo: " +saldo);
        System.out.println();
        return true;        
    }
    
    public void consultarSaldo(){
        System.out.printf("Saldo: R$%.2f%n", saldo);
        System.out.println();
    }
    
    public void consultaChequeEspecial(){
        if(saldo < 0){
            System.out.println("Cheque Especial: SIM");
            System.out.println("Valor do Limite Disponível R$:" +(limite+saldo));
            System.out.println("");
        }
        else{
            System.out.println("Cheque Especial: NÃO");
        }
    }
    
    
    
}
