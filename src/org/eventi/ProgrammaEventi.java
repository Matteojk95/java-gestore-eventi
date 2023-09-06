package org.eventi;

import java.util.ArrayList;
import java.util.List;

public class ProgrammaEventi {

    //ATTRIBUTI


        private String titolo;
        private List<Evento> eventi;

        public ProgrammaEventi(String titolo) {
            this.titolo = titolo;
            this.eventi = new ArrayList<>();
        }

        public void aggiungiEvento(Evento evento) {
            eventi.add(evento);
        }

        public void numeroEventi(Evento evento) {
            eventi.size();
        }

        public void cancellaEventi(Evento evento) {
            eventi.clear();
        }
    }

