// The ArenaStarter class controls the starting process of an arena
public class ArenaStarter {
    public static String status; // Static variable to store the arena's status (e.g., "Waiting", "Running")
    private final Arena arena;   // Reference to the Arena object associated with this ArenaStarter

    // Constructor, takes an Arena object and sets the initial status to "Waiting"
    public ArenaStarter(Arena arena) {
        status = "Waiting";  // Initial status set to "Waiting"
        this.arena = arena;  // Sets the arena reference for this ArenaStarter instance
    }

    // Method to start the arena process
    public void start() {
        System.out.println("Arena launcher running: " + arena.getName());
        System.out.println("*********************************");

        status = "Running";               // Updates the arena status to "Running"
        arena.setEntranceController(false); // Disables the entrance controller for the arena
    }
}

// The Arena class represents a game arena
public class Arena {
    private boolean entranceController; // Variable to control whether entrance is open or closed
    private final String name;          // Name of the arena
    private byte numOfPlayers;          // Tracks the number of players in the arena
    private final ArenaStarter arenaStarter; // ArenaStarter object to manage the starting of the arena

    // Constructor of the Arena class, takes the name and number of players
    public Arena(String name, byte numOfPlayers) {
        this.name = name;               // Sets the arena name
        this.numOfPlayers = numOfPlayers; // Sets the number of players
        this.entranceController = true; // Entrance control initially set to open
        arenaStarter = new ArenaStarter(this); // Creates an ArenaStarter instance with a reference to this arena
    }

    // Method to allow a player to enter the arena
    public void enter() {
        System.out.println("One player joined " + name);
        numOfPlayers++; // Increments the player count
        
        // Displays the arena status when the first player enters
        if(numOfPlayers == 1) {
            System.out.println("Status: " + ArenaStarter.status); // Shows the arena status
            System.out.println("---------------------------------");
        }
        
        // When the second player enters, the arena is considered full and is started
        if(numOfPlayers == 2) {
            System.out.println("This Arena is full!");
            arenaStarter.start(); // Starts the arena
        }
    }

    // Method to set the entrance controller
    public void setEntranceController(boolean entranceController) {
        this.entranceController = entranceController; // Updates the entrance control
    }

    // Method to return the name of the arena
    public String getName() {
        return name;
    }
}

// The Main Class
public class Main {
    public static void main(String[] args) {
        // Creates a new arena named "Arena1" with 0 initial players
        Arena arena1 = new Arena("Arena1", (byte)0);

        // Simulate two players entering "Arena1"
        arena1.enter();
        arena1.enter();

        // Creates a second arena named "Arena2" with 0 initial players
        Arena arena2 = new Arena("Arena2", (byte)0);

        // Simulate one player entering "Arena2"
        arena2.enter();

        // Creates a third arena named "Arena3" with 0 initial players
        Arena arena3 = new Arena("Arena3", (byte)0);

        // Simulate two players entering "Arena3"
        arena3.enter();
        arena3.enter();
    }
}

