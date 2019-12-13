/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;
/*
 * Rymax666
 * Fuck Everyone Else !
 */

public class Main {
    public static void asede() {
        Sort sayang = new Sort();
        Scanner scan = new Scanner(System.in);
        System.out.print("pilihan ? " +
                "\n1. BubbleShort" +
                "\n2. SelectionShort" +
                "\n>>>>> ");

        int pilih = scan.nextInt();
        switch (pilih) {
            case 1:
                sayang.Bubble();
                break;
            case 2:
                sayang.Selection();
                break;
            default:
                System.out.println("tidak ada !!!");
        }
        System.out.print("\npilih lagi ? Y/N" +
                "\n>>>>> ");
        String jwb = scan.next();
        if (jwb.equals("Y") || jwb.equals("y")) {
            asede();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        asede();
    }
}
