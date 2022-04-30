package clases;
/** M�todo que devuelve el �rea de un tri�ngulo a partir de su base y altura */

public class Triangulo extends Figura{

    private double base;
    private double altura;

    /**@return �rea */
    public double CalcularArea(){

        return this.area=(base*altura)/2;

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