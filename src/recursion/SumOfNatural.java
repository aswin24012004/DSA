      System.out.println(sumOfNaturalNumbers(5));


static int sumOfNaturalNumbers(int n) {
    	if (n == 0) {
            return 0;
        }

        int sum = sumOfNaturalNumbers(n - 1);

        // Backtracking
        return n + sum;
    }
