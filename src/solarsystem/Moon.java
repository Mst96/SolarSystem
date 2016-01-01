/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides a graphical representation of a Moon.
 *
 * @author mustafa
 */
public class Moon extends CelestialBody {
// The following instance variables define the information needed to represent a chess square.

    private double centreOfRotationDistance;
    private double centreOfRotationAngle;
    private Planet planetOrbited;

    /**
     * Create a graphical representation of a Moon. Once an instance of the moon
     * class is created, a light grey moon is displayed on the Solar System
     * window.
     *
     * @param distance The radial distance of the Moon from the Planet it orbits.
     * @param speed The orbital speed of the Moon.
     * @param angle the counterclockwise angle of the Moon from the pole.
     * @param corAng centre of rotation angle of the Moon.
     * @param colour the colour of the Moon.
     * @param solarSystem the solar system window the Moon will be displayed on.
     */
    public Moon(double speed, double angle, Planet planet, double corAng, String colour, SolarSystem solarSystem) {
        planetOrbited = planet;
        double orbitalDiameter = (planetOrbited.getDiameter()) / 1.5;

        init(orbitalDiameter, speed, (angle * speed), 5, colour, solarSystem);

        centreOfRotationDistance = planetOrbited.getPointInSpace().getDistance();
        centreOfRotationAngle = corAng;
        this.solarSystem.drawSolarObjectAbout(point.getDistance(), point.getAngle(), this.diameter, this.colour, this.centreOfRotationDistance, 0);
    }

    /**
     * The following method redraws a Moon. Used to override redraw method in
     * super class.
     *
     * @param angle the angle of the Moon.
     * @param speed the speed of the Moon.
     */
    @Override
    public void redraw(double angle, double speed) {
        solarSystem.drawSolarObjectAbout(point.getDistance(), (angle * speed), this.diameter, this.colour, this.centreOfRotationDistance, (angle * planetOrbited.getSpeed()));
    }

    /**
     * The following method obtains the centre of rotation distance. returns the
     * centre of rotation distance.
     */
    public double getCentreOfRotationDistance() {
        return centreOfRotationDistance;
    }

    /**
     * The following method obtains the centre of rotation angle. returns the
     * centre of rotation angle.
     */
    public double getCentreOfRotationAngle() {
        return centreOfRotationAngle;
    }

    /**
     * The following method sets the center of rotation distance of a moon.
     */
    public void setCentreOfRotationDistance(double corDist) {
        centreOfRotationDistance = corDist;
    }

    /**
     * The following method sets the center of rotation angle of a moon.
     */
    public void setCentreOfRotationAngle(double corAng) {
        centreOfRotationAngle = corAng;
    }

}
