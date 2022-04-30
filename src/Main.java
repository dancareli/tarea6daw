/**@author Daniel Cardoso Elías */
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

        System.out.println("El Área del círculo es "+calcularArea(circ1));
        System.out.println("El Área del rectángulo es "+calcularArea(rect1));
        System.out.println("El Área del triángulo es "+calcularArea(tri1));
    }

    /** Función que calcula el Área de un polígono */
    /**
     * @param figura
     * @return el valor del área 
     */    
    public static double calcularArea(Figura f){

    	return f.CalcularArea();

    }
}
