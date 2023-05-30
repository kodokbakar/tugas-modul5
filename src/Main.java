import root.Element;
import root.Hero;
import root.Mage.Mage;
import root.Tank.Armor;
import root.Tank.Tank;
import root.Weapon.Assassin.Assassin;
import root.Weapon.Gun;
import root.Weapon.Sword;
import root.Weapon.Weapon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hero hero = new Assassin(0);
        Hero hero2 = new Mage(0);
        Element element = new Element();
        Weapon weapon;
        Armor armor1 = new Armor(element);
        Armor armor2 = new Armor(element);


        System.out.println("Selamat Datang di Laga Ngantemi");
        System.out.println("================================");
        System.out.println("1. Assassin");
        System.out.println("2. Tank");
        System.out.println("3. Mage");
        System.out.println("0. Keluar");
        System.out.print("Pilih Hero untuk Pemain 1 : ");
        int ch1 = input.nextInt();

        System.out.println("================================");
        System.out.println("1. Assassin");
        System.out.println("2. Tank");
        System.out.println("3. Mage");
        System.out.println("0. Quit");
        System.out.print("Pilih Hero untuk Pemain 2 : ");
        int ch2 = input.nextInt();

        switch (ch1) {
            case 1 -> {
                hero = new Assassin(5);
                System.out.println("========================");
                System.out.println("Pemain 1 Memilih Assassin");
                System.out.println("========================");
                System.out.println("Pilih Weapon");
                System.out.println("====================");
                System.out.println("1.Gun");
                System.out.println("2.Sword");
                System.out.print("Menu : ");
                int w = input.nextInt();
                input.nextLine();
                switch (w) {
                    case 1 -> {
                        weapon = new Gun(element);
                        System.out.println("Pilih Gun");
                        System.out.println("====================");
                        System.out.println("1. Glock 19");
                        System.out.println("2.AK47");
                        System.out.print("Menu : ");
                        int gun = input.nextInt();
                        switch (gun) {
                            case 1:
                                System.out.println("Menggunakan Glock 19");
                                weapon.addname("Glock 19");
                                System.out.println("Tambahkan Element");
                                System.out.println("====================");
                                for (int i = 0; i < element.getName().length; i++) {
                                    System.out.println((i + 1) + ". " + element.getName()[i]);
                                }
                                System.out.print("Menu : ");
                                int ele1 = input.nextInt();

                                switch (ele1) {
                                    case 1:
                                        System.out.println("Menambahkan Poin Gheni");
                                        element.setAdditionalPoint("Gheni");
                                        break;
                                    case 2:
                                        System.out.println("Menambahkan poin Banyu");
                                        element.setAdditionalPoint("Banyu");
                                        break;
                                    case 3:
                                        System.out.println("Menambahkan poin Lemah");
                                        element.setAdditionalPoint("Lemah");
                                        break;
                                    default:
                                        System.out.println("no element point");
                                        element.setAdditionalPoint("");
                                        break;
                                }
                                ((Assassin) hero).useWeapon(weapon);
                                break;
                            case 2:
                                System.out.println("Menggunakan AK47");
                                weapon.addname("AK47");

                                System.out.println("Tambahkan Elemen");
                                System.out.println("====================");
                                for (int i = 0; i < element.getName().length; i++) {
                                    System.out.println((i + 1) + ". " + element.getName()[i]);
                                }
                                System.out.print("Menu : ");
                                int ele2 = input.nextInt();

                                switch (ele2) {
                                    case 1:
                                        System.out.println("Menambahkan Poin Gheni");
                                        element.setAdditionalPoint("Gheni");
                                        break;
                                    case 2:
                                        System.out.println("Menambahkan poin Banyu");
                                        element.setAdditionalPoint("Banyu");
                                        break;
                                    case 3:
                                        System.out.println("Menambahkan poin Lemah");
                                        element.setAdditionalPoint("Lemah");
                                        break;
                                    default:
                                        System.out.println("no element point");
                                        element.setAdditionalPoint("");
                                        break;
                                }
                                ((Assassin) hero).useWeapon(weapon);
                                break;
                        }
                    }
                    case 2 -> {
                        weapon = new Sword(element);
                        System.out.println("Pilih Sword");
                        System.out.println("====================");
                        System.out.println("1. Silet");
                        System.out.println("2. Clurit");
                        System.out.print("Menu : ");
                        int sword = input.nextInt();
                        switch (sword) {
                            case 1:
                                System.out.println("Menggunakan Silet");
                                weapon.addname("Silet");
                                System.out.println(weapon.getDamage());


                                System.out.println("Menambahkan elemen");
                                System.out.println("====================");
                                for (int i = 0; i < element.getName().length; i++) {
                                    System.out.println((i + 1) + ". " + element.getName()[i]);
                                }
                                System.out.print("Menu : ");
                                int ele1 = input.nextInt();

                                switch (ele1) {
                                    case 1:
                                        System.out.println("Menambahkan Poin Gheni");
                                        element.setAdditionalPoint("Gheni");
                                        break;
                                    case 2:
                                        System.out.println("Menambahkan poin Banyu");
                                        element.setAdditionalPoint("Banyu");
                                        break;
                                    case 3:
                                        System.out.println("Menambahkan poin Lemah");
                                        element.setAdditionalPoint("Lemah");
                                        break;
                                    default:
                                        System.out.println("no element point");
                                        element.setAdditionalPoint("");
                                        break;
                                }
                                ((Assassin) hero).useWeapon(weapon);
                                break;
                            case 2:
                                System.out.println("Menggunakan Clurit");
                                weapon.addname("Clurit");

                                System.out.println("Menambahkan Elemen");
                                System.out.println("====================");
                                for (int i = 0; i < element.getName().length; i++) {
                                    System.out.println((i + 1) + ". " + element.getName()[i]);
                                }
                                System.out.print("Menu : ");
                                int ele2 = input.nextInt();

                                switch (ele2) {
                                    case 1:
                                        System.out.println("Menambahkan Poin Gheni");
                                        element.setAdditionalPoint("Gheni");
                                        break;
                                    case 2:
                                        System.out.println("Menambahkan poin Banyu");
                                        element.setAdditionalPoint("Banyu");
                                        break;
                                    case 3:
                                        System.out.println("Menambahkan poin Lemah");
                                        element.setAdditionalPoint("Lemah");
                                        break;
                                    default:
                                        System.out.println("no element point");
                                        element.setAdditionalPoint("");
                                        break;
                                }
                                ((Assassin) hero).useWeapon(weapon);
                                break;
                        }
                    }
                }
            }
            case 2 -> {
                hero = new Tank(4, armor1);
                System.out.println("========================");
                System.out.println("Pemain 1 Memilih Tank");
                System.out.println("========================");
                System.out.println("Tambahkan elemen");
                System.out.println("====================");
                for (int i = 0; i < element.getName().length; i++) {
                    System.out.println((i + 1) + ". " + element.getName()[i]);
                }
                System.out.print("Menu : ");
                int ele = input.nextInt();
                switch (ele) {
                    case 1:
                        System.out.println("Menambahkan Poin Gheni");
                        element.setAdditionalPoint("Gheni");
                        break;
                    case 2:
                        System.out.println("Menambahkan poin Banyu");
                        element.setAdditionalPoint("Banyu");
                        break;
                    case 3:
                        System.out.println("Menambahkan poin Lemah");
                        element.setAdditionalPoint("Lemah");
                        break;
                    default:
                        System.out.println("no element point");
                        element.setAdditionalPoint("");
                        break;
                }
                ((Tank) hero).useArmor(armor1);
            }
            case 3 -> {
                hero = new Mage(4);
                System.out.println("========================");
                System.out.println("Pemain 1 memilih mage");
                System.out.println("========================");
            }
        }

        switch (ch2) {
            case 1:
                hero2 = new Assassin(5);

                System.out.println("========================");
                System.out.println("Pemain 2 Memilih Assassin");
                System.out.println("========================");


                System.out.println("Pilih Weapon");
                System.out.println("====================");
                System.out.println("1.Gun");
                System.out.println("2.Sword");
                System.out.print("Menu : ");
                int w = input.nextInt();

                input.nextLine();

                switch (w) {
                    case 1:
                        weapon = new Gun(element);

                        System.out.println("Pilih Gun");
                        System.out.println("====================");
                        System.out.println("1. Glock 19");
                        System.out.println("2.AK47");
                        System.out.print("Menu : ");
                        int gun = input.nextInt();

                        switch (gun) {
                            case 1:
                                System.out.println("Menggunakan Glock 19");
                                weapon.addname("Glock 19");

                                System.out.println("Tambahkan Element");
                                System.out.println("====================");
                                for (int i = 0; i < element.getName().length; i++) {
                                    System.out.println((i + 1) + ". " + element.getName()[i]);
                                }
                                System.out.print("Menu : ");
                                int ele1 = input.nextInt();

                                switch (ele1) {
                                    case 1:
                                        System.out.println("Menambahkan Poin Gheni");
                                        element.setAdditionalPoint("Gheni");
                                        break;
                                    case 2:
                                        System.out.println("Menambahkan poin Banyu");
                                        element.setAdditionalPoint("Banyu");
                                        break;
                                    case 3:
                                        System.out.println("Menambahkan poin Lemah");
                                        element.setAdditionalPoint("Lemah");
                                        break;
                                    default:
                                        System.out.println("no element point");
                                        element.setAdditionalPoint("");
                                        break;
                                }
                                ((Assassin) hero).useWeapon(weapon);
                                break;
                            case 2:
                                System.out.println("Menggunakan AK47");
                                weapon.addname("AK47");
                                weapon.getDamage();


                                System.out.println("Tambahkan Elemen");
                                System.out.println("====================");
                                for (int i = 0; i < element.getName().length; i++) {
                                    System.out.println((i + 1) + ". " + element.getName()[i]);
                                }
                                System.out.print("Menu : ");
                                int ele2 = input.nextInt();

                                switch (ele2) {
                                    case 1:
                                        System.out.println("Menambahkan Poin Gheni");
                                        element.setAdditionalPoint("Gheni");
                                        break;
                                    case 2:
                                        System.out.println("Menambahkan poin Banyu");
                                        element.setAdditionalPoint("Banyu");
                                        break;
                                    case 3:
                                        System.out.println("Menambahkan poin Lemah");
                                        element.setAdditionalPoint("Lemah");
                                        break;
                                    default:
                                        System.out.println("no element point");
                                        element.setAdditionalPoint("");
                                        break;
                                }
                                ((Assassin) hero2).useWeapon(weapon);
                                break;
                        }
                        break;
                    case 2:
                        weapon = new Sword(element);

                        System.out.println("Pilih Sword");
                        System.out.println("====================");
                        System.out.println("1. Silet");
                        System.out.println("2. Clurit");
                        System.out.print("Menu : ");
                        int sword = input.nextInt();

                        switch (sword) {
                            case 1:
                                System.out.println("Menggunakan Silet");
                                weapon.addname("Silet");
                                weapon.getDamage();


                                System.out.println("Menambahkan elemen");
                                System.out.println("====================");
                                for (int i = 0; i < element.getName().length; i++) {
                                    System.out.println((i + 1) + ". " + element.getName()[i]);
                                }
                                System.out.print("Menu : ");
                                int ele1 = input.nextInt();

                                switch (ele1) {
                                    case 1:
                                        System.out.println("Menambahkan Poin Gheni");
                                        element.setAdditionalPoint("Gheni");
                                        break;
                                    case 2:
                                        System.out.println("Menambahkan poin Banyu");
                                        element.setAdditionalPoint("Banyu");
                                        break;
                                    case 3:
                                        System.out.println("Menambahkan poin Lemah");
                                        element.setAdditionalPoint("Lemah");
                                        break;
                                    default:
                                        System.out.println("no element point");
                                        element.setAdditionalPoint("");
                                        break;
                                }
                                ((Assassin) hero2).useWeapon(weapon);
                                break;
                            case 2:
                                System.out.println("Menggunakan Clurit");
                                weapon.addname("Clurit");
                                weapon.getDamage();

                                System.out.println("Menambahkan Elemen");
                                System.out.println("====================");
                                for (int i = 0; i < element.getName().length; i++) {
                                    System.out.println((i + 1) + ". " + element.getName()[i]);
                                }
                                System.out.print("Menu : ");
                                int ele2 = input.nextInt();

                                switch (ele2) {
                                    case 1:
                                        System.out.println("Menambahkan Poin Gheni");
                                        element.setAdditionalPoint("Gheni");
                                        break;
                                    case 2:
                                        System.out.println("Menambahkan poin Banyu");
                                        element.setAdditionalPoint("Banyu");
                                        break;
                                    case 3:
                                        System.out.println("Menambahkan poin Lemah");
                                        element.setAdditionalPoint("Lemah");
                                        break;
                                    default:
                                        System.out.println("no element point");
                                        element.setAdditionalPoint("");
                                        break;
                                }
                                ((Assassin) hero2).useWeapon(weapon);
                                break;
                        }
                        break;
                }
                break;
            case 2:
                hero2 = new Tank(4, armor2);


                System.out.println("========================");
                System.out.println("Pemain 2 Memilih Tank");
                System.out.println("========================");

                System.out.println("Tambahkan elemen");
                System.out.println("====================");
                for (int i = 0; i < element.getName().length; i++) {
                    System.out.println((i + 1) + ". " + element.getName()[i]);
                }
                System.out.print("Menu : ");
                int ele = input.nextInt();

                switch (ele) {
                    case 1:
                        System.out.println("Menambahkan Poin Gheni");
                        element.setAdditionalPoint("Gheni");
                        break;
                    case 2:
                        System.out.println("Menambahkan poin Banyu");
                        element.setAdditionalPoint("Banyu");
                        break;
                    case 3:
                        System.out.println("Menambahkan poin Lemah");
                        element.setAdditionalPoint("Lemah");
                        break;
                    default:
                        System.out.println("no element point");
                        element.setAdditionalPoint("");
                        break;
                }
                ((Tank) hero2).useArmor(armor2);
                break;
            case 3:
                hero2 = new Mage(4);

                System.out.println("========================");
                System.out.println("Pemain 2 memilih mage");
                System.out.println("========================");
                break;
        }


        System.out.println("====================");
        System.out.println("     Player 1");
        System.out.println("====================");
        hero.spawnIntro();
        hero.checkStatus();

        System.out.println("====================");
        System.out.println("     Player 2");
        System.out.println("====================");
        hero2.spawnIntro();
        hero2.checkStatus();

        System.out.println("=======================");
        System.out.println("    Battle begin!!");
        System.out.println("=======================");
        System.out.println();

        for (int i = 1; !hero.getIsDefeated() || !hero2.getIsDefeated(); i++) {
            System.out.println("==============Round " + i + "==============");
            System.out.println("==============Player 1 Turn==============");
            System.out.println("1. Attack");
            System.out.print("Action : ");
            int action1 = input.nextInt();
            hero.attack(hero2);
            System.out.println("====================");
            System.out.println("     Player 2");
            System.out.println("====================");
            hero2.setDefeated();
            hero2.checkStatus();
            System.out.println();
            if (hero2.getIsDefeated()) {
                break;
            }

            System.out.println("==============Player 2 Turn==============");
            System.out.println("1. Attack");
            System.out.print("Action : ");
            int action2 = input.nextInt();
            hero2.attack(hero);

            System.out.println("====================");
            System.out.println("     Player 1");
            System.out.println("====================");
            hero2.setDefeated();
            hero.checkStatus();
            if (hero.getIsDefeated()) {
                break;
            }

        }

        System.out.println("==========================");
        System.out.println("        Battle Ends");
        System.out.println("==========================");

        if (hero.getIsDefeated()) {
            System.out.println("Player 1 Defeated \n Player 2 Win!!");
        } else if (hero2.getIsDefeated()) {
            System.out.println("Player 2 Defeated \n Player 1 Win!!");
        }

    }
}