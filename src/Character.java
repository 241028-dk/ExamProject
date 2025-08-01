public abstract class Character implements Creature {
    private String name;
    private int hp;

    Character(String name,int hp) {
        if(hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        setName(name);
        setHp(hp);
    }
    public String getName(){// 追加
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp(){
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }// 追加
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = Math.max(0,hp);
    }
    public final boolean isAlive() {
        return this.hp > 0;
    }
    public void showStatus() {
        System.out.println(getName() + ":HP " + getHp());
    }


    //public abstract int getMp();

   // public void setmp(int mp) {
     //   this.mp = mp;
    //}
}
