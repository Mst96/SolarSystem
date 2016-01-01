/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of Earth.
 *
 * @author mustafa
 */
public class Earth extends Planet {

    /**
     * Create a graphical representation of Earth. Once an instance of the Earth
     * class is created, a blue planet is displayed on the Solar System window.
     *
     * @param distance The radial distance of Earth from the Sun.
     * @param speed The orbital speed of Earth.
     * @param diameter the diameter of Earth.
     * @param angle the counterclockwise angle of Earth from the pole.
     * @param colour the colour of Earth.
     * @param solarSystem the solar system window the Earth will be displayed
     * on.
     */
    public Earth(double distance, double speed, double diameter, double angle, String colour, SolarSystem solarSystem) {
        init(distance, speed, angle, diameter, colour, solarSystem);   //initialises Earth.     
    }

}
