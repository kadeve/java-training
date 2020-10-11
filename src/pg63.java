public class pg63 {
    public static void main(String[] args) {
        int a=5, b=7;
        if (a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
        //64
        if(a%2 == 0) {
            System.out.println("a is even");
        }
        else{
            System.out.println("a is even");
        }
        //66
        int year = 1700;
        if( (year%400 == 0) || ((year%4 == 0) && (year%100 != 0))){
            System.out.println(year + " is leap year");
        }
        else{
            System.out.println(year + " is not leap year");
        }
        //67
        int num = 300;
        String txt = "";
        if (num%3 == 0){
            txt += "fizz";
        }
        if (num%5 == 0){
            txt += "buzz";
        }
        System.out.println(txt);
    }
}
