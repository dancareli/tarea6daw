package clases;
/** M�todo que devuelve el �rea de un c�rculo a partir de su radio */

public class Circulo extends Figura{

    private double radio;
    final double pi=3.14159;

    /**@return �rea */
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