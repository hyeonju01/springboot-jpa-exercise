package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {

    public int getAverage(int[] arr) {
        int sum = 0;
        int num = arr.length;
        for(int i = 0; i < num; i++) {
            sum += arr[i];
        }

        float result = (float) sum / num;
        int avg = (int) result;
        return avg;
    }

    public int getMedian(int[] arr) {
        int median = 0;
        int idx = arr.length / 2;
        median = arr[idx];
        return median;
    }

    public int getMode(int[] arr) {
        int mode = 0;
        int[] modeNum = new int[arr.length];

        for(int i = 0; i < modeNum.length; i++) {
            int num = arr[i];

            for(int j = 1; j < modeNum.length; ++j) {
                if (num == arr[j]) {
                    modeNum[j] += 1;
                }
            }
        }

//        //modeNum 최대값의 인덱스 구하는 코드
//        int idx = 0;
//        int modeNumMax = 0;
//        for (modeN : modeNum) {
//            int num = modeNum[i];
//            modeNumMax = Math.max(num, modeNumMax);
////        }
//
//        mode = arr[idx];
//        Arrays.sort(modeNum);
        return modeNum[modeNum.length - 1];
    }

    public int getRange(int[] arr) {
        int range = 0;
        int min = 0;
        int max = 0;
        min = arr[0];
        max = arr[arr.length - 1];
        range = Math.abs(max - min);
        return range;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Statistics stat = new Statistics();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        System.out.println("정렬 값:" + Arrays.toString(arr));
        System.out.println(stat.getAverage(arr));
        System.out.println(stat.getMedian(arr));
        System.out.println(stat.getMode(arr));
        System.out.println(stat.getRange(arr));
    }
}
