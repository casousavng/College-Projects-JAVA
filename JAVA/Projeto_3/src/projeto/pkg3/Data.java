
package projeto.pkg3;

public class Data {
    
    private int ano ; 
    private int mes;
    private int dia; 

    public Data(int ano, int mes, int dia) {
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
            case 2 -> 28;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> 30;
        };
        return dias;

    }
    
    public int numDiasOcorridos(){
        
        int dias = 0;
        int contar = 0;
        int total = 0;
        
        for (int i = 1; i <= this.ano-1900; i++){
            Data A = new Data (1,1,i);
            contar++;
            
        }
        
       dias = (contar * 365) - (diasDoMes(this.mes) - this.dia);
        
        return dias;
    }

    @Override
    public String toString() {
        return "Data: "+ dia + " de " + mes + " de " + ano;
    }
    
    
   
}
