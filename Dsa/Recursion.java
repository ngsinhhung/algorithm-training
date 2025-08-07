public class Recursion {
    public static void walk(int steps){
        if(steps < 1){
            return;
        }
        System.out.println("step at:" + steps);
        walk(steps - 1);
    }

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);

    }

    public static void main(String[] args) {
        System.out.println(Recursion.factorial(5));
    }

}
