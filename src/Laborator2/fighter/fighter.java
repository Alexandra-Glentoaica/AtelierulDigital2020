package Laborator2.fighter;

import java.util.Objects;

public class fighter extends Human {
    private int damgePerAttack;

    public fighter(int damagePerAttack, int health, String name){
        super(health,name);
        this.damgePerAttack=damagePerAttack;
    }

    public int getDamgePerAttack() {
        return damgePerAttack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof fighter)) return false;
        fighter fighter = (fighter) o;
        return damgePerAttack == fighter.damgePerAttack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damgePerAttack);
    }
}
