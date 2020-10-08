public class asteriks {
    public static void  main(String[] args) {
        String txt;
        for(int i=6;i>0;i--) {
            txt = "";
            for (int a = i; a > 0; a--) {
                txt += "*";
            }
            System.out.println(txt);
        }
    }
}