/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaprecruit.animation.solution;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jerson Viveros
 */
public class Animation {
    
    private int numberPositions;
    
    private List<Particle> particles;
    private char[] arena;
    
    /**
     * Get the array with the animation a each unit of time
     * @param speed
     * @param init
     * @return 
     */
    public String [] animate (int speed, String init){
        numberPositions = init.length();
        
        initParticles(init, speed);
        
        Object[] array = startAnimation(init).toArray();
        
        String[] result = new String[array.length];
        for(int i=0; i<array.length; i++){
            result[i] = array[i].toString();
        }
        
        return result;
    }
    
    
    public List<String> startAnimation(String init){
        List<String> result=new ArrayList<String>();
        cleanArena(init);
        String emptyArena = getInstantPicture();
        
        String instantArena = "";
        while(!emptyArena.equals(instantArena)){
            for(Particle p: particles){
                if(p.getPosition() >= 0 && p.getPosition()<init.length()){
                    arena[p.getPosition()] = 'X';
                }
                p.changePos();
            }
            instantArena = getInstantPicture();
            result.add(instantArena);
            System.out.println(instantArena);
            cleanArena(init);
        }
        
        
        
        return result;
    }
    
    
    public String getInstantPicture(){
        StringBuilder chain = new StringBuilder();
        for(char pos :arena){
               chain.append(pos);
        }
        return chain.toString();
    }
    
    
    /**
     * Init a collection with particles
     * @param init
     * @param speed 
     */
    public void initParticles(String init, int speed){
        particles = new ArrayList<Particle>();
        char[] characters = init.toCharArray();
        for(int i=0; i<characters.length ; i++){
            
            if(characters[i] == 'L' ||characters[i] == 'R' ){
                Particle p = new Particle();
                p.setVelocity(speed);
                p.setDirection(characters[i] == 'L' ? -1 : 1);
                p.setPosition(i);
                particles.add(p);
            }
            
        }
        
    }
    
    /**
     * Clean the arena
     */
    public void cleanArena(String init){
        arena = new char[init.length()];
        char[] characters = init.toCharArray();
        for(int i=0; i<characters.length ; i++){
            arena[i] = '.';
        }
    }
    
}
