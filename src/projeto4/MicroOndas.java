package projeto4;

public class MicroOndas extends Eletrodomestico {

    private double tempo; // tempo de funcionamento
    private double potReal; // potencia real abaixo da máxima 

    public MicroOndas(double tempo, double potReal, Eletrodomestico novo) {
        super(novo);
        this.tempo = tempo;
        this.potReal = potReal;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getPotReal(boolean estado, double potenciaMax) {
        if (estado) {
            if (potenciaMax > potReal) {
                System.out.println("A sua potencia máxima não pode ser maior que o consumo atual.");
            } else {
                return potReal;
            }
            }else {
           System.out.println("O aparelho está desligado");
        }
            return potReal;
        }

    

    

    public void setPotReal(double potReal) {
        this.potReal = potReal;
    }

}
