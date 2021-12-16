package jp.ac.uryukyu.ie.e215721;

/**
 * 敵クラス。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
     /** 
      * コンストラクタ、名前、最大HP、攻撃力を指定する。
      * @param name Enenmyの名前
      * @param maximumHP Enemyの最大HP
      * @param attack Enemyの攻撃力
      */
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }


    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを super.getHitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        super.setHitPoint(super.getHitPoint() - damage);
        if( super.getHitPoint() < 0 ) {
            super.setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", super.getName());
        }
    }

}