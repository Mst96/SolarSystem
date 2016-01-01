/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

import java.util.Random;

/**
 * This class provides a graphical representation of an Asteroid.
 *
 * @author mustafa
 */
public class Asteroid extends CelestialBody {

    /**
     * Create a graphical representation of an Asteroid. Once an instance of the
     * Asteroid class is created, a grey Asteroid is displayed on the Solar
     * System window.
     *
     * @param distance The radial distance of the Asteroid from the Sun.
     * @param speed The orbital speed of the Asteroid.
     * @param angle the counterclockwise angle of the Asteroid from the pole.
     * @param corAng centre of rotation angle of the Asteroid.
     * @param colour the colour of the Asteroid.
     * @param solarSystem the solar system window the Asteroid will be displayed
     * on.
     */
    public Asteroid(double speed, double angle, double corAng, String colour, Planet firstPlanet, Planet secondPlanet, SolarSystem solarSystem) {

        double min = firstPlanet.getPointInSpace().getDistance() + 10;
        double max = secondPlanet.getPointInSpace().getDistance() - 40;
        double range = min + (Math.random() * (max - min) + 1); //Creates range where Asteroids are present(between two planets).
        Math.floor(range);

        init(range, speed, angle, corAng, colour, solarSystem); //Initialises Asteroid.
        this.diameter = 5;
        solarSystem.drawSolarObjectAbout(point.getDistance(), point.getAngle(), this.diameter, this.colour, corAng, 0); //Draws asteroid.
    }

    /**
     * The following method redraws the Asteroid. Used to override redraw method
     * in super class.
     *
     * @param angle the angle of the Sun.
     * @param speed the speed of the Sun.
     */
    @Override
    public void redraw(double angle, double speed) {
        solarSystem.drawSolarObjectAbout(point.getDistance(), (point.getAngle() + angle), 5, colour, 0, 0);
    }

}
