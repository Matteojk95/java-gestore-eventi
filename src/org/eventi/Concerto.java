package org.eventi;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

    LocalTime ora;
    BigDecimal prezzo;

    //COSTRUTTORE

    public Concerto(String titolo, LocalDate x, int numerodipostitotali, LocalTime ora, BigDecimal prezzo) throws RuntimeException {
        super(titolo, x, numerodipostitotali);


        this.ora = ora;
        this.prezzo = prezzo;
    }

    //GETTER E SETTER

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    //METODI


    //metodo per formattare il prezzo
    public String getFormattedPrice () {
        DecimalFormat df= new DecimalFormat("0.00");
        return df.format(prezzo);
    }



    //metodo per formattare la data
    public String getFormattedDate () {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String text = getX().format(formatter);
        return text;
    }


    @Override
    public String toString() {
        return getFormattedDate() + " " + getOra() + " " + getTitolo() + " " + getPrezzo();
    }
}
