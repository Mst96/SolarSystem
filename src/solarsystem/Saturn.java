/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of Saturn.
 *
 * @author mustafa
 */
public class Saturn extends Planet {

    /**
     * Create a graphical representation of Saturn. Once an instance of the
     * Saturn class is created, an orange planet with rings is displayed on the
     * Solar System window.
     *
     * @param distance The radial distance of Saturn from the Sun.
     * @param speed The orbital speed of Saturn.
     * @param diameter the diameter of Saturn.
     * @param angle the counterclockwise angle of Saturn from the pole.
     * @param colour the colour of Saturn.
     * @param solarSystem the solar system window the Saturn will be displayed
     * on.
     */
    public Saturn(double distance, double speed, double diameter, double angle, String colour, SolarSystem solarSystem) {

        angle = angle * speed;
        //Create rings of Saturn
        init(distance, speed, angle, diameter * 2, "RED", solarSystem);
        init(distance, speed, angle, diameter * 1.9, "WHITE", solarSystem);
        init(distance, speed, angle, diameter * 1.8, "GREEN", solarSystem);
        init(distance, speed, angle, diameter * 1.7, "WHITE", solarSystem);
        init(distance, speed, angle, diameter * 1.5, "BLACK", solarSystem);

        init(distance, speed, angle, diameter, colour, solarSystem); //Initialise Saturn.
    }

    public void redraw(double ang, double vel) {
        solarSystem.drawSolarObjectAbout(point.getDistance(), ang * vel, diameter * 2, "RED", 0, 0);
        solarSystem.drawSolarObjectAbout(point.getDistance(), ang * vel, diameter * 1.9, "WHITE", 0, 0);
        solarSystem.drawSolarObjectAbout(point.getDistance(), ang * vel, diameter * 1.8, "GREEN", 0, 0);
        solarSystem.drawSolarObjectAbout(point.getDistance(), ang * vel, diameter * 1.7, "WHITE", 0, 0);
        solarSystem.drawSolarObjectAbout(point.getDistance(), ang * vel, diameter * 1.5, "BLACK", 0, 0);
        solarSystem.drawSolarObjectAbout(point.getDistance(), ang * vel, diameter, colour, 0, 0);

    }

}
