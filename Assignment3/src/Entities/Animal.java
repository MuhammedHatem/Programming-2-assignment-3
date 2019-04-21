/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import pkjaya.ICrosser;

/**
 *
 * @author Nayera Hatem
 */
public class Animal implements pkjaya.ICrosser {

    private final String type;
    private final int weight;

    Animal(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public boolean canSail() {
        return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWeight() {
        return this.weight; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEatingRank() {
        switch (this.type) {
            case "herbivorous":
                return 1;
            case "carnivorous":
                return 2; //To change body of generated methods, choose Tools | Templates.
            default:
                return 0;
        }
    }

    @Override
    public BufferedImage[] getImages() {
        BufferedImage[] buff = new BufferedImage[2];
        if ("herbivorous".equals(this.type)) {
            try {
                buff[0] = ImageIO.read(getClass().getResource(("C:\\Users\\Nayera Hatem\\Documents\\NetBeansProjects\\JavaApplication3\\Assignment3\\src\\Media\\happy_herb.png")));
                buff[1] = ImageIO.read(getClass().getResource(("C:\\Users\\Nayera Hatem\\Documents\\NetBeansProjects\\JavaApplication3\\Assignment3\\src\\Media\\sad_herb.png")));
            } catch (IOException ex) {
                Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                buff[0] = ImageIO.read(getClass().getResource(("C:\\Users\\Nayera Hatem\\Documents\\NetBeansProjects\\JavaApplication3\\Assignment3\\src\\Media\\happy_eater.png")));
                buff[1] = ImageIO.read(getClass().getResource(("C:\\Users\\Nayera Hatem\\Documents\\NetBeansProjects\\JavaApplication3\\Assignment3\\src\\Media\\sad_eater.png")));
            } catch (IOException ex) {
                Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return buff; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICrosser makeCopy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLabelToBeShown(String label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelToBeShown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
