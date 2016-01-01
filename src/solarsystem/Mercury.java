/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of Mercury.
 *
 * @author mustafa
 */
public class Mercury extends Planet {

    /**
     * Create a graphical representation of Mercury. Once an instance of the
     * Mercury class is created, a grey planet is displayed on the Solar System
     * window.
     *
     * @param distance The radial distance of Mercury from the Sun.
     * @param speed The orbital speed of Mercury.
     * @param diameter the diameter of Mercury.
     * @param angle the counterclockwise angle of Mercury from the pole.
     * @param colour the colour of Mercury.
     * @param solarSystem the solar system window the Mercury will be displayed
     * on.
     */
    public Mercury(double distance, double speed, double diameter, double angle, String colour, SolarSystem solarSystem) {
        init(distance, speed, angle, diameter, colour, solarSystem);  //initialises Mercury
    }

}
