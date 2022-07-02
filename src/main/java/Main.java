import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.tableList.add(new Table());
        restaurant.tableList.add(new Table());
        Scanner scanner = new Scanner(System.in);

        loadQueue(restaurant.waitlist);

        System.out.println("Press 1 for check-in, or 2 for check-out");
        int input = scanner.nextInt();
        scanner.nextLine();
        if (input == 1) {
            checkIn(restaurant, scanner);
        } else {

        }

        printWaitlist(restaurant);

        checkIn(restaurant, scanner);

        printTableData(restaurant);

        checkIn(restaurant, scanner);

        checkOut(restaurant, scanner);

        printTableData(restaurant);

    }

    static void loadQueue(Queue<Party> wl) {
        wl.add(new Party("Drake", 5));
        wl.add(new Party("Jenna", 4));
        wl.add(new Party("Adrian", 2));
        wl.add(new Party("Hugo", 2));
    }

    static void checkIn(Restaurant restaurant, Scanner scanner) {
        List<Table> tables = restaurant.getTableList();

        System.out.println("Name of the party:");
        String partyName = scanner.nextLine();
        System.out.println("Number of people in party?");
        int partySize = scanner.nextInt();
        scanner.nextLine();

        // Make this a search Empty Table function
        for (Table table : tables) {
            if (table.isEmpty()) {
                // seat party at table
                seatPartyAtTable(table, new Party(partyName, partySize));
                break;
            } else {
                restaurant.waitlist.add(new Party(partyName, partySize));
            }
        }
    }

    static void checkOut(Restaurant restaurant, Scanner scanner) {
        List<Table> tables = restaurant.getTableList();
        System.out.println("Name of the party to checkout:");
        String partyName = scanner.nextLine();
        
        for (Table table : tables) {
            if(partyName.equals(table.getParty().getPartyName())) {
                System.out.println("...checking out: " + partyName);
                table.setParty(new Party());
            }
            break;
        }

        // Function to automatically Add party to a table from the waitlist
        if (restaurant.getWaitlist().peek() != null) {
            checkInFromWaitlist();
        }
    }

    static void printTableData(Restaurant restaurant) {
        for (Table t : restaurant.getTableList()){
            System.out.println("\n==> Table party name: " + t.getParty().getPartyName() + "  Guests: " + t.getParty().getGuests());
        }
    }

    static void printWaitlist(Restaurant restaurant) {
        if (!restaurant.waitlist.isEmpty()) {
            System.out.println(" THIS THE WAITLIST ");
            for (Party p : restaurant.getWaitlist()) {
                System.out.println("==> Table party name: " + p.getPartyName() + "  Guests: " + p.getGuests());
            }
        }
    }

    static void checkInFromWaitlist() {

    }

    static void seatPartyAtTable(Table table, Party party) {
        table.setEmpty(false);
        table.setParty(party);
    }
}
