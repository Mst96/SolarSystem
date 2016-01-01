/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

import java.util.*;

/**
 *
 * @author mustafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(1000, 800); //Instance of SolarSystem which displays a window of size 1000*800.

        List<CelestialBody> bodies = new ArrayList<CelestialBody>(); //Array List type casted to CelestialBody. Will be used to store all Celestial Bodies.

        bodies.add(new Sun(solarSystem));
        bodies.add(new Mercury(90, 1.607, 8, 0, "DARKGREY", solarSystem));
        bodies.add(new Venus(105, 1.174, 18, 0, "YELLOW", solarSystem));
        bodies.add(new Earth(120, 1, 20, 0, "BLUE", solarSystem));
        bodies.add(new Moon(12, 0, (Planet) bodies.get(3), 0, "LIGHTGRAY", solarSystem));
        bodies.add(new Mars(130, 0.802, 10, 0, "RED", solarSystem));
        bodies.add(new Jupiter(195, 0.434, 40, 0, "ORANGE", solarSystem));
        bodies.add(new Saturn(255, 0.323, 30, 0, "YELLOW", solarSystem));
        bodies.add(new Uranus(295, 0.228, 22, 0, "CYAN", solarSystem));
        bodies.add(new Neptune(320, 0.182, 20, 0, "BLUE", solarSystem));

        Random random = new Random(); //Instance of Random, its methods are later used to generate random numbers.

        //for loop used to generate all 63 of Jupiter's moons.
        for (int j = 0; j < 63; j++) {
            bodies.add(new Moon(random.nextDouble() * 20, 0, (Planet) bodies.get(6), random.nextDouble() * 361, "LIGHTGRAY", solarSystem));
        }
        //for loop used to generate 200 asteroids in random positions between Mars and Jupiter to form the Asteroid Belt.
        for (int k = 0; k < 200; k++) {
            bodies.add(new Asteroid(5, random.nextDouble() * 361, 0, "GREY", (Planet) bodies.get(5), (Planet) bodies.get(6), solarSystem));
        }
        
        //Infinite for loop used to keep Celestial Bodies continue to orbit. 
        for (int i = 0;; i++) {
            for (CelestialBody x : bodies) {       //for loop that loops through all Celestial Bodies in the bodies Array List.
                x.redraw(i, x.getSpeed());  //redraws each Celestial Body.
            }

            solarSystem.finishedDrawing(); //Finishes drawing. Clears Solar System window.
        }
    }
}
