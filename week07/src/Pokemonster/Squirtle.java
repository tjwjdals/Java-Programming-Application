package Pokemonster;

import java.util.ArrayList;
import java.util.Arrays;

public class Squirtle extends Pokemon {
    public Squirtle(Flyable f) {
        super();  // 부모 클래스의 기본 생성자 호출 (생략 가능)
        System.out.println("꼬북꼬북..");
        //this.setLevel(1);
        this.level = 1;
        // this.attackRate = 48;   // 미진화 포켓몬의 경우 최대 공격력과 최소 공격력의 차를 3으로 두고 랜덤 추출.
        this.attackRate = (int)(Math.random() * 4) + 45;  // 445 ~ 48
        this.defenceRate = 65;
        this.setHp(44);
        this.name = "꼬부기";
        this.flyable = f;   // Association, Has- a (Aggregation)
        // this.skills = new String[]{"물대포", "고속스핀", "물의파동"};
        // this.specialAttackRate = new int[]{40, 50, 60};

        // this.skills = new ArrayList<>();
        // skills.add("물대포");
        // skills.add("고속스핀");
        // skills.add("물의파동");

        // this.specialAttackRate = new ArrayList<>();
        // specialAttackRate.add(40);
        // specialAttackRate.add(50);
        // specialAttackRate.add(60);

        this.skills = new ArrayList<>(Arrays.asList("물대포", "고속스핀", "물의파동"));
        this.specialAttackRate = new ArrayList<>(Arrays.asList(40, 50, 60));
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}
