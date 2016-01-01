/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of Uranus.
 *
 * @author mustafa
 */
public class Uranus extends Planet {

    /**
     * Create a graphical representation of Uranus. Once an instance of the
     * Uranus class is created, a light blue planet is displayed on the Solar
     * System window.
     *
     * @param distance The radial distance of Uranus from the Sun.
     * @param speed The orbital speed of Uranus.
     * @param diameter the diameter of Uranus.
     * @param angle the counterclockwise angle of Uranus from the pole.
     * @param colour the colour of Uranus.
     * @param solarSystem the solar system window the Uranus will be displayed
     * on.
     */
    public Uranus(double distance, double speed, double diameter, double angle, String colour, SolarSystem solarSystem) {
        init(distance, speed, angle, diameter, colour, solarSystem);  //initialises Uranus.
    }

}
