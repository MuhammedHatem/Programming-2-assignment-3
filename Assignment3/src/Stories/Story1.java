/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stories;

import java.util.List;
import pkjaya.ICrosser;

/**
 *
 * @author Nayera Hatem
 */
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
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ICrosser> getInitialCrossers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getInstructions() {
        String[] storyOneInstructions = new String[2];
        storyOneInstructions[0] = "1. The farmer is the only one who can sail the boat. He can only take one passenger, in addition to himself.";
        storyOneInstructions[1] = "2. You can not leave any two crossers on the same bank if they can harm(eat) each other";
        return storyOneInstructions;
    }
}
