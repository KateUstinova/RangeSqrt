package ru.netology.sqr.service;

public class SQRService {
    public int enumeration (int startRange, int endRange) {
        int count = 0;
        for (int i=10; i<=99; i++) {
            if (startRange <= i * i && i * i <= endRange) {
                count++;
            }
        }
        return count;
    }
}
