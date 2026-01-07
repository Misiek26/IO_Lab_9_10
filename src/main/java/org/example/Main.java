package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger =
            LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        run();
    }

    static void run() {
        logger.info("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            logger.info("i = {}", i);
        }

        logger.info("Dodano SonarQube!!");
    }

    static void unused() {
        System.out.println("boom");
        System.out.println("Powinno wyrzucic blad!");
        int x = 1 / 0;

        if (true) {
            System.out.println("always true");
        }
    }
}