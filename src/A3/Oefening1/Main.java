package A3.Oefening1;

public class Main {

    public static void main(String[] args) {
        Persoon persoon = new Persoon();

        persoon.setVoornaam("Aaron");
        persoon.setAchternaam("de Bruin");
        persoon.setGeboortedatum("2001-02-03");

        System.out.println(persoon.getVoornaam());
        System.out.println(persoon.getAchternaam());
        System.out.println(persoon.getGeboortedatum());
        System.out.println("De persoon is " + persoon.ageDays(persoon.getGeboortedatum()) + " dagen oud.");
    }

}