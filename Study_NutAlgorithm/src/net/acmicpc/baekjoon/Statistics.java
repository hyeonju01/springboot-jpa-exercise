package net.acmicpc.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {
    //산술평균
    public float getAverage(int[] arr) {
        float avg = 0;
        // 메소드 작성
        return avg;
    }

    //중앙값
    public int getMedian(int[] arr) {
        int median = 0;
        // 메소드 작성
        return median;
    }

    //최빈값 ./..가장 자주 나오는 값~! 최빈값 mode
    public int getMode(int [] arr) {
        int mode = 0;
        // 메소드 작성
        return mode;
    }

    //범위 범위가 뭐지..
    public int getRange(int [] arr) {
        int range = 0;
        // 메소드 작성
        return range;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Statistics stat = new Statistics();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        stat.getAverage(arr);
        stat.getMedian(arr);
        stat.getMode(arr);
        stat.getRange(arr);
    }
}