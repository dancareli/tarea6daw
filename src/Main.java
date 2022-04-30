/**@author Daniel Cardoso El�as */
/**@version 1.0 mayo 2022 */
import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;

/**Clase principal*/

public class Main {

    public static void main(String[] args){

        Circulo circ1 = new Circulo();
        Rectangulo rect1 = new Rectangulo();
        Triangulo tri1= new Triangulo();

        circ1.setRadio(20.5);
        rect1.setBase(45);
        rect1.setAltura(20);
        tri1.setBase(30);
        tri1.setAltura(50);

        System.out.println("El �rea del c�rculo es "+calcularArea(circ1));
        System.out.println("El �rea del rect�ngulo es "+calcularArea(rect1));
        System.out.println("El �rea del tri�ngulo es "+calcularArea(tri1));
    }

    /** Funci�n que calcula el �rea de un pol�gono */
    /**
     * @param figura
     * @return el valor del �rea 
     */    
    public static double calcularArea(Figura f){

    	return f.CalcularArea();

    }
}
