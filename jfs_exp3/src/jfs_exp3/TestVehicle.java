package jfs_exp3;
import automobile.twowheeler.Hero;
import automobile.twowheeler.Honda;
public class TestVehicle {
    public static void main(String[] args) {
        Hero hero = new Hero(
            "Hero Splendor",
            "TN01AB1234",
            "Esther",
            80
        );
        Honda honda = new Honda(
            "Honda Activa",
            "TN02CD5678",
            "Esther",
            90
        );
        System.out.println("----- HERO -----");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();
        System.out.println();
        System.out.println("----- HONDA -----");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}


