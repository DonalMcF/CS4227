/* Player Class is used for creating a player and defining their class, there are two classes warrior and duelist*/
    package projectmoria;


    import java.io.OutputStreamWriter;
    import java.util.ArrayList;
    import java.util.List;

    
    public class Player implements Character{

        private String name;
        private String description;
        private int maxHitPoints;
        private int hitPoints;
        private int minDamage;
        private int maxDamage;
        private int defense;
        private double critChance;
        private int currX;
        private int currY;
        private List<Item> inventory;
        private Room currRoom;

        public Player() {
            this.currX = 14;
            this.currY = 14;
            this.inventory = new ArrayList<>(10);
            Item.addPotion(3, this);
        }

        @Override
        public int attack() {
            return ProjectMoria.RAND.nextInt(maxDamage - minDamage + 1);
        }

        public int defend(Monster monster) {
            int incomingAttack = monster.attack();
            int random = ProjectMoria.RAND.nextInt(99) + 1;
            if (random <= monster.getCritChance()) {
                incomingAttack = incomingAttack * 2;
                IO.monsterCrit(); 
            }
            IO.playerHitPointsMessage(incomingAttack, monster);
            hitPoints = (hitPoints * defense > incomingAttack)
                    ? hitPoints - incomingAttack : 0;
            return hitPoints;
        }

        public void heal(Item potion){
            this.hitPoints += 20;
            inventory.remove(potion);
            IO.heal(this.hitPoints);
        }

        public static Player newWarrior() {
             Player Ourwarrior = new Player();
             Ourwarrior.SetName("Warrior");
             Ourwarrior.SetDescription("A tough, well-rounded fighter with"
             + " a balanced skillset.");
             Ourwarrior.SetMaxHitPoints(100);
             Ourwarrior.SetMinDamage(20);
             Ourwarrior.SetMaxDamage(30);
             Ourwarrior.SetDefense(3);
             Ourwarrior.SetCritChance(10);
             return Ourwarrior;
        }

        public static Player newDuelist() {
            Player OurDuelist = new Player();
            OurDuelist.SetName("Warrior");
            OurDuelist.SetDescription("A tough, well-rounded fighter with"
            + " a balanced skillset.");
            OurDuelist.SetMaxHitPoints(100);
            OurDuelist.SetMinDamage(20);
            OurDuelist.SetMaxDamage(30);
            OurDuelist.SetDefense(3);
            OurDuelist.SetCritChance(10);
            return OurDuelist;
        }

        public void SetName(String name)
        {
            this.name = name;
        }

        public void SetDescription(String description)
        {
            this.description = description;
        }

        public void SetMaxHitPoints(int maxHitPoints)
        {
            this.maxHitPoints = maxHitPoints;
            this.hitPoints = maxHitPoints;
        }

        public void SetMinDamage(int minDamage)
        {
            this.minDamage = minDamage;
        }

        public void SetMaxDamage(int maxDamage)
        {
            this.maxDamage = maxDamage;
        }

        public void SetDefense(int defense)
        {
            this.defense = defense;
        }

        public void SetCritChance(int critChance)
        {
            this.critChance = critChance;
        }

        @Override
         public String getDescription() {
            return description;
        }

        @Override
        public int getHitPoints() {
            return hitPoints;
        }

        @Override
        public boolean isAlive() {
            return hitPoints > 0;
        }

        @Override
        public String getName() {
            return name;
        }

        public int getMaxHitPoints() {
            return maxHitPoints;
        }

        public int getMinDamage() {
            return minDamage;
        }

        public int getMaxDamage() {
            return maxDamage;
        }

        public int getDefense() {
            return defense;
        }

        @Override
        public double getCritChance() {
            return critChance;
        }

        public int getCurrX() {
            return currX;
        }

        public int getCurrY() {
            return currY;
        }

        public List<Item> getInventory() {
            return inventory;
        }


        public Room getCurrRoom() {
            return currRoom;
        }

        public void setCurrRoom(Room room) {
            currRoom = room;
        }

        public void setCurrX(int currX) {
            this.currX = currX;
        }

        public void setCurrY(int currY) {
            this.currY = currY;
        }
    }
