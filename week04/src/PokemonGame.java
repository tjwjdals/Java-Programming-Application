public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        pikachu.setFlyable(new NoFly()); // 프로그램 실행 중 동적으로 하늘을 나는 방식을 변경
        pikachu.performFly();
    }
}
