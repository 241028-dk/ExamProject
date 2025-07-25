public class Goblin extends Monster {

    Goblin(String name,char suffix, int hp) {
        super("ゴブリン",hp,suffix);
        setName(name);
        //setSuffix(suffix);
        //setHp(hp);
    }
@Override
    public void attack(Creature target) {
        System.out.println("ゴブリン" + getSuffix() + "はナイフで切りつけた！" + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }

}
