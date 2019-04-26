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
public class Person implements pkjaya.ICrosser {

    private int weight;

    public Person() {
    }

    public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
    public boolean canSail() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public int getEatingRank() {
        return 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BufferedImage[] getImages() {
        BufferedImage[] buff = new BufferedImage[2];
        try {
            buff[0] = ImageIO.read(getClass().getResource(("C:\\Users\\Nayera Hatem\\Documents\\NetBeansProjects\\JavaApplication3\\Assignment3\\src\\Media\\happy_farmer.png")));
            buff[1] = ImageIO.read(getClass().getResource(("C:\\Users\\Nayera Hatem\\Documents\\NetBeansProjects\\JavaApplication3\\Assignment3\\src\\Media\\sad_farmer.png")));
        } catch (IOException ex) {
            Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
        }

        return buff;
    }

    @Override
    public ICrosser makeCopy() {
        ICrosser temp = this;
        return temp;
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