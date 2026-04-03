package edu.byu.cs.sonar;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {


    @Test
    void testMain() {
        String[] args = {"readMe1.txt", "readMe2.txt", "readMe3.txt", "5"};

        assertDoesNotThrow(() -> Main.main(args));

    }

    @Test
    void testError() {
      String[] args = {"readMe8.txt", "readMe2.txt", "readMe3.txt", "5"};

      Main.main(args);
    }
}