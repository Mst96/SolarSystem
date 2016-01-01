/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 *This class holds the polar coordinates of a Celestial Body.
 * @author mustafa
 */
public class PointInSpace {
     // The following instance variables define the components of the polar coordinates of a point in space.
    private double distance;
    private double angle;
    
    /**
	 * Create a PointInSpace object that holds the polar coordinates of a Celestial Body.
	 * Once an instance of the PointInSpace class is created,
	 * the distance and angle of an object can be stored.
	 * The object can then refer to them via this instance.
	 *
	 * @param distance The radial distance of a Celestial Body from the origin.
	 * @param angle The counterclockwise angle of a Celestial Body from the pole.
	 */
    public PointInSpace(double distance, double angle){      
        this.distance = distance;
        this.angle = angle;
    } 
    
    /**
     * The following method obtains the angle component of the polar coordinate.
     * returns the angle component of the polar coordinate of a Celestial Body.
     */
     public double getAngle(){
      return angle;
    }
     /**
     * The following method sets the angle component of the polar coordinate.
     */
     public void setAngle(double ang){
        angle = ang;
    }
     /**
     * The following method obtains the distance component of the polar coordinate.
     * returns the distance component of the polar coordinate of a Celestial Body.
     */
    public double getDistance(){
        return distance;
    }
    /**
     * The following method sets the distance component of the polar coordinate.
     */
       public void setDistance(double dist){
        distance = dist;
    }
    
    
    
    
}
