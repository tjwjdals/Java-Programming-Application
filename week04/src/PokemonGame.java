import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다.\n 야생 포켓몬이 나타났습니다.");
//       System.out.println(Math.random());  // 0.0 <= x < 1.0
//        System.out.println((int)(Math.random()*6)+1);   // 1 <= x <= 6

        // 적군 포켓몬스터 랜덤 생성
        Pokemon enemy = null;
        int enemyPick = (int)(Math.random()*3); // 0,1,2
        // System.out.println(enemyPick);
        if(enemyPick == 0) {
            NoFly noFly = new NoFly();
            enemy = new Pikachu(noFly);
        } else if (enemyPick == 1) {
            NoFly noFly = new NoFly();
            enemy = new Squirtle(noFly);
        } else if ( enemyPick == 2) {
            Wings wings = new Wings();
            enemy = new Charizard(wings);
        } else {
            System.out.println("여기는 영원히 실행 안됩니다.");
        }

        // 플레이어 포켓몬스터 선택
        // Pokemon player = new Pokemon();  // 추상 클래스의 객체는 생성 불가
        Pokemon player = null;     // 추상 클래스위 변수 선언은 가능 (upcasting 용)
        Scanner scanner = new Scanner(System.in);
        System.out.println("포켓몬을 고르세요.\n 1) 피카츄    2) 꼬북이    3) 리자몽 : ");
        int pokemonpick = scanner.nextInt();
        if (pokemonpick == 1) {
            player = new Pikachu(new NoFly());
        } else if (pokemonpick == 2) {
            player = new Squirtle(new NoFly());
        } else if (pokemonpick == 3) {
            player = new Charizard(new Wings());
        } else {
            System.out.println("정상적인 값이 아닙니다.");
        }

        int menu;
        while(true) {
            System.out.println("\t 1) 전투     2) 도망    3) 종료 : ");
            menu = scanner.nextInt();
            if (menu == 1) {
                player.attack(enemy);
            } else if ( menu == 2) {

            } else {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}
