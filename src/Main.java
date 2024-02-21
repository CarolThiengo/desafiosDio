import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir ao usuário para inserir o Nome e a XP do Herói//
        System.out.println("Digite o Nome do herói: ");
        String nomeHeroi = scanner.nextLine();

        System.out.println("Digite a quantidade de XP do herói: ");
        int xpHeroi = scanner.nextInt();

        //Utilizar If / else como estrutura de decisão para determinar o nível do herói//
        String nivel = "";
        if (xpHeroi < 1000) {
            nivel = "Ferro";
        } else if (xpHeroi >= 1001 && xpHeroi <= 2000) {
            nivel = "Bronze";
        } else if (xpHeroi >= 2001 && xpHeroi <= 5000) {
            nivel = "Prata";
        } else if (xpHeroi >= 5001 && xpHeroi <= 7000) {
            nivel = "Ouro";
        } else if (xpHeroi >= 7001 && xpHeroi <= 8000) {
            nivel = "Platina";
        } else if (xpHeroi >= 8001 && xpHeroi <= 9000) {
            nivel = "Ascendente";
        } else if (xpHeroi >= 9001 && xpHeroi <= 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }
        System.out.println("O nome do herói é: " + nomeHeroi + ", está no nível " + nivel);
        scanner.close();
    }
}