package at.campus02;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] test = {1,2,3,-1};
        int[][] m = {{2,2,4,4},{1,2,4,-1},{1,4,3,-1},{4,2,3,-1}};
        String[] w1 = {"Hansi", "Susi", "Toni", "Magda"};
        String[] w2 = {"Kerstin", "Hansi", "Toni", "Michaela"};
        int[][] sm = {{1, 50},{3, 30},{2, 10},{1, 40}};

        System.out.println(findeKleinsteZahl(test));
        System.out.println(summeGegendiagonale(m));
        System.out.println(Arrays.toString(mittelwerte(m)));
        System.out.println(Arrays.toString(luckyLooser(w1, w2)));
        int[][] sales = smartphoneSales(sm);
        for(int []s : sales) {
            System.out.println(Arrays.toString(s));
        }
    }
    public static int findeKleinsteZahl(int[] array){
        int smallestVal = array[0];
        int idx = 0;

        for(int i = 1; i < array.length; ++i){
            if(array[i] < smallestVal){
                idx = i;
                smallestVal = array[i];
            }
        }

        return idx;
    }

    public static int summeGegendiagonale(int[][] m){
        int sum = 0;

        for(int i = 0; i < m.length; ++i){
            sum += m[i][m.length-i-1];
        }
        return sum;
    }
    public static double[] mittelwerte(int[][] array){
        double[] mittelwerte = new double[array.length];

        for(int z = 0; z < array.length; ++z){
            double sum = 0;
            for(int s = 0; s < array[z].length; ++s){
                sum += array[z][s];
            }
            mittelwerte[z] = sum / array.length;
        }

        return mittelwerte;
    }

    public static String[] luckyLooser(String[] first, String[] second){
        String[] l = new String[first.length > second.length ? first.length : second.length];
        int nextIdx = 0;
        for(int f = 0; f < first.length; ++f){
            for(int s = 0; s < second.length; ++s ){
                if(first[f].equals(second[s])){
                    l[nextIdx++] = first[f];
                    break;
                }
            }
        }
        return l;
    }

    public static int[][] smartphoneSales(int [][]sales){
        int [][] sums = new int[10][2];

        for(int z = 0; z < sales.length; ++z){
            sums[sales[z][0]-1][0] = sales[z][0];
            sums[sales[z][0]-1][1] += sales[z][1];
        }
        return sums;
    }
}
