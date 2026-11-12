package recursion;

public class CountZeoros {
    static void main() {
        int num = 54070060;
        System.out.println(counAllZeros(num,0));
    }

    private static int counAllZeros(int num, int count) {
        if (num == 0) return count;
        int rem = num % 10;
        if (rem == 0) {
            return counAllZeros(num/10, count+1);
        }
        return  counAllZeros(num/10, count);
    }


}
