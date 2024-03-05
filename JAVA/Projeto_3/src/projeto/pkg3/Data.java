
package projeto.pkg3;

public class Data {
    
    private int ano ; 
    private int mes;
    private int dia; 

    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public Data() {
        this.ano = 1900;
        this.mes = 01;
        this.dia = 01;
    }
    
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int diasDoMes (int mes){
        
        int dias = 0;
        
        dias = switch (mes) {
            case 0 -> 0;
            case 2 -> 28;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> 30;
        };
        return dias;

    }
    
    // Método para retornar o número de dias desde a data de referência 01/01/1900
    public int contaDias(){
        int qtdDias = 0, anos = 1;
        for(int i = 0; i < this.ano-1900; i++){
            anos++; // conta os anos
        }

        qtdDias = (anos * 365) - (diasDoMes(this.mes) - this.dia); // estes 2 dias a mais é o primeiro e o último
        
        System.out.println(anos * 365);

        return qtdDias;
    }

    @Override
    public String toString() {
        return "Data: "+ dia + " de " + mes + " de " + ano;
    }
    
    
   
}
