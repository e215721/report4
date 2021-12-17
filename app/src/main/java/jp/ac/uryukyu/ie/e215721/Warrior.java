package jp.ac.uryukyu.ie.e215721;

public class Warrior extends Hero {
    /**
     * コンストラクタ．名前，最大HP，攻撃力を指定する．
     * @param name Warriorの名前
     * @param maximumHP Warriorの最大HP
     * @param attack Warriorの攻撃力
     */
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }


    /**
     * LivingThingへ攻撃するメソッド．
     * attackの1.5倍のダメージを算出し，opponent.wounded()によりダメージ処理を実行．
     * @param opponent 攻撃対象
     */
    public void attackWithWeponSkill(LivingThing opponent) {
        int damage = (int)(super.getAttack()*1.5);
        opponent.wounded(damage);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", super.getName(), opponent.getName(), damage);
    }
    
}
