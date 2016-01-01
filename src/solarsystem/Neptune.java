/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of Neptune.
 *
 * @author mustafa
 */
public class Neptune extends Planet {

    /**
     * Create a graphical representation of Neptune. Once an instance of the
     * Neptune class is created, a blue planet is displayed on the Solar System
     * window.
     *
     * @param distance The radial distance of Neptune from the Sun.
     * @param speed The orbital speed of Neptune.
     * @param diameter the diameter of Neptune.
     * @param angle the counterclockwise angle of Neptune from the pole.
     * @param colour the colour of Neptune.
     * @param solarSystem the solar system window the Neptune will be displayed
     * on.
     */

    public Neptune(double distance, double speed, double diameter, double angle, String colour, SolarSystem solarSystem) {
        init(distance, speed, angle, diameter, colour, solarSystem);  //initialises Neptune.
    }

}
