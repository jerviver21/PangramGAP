package com.gaprecruit.pangram;

import com.gaprecruit.pangram.solution.MissingLetters;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class App{

    public App(){
        
    }
    
    public static void main( String[] args ){
        Logger logger = Logger.getLogger(App.class);
        
        logger.info("Started");
         
        MissingLetters ml = new MissingLetters();
        logger.info("1: "+ml.getMissingLetters("A quick brown fox jumps over the lazy dog"));
        logger.info("2: "+ml.getMissingLetters("A slow yellow fox crawls under the proactive dog"));
        logger.info("3: "+ml.getMissingLetters("Lions, and tigers, and bears, oh my!"));
        logger.info("4: "+ml.getMissingLetters(""));

        logger.info("Finished");

    }
}