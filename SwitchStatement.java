import jdk.internal.org.jline.reader.impl.DefaultParser.Bracket;

public class SwitchStatement {
    public static void main(String[] args) {
        
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("seleccionaste Light Mode");
            break;
            case "Night": //Ambar
                System.out.println("seleccionaste Nigth Mode");
            break;
            case "Blue Dark":
                System.out.println("seleccionaste Blue Dark Mode");
            break;
            case "Dark":
                System.out.println("seleccionaste Dark Mode");
            break;
            default:
                System.out.println("selecciona una opcion");
            break;
        }
    }
}
