package DataTypesJava;

public class DataTypes {
    public static void main(String[] args) {
        //Tipos de datos
        
        //Enteros
        int n = 123456789;
        long nL = 12345678901L;
        
        //Punto Flotante
        double nD =  123.456123456;
        float nF = 123.456F;

        //Inferencia de datos: utilizacion declando var como tido de dato
        var salary = 1000;//int
            //pension 3%
        var pension = salary*0.03;//double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeename = "Ivan Batallanos";
        System.out.println("EMPLOYEE: " + employeename + " SALARY: " + totalSalary);
        

    }
    
}
