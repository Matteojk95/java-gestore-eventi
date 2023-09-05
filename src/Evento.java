import java.time.LocalDate;

public class Evento {

    //ATTRIBUTI

    private String titolo;
    private LocalDate x;
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

    public int disdici(int postirichiesti) throws RuntimeException {
        if (postirichiesti <= 0 || x.isBefore(LocalDate.now())) {
            throw new RuntimeException("non puoi disdire posti che non hai prenotato");
        }
        numerodipostiprenotati = numerodipostiprenotati - postirichiesti;
        return numerodipostiprenotati;
    }


    public int prenota (int postirichiesti) throws RuntimeException {
        if (postirichiesti > postirimastidisponibili()|| x.isBefore(LocalDate.now())) {
            throw new RuntimeException("non ci sono posti rimasti disponibili");
        }
        numerodipostiprenotati = numerodipostiprenotati + postirichiesti;
        return numerodipostiprenotati;
    }

        public int postirimastidisponibili () {
            return numerodipostitotali - numerodipostiprenotati;
        }


        @Override
        public String toString() {
            return titolo + " " + x;
        }
    }
