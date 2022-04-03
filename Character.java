package projectmoria;

public interface Character {
    int attack();
    void defend();
    String getDescription();
    int getHitPoints();
    boolean isAlive();
    String getName();
    double getCritChance();
}
