public class IfStatement {
    public static void main(String[] atgs) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            //send file
            fileSended++;
            System.out.println("Archivo Enviado");
        } else {
            fileSended--;
            System.out.println("Por favor enciente tu Bluetooth, para iniciar ña transferencia");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);

    }
}