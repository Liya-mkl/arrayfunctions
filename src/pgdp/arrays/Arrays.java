package pgdp.arrays;

public class Arrays {

    // generelle Funktionen

    static boolean zweierpotenz(int n) {
        if (n != 1 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    static int quersumme(int n) {
        int result = 0;
        while (n > 0) {
            int lastNumber = n % 10;
            result += lastNumber;
            n = n / 10;
        }
        return result;
    }

    static long permutation(long n, long k) {
        long permutation = 1;
        for (int i = 0; i < (n - k); i++) {
            permutation *= n - i;
        }
        return permutation;
    }

    static long powers(int n, int k) {
        if (k == 0) {
            return 1;
        }
        long n2 = n;
        long basis = n;
        for (int dynamici = 1; dynamici < k; dynamici++) {
            long a = n2;
            long b = basis;
            long dynamicn2 = b;
            long basis2 = a;
            for (b = 1; b < dynamicn2; b++) {
                a += basis2;
            }
            n2 = a;
        }
        return n2;
    }

    static int square(int n) {
        int square = n * n;
        return square;
    }

    static int sumOfSquares(int a, int b) {
        int aSquared = square(a);
        int bSquared = square(b);
        int sum = aSquared + bSquared;

        return sum;
    }

    static int cube(int n) {
        int dynamicn = n;
        for (int i = 0; i < 2; i++) {
            dynamicn *= n;
        }
        return dynamicn;
    }

    static int average(int a, int b, int c) {
        int sum = a + b + c;
        int averageOfSum = sum / 3;
        return averageOfSum;
    }

    static boolean isPythagoreanTriple(int a, int b, int c) {
        if (sumOfSquares(a, b) == square(c)) {
            return true;
        }
        return false;
    }

    static void printPowersOfTwoUpTo(int n) {
        if (n <= 0) {
            System.out.println("Eingabe muss größer als 0 sein!");
        } else {
            int i = 1;
            System.out.print(i);
            while (i * 2 <= n) {
                i *= 2;
                System.out.print(" " + i);
            }
        }
    }

    static int calculateNumberOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count = count + 1;
        }
        return (count);
    }

    static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return (reversed);
    }

    static void printAsciiCodesFor(char start, int count) {
        int startInt = (int) start;
        for (int i = start; i < start + count; i++) {
            System.out.println("Der ASCII-Code von '" + (char) i + "' ist " + i + ".");
        }
    }

    static void printPrimesUpTo(int n) {
        if (n < 2) {
            return;
        }
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int p = i * i; p <= n; p += i) {
                    isPrime[p] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
    // -----------------------------------------------------------------------------------------------------------------
    // Arrays eindimensional:

    static void print(int[] a) {
        System.out.print('{');
        if (a.length > 0) {
            for (int i = 0; i < a.length - 1; i++) {
                System.out.print(a[i] + ", ");
            }
            int i = a.length - 1;
            System.out.print(a[i]);
        }
        System.out.print('}');
    }

    // Kopiert ein Array
    static int[] copyOf(int[] a){
        int[] newi = new int[a.length];
        for(int i=0;i<a.length;i++){
            newi[i] = a[i];
        }
        return newi;
    }

    static void minAndMax(int[] a) {
        int minimum = 1;
        int maximum = 1;
        if (a.length > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] < minimum) {
                    minimum = a[i];
                }
                if (a[i] > maximum) {
                    maximum = a[i];
                }
            }
        }
        System.out.print("Minimum = " + minimum + ", Maximum = " + maximum);
    }

    static boolean isOrderedAscendingly(int[] a) {
        if (a.length > 0) {
            int saveNumber = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= saveNumber) {
                    saveNumber = a[i];
                } else {
                    //System.out.println("false");
                    return false;
                }
            }
        } else {
            //System.out.println("true");
            return true;
        }
        //System.out.println("true");
        return true;
    }

    static void invert(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int saveValue = a[left];
            a[left] = a[right];
            a[right] = saveValue;
            left++;
            right--;
        }
    }

    static int[] resize(int[] a, int length) {
        int[] newa;
        if (length > 0) {
            newa = new int[length];
            for (int i = 0; i < length; i++) {
                if (i < a.length) {
                    newa[i] = a[i];
                } else {
                    newa[i] = 0;
                }
            }
        } else {
            newa = new int[0];
        }
        return newa;
    }

    static int[] filterEvenNumbersFrom(int[] a) {
        int countEvenDigits = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                countEvenDigits++;
            }
        }
        int[] evena = new int[countEvenDigits];
        int evenIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evena[evenIndex] = a[i];
                evenIndex++;
            }
        }
        return evena;
    }

    static int[] distinct(int[] a) {
        int countDistinct = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                countDistinct++;
            }
        }
        int[] result = new int[countDistinct];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index] = a[i];
                index++;
            }
        }
        return result;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Arrays mehrdimensional:

    static void print(int[][] a) {
        System.out.println("[");
        for (int[] b: a) {
            System.out.println("\t" + java.util.Arrays.toString(b));
        }
        System.out.println("]");
    }

    static int[][] minsAndMaxs(int[][] a) {
        int[][] minMax = new int[a.length][2];
        for(int i = 0; i < a.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] <= min) {
                    min = a[i][j];
                }
                if(a[i][j] > max) {
                    max = a[i][j];
                }
            }
            minMax[i][0] = min;
            minMax[i][1] = max;
        }
        return minMax;
    }

    static int[][] transpose(int[][] a) { // Zeilen und spalten vertauscht
        int[][] res;
        if (a.length > 0) {
            res = new int[a[0].length][a.length];
        } else {
            return new int[0][0];
        }

        for(int y = 0; y < a.length; y++) {
            for(int x = 0; x < a[y].length; x++) {
                res[x][y] = a[y][x];
            }
        }
        return res;
    }

    static int[] linearize(int[][] a) {  // innere Arrays aneinanderhängen
        int size = 0;
        for	(int i =0; i < a.length; size += a[i].length, i++);
        int[] res = new int[size];
        size = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                res[size++] = a[i][j];
            }
        }
        return res;
    }

    static boolean crossword(char[][] letterGrid, char[] word) {
        int current;

        // Horizontal
        for (int i = 0; i < letterGrid.length; i++) {
            current = 0;
            for (int j = 0; j < letterGrid[i].length; j++) {
                if (letterGrid[i][j] == word[current]) {
                    current++;
                    if (current >= word.length)
                        return true;
                } else if (letterGrid[i][j] == word[0]) {
                    current = 1;
                } else {
                    current = 0;
                }
            }
        }

        // Vertical
        for (int i = 0; i < letterGrid.length; i++) {
            current = 0;
            for (int j = 0; j < letterGrid[i].length; j++) {
                if (letterGrid[j][i] == word[current]) {
                    current++;
                    if (current >= word.length)
                        return true;
                } else if (letterGrid[j][i] == word[0]) {
                    current = 1;
                } else {
                    current = 0;
                }
            }
        }

        current = 0;
        for (int i = 0; i < letterGrid.length; i++) {
            if (letterGrid[i][i] == word[current]) {
                current++;
                if (current >= word.length)
                    return true;
            } else if (letterGrid[i][i] == word[0]) {
                current = 1;
            } else {
                current = 0;
            }
        }

        return false;
    }


}
