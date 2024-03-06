
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
    
   public int bisexto  (int ano){
        if(((ano % 400 == 0) || ((ano % 4 == 0)) && (ano % 100 != 0))){
            return 29;
        }
        else{
            return 28;
        }           
    }
    
    public int diasDoMes (int mes, int ano){
        
        int dias;
        
        dias = switch (mes) {
            case 2 -> bisexto(ano);
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> 30;
        };
        return dias;
    }
    
    
        public int contaDias(){
        
        int contaDias, anos = 0, meses = 0;
        
        for (int i = 1900; i <= (this.ano-1); i++) // conta os anos ate ao ano anterior ao pedido e soma os dias todos
            if (bisexto(i) == 29){
                anos += 366;
            }
            else{
                anos += 365;
            }
        
        for (int i = this.mes; i > 1; i--){ // conta os meses até ao mes anterior e soma os dias dos meses
            meses += diasDoMes(i, this.ano);
        }
        
        contaDias = anos + meses + (this.dia); 

        return contaDias;
    }
        
    /*
    
    // Método para retornar o número de dias desde a data de referência 01/01/1900
    public int contaDias(){
        
        int contaDias = 0, anos = 0, total= 0;
        
        for(int i = 0; i < this.ano-1900; i++){
            anos++; // conta os anos
        }
        
        if (this.ano == 1900){
            for(int i = 1; i < this.mes; this.mes--){
                
                total += diasDoMes(this.mes-1, this.ano);
                System.out.println(total);
                
            }
            contaDias = (total + (this.dia)) - 1; // -1 remove o proprio dia
        }
            
        else {
            for(int i = 1; i < this.mes; this.mes--){
                total += diasDoMes(this.mes, this.ano);  
            }
            contaDias = ((this.ano - 1900) * 365) + (total + this.dia);
        }

        return contaDias;
    }
*/

    @Override
    public String toString() {
        return "Data: "+ dia + " de " + mes + " de " + ano;
    }
    
    
   
}
