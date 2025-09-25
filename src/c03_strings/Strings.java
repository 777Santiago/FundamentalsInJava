package c03_strings;

public class Strings {
    public static void main(String[] args) {

        //Cadenas de texto
        String name = "Daniel";
        var surname = new String("Arcila");

        //Operaciones Basicas
        System.out.println(name + " " + surname);

        //Longitud
        System.out.println(name.length());

        //Obtener caracter
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(name.length() - 1));

        //Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(3, 5));

        //Mayusculas y Minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Compribar si contiene
        System.out.println("Hello Java!".contains("Daniel"));
        System.out.println("Hello Java!".contains("ava"));
        System.out.println("Hello Java!".toUpperCase().contains("AVA"));

        //Comparacion
        System.out.println(name.equals("Daniel"));
        System.out.println(name.equals("daniel"));
        System.out.println(name.equalsIgnoreCase("daniel"));

        //== vs. equals
        var a = "Daniel";
        var b = "Daniel";
        var c = new  String("Daniel");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        //Trim
        System.out.println(" Hola, me llamo Daniel ".trim());

        //Replace
        System.out.println("Hola, me llamo Daniel".replace("Daniel", "Arcila"));

        //Format
        var age = 24;
        System.out.println(String.format("Hola, %s. Tego %d años", name, age));

    }
}
