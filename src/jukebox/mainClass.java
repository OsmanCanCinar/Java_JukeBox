//@author osman 17070006056
package jukebox;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;

public class mainClass {
    
    FileInputStream FIS;
    BufferedInputStream BIS;
    public Player player;
    public long pauseLocation;
    public long songTotalLength;
    public String fileLocation;
    
    public void stop() { //it will stop the player from playing the sound and drop the song.
        if(player != null) {
            player.close();
            pauseLocation = 0;
            songTotalLength = 0;
            homeScreen.songDisplay.setText("");
        }
    }
    
    public void play(String path) {
        try {
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
            player = new Player(BIS);
            songTotalLength= FIS.available();
            fileLocation = path + "";
        } 
        catch (FileNotFoundException | JavaLayerException ex) {
            Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                    if(player.isComplete() && homeScreen.count == 1) { // this if will keep the play in loop.
                        play(fileLocation);
                    }
                } catch (JavaLayerException ex) {
                    Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
    
    public void pause() { 
        if(player != null) {
            try {
                pauseLocation = FIS.available(); // checks how many seconds remained from the song.
                player.close();
            } 
            catch (IOException ex) {
                Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void resume() {
        try {
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);
            player = new Player(BIS);
            FIS.skip(songTotalLength - pauseLocation);
        } 
        catch (FileNotFoundException | JavaLayerException ex) {
            Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                    Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
   
    void volumeControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((double)volumeToCut);
                    volControl.setValue(changedCalc);
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
     
    void volumeUpControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float)currentVolume+(double)volumeToCut);
                    volControl.setValue(changedCalc);
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
     
    void volumeDownControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float)currentVolume-(double)volumeToCut);
                    volControl.setValue(changedCalc);
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
}
