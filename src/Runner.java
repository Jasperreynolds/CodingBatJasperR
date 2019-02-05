public class Runner {


    public static void main(String[] args) {
        System.out.println(hasTeen(1,2,3));
        int[] num = {1,2,3,4,5};
        System.out.println(array123(num));
        System.out.println(firstHalf("Hello"));
        int[] sum = {14,23,10};
        System.out.println(sum3(sum));
        System.out.println(nearTen(12));
        System.out.println(blackjack(19,21));
        System.out.println(catDog("dogdogcat"));
        System.out.println(fizzArray(2));
        System.out.println(sumDigits("aa1b2cc3d5"));
        int[] in = {1,2,4,6};
        int[] out = {2,4};
        System.out.println(linearIn(in, out));
    }


    //Warm Up 1
    public static boolean hasTeen(int a, int b, int c) {
        if((13<=a && a<=19)||(13<=b && b<=19)||(13<=c && c<=19)){
            return true;
        } else {
            return false;
        }
    }

    //Warm Up 2
    public static boolean array123(int[] nums) {
        for (int i=0; i<(nums.length-2); i++){
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                return true;
            }
        }
        return false;
    }

    //String 1
    public static String firstHalf(String str) {
        int halfLength = str.length()/2;
        String result = "";
        for (int i = 0; i < halfLength; i++){
            result += str.substring(i, i+1);
        }
        return result;
    }

    //Array 1
    public static int sum3(int[] nums) {
        return nums[0]+nums[1]+nums[2];
    }

    //Logic 1
    public static boolean nearTen(int num) {
        if ((num % 10 <= 2) || (num % 10 >= 8)) {
            return true;
        } else {
            return false;
        }
    }

    //Logic 2
    public static int blackjack(int a, int b) {
        if((a <= 21 && a > b) || (b > 21 && a <=21)) {
            return a;
        }else if(a > 21 && b > 21){
            return 0;
        }else{
            return b;
        }
    }

    //String 2
    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i+3).equals("cat")){
                cat++;
            }
            if (str.substring(i, i+3).equals("dog")){
                dog++;
            }
        }
        if (cat == dog){
            return true;
        } else {
            return false;
        }
    }

    //Array 2
    public static int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }

    //String 3
    public static int sumDigits(String str) {
        int sum = 0;
        for (int i=0; i< str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                String num = str.substring(i,i+1);
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }

    //Array 3
    public static boolean linearIn(int[] outer, int[] inner) {
        int simNum = 0;
        int j = 0;
        if(inner.length == 0) {
            return true;
        }
        for (int i = 0; i < outer.length; i++) {
            if(outer[i] == inner[j]) {
                simNum ++;
                j ++;
            } else if(outer[i] > inner[j]) {
                return false;
            }
            if (simNum == inner.length){
                return true;
            }
        }
        return false;
    }

}
