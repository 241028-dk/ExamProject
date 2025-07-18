import java.util.ArrayList;

public class GameMaster {
public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        Hero h = new Hero("勇者",100,"剣");
        Wizard w = new Wizard("魔法使い",60,20);
        Thief t = new Thief("盗賊",70);

        party.add(h);
        party.add(w);
        party.add(t);

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        Matango m = new Matango("お化けキノコ",'A',45);
        Goblin g = new Goblin("ゴブリン",'A',50);
        Slime s = new  Slime("スライム",'A',40);

        monsters.add(m);
        monsters.add(g);
        monsters.add(s);

        System.out.println("---味方パーティー---");
        for(Character ally : party){
             ally.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster enemy : monsters) {
                enemy.showStatus();
        }

        System.out.println("\n味方の総攻撃！");
        for(Character ally : party) {
                for (Monster enemy : monsters) {
                        ally.attack(enemy);
                }
        }
        System.out.println("\n敵の総攻撃！");
        for(Monster enemy : monsters) {
                for (Character ally : party) {
                        enemy.attack(ally);
                }
        }

        System.out.println("\nダメージを受けた勇者が突然光ただした!");
        SuperHero sh = new SuperHero(h);
        for(Monster enemy : monsters) {
                sh.attack(enemy);
        }

        System.out.println("\n---味方パーティー最終ステータス---");
        String alive = "生存状況:";
        for (Character ally : party) {
                ally.showStatus();
                if (ally.isAlive()) {
                        System.out.println(alive + "生存");
                } else {
                        System.out.println(alive + "死亡");
                }
        }
        System.out.println("\n---敵グループ最終ステータス---");
        for(Monster enemy : monsters){
                enemy.showStatus();
                if(enemy.isAlive()) {
                        System.out.println(alive + "生存");
                }else{
                        System.out.println(alive + "討伐済み");
                }
        }

    }
}
