/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This abstract class provides the methods and instance variables required to
 * create a graphical representation of a planet.
 *
 * @author mustafa
 */
public abstract class Planet extends CelestialBody {
// The following instance variables set the centre of rotation distance and angle to 0. 
    //Planet's only orbit the Sun so this is set to 0.

    private final double CENTRE_OF_ROT_DIST = 0;
    private final double CENTRE_OF_ROT_ANG = 0;

    /**
     * The following method initialises a Planet. returns the angle component of
     * the polar coordinate of a Celestial Body.
     * @param distance The radial distance of the Planet from the Sun.
     * @param speed The orbital speed of the Planet.
     * @param angle The counterclockwise angle of the Planet from the pole.
     * @param diameter The diameter of the Planet.
     * @param colour The colour of the Planet.
     * @param solarSystem The solar system window the Planet will be displayed on.
     */
    @Override
    public void init(double distance, double speed, double angle, double diameter, String colour, SolarSystem solarSystem) {
        point = new PointInSpace(distance, angle);
        this.speed = speed;
        this.diameter = diameter;
        this.colour = colour;
        this.solarSystem = solarSystem;
        this.solarSystem.drawSolarObjectAbout(point.getDistance(), point.getAngle(), this.diameter, this.colour, CENTRE_OF_ROT_DIST, CENTRE_OF_ROT_ANG);

    }

    /**
     * The following method redraws a Planet. Used to override redraw method in
     * super class.
     *
     * @param angle the angle of a Planet.
     * @param speed the speed of a Planet.
     */
    public void redraw(double angle, double speed) {
        solarSystem.drawSolarObjectAbout(point.getDistance(),(angle * speed), this.diameter, this.colour, CENTRE_OF_ROT_DIST, CENTRE_OF_ROT_ANG);
    }

    /**
     * The following method obtains the centre of rotation distance. returns the
     * centre of rotation distance .
     */
    public double getCentreOfRotationDistance() {
        return CENTRE_OF_ROT_DIST;
    }

    /**
     * The following method obtains the centre of rotation angle. returns the
     * centre of rotation angle.
     */
    public double getCentreOfRotationAngle() {
        return CENTRE_OF_ROT_ANG;
    }

}
