package com.ephemeride.ephemeride.DTO;

public class EphemerideDTO {

    public EphemerideDTO(){
        //empty
    }

    String dateJour;

    String feteDuJour;

    Integer jourAnnee;

    Integer joursRestants;

    Integer numSemaine;

    public String getDateJour() {
        return dateJour;
    }

    public void setDateJour(String dateJour) {
        this.dateJour = dateJour;
    } //DayOfWeek	getDayOfWeek() +

    public String getFeteDuJour() {
        return feteDuJour;
    }

    public void setFeteDuJour(String feteDuJour) {
        this.feteDuJour = feteDuJour;
    }

    public Integer getJourAnnee() {
        return jourAnnee;
    }

    public void setJourAnnee(Integer jourAnnee) {
        this.jourAnnee = jourAnnee;
    } //int	getDayOfYear()

    public Integer getJoursRestants() {
        return joursRestants;
    }

    public void setJoursRestants(Integer joursRestants) {
        this.joursRestants = joursRestants;
    }

    public Integer getNumSemaine() {
        return numSemaine;
    }

    public void setNumSemaine(Integer numSemaine) {
        this.numSemaine = numSemaine;
    }
}
