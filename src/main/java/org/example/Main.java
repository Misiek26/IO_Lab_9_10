package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger =
            LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        run();
        used();
    }

    static void run() {
        logger.info("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            logger.info("i = {}", i);
        }

        logger.info("Dodano SonarQube!!");
    }

    static void used() {
        System.out.println("Powinno byc dobrze!");
    }
}