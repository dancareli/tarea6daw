package clases;
/** Método que devuelve el Área de un rectángulo a partir de su base y altura */

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    /**@return Área */
    public double CalcularArea(){

        return this.area=base*altura;

    }

    /** @return base */
    public double getBase(){

        return base;

    }

    public void setBase (double base){

        this.base=base;

    }

    /** @return altura */
    public double getAltura(){

        return altura;

    }

    public void setAltura(double altura){

        this.altura=altura;

    }
    
}