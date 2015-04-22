/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaprecruit.pangram.solution;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jerson Viveros
 */
public class MissingLetters {
    private final String alphabet  = "abcdefghijklmnopqrstuvwxyz";
    private Set<Character> alphabetSet = null;
    
    public MissingLetters(){
        
    }
    
    
    /**
     * Get the missing letters to get a pangram
     * @param sentence
     * @return 
     */
    public String getMissingLetters(String sentence){
        initAlphabet();
        StringBuilder dataMissed = new StringBuilder();
        
        char[] characters = sentence.toCharArray();
        
        for(char character : characters){
            if(alphabetSet.contains(character)){
                alphabetSet.remove(character);
            }
        }
        
        for(Character character :  alphabetSet){
            dataMissed.append(character);
        }
        
        return dataMissed.toString();
    }
    
    
    /**
     * Init the alphabet
     */
    public void initAlphabet(){
        alphabetSet = new TreeSet<Character>();
        char[] characters = alphabet.toCharArray();
        for(char character : characters){
            alphabetSet.add(character);
        }
    }
    
}
