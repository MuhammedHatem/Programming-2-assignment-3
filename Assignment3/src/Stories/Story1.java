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

public class Story1 implements pkjaya.ICrossingStrategy {

    public boolean checkOverConditions(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers, List<ICrosser> boatRiders) {
        if (boatRiders.size() > 2) {
            return false;
        }
        return !(!(boatRiders.get(0) instanceof Entities.Person) && !(boatRiders.get(1) instanceof Entities.Person));
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
        herb.setWeight(0);
        Animal carn = new Animal();
        herb.setType("carnivorous");
        herb.setWeight(0);
        
        Person farmer = new Person();
        farmer.setWeight(0);
        
        crosser.add(herb);
        crosser.add(carn);
        crosser.add(Plant.getInstance());
        crosser.add(farmer);
        
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
