public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono $200
        salary += 200;
        System.out.println(salary);

        //pension: $50 descuento
        salary -= 50;
        System.out.println(salary);

        //2 horas estra $30 c/u
        //Comida: $45
        salary += (30*2)-45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Ivan Batallanos";
        employeeName = employeeName + " Thanatos";

        employeeName = "Yan " + employeeName;
        System.out.println(employeeName);
    }
}
