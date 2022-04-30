package clases;
/** Método que devuelve el Área de un círculo a partir de su radio */

public class Circulo extends Figura{

    private double radio;
    final double pi=3.14159;

    /**@return Área */
    public double CalcularArea(){

        return this.area=pi*radio*radio;

    }

    /** @return radio */
    public double getRadio(){

        return radio;

    }

    public void setRadio (double radio){

        this.radio=radio;

    }
    
}