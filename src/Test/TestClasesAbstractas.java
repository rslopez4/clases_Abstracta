package test;

import dominio.Animal;
import dominio.AnimalCarnivoro;
import dominio.AnimalHerbivoro;
import dominio.Planta;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestClasesAbstractas {

    public static void main(String[] args) {

        int entrada = 0;
        Menu menu = new Menu();
        entrada = menu.MenuPrincipal();

        while (entrada != 3) {
            switch (entrada) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Opción 1: Clases abstractas.");
                    System.out.println("Las clases abstractas son: SerVivo y Animal");
                    entrada = menu.MenuPrincipal();
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("Opción 2: Instanciacion de objetos.");
                    System.out.println("Los seres vivos se alimentan de diferentes maeras y fuentes:");
                    Planta planta = new Planta();
                    Animal animal = new Animal() {
                    };
                    AnimalCarnivoro aCarnivoro = new AnimalCarnivoro();
                    AnimalHerbivoro aHerbivoro = new AnimalHerbivoro();

                    planta.alimentarse();
                    animal.alimentarse();
                    aCarnivoro.alimentarse();
                    aHerbivoro.alimentarse();
                    entrada = menu.MenuPrincipal();
                    break;

            }
        }
    }
}
