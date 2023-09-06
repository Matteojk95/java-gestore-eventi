package org.eventi;

import org.eventi.Evento;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Evento e = null;
        do {
            try {
                System.out.println("crea un nuovo evento");
                System.out.println("nome evento?");
                String titoloevento = scan.nextLine();
                System.out.println("quando è? (yyyy-MM-dd)");
                String dataevento = scan.nextLine();
                LocalDate date = LocalDate.parse(dataevento);
                System.out.println("quanti posti totali ci sono?");
                int numeropostitotali = Integer.parseInt(scan.nextLine());

                e = new Evento(titoloevento, date, numeropostitotali);

            } catch (InvalidEventParametersException ex) {
                System.out.println("non riesco a creare un evento:" + ex.getMessage());
            } catch (DateTimeParseException de) {
                System.out.println("formato data non valido");
            } catch (NumberFormatException ne) {
                System.out.println("numero non valido");
            } catch (Exception ex) {
                System.out.println("Errore generico");
            }


        } while (e == null);
        scan.close();
    }
}
