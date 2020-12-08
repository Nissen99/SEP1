package Gluecode;
import Acquaintance.IBusiness;
import Acquaintance.IGame;
import Business.BusinessFacade;
import GUI.GameGUI;
public class starter {
}



public class Starter {

    public static void main(String[] args) {
        Ilogik  business = new BusinessFacade() {};
        IGame game = new GameGUI();
        game.setBusiness(business);
        game.startApplication(args);
    }
}
