package at.campus02.zamss22.pr1;

public class Metropolis {
    public static void main(String[] args) {
        System.out.println(isMetropolis(true, 80000, 100));
        System.out.println(isMetropolis(false, 100001, 100));
        System.out.println(isMetropolis(true, 100001, 100));
        System.out.println(isMetropolis(false, 200001, 300));


    }

    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth){
        if ((isCapital && inhabitants > 100000) || ((inhabitants > 200000) && ((inhabitants*taxPerPersonAndMonth*12) >= 720000000))){
            return true;
        }
        return false;
    }
}
