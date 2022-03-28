package com.company;

import java.util.*;

public class Main {

 // Missing number
 // ------------------------------------------------------------------------------------

    public int missingNumber(int[] A) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i=1; i <=A.length+1;i++) {
            numbers.add(i);
        }
        for (int a : A) {
            numbers.remove(new Integer(a));
        }
        return numbers.iterator().next();
    }

    //More efficient than above
    public int missingNumber2(int[] A) {
        int result=1;
        Arrays.sort(A);
        int lastNumber =  A[A.length-1];
        if (lastNumber>=1) {
            for (int i=1; i< A.length; i++) {
                result++;
                if (A[i]!=result) {
                    break;
                }
            }
        }
        return result;
    }
    // END Missing number
    // ------------------------------------------------------------------------------------


    // binaryGap
    // ------------------------------------------------------------------------------------

    public int binaryGap(int N) {
        String bString = Integer.toString(N,2);
        //System.out.println(bString);
        //return 0;
        boolean started=false;
        int counter=0;
        int maxCounter=0;
        for (int i=0; i < bString.length(); i++) {
            String c = bString.substring(i,i+1);
            if (c.equals("1")) {
                if (started) {
                    if (counter > maxCounter) {
                        maxCounter = counter;
                    }
                }
                counter=0;
                started=true;
            }
            if (c.equals("0")) {
                counter++;
            }
        }
        return maxCounter;
    }

    public int binaryGap2(int N) {
        String bString = Integer.toString(N,2);
        String[] strArray = bString.replaceAll("0+$","").split("1");
        int maxGap = 0;
        for (String s: strArray) {
            int sLength =s.length();
            if (sLength>maxGap) {
                maxGap = sLength;
            }
        }
        return maxGap;
    }

    // END binaryGap
    // ------------------------------------------------------------------------------------

    // cyclicRotation
    // ------------------------------------------------------------------------------------
    public int[] cyclicRotation(int[] A, int K) {
        if (A.length==0||A.length==K) {
            return A;
        }
        for (int i=0; i<K; i++) {
            int lastValue = A[A.length-1];
            for (int j=A.length-2; j>=0; j--) {
               // System.out.println("A "+(j+1)+"= "+j+"="+A[j] );
                A[j+1] = A[j];
            }
            A[0]=lastValue;

        }
        return A;
    }


    HashSet<Integer> aList= new HashSet<Integer>();


    public int oddOccurance(int[] A) {
        for (int i=0; i < A.length; i++) {
            int a = A[i];
            if (aList.contains(a)) {
                aList.remove(Integer.valueOf(a));
            } else{
                aList.add(a);
            }
        }
        return aList.iterator().next();
    }

    public int oddOccurance2(int[] A) {
        int nonDuplicate = 0;
        for (int i = 0; i < A.length; i++) {
            nonDuplicate ^= A[i];
        }
        return nonDuplicate;
    }

    public int frogJump(int X,int Y, int D) {
      int distance  = Y - X;
      return (int) Math.ceil(distance/(double)D);
    }

    public static void frogJump2(int X, int Y, int D) {
        int a = 0, r = 0;
        a = Y - X;
        r = a % D;
        a = a / D;
        if (r > 0) {
            a = a + 1;
        }
        System.out.println("Total jumps are: " + a);
    }


    public int permMissingElement(int[] A) {
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i=1; i<A.length+1; i++) {
            list.add(i);
        }
        for (int i=0; i < A.length; i++) {
            list.remove((Integer) A[i]);
        }
        return list.iterator().next();
    }

    public int equilibrium(int[] A) {
            int numbersOnRight = 0;
            for (int i=0; i < A.length; i++) {
                numbersOnRight +=A[i];
            }
            int minDiff = Integer.MAX_VALUE;
            int numberOnLeft=0;
            for (int i=0; i < A.length-1; i++) {
                numbersOnRight -= A[i];
                numberOnLeft +=A[i];

                if (Math.abs(numberOnLeft - numbersOnRight) < minDiff) {
                    minDiff = Math.abs(numberOnLeft- numbersOnRight);
                    System.out.println(" "+numberOnLeft+" "+numbersOnRight+" "+Math.abs(numberOnLeft- numbersOnRight));
                }
            }
            return minDiff;
    }

    public int frogRiverOne(int X, int[] A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i=1; i <=X; i++) {
            hs.add(i);
        }
        for (int i=0; i < A.length; i++) {
            if (hs.remove(A[i])) {
                if (hs.isEmpty()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int[] maxCounters(int N, int[] A) {
        int minValue = 0;
        int maxValue = 0;
        int[] counters = new int[N];

        for (int i=0; i < A.length; i++) {
            int current = A[i];
            if (current == N+1) {
                minValue = maxValue;
            } else {
               // current = current-1;
                current--;

              //  counters[current]++;
                System.out.println("Wor "+current);
                    counters[current]=Math.max(counters[current]+1,minValue+1);
      //          }

                maxValue = Math.max(maxValue,counters[current]);
            }

        }
        for (int i=0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], minValue);
        }

        return counters;
    }

    public int PermCheck(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=1; i <=A.length; i++) {
            hs.add(i);
        }
        for (int a:A) {
            if (!hs.contains(a)) {
                return 0;
            } else {
                hs.remove(a);
            }
        }
        return hs.isEmpty() ? 1 : 0;
    }

    //6, 11, 2
    public int countDiv(int A, int B, int K) {
        //6 / 2 = 3
        int base = (int)Math.ceil((double)A/K);
        // 3 * 2 = 6
        base *= K;
        // 11 - 6 = 5
        B -=base;
        // 5 / 2 = floor of it which = 2
        int count = (int)Math.floor((double)B/K);
        // increment count and that is what we requi
        count++;
        // amount of numbers between 6 - 11 divisible by 2 = 8 & 10
        return count;
    }

    public int[] genomicRange(String S, int[] P, int[] Q) {
        int[][] counters = new int[3][S.length()+1];
        int a=0;
        int c=0;
        int g=0;
        for (int i=0; i < S.length(); i++) {
            String ch = S.substring(i,i+1);
            if (ch.equals('C')) {
                c++;
            } else if (ch.equals('G')) {
                g++;
            } else if (ch.equals('A')) {
                a++;
            }
            counters[0][i+1]=a;
            counters[1][i+1]=c;
            counters[2][i+1]=g;
        }

        int[] result = new int[P.length];
        for (int i=0; i < result.length; i++) {
            int startIndex = P[i];
            int endIndex = Q[i]+1;
            int resultCount = 4;
            for (int j=0; j < 3; j++) {
                if (counters[j][startIndex] != counters[j][endIndex]) {
                    resultCount = j+1;
                    break;
                }
            }
            result[i]=resultCount;
        }
        return result;
    }

    public int minAvgOfTwoSlices(int[] A) {
        int indexOfMin2 = -1;
        int minSumOf2 = Integer.MAX_VALUE;

        int indexOfMin3=-1;
        int minSumOf3 = Integer.MAX_VALUE;

        for (int i=0; i < A.length-1; i++) {
            int val1 = A[i];
            int val2 = A[i+1];
            int sumOf2 = val1 + val2;
            if (sumOf2  < minSumOf2 ) {
                minSumOf2=sumOf2;
                indexOfMin2=i;
            }
            if (i < A.length-2) {
                int val3= A[i+2];
                int sumOf3 = val1+val2+val3;
                if (sumOf3 < minSumOf3) {
                    minSumOf3 = sumOf3;
                    indexOfMin3 = i;
                }
            }
        }
        if (indexOfMin3==-1) {
            return indexOfMin2;
        }
        double avg2 = (double)minSumOf2/2;
        double avg3 = (double)minSumOf3/3;
        if (avg2<avg3) {
            return indexOfMin2;
        }
        if (avg3 < avg2) {
            return indexOfMin3;
        }
        return Math.min(indexOfMin2, indexOfMin3);


    }

    public int passingCars(int[] A) {
        int eastBoundCars = 0;
        int passingCars = 0;
        for (int a:A) {
            if (a == 0) {
                eastBoundCars++;
            } else {
                passingCars += eastBoundCars;
                if (passingCars > 100000000) {
                    return -1;
                }
            }
        }
        return passingCars;
    }


    public int distinctValues(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for (int a: A) {
            //if (!hs.contains((Integer)a)) {
                hs.add(a);
            //}
        }
        return hs.size();
    }



    public int[] largest = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE,Integer.MIN_VALUE};
    public int[] smallest = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public int maxProductOfThree(int[] A) {
            for (int a:A) {
                considerLarge(a);
                considerSmall(a);
            }
        int product1 = largest[0] * largest[1] * largest[2];
        int product2 = largest[0] * smallest[0] * smallest[1];

        return Math.max(product1, product2);
    }

    public void considerLarge(int a) {
        if (a > largest[0]) {
            largest[2] = largest[1];
            largest[1]=largest[0];
            largest[0]=a;
        } else if (a > largest[1]) {
            largest[2] = largest[1];
            largest[1] = a;
        } else if (a > largest[2]) {
            largest[2] = a;
        }
    }
    public void considerSmall(int a) {
        if (a < smallest[0]) {
            smallest[1]=smallest[0];
            smallest[0]=a;
        } else if (a < largest[1]) {
            smallest[1] = a;
        }
    }


    public int numberOfDiscIntersections(int[] A) {
        int[] starts = new int[A.length];
        for (int i=0; i < A.length; i++) {
            int radius = A[i];
            int startPos = i - radius;
            if (startPos < 0) {
                startPos = 0;
            }
            startPos++;
        }
        int total = 0;
        for (int i=0; i < starts.length; i++) {
            total += starts[i];
            starts[i]=total;
        }
        int totalIntersections = 0;
        for (long i=0; i < A.length; i++) {
            long radius = A[(int)i];
            long endPos = i+radius;
            if (endPos > A.length-1) {
                endPos = A.length-1;
            }
            int intersections = (int)(Math.max(starts[(int)i],starts[(int)endPos]) - (i+1));
            totalIntersections +=intersections;
            if (totalIntersections>10000000) {
                return -1;
            }
        }
        return totalIntersections;
    }

    public int triangle(int[] A) {
        if (A.length<3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i=0; i < A.length-2; i++) {
            if (A[i] + A[i+1] > A[i+2]) {
                return 1;
            }
        }
        return 0;
    }

    public int bracketStack(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c=='['||c=='('||c=='{') {
                stack.push(c);
            } else {
                Character popped = stack.pop();
                if (c=='[' && popped != ']') {
                    return 0;
                } else if (c=='{' && popped != '}') {
                    return 0;
                }
                if (c=='(' && popped != ')') {
                    return 0;
                }
            }

        }
        if (!stack.isEmpty()) {
            return 0;
        }
       return 1;
    }

    public int fishSurvival(int[] A, int[] B) {
        int survivors = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i < A.length; i++) {
            int fish = A[i];
            int direction = B[i];
            if (direction==0) {
                boolean survivor = true;
                while (!stack.isEmpty()) {
                    int oppFish = stack.pop();
                    if (oppFish> fish) {
                        stack.push(oppFish);
                        survivor=false;
                        break;
                    }
                }
                if (survivor) {
                    survivors++;
                }
            } else {
                stack.push(fish);
            }
        }
        return survivors;
    }

    public int nestingBrackets(String S) {
        int counter=0;

        for (int i=0; i < S.length(); i++) {
            if (S.charAt(i)=='(') {
                counter++;
            } else {
                counter--;
            }
            if (counter < 0) {
                return 0;
            }
        }
        return counter==0 ? 1 : 0;
    }

    public int stoneWall(int[] A) {
        int blockCount=0;
        Stack<Integer> stack = new Stack<>();
        for (int a:A) {
            while (!stack.isEmpty() && stack.peek() > a) {
                stack.pop();
            }
            if (!stack.isEmpty() && stack.peek() == a) {
                //do nothing
            } else {
                stack.push(a);
                blockCount++;
            }
        }
        return blockCount;
    }


    public int dominator(int[] A) {
        Map<Integer,Integer> counters = new HashMap<>();
        for (int i=0; i < A.length; i++) {
            int a=A[i];
            if (!counters.containsKey(a)) {
                counters.put(a,1);
            } else {
                counters.put(a, counters.get(a)+1);
            }
            if (counters.get(a)> A.length/2) {
                return 1;
            }
        }
        return -1;
    }

    public int equileader(int[] A) {
        int dominator =0;
        int dominatorCount=0;
        Map<Integer,Integer> counters = new HashMap<>();
        for (int i=0; i < A.length; i++) {
            int a=A[i];
            if (!counters.containsKey(a)) {
                counters.put(a,1);
            } else {
                counters.put(a, counters.get(a)+1);
            }
            if (counters.get(a)> A.length/2) {
                dominator=a;
                dominatorCount=counters.get(a);
            }
        }
        int equiLeader =0;
        int leadersInRightSide=dominatorCount;
        int countRightSide=A.length;
        int leadersOnLeftSide=0;
        int countLeftSide=0;
        for (int i=0; i < A.length; i++) {
            if (A[i]==dominator) {
                leadersInRightSide--;
                leadersOnLeftSide++;
            }
            countLeftSide++;
            countRightSide--;
            if (leadersOnLeftSide > countLeftSide/2) {
                if (leadersInRightSide > countRightSide/2) {
                    equiLeader++;
                }

            }

        }
        return equiLeader;
    }

    public int maxDoubleSlice(int[] A) {
        int[] s = new int[A.length];
        int[] e = new int[A.length];
        for (int i=1; i < A.length-1; i++) {
            s[i] = Math.max(A[i],s[i-1]+A[i]);
        }
        for (int i=A.length-2; i >0; i--) {
            e[i]=Math.max(A[i], e[i+1]+A[i]);
        }
        int max=0;
        for (int i=1; i < A.length-1; i++) {
            max = Math.max(s[i-1]+e[i+1], max);
        }
        return max;
    }

    public int maxProfit(int[] A) {

        int maxProfit = 0;
        int cumulativeProfit = 0;
        for (int i=1; i < A.length; i++) {
            int profitThisDay = A[i] - A[i-1];
           // if (profitThisDay > maxProfit) {
           //     maxProfit = profitThisDay;
            //}
            cumulativeProfit += profitThisDay;
            if (cumulativeProfit>0) {
                if (cumulativeProfit>maxProfit) {
                    maxProfit = cumulativeProfit;
                }
            } else {
                cumulativeProfit = 0;
            }
        }
        return maxProfit;
    }


    public int maxSliceSum(int[] A) {
        long sum = Integer.MIN_VALUE;
        long maxSum = Integer.MIN_VALUE;

        for (int a: A) {
            sum = Math.max(sum+a, a);
            maxSum = Math.max(sum, maxSum);
        }
        return (int)maxSum;
    }

    public int countFactors(int N) {
        int factors = 0;
        for (int i =1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i < Math.sqrt(N)) {
                    factors +=2;
                } else {
                    factors++;
                }
            }
        }
        return factors;
    }

    public int flagsOnPeaks(int[] A) {
        List<Integer> peaks = new ArrayList<>();
        for (int i=1; i < A.length-1; i++) {
            if (A[i-1] < A[i]) {
                if (A[i+1] < A[i]) {
                    peaks.add(i);
                }
            }
        }
        if (peaks.size()<=1) {
            return peaks.size();
        }
        int maxFlags = (int)Math.ceil(Math.sqrt(peaks.get(peaks.size()-1)-peaks.get(0)));

        for (int flags = maxFlags; flags> 1; flags--) {
            int startIndex = 0;
            int endIndex = peaks.size()-1;

            int startFlag = peaks.get(startIndex);
            int endFlag = peaks.get(endIndex);

            int flagsPlaced = 2;
            while (startIndex < endIndex) {
                startIndex++;
                endIndex--;
                if (peaks.get(startIndex) >= startFlag+flags) {
                    if (peaks.get(startIndex) <= endFlag-flags) {
                        flagsPlaced++;
                        startFlag = peaks.get(startIndex);
                    }

                }
                if (peaks.get(endIndex) >= startFlag+flags) {
                    if (peaks.get(endIndex) <= endFlag - flags) {
                        flagsPlaced++;
                        endFlag = peaks.get(endIndex);
                    }
                }
                if (flagsPlaced == flags) {
                    return flags;
                }
            }
        }
        return 0;
    }

    public int minPerimeterRectangle(int N) {
        for (int i=(int) Math.ceil(Math.sqrt(N)); i >=1; i--) {
            if (((double)N/i) % 1 ==0)  {
                return i*2 + ((N/i) *2);
            }
        }
        return 0;
    }

    public int peaks(int[] A) {
        if (A.length<3) {
            return 0;
        }
        List<Integer> peaks = new ArrayList<>();
        for (int i=1; i < A.length-1; i++) {
            if (A[i - 1] < A[i] && A[i+1] < A[i]) {
                peaks.add(i);
            }
        }
        if (peaks.size()==0) {
            return 0;
        }
        for (int blockLength=3; blockLength <= A.length/2; blockLength++) {
            if (A.length % blockLength !=0) {
                continue;
            }
            int currentPeak = 0;
            boolean ok=true;
            for (int blockStart=0; blockStart< A.length; blockStart+=blockLength) {
                boolean foundPeak = false;

                while (currentPeak<peaks.size()) {
                    if (peaks.get(currentPeak) < blockStart+blockLength) {
                        foundPeak = true;
                        currentPeak++;
                    } else if (peaks.get(currentPeak)>=blockStart+blockLength) {
                        break;
                    }
                }
                if (!foundPeak) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return A.length / blockLength;
            }
        }
         return 1;
    }
    //Similar to countFactors
    public int[] countNonDivisible(int[] A){

        Map<Integer,Integer> count = new HashMap<>();
        for (int a: A) {
            int c=0;
            if (count.containsKey(a)){
                c = count.get(0);
            }
            c++;
            count.put(a,c);
        }
        Map<Integer,Integer> divisorsCount = new HashMap<>();
        for (int n: count.keySet()) {
             int divisorCount = 0;
             for (int val=1;val <=Math.sqrt(n); val++) {
                 if (n % val == 0) {
                     if (count.containsKey(val)) {
                         divisorCount+=count.get(val);
                     }

                     if (val< Math.sqrt(n)) {
                         int opp = n / val;
                         if (count.containsKey(opp)) {
                             divisorCount += count.get(opp);
                         }
                     }
                 }
             }
             divisorsCount.put(n, divisorCount);
        }
        int[] nonDivisors = new int[A.length];
        for (int i=0; i < A.length; i++) {
            nonDivisors[i] = A.length - divisorsCount.get(A[i]);
        }
        return nonDivisors;
    }

    public int[] countSemiPrimes(int N, int[] P, int[] Q) {
        boolean[] notPrimes = new boolean[N+1];
        for (int a=2; a <= N/2; a++) {
            for (int b=a*2; b<=N; b+=a) {
                notPrimes[b] = true;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int a=2; a <= N; a++) {
            if (!notPrimes[a]) {
                primes.add(a);
            }
        }
        int[] semiPrimes = new int[N+1];
        for (int a=0; a < primes.size()-1; a++) {
            for (int b=a;  b < primes.size()-1; b++) {
                int primea = primes.get(a);
                int primeb = primes.get(b);
                if ((long)primea*primeb >= semiPrimes.length) {
                    break;
                }
                semiPrimes[primea*primeb]= 1;
            }
        }
        int c = 0;
        for (int i=0; i < semiPrimes.length; i++) {
            c+=semiPrimes[i];
            semiPrimes[i]=c;
        }
        //return semiPrimes;
        int result[] = new int[P.length];
        for (int i=0; i < P.length; i++) {
            result[i]=semiPrimes[Q[i]] - semiPrimes[P[i]-1];
        }
        return result;
    }

    //--- GCD
    public int chocolateByNumbers(int N, int M) {
        return N/gcd(N,M,1);
    }

    public int commonPrimeDivisors(int[] A,int[] B) {
        int count=0;
        for (int i=0; i < A.length; i++) {
            if (hasAllPrimeFactors(A[i],B[i])&& hasAllPrimeFactors(B[i],A[i])) {
                count++;
            }
        }
        return count;
    }
    public boolean hasAllPrimeFactors(int x, int y) {
        if (y==1) {
            return true;
        }
        int gcd=gcd(x,y,1);
        if (gcd==1) {
            return false;
        }
        return hasAllPrimeFactors(x,y/gcd);
    }

    public int gcd(int a, int b, int res) {
        if (a==b) {
            return res * a;
        } else if ((a%2 == 0 ) && (b%2==0)) {
            return gcd(a/2,b/2,2*res);
        } else if (a %2 == 0) {
            return gcd(a/2,b,res);
        } else if (b %2 == 0) {
            return gcd(a, b / 2, res);
        } else if (a > b) {
            return gcd(a -b, b, res);
        } else {
            return gcd(a,b-a,res);
        }
    }

    //--- END GCD

    //--- fib fibFrog

    List<Integer> fibNums;
    int[] A;
    int target;

    List<Integer> positions = new ArrayList<>();

    public int fibFrog(int[] A) {
        this.A=A;
        target=A.length;

        fibNums = new ArrayList<>();
        fibNums.add(A[0]);
        fibNums.add(A[1]);
        for (int i=0;;i++) {
            int nextFibNum=fibNums.get(i)+fibNums.get(i+1);
            if (nextFibNum <= A.length+1) {
                fibNums.add(nextFibNum);
            } else {
                break;
            }
        }

        int steps = 0;
        positions.add(-1);
        while (!positions.isEmpty()) {
            steps++;
            if (attemptJump()) {
                return steps;
            }
        }
        return -1;
    }
    public boolean attemptJump() {
        List<Integer> newPositions = new ArrayList<>();
        for (int position:positions) {
            for (int i=fibNums.size()-1; i>=2; i--) {
                int fibNum = fibNums.get(i);
                int newPosition =position+fibNum;
                if (newPosition ==target) {
                    return true;
                }
                if (position+fibNum<target) {
                    if (A[newPosition]==1) {
                        A[newPosition] = 0;
                        newPositions.add(newPosition);
                    }
                }
            }
        }
        return false;
    }


    //-- frog end

    public int[] ladder(int[] A, int[] B) {
        int[] result = new int[A.length];

        int[] fibs = new int[A.length+1];
        fibs[0] = 1;
        fibs[1] = 1;
        for (int i=2; i < A.length; i++) {
            fibs[i] = (fibs[i-2] + fibs[i=1]) % (int)Math.pow(2,30);
        }
        for (int i=0; i< A.length;i++) {
            int m = (int)Math.pow(2,B[i]);
            result[i] = fibs[A[i]] %m;
        }
        return result;
    }



    public int minMax(int K, int M, int[] A) {
        int min = 0;
        int max=0;
        for (int a: A) {
            max+=a;
            //maximum or highest value in array
            min = Math.max(min, a);
        }
        int bestAnswer = max;

        while (min<=max) {
            int mid = (min+max)/2;
            int blocks=checkBlocks(A, mid);
            if (blocks > K) {
                min = mid+1;
            } else {
                max = mid -1;
                if (mid < bestAnswer ) {
                    bestAnswer = mid;
                }
            }
        }
        return bestAnswer;

    }
    public int checkBlocks(int[] A, int guess) {
        int blocks=1;
        int blockSum =0;
        for (int a:A) {
            blockSum+=a;
            if (blockSum>guess) {
                blockSum=a;
                blocks++;
            }
        }
        return blocks;
    }
    //-- end ladder

    //-- nail Planks

    class Nail implements Comparable<Nail>{

        int index;
        int value;

        public Nail(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Nail{" +
                    "index=" + index +
                    ", value=" + value +
                    '}';
        }

        @Override
        public int compareTo(Nail nail) {
            return value - nail.value;
        }
    }
    class Plank implements Comparable<Plank>{
        int start;
        int end;

        public Plank(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Plank{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        @Override
        public int compareTo(Plank plank) {
            return start - plank.start;
        }
    }
    public int nailPlanks(int[] A, int[] B, int[] C) {
        Set<Integer> nailsSeen = new HashSet<>();
        List<Nail> nails = new ArrayList<>();
        for (int i=0; i<C.length; i++) {
            if (!nailsSeen.contains(C[i])) {
                nails.add(new Nail(i+1,C[i]));
                nailsSeen.add(C[i]);
            }
        }
        Collections.sort(nails);

        List<Plank> planks = new ArrayList<>();
        for (int i=0; i < A.length; i++) {
            planks.add(new Plank(A[i],B[i]));
        }
        Collections.sort(planks);
        for (int i=0; i < planks.size()-2; i++) {

            while (i>0 && planks.get(i).end > planks.get(i+1).end) {
                planks.remove(i--);
            }
        }
        int maxMin = 0;
        for (Plank plank: planks) {
            int minIndex = getMinNailIndex(nails,plank);
            if (minIndex==-1) {
                return -1;
            }
            maxMin = Math.max(maxMin, minIndex);

        }
        return maxMin;
    }
    public int getMinNailIndex(List<Nail> nails, Plank plank) {
        int start = 0;
        int end = nails.size()-1;
        int result = -1;
        while (start<=end) {
            int centre = (start+end)/2;
            if (nails.get(centre).value < plank.start) {
                start = centre+1;
            } else if (nails.get(centre).value > plank.end) {
                end = centre-1;
            } else {
                result = centre;
                end = centre -1;
            }
        }
        if (result==-1) {
            return -1;
        }
        int minIndex = nails.get(result).index;
        for (int i=result+1; i < nails.size(); i++) {
            if (nails.get(i).value < plank.end) {
                minIndex = Math.min(minIndex, nails.get(i).index);
            } else {
                return minIndex;
            }
        }
        return minIndex;
    }
    //-- end nail Planks

    public int absDistinct(int[] A) {
        HashSet<Long> distinctValues = new HashSet<>();
        //int count =0;
        for (int a:A) {
            if (!distinctValues.contains(Math.abs((long)a))) {
                distinctValues.add(Math.abs((long)a));
                //count++;
            }
        }
        return distinctValues.size();
    }

    HashSet<Integer> caterpillar = new HashSet<>();
    int catFront=0;
    int catRear=0;
    //int[] A;
    public int countDistinctSlices(int M, int[] A) {
        this.A=A;
        int count =0;
        while (A.length > catFront || A.length > catRear) {
            if (A.length > catFront && !caterpillar.contains(A[catFront])) {
                moveHeadForward();
                outputCat(">");
                count += caterpillar.size();
                if (count >100000000) {
                    return 1000000000;
                }
            } else {
                moveTailForward();
                outputCat("<");
            }
        }
        return count;
    }
    public void moveHeadForward() {
        caterpillar.add(A[catFront]);
        catFront++;
    }

    public void moveTailForward() {
        caterpillar.remove(A[catRear]);
        catRear++;
    }
    public void outputCat(String dir) {
        Iterator<Integer> iCat = caterpillar.iterator();
        String s=dir;
        while (iCat.hasNext()) {
            s +=iCat.next()+" : ";
        }
        System.out.println(s);
    }

    //----------

    public int countTriangles(int[] A) {
        Arrays.sort(A);
        int triangles=0;
        for (int catBack=0; catBack < A.length-2; catBack++) {
            int catFront = catBack +2;
            for (int m = catBack+1; m < A.length-1; m++) {
                while (catFront < A.length && A[catBack] + A[m] > A[catFront]) {
                    catFront++;
                }
                triangles += catFront - m - 1;
            }
        }
        return triangles;
    }

    public int minAbsSumOfTwo(int[] A) {
        Arrays.sort(A);
        int startIndex=0;
        int endIndex = A.length-1;
        int minAbsSum=Integer.MAX_VALUE;

        while (startIndex < endIndex) {
            int absSum = Math.abs(A[startIndex] + A[endIndex]);
            if (absSum < minAbsSum) {
                minAbsSum = absSum;
            }
            if (Math.abs(A[startIndex]) > Math.abs(A[endIndex])) {
                startIndex++;
            } else {
                endIndex--;
            }
        }
        return minAbsSum;
    }


//---

    public int maxNonOverlappingSegments(int[] A, int[] B) {
        int currentPosition = -1;
        int segmentCounter = 0;
        for (int i=0; i <A.length; i++) {
            if (A[i] > currentPosition) {
                currentPosition = B[i];
                segmentCounter++;
            }
        }
        return segmentCounter;
    }


    public int tieRopes(int K, int[] A) {

        int currentLength=0;
        int ropes = 0;

        for (int i=0; i < A.length; i++) {
            currentLength+=A[i];
            if (currentLength>=K) {
                ropes++;
                currentLength=0;
            }

        }
        return ropes;
    }

    public int numberSolitaire(int[] A) {
        int[] r = new int[A.length];
        for (int i=0; i < r.length; i++) {
            if (i==0) {
                r[i] = A[i];
            } else {
                int maxOnThisSquare = Integer.MIN_VALUE;
                for (int j=1; j<=6; j++) {
                    if (i-j >=0) {
                        maxOnThisSquare = Math.max(maxOnThisSquare,r[i-j]+A[i]);
                    }
                }
                r[i]=maxOnThisSquare;
            }
        }
        return r[r.length-1];
    }



    public int minAbsSum(int[] A) {


        return 0;
    }


    public int longestPassword(String S) {
        String[] words = S.split(" ");
        int longestPassword = 0;
        for (String word : words) {
            if (checkWord(word)) {
                longestPassword = Math.max(longestPassword, word.length());
            }
        }
        return longestPassword;
    }

    public int floodDepth(int[] A) {
        int[] right = new int[A.length];
        int[] left = new int[A.length];
        int leftHeight = 0;
        int rightHeight = 0;
        for (int i=0; i < A.length; i++) {
            leftHeight = Math.max(leftHeight, A[i]);
            left[i] = leftHeight;

            rightHeight = Math.max(rightHeight, A[A.length-1-i]);
            right[A.length-1-i]=rightHeight;
        }
        int maxDepth = 0;
        for (int i=0; i < A.length; i++) {
            int depth = Math.min(left[i],right[i]) - A[i];
            maxDepth = Math.max(maxDepth, depth);
        }
        return maxDepth;
    }

    public boolean checkWord(String word) {
        int numberCount=0;
        int letterCount=0;
        for (int i=0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)||Character.isLowerCase(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else {
                return false;
            }
        }
        return (numberCount % 2 == 1 && letterCount % 2 == 0);
    }
    public static void main(String[] args) {
	    // write your code here
        Main m = new Main();


       // System.out.println(m.countDistinctSlices(6 , new int[] {1,2,3,4,5}));
        /*
        //Missing number
        System.out.println( m.missingNumber(new int [] {1,2,3,4,6}));
        System.out.println( m.missingNumber2(new int [] {1,2,3,4,6}));
        System.out.println( m.missingNumber(new int [] {-1,-2}));
        System.out.println( m.missingNumber2(new int [] {-1,-2}));
        System.out.println( m.missingNumber(new int [] {1,2,3,5,7}));
        System.out.println( m.missingNumber2(new int [] {1,2,3,5,7}));
        */

        /*
        //binaryGap
        System.out.println(m.binaryGap(542));
        System.out.println(m.binaryGap2(542));

         */

        /*
        //cyclicRotation
        int[] result = m.cyclicRotation(new int[] {3,8,9,7,6}, 3);
        for (int i: result) {
            System.out.print(i+" ");
        }
        */


       /*
        //oddOccurance
        System.out.println(m.oddOccurance(new int[] {3,8,3,8,9,7,9,7,6}));
        System.out.println(m.oddOccurance2(new int[] {3,8,3,8,9,7,9,7,6}));
        */


         /*
        //frogJump
        System.out.println(m.frogJump(10,85,30));
        m.frogJump2(10,85,30);
        //System.out.println();

       */

        /*
        // permMissingElement
            System.out.println(m.permMissingElement(new int[] {1,2,3,5}));
         */

 /*
        // countedDivisions
        int countedDivisions = m.countDiv(6,11,2);
        System.out.println(countedDivisions);

  */

 /*
        // genomicRange
        int[] result=m.genomicRange("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6});
        for (int i:result) {
            System.out.println(i);
        }
  */
/*
        // minAvgOfTwoSlices
        int minAvSlice = m.minAvgOfTwoSlices(new int[]{4,2,2,5,1,5,8});
        System.out.println("minAvgSlice"+ minAvSlice);
*/

/*
        // passingCars
        int passingCars = m.passingCars(new int[]{0,1,0,1,1});
        System.out.println("passingCars"+ passingCars);

 */


        //System.out.println(m.bracketStack("{[(]}"));
        //System.out.println(m.flagsOnPeaks(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}));
        //System.out.println(m.chocolateByNumbers(10,4));
        //System.out.println(m.commonPrimeDivisors(new int[]{15,10,9}, new int[] {75,30,5}));#
        //System.out.println(m.fibFrog(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
     //   System.out.println(m.nailPlanks(new int[]{1,4,5,8},new int[]{4,5,9,10},new int[]{4,6,7,10,2}));
        //System.out.println(m.countDistinctSlices(6 , new int[] {3,4,5,5,2}));

      //  System.out.println(m.countTriangles( new int[] {10,2,5,1,8,12}));
       // System.out.println(m.maxNonOverlappingSegments( new int[] {1,3,7,9,9},new int[] {5,6,8,9,10}));
        //System.out.println(m.longestPassword("abcdef42 &kd 12 lllll23d2"));
        //int[] a =m.maxCounters(4,new int[] { 3,4,4,6,1,4,4});
      //  for (int i=0; i < a.length; i++) {
       //     System.out.println(" - "+a[i]);
      //  }

        System.out.println(m.equilibrium(new int[]{3,1,2,4,3}));
        System.out.println(m.oddOccurance(new int[]{3,1,3,1,4,9,3}));

    }
}
