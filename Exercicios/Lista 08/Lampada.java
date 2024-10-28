//Exercício 01 - Lista 08
//Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, 
//métodos getters e setters e construtores. Os métodos que serão utilizados pela
//classe de teste devem ser públicos. Se necessário, crie métodos privados como
//auxiliares para organizar melhor o código fonte também. 
//Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar,
//desligar a lampada.
//Autor: Flávio Alencar - 26OUT24 - 10h23 AM

package exercicios.Lista08;

public class Lampada {
    
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String modelo;
    private String tensao;                //volts (V)
    private String cor;
    private String tipoLuz;
    private int potencia;                 //Watts (W)
    private int garantiaMeses;
    private boolean tipoAbajur;
    //--------------------------------------------------------------------------
    
    
    
    public void setModelo(String modelo){
        this.modelo = modelo;        
    }
    
    public String getModelo(){
        return modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public boolean getTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }
    
   public void ImprimirCaracteristicas(){
        System.out.println("          CARACTERISTICAS          ");
        System.out.println("-----------------------------------");
        System.out.println("Modelo: " +modelo);
        System.out.println("Tensão: " +tensao);
        System.out.println("Cor: " +cor);
        System.out.println("Tipo de Luz: " +tipoLuz);
        System.out.println("Potência: " +potencia +" W");
        System.out.println("Garantia: " +garantiaMeses +" meses" );
        if(tipoAbajur){
            System.out.println("Tipo Abajur: SIM");
        }
        else{
            System.out.println("Tipo Abajur: Não");            
        }
        System.out.println("-----------------------------------");
        System.out.println("");
    }
    
    public void Ligarlampada(){
        System.out.println("Lampada: ON!");
    }
    
    public void DesligarLampada(){
        System.out.println("Lampada: OFF!");}
    }
