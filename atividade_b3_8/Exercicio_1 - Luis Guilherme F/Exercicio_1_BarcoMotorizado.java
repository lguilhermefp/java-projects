package atividade_b3_8;

public class Exercicio_1_BarcoMotorizado {
	    protected double velocidadeAtual = 0;
	    protected double volumeTanque;
	    protected double volumeTanqueAtual;
	    protected String tipo;

	    public Exercicio_1_BarcoMotorizado(double volumeTanque, double volumeTanqueAtual) {
	        this.volumeTanque = volumeTanque;
	        this.volumeTanqueAtual = volumeTanqueAtual;
	        tipo = "Barco motorizado";
	    }

	    public void acelerar(double aceleracao){
	        velocidadeAtual+=aceleracao;
	    }

	    public void freiar(double freagem){
	        velocidadeAtual-=freagem;
	    }

	    public void abastecer(double volume){
	        if (volumeTanqueAtual+volume <= volumeTanque)
	            System.out.println("Abastecendo");
	        else
	            System.out.println("O tanque vai transbordar.");
	    }

	    @Override
	    public String toString() {
	        return "BarcoMotorizado{" +
	                "velocidadeAtual=" + velocidadeAtual +
	                ", volumeTanque=" + volumeTanque +
	                ", volumeTanqueAtual=" + volumeTanqueAtual +
	                ", tipo='" + tipo + '\'' +
	                '}';
	    }
}
