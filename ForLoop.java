public class ForLoop {
    static boolean isTurnOnLigth = false;
    public static void main(String[] args) {
     
        turnOnoffLigth();
        for (int i = 1; i <= 10; i++) {
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnoffLigth() {
        //variable terniario
        isTurnOnLigth = (isTurnOnLigth)?false:true;

        /*if (isTurnOnLigth) {
            isTurnOnLigth = false;
        }else {
            isTurnOnLigth = true;
        }*/
        return isTurnOnLigth;
    }
}