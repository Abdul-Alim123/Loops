import java.util.Random;

public class MontyHall {
    public static void main(String[] args) {
        int simulations = 10000;
        int switchWins = 0;
        int stayWins = 0;

        for (int i = 0; i < simulations; i++) {
            if (simulateGame(true)) {
                switchWins++;
            }
            if (simulateGame(false)) {
                stayWins++;
            }
        }

        System.out.println("Simulations: " + simulations);
        System.out.println("Switch Wins: " + switchWins);
        System.out.println("Stay Wins: " + stayWins);
        System.out.println("Switch Win Probability: " + (double) switchWins / simulations);
        System.out.println("Stay Win Probability: " + (double) stayWins / simulations);
    }

    public static boolean simulateGame(boolean switchChoice) {
        Random rand = new Random();
        
        // 0 = car, 1 = goat
        int[] doors = {0, 1, 1};
        shuffleArray(doors);
        
        // Player makes an initial choice
        int playerChoice = rand.nextInt(3);
        
        // Monty opens a door that is not the player's choice and is not the car
        int montyChoice = -1;
        for (int i = 0; i < 3; i++) {
            if (i != playerChoice && doors[i] != 0) {
                montyChoice = i;
                break;
            }
        }

        // If the player switches, they choose the remaining door
        if (switchChoice) {
            for (int i = 0; i < 3; i++) {
                if (i != playerChoice && i != montyChoice) {
                    playerChoice = i;
                    break;
                }
            }
        }

        // Return true if the player wins (i.e., the player chose the door with the car)
        return doors[playerChoice] == 0;
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = rand.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}

