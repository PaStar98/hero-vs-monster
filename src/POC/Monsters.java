package POC;

public class Monsters {
    public static void main(String[] args) {

        MonsterSpider spider = new MonsterSpider();
        spider.hp = 100;
        spider.minWeakAttack = 2;
        spider.maxWeakAttack = 7;
        spider.minStrongAttack = 8;
        spider.maxStrongAttack = 13;

        MonsterOrc orc = new MonsterOrc();
        orc.hp = 150;
        orc.minWeakAttack = 5;
        orc.maxWeakAttack = 10;
        orc.minStrongAttack = 11;
        orc.maxStrongAttack = 16;

        MonsterReaper reaper = new MonsterReaper();
        reaper.hp = 200;
        reaper.minWeakAttack = 8;
        reaper.maxWeakAttack = 13;
        reaper.minStrongAttack = 18;
        reaper.maxStrongAttack = 22;
    }
}
