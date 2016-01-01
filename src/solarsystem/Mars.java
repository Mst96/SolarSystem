/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of Mars.
 *
 * @author mustafa
 */
public class Mars extends Planet {

    /**
     * Create a graphical representation of Mars. Once an instance of the Mars
     * class is created, a red planet is displayed on the Solar System window.
     *
     * @param distance The radial distance of Mars from the Sun.
     * @param speed The orbital speed of Mars.
     * @param diameter the diameter of Mars.
     * @param angle the counterclockwise angle of Mars from the pole.
     * @param colour the colour of Mars.
     * @param solarSystem the solar system window the Earth will be displayed
     * on.
     */
    public Mars(double distance, double speed, double diameter, double angle, String colour, SolarSystem solarSystem) {
        init(distance, speed, angle, diameter, colour, solarSystem);   //initialises Mars
    }
}
