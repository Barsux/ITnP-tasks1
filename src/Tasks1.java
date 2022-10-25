public class Tasks1 {
    public static void main(String[] args) {
        System.out.println("\n<<Задача1<<");
        System.out.println("remainder(1, 3) -> " + remainder(1, 3));
        System.out.println("remainder(3, 4) -> " + remainder(3, 4));
        System.out.println("remainder(-9, 45) -> " + remainder(-9, 45));
        System.out.println("remainder(5, 5) -> " + remainder(5, 5));
        System.out.println(">>Задача1>>");
        System.out.println("\n<<Задача2<<");
        System.out.println("triArea(3, 2) -> " + triArea(3, 2));
        System.out.println("triArea(7, 4) -> " + triArea(7, 4));
        System.out.println("triArea(10, 10) -> " + triArea(10, 10));
        System.out.println(">>Задача2>>");
        System.out.println("\n<<Задача3<<");
        System.out.println("animals(2, 3, 5) -> " + animals(2, 3, 5));
        System.out.println("animals(1, 2, 3) -> " + animals(1, 2, 3));
        System.out.println("animals(5, 2, 8) -> " + animals(5, 2, 8));
        System.out.println(">>Задача3>>");
        System.out.println("\n<<Задача4<<");
        System.out.println("profitableGamble(0.2, 50, 9) -> " + profitableGamble(0.2, 50, 9));
        System.out.println("profitableGamble(0.9, 1, 2) -> " + profitableGamble(0.9, 1, 2));
        System.out.println("profitableGamble(0.9, 3, 2) -> " + profitableGamble(0.9, 3, 2));
        System.out.println(">>Задача4>>");
        System.out.println("\n<<Задача5<<");
        System.out.println("operation(24, 15, 9) -> " + operation(24, 15, 9));
        System.out.println("operation(24, 26, 2) -> " + operation(24, 26, 2));
        System.out.println("operation(15, 11, 11) -> " + operation(15, 11, 11));
        System.out.println(">>Задача5>>");
        System.out.println("\n<<Задача6<<");
        System.out.println("ctoa('A') -> " + ctoa('A'));
        System.out.println("ctoa('m') -> " + ctoa('m'));
        System.out.println("ctoa('[') -> " + ctoa('['));
        System.out.println("ctoa('\\') -> " + ctoa('\\'));
        System.out.println(">>Задача6>>");
        System.out.println("\n<<Задача7<<");
        System.out.println("addUpTo(3) -> " + addUpTo(3));
        System.out.println("addUpTo(10) -> " + addUpTo(10));
        System.out.println("addUpTo(7) -> " + addUpTo(7));
        System.out.println(">>Задача7>>");
        System.out.println("\n<<Задача8<<");
        System.out.println("nextEdge(8, 10) -> " + nextEdge(8, 10));
        System.out.println("nextEdge(5, 7) -> " + nextEdge(5, 7));
        System.out.println("nextEdge(9, 2) -> " + nextEdge(9, 2));
        System.out.println(">>Задача8>>");
        System.out.println("\n<<Задача9<<");
        System.out.println("sumOfCubes([1, 5, 9]) -> " + sumOfCubes(new int[]{1, 5, 9}));
        System.out.println("sumOfCubes([3, 4, 5]) -> " + sumOfCubes(new int[]{3, 4, 5}));
        System.out.println("sumOfCubes([2]) -> " + sumOfCubes(new int[]{2}));
        System.out.println(">>Задача9>>");
        System.out.println("\n<<Задача10<<");
        System.out.println("abcmath(42, 5, 10) -> " + abcmath(42, 5, 10));
        System.out.println("abcmath(5, 2, 1) -> " + abcmath(5, 2, 1));
        System.out.println("abcmath(1, 2, 3) -> " + abcmath(1, 2, 3));
        System.out.println(">>Задача10>>");
    }
    public static int remainder(int arg1, int arg2){
        return arg1 % arg2;
    }
    public static int triArea(int a, int h){
        return a * h / 2;
    }
    public static int animals(int chickens, int cows, int pigs) {
        return chickens * 2 + (cows + pigs) * 4;
    }
    public static boolean profitableGamble(double prob, double prize, double pay){
        return prob * prize > pay;
    }
    public static String operation(int n, int a, int b){
        if((a + b) == n)return "added";
        else if((a - b) == n)return "subtracted";
        else if((a * b) == n)return "multiplied";
        else if((a / b) == n)return "divided";
        else return "none";
    }
    public static int ctoa(char symbol){
        return (int)symbol;
    }
    public static int addUpTo(int n){
        return (1 + n) / 2 * n;
    }
    public static int nextEdge(int a, int b){
        return a + b - 1;
    }
    public static int sumOfCubes(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.pow(arr[i], 3);
        }
        return sum;
    }
    public static boolean abcmath(int a, int b, int c){
        a = a * (b - 1);
        return a % c == 0;
    }
}
