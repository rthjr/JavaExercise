import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // create 52 cards
        ArrayList<String> cardName = new ArrayList<>( Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades" ));
        ArrayList<String> cardNum =new ArrayList<>(Arrays.asList( "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" ));

        // match the card
        ArrayList<String> deck = new ArrayList<>();

        for (int i = 0; i < cardName.size(); i++) {
            for (int j = 0; j < cardNum.size(); j++) {
                deck.add(cardName.get(i) + " " + cardNum.get(j));
            }
        }

        // Shuffle the deck before dealing
        shuffle(deck);

        // Deal the cards to computer and player c-p-c-p
        ArrayList<String> computer = new ArrayList<>();
        ArrayList<String> player = new ArrayList<>();

        computer.add(deck.get(0));
        deck.remove(0);

        player.add(deck.get(1));
        deck.remove(1);

        computer.add(deck.get(2));
        deck.remove(2);

        player.add(deck.get(3));
        deck.remove(3);

        // reveal the player and computer cards
        System.out.println("Player: " + player);

        // check if either player has a 'Boom'
        if (cardChecking(computer) || cardChecking(player)) {
            declareResult(computer, player);
            System.exit(0);
        }

        // pulling the card rule for player
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to pull a card? (yes/no): ");
        String yesNo = input.nextLine();
        input.close();

        if (yesNo.equalsIgnoreCase("yes")) {
            player.add(deck.get(deck.size() - 1));
            deck.remove(deck.size() - 1);
        }

        // pulling card for computer
        Random random = new Random();
        int computerPoint = pointCalculation(computer);

        if (computerPoint < 4 || (computerPoint == 10 || computerPoint == 0)) {
            computer.add(deck.get(deck.size() - 1));
            deck.remove(deck.size() - 1);
        }

        else if (computerPoint == 4 && random.nextDouble(1) < 0.8) {
            computer.add(deck.get(deck.size() - 1));
            deck.remove(deck.size() - 1);
        }

        else if (computerPoint == 5 && random.nextDouble(1) < 0.4) {
            computer.add(deck.get(deck.size() - 1));
            deck.remove(deck.size() - 1);
        }

        else if (computerPoint == 6 && random.nextDouble(1) < 0.1) {
            computer.add(deck.get(deck.size() - 1));
            deck.remove(deck.size() - 1);
        }

        // block of the result
        declareResult(computer, player);
    }

    // shuffle the deck of cards
    public static void shuffle(ArrayList<String> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int j = random.nextInt(list.size());
            String temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    // check if the hand has 8 or 9 points or J Q K
    public static boolean cardChecking(ArrayList<String> hand) {
        int total = pointCalculation(hand);
        return total == 8 || total == 9;
    }

    // Calculate the total points of a hand
    public static int pointCalculation(ArrayList<String> hand) {
        int total = 0;

        // pass each player and computer card to cardPoint
        for (int i = 0; i < hand.size(); i++) {

            total += cardPoint(hand.get(i));
        }

        // calculate to fine the ones value
        return total % 10;
    }

    // change the card string to calculate able value by passing to rankToInt
    public static int cardPoint(String card) {
        String rank = card.split(" ")[1];
        return converter(rank);
    }

    // switch to return the card number as integer to cardPoint method
    public static int converter(String rank) {
        switch (rank) {
            case "A":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 0;
            case "J":
                return 0;
            case "Q":
                return 0;
            case "K":
                return 0;
            default:
                throw new RuntimeException("Invalid key value");
        }
    }

    // block of the result of the game
    public static void declareResult(ArrayList<String> computer, ArrayList<String> player) {

        // point of each player
        int computerResult = pointCalculation(computer);
        int playerResult = pointCalculation(player);

        System.out.println("Score For Computer: " + computer + " : " + computerResult + " Points");
        System.out.println("Score For Player: " + player + " : " + playerResult + " Points");


        // decide the winner
        if (threePicture(player)) {
            System.out.println("Player wins!");
        } 
        else if (threePicture(computer)) {
            System.out.println("Computer wins!");
        } 
        else if (computerResult == playerResult) {
            System.out.println("It's a draw!");
        } 
        else if (playerResult == 9 || playerResult == 8
                || (playerResult > computerResult && !(computerResult == 9 || computerResult == 8))) {
            System.out.println("Player wins!");
        } 
        else {
            System.out.println("Computer wins!");
        }
    }

    // if hand has three face cards
    public static boolean threePicture(ArrayList<String> hand) {
        int count = 0;
        for (String card : hand) {
            String rank = card.split(" ")[1];
            if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
                count++;
            }
        }
        return count == 3;
    }
}
