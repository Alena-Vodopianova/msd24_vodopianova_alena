package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Das Programm wurde gestartet"); // Программа запущена
        logger.error("Dies ist ein Beispiel für einen Fehler"); // Это пример ошибки
        System.out.println("Hallo, Welt!");
    }
}
