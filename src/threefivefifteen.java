public class threefivefifteen {
    public static void  main(String[] args) {
        int a=3,b=5,c=15;
        for(int i=1;i<100;i++){
            if((i%a==0 || i%b==0 ) && i%15!=0){
                System.out.print(i + " ");
            }
        }
}
}
