package at.campus02.zamss22.pr1;

public class TeilerFinden {
    public static void main(String[] args) {

        printTeiler(10);
        System.out.println("-------");
        printTeiler(11);
        System.out.println("-------");
        printTeiler(12);

    }
    public static void printTeiler(int z){

        int teiler = 2;

        while(teiler < z){
            if( (z % teiler) == 0){
                System.out.println(teiler);
            }
            ++teiler;
        }

    }
}
