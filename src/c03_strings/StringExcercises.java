package c03_strings;

public class StringExcercises {
    public static void main(String[] args) {

        var name = "Daniel";
        var surname = "Arcila";

        //1. Concatena dos cadenas de texto
        System.out.println(name + " " + surname);

        //2. Muestra la longitud de una cadena de texto
        System.out.println(name.length());

        //3. Muestra el primer y ultimo caracter de un string
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));

        //4. Convierte a mayusculas y minusculas un string
        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

        //5. Comprueba si una cadena de texto contiene una palabra concreta
        System.out.println(name.contains(surname));

        //6. Formatea un string con un entero
        var age = 24;
        System.out.println("Hola me llamo " + name + ", y tengo %d años");

        //7. Elimina los espacios en blanco al principio y al final
        System.out.println(" Hola Daniel ".trim());

        //8. Sustituye todos los espacios en blanco de un string
        System.out.println(("Hola me llamo " + name + " " + surname).replace(" ","_"));
        //9. Comprueba si dos strings son iguales
        System.out.println(name.equals(surname));

        //10. Comprueba si dos string tienen la misma longitud
        System.out.println(name.length() == surname.length());
    }
}
