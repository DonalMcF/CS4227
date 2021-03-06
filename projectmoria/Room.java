package projectmoria;


public final class Room {

    private final String description;
    private final Monster monster;
    private final int numOfMonsters;
    private final boolean isBossRoom;

    private Room(String description, Monster monster, boolean isBossRoom,
            int numOfMonsters) {
        this.description = description;
        this.monster = monster;
        this.isBossRoom = isBossRoom;
        this.numOfMonsters = numOfMonsters;
    }

    public static Room newRoomInstance() {
        String description = null;
        int numOfMonsters = 0;
        boolean isBossRoom = false;
        int random = ProjectMoria.RAND.nextInt(3) + 1; //Randomly select a room
        switch (random) {
            case 1:
                description = "A dark corridor with creeping, animated vines.";
                numOfMonsters = 1;
                //lighting = false;
                break;
            case 2:
                description = "A single lantern lays on the floor, illuminating"
                        + " a skeleton of a past explorer. Two pairs of eyes "
                        + "can be seen.";
                numOfMonsters = 1;
                break;
            case 3:
                description = "A green, floral room full of massive plants.";
                numOfMonsters = 1;
                //lighting = true;
                break;
        }
        return new Room(description, Monster.newRandomMonster(), false,
                numOfMonsters);

    }

    @Override
    public String toString() {
        return description;
    }

    public boolean isBossRoom() {
        return isBossRoom;
    }

    public String getDescription() {
        return description;
    }

    public Monster getMonster() {
        return monster;
    }

    public int getNumOfMonsters() {
        return numOfMonsters;
    }

    public boolean isIsBossRoom() {
        return isBossRoom;
    }

}
