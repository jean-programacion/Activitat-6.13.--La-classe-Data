/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cipfpbatoi;

/**
 *
 * @author jeanm
 */
public class TestData {

    public static void main(String[] args) {

        Data objeto1 = new Data("16/01/2021");
        Data fechaPorDefecto = new Data("01/01/1970");

        //objeto1.mostrarEnFormatText();
        // Imprimir resultados de la prueba de constructores
        System.out.println("=== START - Prova de Constructors - START ===\n");
        imprimirResultados("Cree un nou objecte utilitzant el constructor parametritzat int int int (16,1,2021)",
                objeto1);
        imprimirResultados("Cree un nou objecte utilitzant el constructor String 16/1/2021", objeto1);
        imprimirResultados("Comprove mitjançant el mètode isIgual que les dates representades per tots dos objectes són iguals",
                fechaPorDefecto.isIgual(fechaPorDefecto));
        imprimirResultados("Cree un nou objecte utilitzant el constructor per defecte", fechaPorDefecto);
        System.out.println("=== FI - Prova de Constructors - FI ===\n");

        // Prueba de métodos afegir/restar días
        System.out.println("=== START - Prova de Mètodes afegir/restar dies - START ===");
        Data data4 = objeto1.afegir(1);
        imprimirResultados("Endemà de la data inicial (16-1-2021) - (+1 dia)", data4);
        Data data5 = objeto1.restar(1);
        imprimirResultados("Dia anterior a la data inicial (16-1-2021) - (-1 dia)", data5);
        Data data6 = objeto1.restar(30);
        imprimirResultados("Data corresponent a restar 30 dies a la data inicial (16-1-2021) - (-30 dies)", data6);
        System.out.println("=== FI - Prova de Mètodes afegir/restar - FI ===");

        // Prueba del método modificador
        System.out.println("=== START - Prova del mètode modificador - START ===");
        objeto1.set(22, 1, 2021);
        imprimirResultados("Modifique la data del primer objecte creat (16-1-2020) per la data 22-1-2021", objeto1);
        System.out.println("=== FI - Prova del mètode modificador - FI ===");
    }

    public static void imprimirResultados(String mensaje, Data data) {
        System.out.println("-------------------------");
        System.out.println(mensaje);
        System.out.println("Data en format ES:");
        data.mostrarEnFormatES();
        System.out.println("Data en format GB:");
        data.mostrarEnFormatGB();
        System.out.println("Data en format text:");
        data.mostrarEnFormatText();
        System.out.println("La data és correcta: " + data.isCorrecta());
        System.out.println("La data és festiu: " + data.isFestiu());
        System.out.println("El dia de la setmana és: " + data.getDiaSetmana());
    }

    public static void imprimirResultados(String mensaje, boolean resultado) {
        System.out.println("-------------------------");
        System.out.println(mensaje + ": " + resultado);
    }
}
