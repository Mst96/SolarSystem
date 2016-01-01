/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of Jupiter.
 *
 * @author mustafa
 */
public class Jupiter extends Planet {

    /**
     * Create a graphical representation of Jupiter. Once an instance of the
     * Jupiter class is created, an orange planet is displayed on the Solar
     * System window.
     *
     * @param distance The radial distance of Jupiter from the Sun.
     * @param speed The orbital speed of Jupiter.
     * @param diameter the diameter of Jupiter.
     * @param angle the counterclockwise angle of Jupiter from the pole.
     * @param colour the colour of Jupiter.
     * @param solarSystem the solar system window the Jupiter will be displayed
     * on.
     */
    public Jupiter(double distance, double speed, double diameter, double angle, String colour, SolarSystem solarSystem) {
        init(distance, speed, angle, diameter, colour, solarSystem);  //initialises Jupiter.   
    }
}
