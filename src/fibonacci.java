public class fibonacci {
    public static void  main(String[] args) {

        int i=0, s1 = 0, s2 = 1, s3=0;
        while(i<=10){
            System.out.print(s1 + " ");
            s3 = s1+s2;
            s1 = s2;
            s2 = s3;
            i++;

    }


}
}
