public class Funsiones {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo
        //PI * r2
        double area = cicleArea(y);
        System.out.println(cicleArea(y));


        //Area de una esfera
        //4*PI*r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*PI*r3
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS A DOLARES: " + converToDolar(200, "MXM"));

        
    }

    public static double cicleArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double sphereArea(double radio) {
        return 4 * Math.PI * Math.pow(y, 2);
    }

    public static double sphereVolumen(double radio) {
        return (4/3) * Math.PI * Math.pow(y, 3);
    }

    /**
     * Descripcion: Funcion que especificando  su moneda convierte una cantidad de dinero a dolares.
     * 
     * @param quantify Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXM o COP
     * @return quantify Devuelve la cantidad actulizada en Dolares
     */
    public static double converToDolar(double quantify, String currency) {
        //MXN COP
        switch (currency){
            case "MXM":
                quantify = quantify * 0.052;
            break;
            case "COP":
                quantify = quantify * 0.00031;
            break;
            }
        return quantify;
    }
}
