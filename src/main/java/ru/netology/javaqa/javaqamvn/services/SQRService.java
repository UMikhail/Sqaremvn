package ru.netology.javaqa.javaqamvn.services;

public class SQRService {
    public int calcSqr(int from, int before) {
        int total = 0;
        for (int i = 1; i <= before; i++) {
            if (i * i >= from) {
                if (i * i <= before) {
                    total++;
                }
            }
        }
        return total;
    }
}