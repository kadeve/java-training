public class asteriks {
    public static void  main(String[] args) {
        StringBuilder txt;
        for(int i=6;i>0;i--) {
            txt = new StringBuilder();
            txt.append("*".repeat(i));
            System.out.println(txt);
        }
    }
}