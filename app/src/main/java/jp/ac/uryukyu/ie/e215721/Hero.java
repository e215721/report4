package jp.ac.uryukyu.ie.e215721;

/**
 * ヒーロークラス。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
     /** 
      * コンストラクタ、名前、最大HP、攻撃力を指定する。
      * @param name Heroの名前
      * @param maximumHP Heroの最大HP
      * @param attack Heroの攻撃力
      */
    public Hero(String name, int maximumHP, int attack) {
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", super.getName());
        }
    }

}