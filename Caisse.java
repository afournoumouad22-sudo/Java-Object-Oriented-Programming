package TP03;

public class Caisse {
    private Ticket[] tickets = new Ticket[50];
    private int nbTickets;
    public Caisse(Ticket[] tickets){
        this.tickets = tickets;
        nbTickets = 0;
        
    }
    public void ajouterTikcket(Ticket t){
        if(t == null || this.tickets.length < 50){
            System.err.println("ERREUR");
            return;
        }
        this.tickets[nbTickets] = t;
        nbTickets++;
    }
    
    public  double getCaisse(){
        return nbTickets;
    }
}
