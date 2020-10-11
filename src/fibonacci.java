public class fibonacci {
    public static String fibbo(int sayi){
        int i=0, s1 = 0, s2 = 1, s3=0;
        String cikti = "";
        while(i<=sayi){
           cikti +=  s1 + " ";
            s3 = s1+s2;
            s1 = s2;
            s2 = s3;
            i++;
        }
        return cikti;

}
}
