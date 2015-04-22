
package com.gaprecruit.animation.solution;

/**
 *
 * @author Jerson Viveros
 */
public class Particle {
    private int velocity;
    private int position;
    /**
     * 1 is right
     * -1 is left
     */
    private int direction;

    
    /**
     * Change the position of the particle
     */
    public void changePos(){       
        position += velocity*direction;
    }

    /**
     * @return the velocity
     */
    public int getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * @return the direction
     */
    public int getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(int direction) {
        this.direction = direction;
    }

    
    
}
