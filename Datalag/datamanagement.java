package Datalag;
import IEmployee;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import LogikLag

public class datamanagement implements Serializable {


    private final ArrayList<Employee> employees;
    private static final File EMPLOYEE_FILE = new File("Employee.txt");
    private static final File TEAMMENBERS_FILE = new File("Employee.txt")
    private static final File PROJECT_FILE = new File("Employee.txt");
    FileWriter fileWriter;

}


    public void saveScoreFile(Player player, GameTimer gameTimer) {
        try {
            int totalScore = player.getScore() + player.getCoin();
            fileWriter = new FileWriter(HIGHSCORE_FILE);
            fileWriter.append(player.getName() + ": " + totalScore + " point & "
                    + gameTimer.getTimeRemaining() + " sekunder.\n");
            fileWriter.close();
        } catch (IOException ex) {
            System.err.println("*** fejl ved FileWriter ***");
        }
    }

    public void savePlayer(Player player) {
        try {
            FileOutputStream outputStream = new FileOutputStream(PLAYER_FILE);
            ObjectOutputStream savePlayerStream = new ObjectOutputStream(outputStream);
            savePlayerStream.writeObject(player);
            outputStream.close();
            savePlayerStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HighscoreManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HighscoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Player loadPlayer() {
        Player player = null;
        try {
            FileInputStream inputStream = new FileInputStream(PLAYER_FILE);
            ObjectInputStream loadPlayerStream = new ObjectInputStream(inputStream);
            player = (Player) loadPlayerStream.readObject();
            inputStream.close();
            loadPlayerStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HighscoreManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HighscoreManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HighscoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return player;
    }
}