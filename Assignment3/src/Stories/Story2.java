/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stories;

import java.util.List;

import Entities.Animal;
import Entities.Person;
import Entities.Plant;
import pkjaya.ICrosser;

public class Story2 implements pkjaya.ICrossingStrategy {

    public boolean checkOverConditions(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers, List<ICrosser> boatRiders) {
    	int weights = 0;
    	for(int i = 0; i < boatRiders.size(); i++) {
    		weights += boatRiders.get(i).getWeight();
    		if (weights > 100) {
        		return false;
        	}
    	}
    	for (int i = 0 ; i < boatRiders.size() ;i++)
        {
            if (boatRiders.get(i) instanceof Entities.Animal || boatRiders.get(i) instanceof Entities.Plant)
                return false;
        }
 			return true;
    }

    @Override
    public boolean isValid(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers, List<ICrosser> boatRiders) {
        return checkOverConditions(rightBankCrossers, leftBankCrossers, boatRiders);
        
    }

    @SuppressWarnings("null")
	@Override
	
    public List<ICrosser> getInitialCrossers() {
    	List <ICrosser> crosser = null;
        Animal herb = new Animal();
        herb.setType("herbivorous");
        herb.setWeight(20);
                
        Person farmer1 = new Person();
        farmer1.setWeight(90);
        Person farmer2 = new Person();
        farmer2.setWeight(80);
        Person farmer3 = new Person();
        farmer3.setWeight(60);
        Person farmer4 = new Person();
        farmer4.setWeight(40);
        
        crosser.add(farmer1);
        crosser.add(farmer2);
        crosser.add(farmer3);
        crosser.add(farmer4);
        crosser.add(herb);
        
        return crosser;
    }

    @Override
    public String[] getInstructions() {
        String[] storyOneInstructions = new String[2];
        storyOneInstructions[0] = "1. The farmer is the only one who can sail the boat. He can only take one passenger, in addition to himself.";
        storyOneInstructions[1] = "2. You can not leave any two crossers on the same bank if they can harm(eat) each other";
        return storyOneInstructions;
    }
}