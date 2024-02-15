package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
        Champion champion1 = createChampion(sc);
        
        System.out.println();
        
        System.out.println("Digite os dados do segundo campeão:");
        Champion champion2 = createChampion(sc);
        
        System.out.println();

        System.out.print("Quantos turnos você deseja executar? ");
        int numTurns = sc.nextInt();
        System.out.println();

        for (int turn = 1; turn <= numTurns; turn++) {
            System.out.println("Resultado do turno " + turn + ":");
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);
            System.out.println(champion1.status());
            System.out.println(champion2.status());
            System.out.println();

            if (champion1.status().contains("morreu") || champion2.status().contains("morreu")) {
                break;
            } 	
        }
        System.out.println("FIM DO COMBATE");
        sc.close();
    }

    private static Champion createChampion(Scanner sc) {
        System.out.print("Nome: ");
        String name = sc.next();

        System.out.print("Vida inicial: ");
        int health = sc.nextInt();

        System.out.print("Ataque: ");
        int attack = sc.nextInt();

        System.out.print("Armadura: ");
        int armor = sc.nextInt();

        return new Champion(name, health, attack, armor);
    }
}