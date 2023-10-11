package Pokemonster;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PokemonGame {

        // 플레이어 포켓몬스터 선택
        // Pokemonster.Pokemon player = new Pokemonster.Pokemon();  // 추상클래스의 객체는 생성 불가
                try{
                    Pokemon player = null;  // 추상클래스의 변수 선언은 가능 (upcasting 용)
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("포켓몬을 고르세요.\n1) 피카츄   2) 꼬부기   3) 리자몽 : ");
                    int pokemonPick = scanner.nextInt();
                    if(pokemonPick == 1){
                        player = new Pikachu(new NoFly());
                    }else if(pokemonPick == 2){
                        player = new Squirtle(new NoFly());
                    }else if(pokemonPick == 3){
                        player = new Charizard(new Wings());
                    }else {
                        System.out.println("정상적인 값이 아닙니다!");
                    }

                    int menu, skillMenu;
                    while(true){
                        System.out.print("\t1) 전투   2) 도망   3) 종료 : ");
                        menu = scanner.nextInt();
                        if(menu == 1){
                            //System.out.print("전투 기술 1) " + player.skills[0] + "   2) " +  player.skills[1] + "   3) " +  player.skills[2] + " : ");
                            System.out.print("전투 기술 1) " + player.skills.get(0) + "   2) " +  player.skills.get(1) + "   3) " +  player.skills.get(2) + " : ");
                            skillMenu = scanner.nextInt();
                            //player.attack(enemy, scanner.next());
                            //player.attack(enemy, player.skills[skillMenu-1]);
                            player.attack(enemy, skillMenu);
                            enemy.attack(player, (int)(Math.random() * 3)+1);
                        }else if(menu == 2){

                        }else{
                            System.out.println("게임을 종료합니다.");
                            break;
                        }
                    }
                }catch (InputMismatchException err){
                    System.out.println("입력 값은 숫자입니다.");
                }
            }
        }