package main.java.hr.java.covidportal.genericsi;

import main.java.hr.java.covidportal.model.Osoba;

import java.util.List;

public class Persone <T extends Osoba> {
    private List<T> osobe;

    public Persone(List<T> osobe) {
        this.osobe = osobe;
    }

    public List<T> getOsobe() {
        return osobe;
    }

    public void setOsobe(List<T> osobe) {
        this.osobe = osobe;
    }

    @Override
    public String toString() {
        return "Ovo je lista mojih persona "+ osobe;
    }

    public void addOsoba(T novaOsoba) {
        this.osobe.add(novaOsoba);
    }

    public  T getOsoba (int myIndex) { return this.osobe.get(myIndex); }
}
