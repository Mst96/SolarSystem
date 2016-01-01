/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 * This class provides the methods and instance variables required to create a
 * graphical representation of a Celestial Body.
 *
 * @author mustafa
 */
public abstract class CelestialBody {

    protected double speed;
    protected double diameter;
    protected String colour;
    protected PointInSpace point;
    protected SolarSystem solarSystem;

    public void init(double dist, double vel, double ang, double dia, String col, SolarSystem solarSys) {
        point = new PointInSpace(dist, ang);
        diameter = dia;
        speed = vel;
        colour = col;
        solarSystem = solarSys;
    }

    /**
     * The following method redraws the Celestial Body. Is overridden by some
     * sub classes.
     *
     * @param angle the angle of the Celestial Body.
     * @param speed the speed of the Celestial Body.
     */
    public void redraw(double angle, double speed) {
    }

    /**
     * The following method obtains the centre of rotation distance. 
     * returns the centre of rotation distance.
     */
    public PointInSpace getPointInSpace() {
        return point;
    }

    /**
     * The following method sets the point in space where a Celestial Body is
     * positioned.
     *
     * @param distance The radial distance of the Celestial Body from the
     * origin.
     * @param angle the counterclockwise angle of the Celestial Body from the
     * pole.
     */
    public void setPointInSpace(double distance, double angle) {
        point.setDistance(distance);
        point.setAngle(angle);
    }

    /**
     * The following method obtains the speed of a Celestial Body. returns the
     * speed of a Celestial Body.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * The following method obtains the diameter of a Celestial Body. returns
     * the diameter of a Celestial Body.
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * The following method obtains the colour of a Celestial Body. returns the
     * colour of a Celestial Body.
     */
    public String getColour() {
        return colour;
    }

}
