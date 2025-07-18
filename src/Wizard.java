public class Wizard extends Character{
    int mp;

    Wizard(String name,int hp,int mp) {
        super("魔法使い",40);
        setName(name);
        setHp(hp);
    }
    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
    public void attack(Creature target) {
        System.out.println(getName() + "は火の玉を放った！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp()-3);
        this.setMp(this.getMp()-1);
    }

}
