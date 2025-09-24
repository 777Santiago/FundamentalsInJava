public class DataTypes {
    public static void main(String[] args) {

        //Tipos de datos primitivos
        int myInt = 24;
        System.out.println(myInt);

        double myDouble = 1.85;
        System.out.println(myDouble);

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);

        //Tipo de dato en compilación
        System.out.println(myString.getClass().getSimpleName());
    }
}
