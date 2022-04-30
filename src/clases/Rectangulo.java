package clases;
/** M�todo que devuelve el �rea de un rect�ngulo a partir de su base y altura */

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    /**@return �rea */
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