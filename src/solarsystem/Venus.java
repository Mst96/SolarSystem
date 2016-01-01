/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of Venus.
 *
 * @author mustafa
 */
public class Venus extends Planet {

    /**
     * Create a graphical representation of Venus. Once an instance of the Venus
     * class is created, an orange planet is displayed on the Solar System
     * window.
     *
     * @param distance The radial distance of Venus from the Sun.
     * @param speed The orbital speed of Venus.
     * @param diameter the diameter of Venus.
     * @param angle the counterclockwise angle of Venus from the pole.
     * @param colour the colour of Venus.
     * @param solarSystem the solar system window the Venus will be displayed
     * on.
     */
    public Venus(double distance, double speed, double diameter, double angle, String colour, SolarSystem solarSystem) {
        init(distance, speed, angle, diameter, colour, solarSystem);  //initialises Venus.
    }
}
