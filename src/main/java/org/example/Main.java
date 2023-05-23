package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
        }

    private void run() {
        Tree<Integer> tree=new Tree(new IComparator()) ;
        loop:
        while (true){
            System.out.println("1-Добавити 10^5 елементів");
            System.out.println("2-Добавити 10^6 елементів");
            System.out.println("3-Закінчити програму");
            Scanner scanner=new Scanner(System.in);
            int n= scanner.nextInt();
            switch (n){
                case 1->throwNum(tree,100000,scanner);
                case 2->throwNum(tree,1000000,scanner);
                case 3->{break loop;}
            }
        }


}

    private void throwNum(Tree<Integer> tree, int num, Scanner scanner) {
        randomNumbers(tree, num);
        System.out.println("Висота дерева: " + tree.getHeight());
        System.out.println("1-Показати дерево");
        if (scanner.nextInt() == 1) {
            tree.traverse();
        }
        System.out.println();
    }

    private void randomNumbers(Tree<Integer> tree, int num) {
        Random random = new Random();
        long start = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            tree.add(random.nextInt(-1000000, 1000000));
        }

        long finish = System.currentTimeMillis();
        System.out.println("Витраченний час: " + (finish-start));
    }
}