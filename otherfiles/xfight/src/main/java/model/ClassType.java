package model;

/**
 * Описывает базовые свойства классов бойцов.
 */
public abstract class ClassType {

    /**
     *
     */
    public String name;
    /**
     *
     */
    public int health;
    /**
     *
     */
    public int level;
    /**
     *
     */
    public int experience;
    /**
     *
     */
    public int maxLegHit;
    /**
     *
     */
    public int maxHandHit;
    /**
     * Шанс нанести суперудар.
     */
    private int chanceSuperHit;
    /**
     * Шанс полностью отразить удар.
     */
    private int chanceBlock;





    abstract void hit();

    abstract void superHit();

    abstract void blockingHit();





}
