/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 *This class provides a graphical representation of the Sun.
 * @author mustafa
 */
public class Sun extends CelestialBody{
    // The following instance variables define the information needed to represent a Sun.
    private final double DISTANCE = 0;
    private final double ANGLE = 0;
    private final double SPEED = 0;
    private final String COLOUR = "YELLOW";
    private final double DIAMETER = 150;
    
    /**
	 * Create a graphical representation of the Sun.
	 * Once an instance of the Sun class is created,
	 * a yellow circle is displayed on the Solar System window.
	 *
	 * @param solarSystem the solar system window the Sun will be displayed on.
	 */
    public Sun(SolarSystem solarSystem){
        init(DISTANCE, SPEED, ANGLE, DIAMETER, "YELLOW", solarSystem);
        this.solarSystem = solarSystem;
        this.solarSystem.drawSolarObject(point.getDistance(), point.getAngle(), DIAMETER, COLOUR);        
    }
    
    
    /**
     * The following method redraws the Sun.
     * Used to override redraw method in super class.
     * @param angle the angle of the Sun.
     * @param speed the speed of the Sun.
     */
    public void redraw(double angle, double speed){
        solarSystem.drawSolarObject(point.getDistance(), point.getAngle(), DIAMETER, COLOUR);
    }
    
}
