import java.time.LocalDate;
import java.time.LocalDateTime;

public class Evento {

    //ATTRIBUTI

    private String titolo;
    private LocalDate x ;
    private int numerodipostitotali;
    private int numerodipostiprenotati;

    //COSTRUTTORE
    public Evento(String titolo, LocalDate x, int numerodipostitotali) throws RuntimeException {

        if (numerodipostitotali < 0) {
            throw new RuntimeException("il numero di posti totali non può essere negativo");
        }

        if (x.isBefore(LocalDate.now())) {
            throw new RuntimeException("la data non può essere prima di quella odierna");
        }


        this.titolo = titolo;
        this.x = x;
        this.numerodipostitotali = numerodipostitotali;
        this.numerodipostiprenotati = 0;
    }

    //GETTERS E SETTERS
    public int getNumerodiposti() {
        return numerodipostitotali;
    }

    public int getNumerodipostiprenotati() {
        return numerodipostiprenotati;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getX() {
        return x;
    }

    public void setX(LocalDate x) {
        this.x = x;
    }


    public Evento() {
        super();
    }

    @Override
    public String toString() {
        return titolo + " " + x;
    }
}
