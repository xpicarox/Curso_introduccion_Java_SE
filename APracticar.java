public class APracticar {
    public static void main(String [] args) {
        //EJERCICIO #1: Variables
        //presentacion de mis familiares en variables
        int ivanBatallanos = 24;
        String jhonyBebeto = "hermano";
        String madre = "maritzel";

        //EJERCICIO #2: Casting
        //Tipos de casting implicito y explicito
        //chat >> int
        char  c = 'z';
        int n = c;
        System.out.println(n);

        //int >> long >> shot
        int i1 = 250;
        long l1 = i1;
        short s1 = (short)l1;
        System.out.println(s1);

        //double >> long
        double d = 301.067;
        long lg = (long)d;
        System.out.println(lg);

        //int >> float + 5000.66
        int i2 = 100;
        float f1 = (float)(i2+5000.66);
        System.out.println(f1);

        //int >> byte * 100
        int i3 = 100;
        byte b1 = (byte)(i3 * 100);
        System.out.println(b1);
        
        //double >> long / 298.638
        double d1 = 298.638;
        long l2 = (long) d1/25;
        
        /*EJERCICIO #3
        Primero descargaria la versión jdk necesaria. En este caso el jdk 9.
        Segundo configuro el JAVA_HOME y el Path, y le asigno el jdk 9 para poder correrlo con mi jre.
        La aplicación le hago el artefacto Jar.
        Lo anterior aplica para mac y windows, que son similares los procesos*/
        
    }
}
