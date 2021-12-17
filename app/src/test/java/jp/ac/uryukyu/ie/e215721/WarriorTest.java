package jp.ac.uryukyu.ie.e215721;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultWarriorAttack = 100;
        int defaultWarriorHp = 1000;
        Warrior demoWarrior = new Warrior("demoWarrior", defaultWarriorHp, defaultWarriorAttack);
        Enemy demoEnemy = new Enemy("demoEnemy", 500, 50);

        for (int i = 0; i < 3; i++) {
            int beforeHp = demoEnemy.getHitPoint();
            demoWarrior.attackWithWeponSkill(demoEnemy);
            demoEnemy.attack(demoWarrior);
            assertEquals((int)(defaultWarriorAttack * 1.5), beforeHp - demoEnemy.getHitPoint());
        }
    }
}