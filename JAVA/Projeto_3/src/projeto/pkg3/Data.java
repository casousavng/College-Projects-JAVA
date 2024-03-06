package projeto.pkg3;

import java.time.LocalDate;

public class Data implements Cloneable {

    private int ano;
    private int mes;
    private int dia;
    private boolean formato;

    public Data() {
        ano = 1900;
        mes = 01;
        dia = 01;
        formato = true;
    }

    public Data(int dia, int mes, int ano , boolean formato) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.formato = formato;
    }
    
    Data (Data nova){
        System.out.println("Construtor de Copia Chamado: ");
        ano = nova.ano;
        mes = nova.mes; 
        dia = nova.dia;
        formato = nova.formato;
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

    public String setNomeMes(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Marco";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês Inválido";
        }
    }

   public int bissexto  (int ano){ // metodo que retorna o valor de 29 se for Bissexto e 28 se nao for
        if(((ano % 400 == 0) || ((ano % 4 == 0)) && (ano % 100 != 0))){
            return 29;
        }
        else{
            return 28;
        }           
    }
    
    public int diasDoMes (int mes, int ano){ // verifica quantos dias tem cada mes (utiliza o Bissexto para verificar 29 ou 28)
        
        int dias;
        dias = switch (mes) {
            case 2 -> bissexto(ano);
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> 30;
        };
        return dias;
    }
    
    
    public int contaDias(){
        
        int contaDias, anos = 0, meses = 0;
        
        for (int i = 1900; i <= (this.ano-1); i++) // conta os anos ate ao fim do ano anterior ao pedido e soma os dias todos
            if (bissexto(i) == 29){
                anos += 366;
            }
            else{
                anos += 365;
            }
        
        for (int i = this.mes; i > 1; i--){ // conta os meses até ao fim do mes anterior e soma os dias dos meses
            meses += diasDoMes(i, this.ano);
        }
        
        contaDias = anos + meses + (this.dia); 

        return contaDias;
    }

    public String getDataSistema() {
        LocalDate dataSistema = LocalDate.now();
        return dataSistema.toString();
    }

    @Override
    public String toString() {
        if (formato) {
            return "Data: " + dia + " de " + setNomeMes(mes) + " de " + ano;
        } else {
            return "Data: " + dia + "/" + mes + "/" + ano;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public boolean equals(Object obj){
        System.out.println("Construtor equals() Chamado: ");
        if (this == obj) {
            return true;
        } 
        else{
            return false;
        }
    }
}
