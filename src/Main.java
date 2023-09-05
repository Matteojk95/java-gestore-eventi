import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("nome evento?");
        String titoloevento = scan.nextLine();
        System.out.println("quando è? ");
        String dataevento = scan.nextLine();
        System.out.println("quanti posti totali ci sono?");
        int numeroposti= scan.nextInt();

        try {
            Evento evento = new Evento("hello world", LocalDate.parse (dataevento), 200);
            System.out.println(evento.getNumerodiposti());
            System.out.println(evento.getTitolo());
            System.out.println(evento.getX());
            System.out.println(evento.getNumerodipostiprenotati());

        } catch (RuntimeException e) {
            System.out.println("Errore");
            System.out.println(e.getMessage());
        }

    }
}
