package ru.netology.sgr;

public class SQRService {

    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int result = i * i;
            if (result >= min) {
                if (result <= max) {
                    counter++;

                }

            }
        }

        return counter;
    }
}