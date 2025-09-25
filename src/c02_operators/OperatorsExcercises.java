package c02_operators;

public class OperatorsExcercises {
    public static void main(String[] args) {

        //1. Crea una variable con el resultado de cada operación aritmetica
        int a = 3;
        int b = 2;
        var suma = a + b;
        var resta = a - b;
        var multiplicacion = a * b;
        var division = a / b;
        var modulo = a % b;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);

        //2. Crea una variable para cada tipo de operacion de asignacion
        var aSuma = a += 1;
        var aResta = a -= 1;
        var aMultiplicacion = a *= 2;
        var aDivision = a /= 2;
        var aModulo = a %= 2;

        System.out.println(aSuma);
        System.out.println(aResta);
        System.out.println(aMultiplicacion);
        System.out.println(aDivision);
        System.out.println(aModulo);

        //3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación
        System.out.println(a != b && a < b);
        System.out.println(a == b || a < b);
        System.out.println(a < b);

        //4. Imprime 3 comparaciones falsas con diferentes operadores de comparación
        System.out.println(a != b && a > b);
        System.out.println(a == b || a > b);
        System.out.println(!(a < b));

        //5. Utiliza el operador logico and
        System.out.println(a == b && !(a < b));

        //6. Utiliza el operador logico or
        System.out.println(a == b || a < b);

        //7. Combina ambos operadores logicos
        System.out.println(a == b || a > b && a < b);

        //8. Añade alguna negacion
        System.out.println(!(a < b));

        //9. Imprime 3 ejemplos de uso de operadores unitarios
        System.out.println(-a);
        System.out.println(--b);
        System.out.println(a++);

        //10. Combina operadores aritmeticos, de comparacion y logicos
        System.out.println(aModulo == b && a % b == 0);
    }
}
