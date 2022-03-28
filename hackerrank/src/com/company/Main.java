package com.company;

import java.util.*;

public class Main {
    public static class Node {
        int data;
        LowestCommonAncestor.Node left;
        LowestCommonAncestor.Node right;
        Node(int data) {
            this.data=data;
        }
    }
    public static LowestCommonAncestor.Node createBinaryTree()
    {

        LowestCommonAncestor.Node rootNode =new LowestCommonAncestor.Node(40);
        LowestCommonAncestor.Node node20=new LowestCommonAncestor.Node(20);
        LowestCommonAncestor.Node node10=new LowestCommonAncestor.Node(10);
        LowestCommonAncestor.Node node30=new LowestCommonAncestor.Node(30);
        LowestCommonAncestor.Node node60=new LowestCommonAncestor.Node(60);
        LowestCommonAncestor.Node node50=new LowestCommonAncestor.Node(50);
        LowestCommonAncestor.Node node70=new LowestCommonAncestor.Node(70);
        LowestCommonAncestor.Node node5=new LowestCommonAncestor.Node(5);
        LowestCommonAncestor.Node node45=new LowestCommonAncestor.Node(45);
        LowestCommonAncestor.Node node55=new LowestCommonAncestor.Node(55);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node10.left=node5;
        node50.right=node55;
        return rootNode;
    }

    public static LowestCommonAncestor.Node lca(LowestCommonAncestor.Node root, int val1, int val2) {

        if (val1 > root.data && val2 > root.data) {
            return lca(root.right, val1, val2);
        }
        if (val1 < root.data && val2 < root.data) {
            return lca(root.left, val1, val2);
        }
        return root;
    }

    private List<String> tags;

    private void mapStuff() {
        Map<String, String> productsByName = new HashMap<>();
        for(String key : productsByName.keySet()) {
           // Product product = productsByName.get(key);
            System.out.println(key);
            tags.remove(key);
        }
        for(Map.Entry<String, String> entry : productsByName.entrySet()) {
            String value =  entry.getValue();
            String key = entry.getKey();

            tags.add(key);
            //do something with the key and value
        }

    }
    public static int diagonalDifference(int[][] arr) {
        int left_to_right = 0;
        int right_to_left = 0;

        int rows = arr.length;
        int columns = arr[0].length;

        int i = 0;
        int j = 0;
        int k = 0;
        //right to left
        int l = arr.length-1;

        while (i < rows && j < columns && k < rows && l >=0) {
            right_to_left += arr[i][j];
            left_to_right += arr[k][l];
            System.out.println(arr[i][j]+"<>"+ arr[k][l]);
            i++;
            j++;
            k++;
            l--;
        }

        System.out.println("ltr@: "+left_to_right);
        System.out.println("rtl@: "+right_to_left);
        return Math.abs(left_to_right - right_to_left);
    }

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (String s : a.split("")) {
            b = b.replaceFirst(s, "");
            //System.out.println(s+" ---- "+b);
        }
        return  b.isEmpty();
    }
    static Integer minAbsoluteValue(int[] arr) {
        int min_absolute_difference = Integer.MAX_VALUE;
        //For strings
        //Arrays.sort(arr, Collections.reverseOrder());

        //for ints
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        Integer[] array = new Integer[] { 1, 24, 4, 4, 345 };
        Arrays.sort(array,comparator);

        System.out.println("Array sorted in reverse  ="+Arrays.toString(array));
        Arrays.sort(arr);
        System.out.println("Array sorted ="+Arrays.toString(arr));

        for (int i=0; i < arr.length-1; i++) {

            int current_absolute_diff = Math.abs(arr[i] - arr[i+1]);
            System.out.println("current_absolute_diff between "+arr[i]+" &"+arr[i+1]+" = "+current_absolute_diff);

            min_absolute_difference = Math.min(current_absolute_diff,min_absolute_difference);
            System.out.println("Min absolute difference =  "+min_absolute_difference);
        }
        return min_absolute_difference;
    }
    static int alternatingCharacters(String s) {
        int min_deletion=0;
        String result = "";
        for (int i=0; i < s.length()-1;i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                min_deletion++;
               // sb.deleteCharAt(i);
                //newString = newString.substring(0,i+2)+newString.substring(i+3);
            } else {
                result += s.charAt(i);
            }
        }
        result += s.charAt(s.length()-1);
        System.out.println(" --- >alternatingCharacters StringBuilder "+result);
        return min_deletion;
    }

    //1,2,3,4,5 rotate by 2 = 3,4,5,1,2
    static int[] leftRotateArray(int[] arr, int rotateAmount) {
        int arraySize = arr.length;
        int[] newArray = new int[arraySize];
        int i=0;
        int rotateIndex=rotateAmount;
        while (rotateIndex < arraySize) {
            newArray[i]=arr[rotateIndex];
            rotateIndex++;
            i++;
        }
        rotateIndex=0;
        while (rotateIndex < rotateAmount) {
            newArray[i]=arr[rotateIndex];
            i++;
            rotateIndex++;
        }
        return newArray;
    }

    public static String getSmallestAndLargest(String s, int k) {
        String current = s.substring(0,k);
        String smallest = current;
        String largest = current;
        System.out.println("getSmallestAndLargest ="+current);
        for (int i=1; i <=s.length() -k; i++) {
            current = s.substring(i,i+k);
            System.out.println("chg getSmallestAndLargest ="+current);
            if (current.compareTo(largest)>0) {
                largest=current;
                System.out.println("chg lgs "+largest);
            }
            if (current.compareTo(smallest)<0) {
                smallest = current;
                System.out.println("chg sml "+smallest);
            }
        }

        return smallest+"\n"+largest;
    }

    public static int[] removeDuplicate(int[] array) {
        int[] tempArray = new int[array.length];
        int j = 0;
        for (int i : array) {

            if (!isExists(tempArray, i)) {
                tempArray[j++] = i;

            }
        }
        tempArray = Arrays.copyOf(tempArray,  j);
        return tempArray;
    }

    public static boolean isExists(int[] array, int num) {
        if (array == null)
            return false;
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] array = { 10, 20, 30, 10, 45, 30,50,55,55,60,65 };
        int [] newArray = removeDuplicate(array);
        System.out.println(Arrays.toString(array)+ " array "+array.length);
        System.out.println(Arrays.toString(newArray)+" newArray "+newArray.length);

        System.out.println(getSmallestAndLargest("acdcometojava",3));
        System.out.println("alternatingCharacters: "+alternatingCharacters("AAAA"));
        System.out.println("alternatingCharacters: "+ alternatingCharacters("ABAABBCAD"));
        System.out.println("alternatingCharacters: "+ alternatingCharacters("AAABBB"));
        int[] arrMinAbs =  { 1, 24, 4, 4, 345 }; //{1,5,7,9,11};

        System.out.println(Arrays.toString(arrMinAbs)+" : ROTATE INDEX: ________ "+Arrays.toString(leftRotateArray(arrMinAbs,2)));
        System.out.println("MIN ABS: "+minAbsoluteValue(arrMinAbs));
        // write your code here
        //System.out.println(isAnagram("cat", "Tac"));

        String[] myStrings = { "gat", "cat", "dog", "Tac", "fat", "ACT" };

        HashMap<String,String> collection = new HashMap<String,String>();

        Set<String> existing = new HashSet<>();
       // Set<String> result = new HashSet<>();
        List<String> sortedResult = new ArrayList<String>();
        for (int i=0; i < myStrings.length; i++) {

            String loweredValue =myStrings[i].toLowerCase();
            char[] characters =loweredValue.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters).toLowerCase();
            System.out.println(loweredValue+" is now "+sorted);
            if (!collection.containsKey(sorted)) {
                collection.put(sorted,myStrings[i]);
            }
            if (!existing.contains(sorted)) {
                existing.add(sorted);
                sortedResult.add(myStrings[i]);
            }
        }
        List<String> sortedCollectionValues = new ArrayList<String>(collection.values());
        Collections.sort(sortedCollectionValues);
        for (int a=0; a < sortedCollectionValues.size(); a++) {
            System.out.println("---AHHHHAA----> "+sortedCollectionValues.get(a));
        }
       // List<String> sortedResult = new ArrayList<String>(result);
        Collections.sort(sortedResult);
         System.out.println("ahha "+sortedResult.size() );
        for (int a=0; a < sortedResult.size(); a++) {
            System.out.println("-------> "+sortedResult.get(a));
        }



        for (int i=0; i < myStrings.length; i++) {
            for (int j=i+1; j < myStrings.length; j++) {
                String one =   myStrings[i];
                String two =   myStrings[j];
                //System.out.println("Comparing "+one+" with "+two+" = "+isAnagram(one,two));
                if (isAnagram(one,two)==true) {
                    myStrings=removeEntry(myStrings,j);
                }
            }
        }

        for (int i=0; i < myStrings.length; i++) {
            String one =   myStrings[i];
            System.out.println("We have "+one);
        }

        doDiagonalDiff();

        int arr2[] = {1,2,4,11,12,8};
        int key = 2;
        System.out.println(calculateTotal(arr2,key));


        int[] arr = {10,2,3};
        System.out.println("10+2+3="+ (simpleArraySum(arr)));



        LowestCommonAncestor.Node rootNode= createBinaryTree();

        System.out.println("Lowest common ancestor for node 5 and 30:");
        LowestCommonAncestor.Node node5=new LowestCommonAncestor.Node(5);
        LowestCommonAncestor.Node node30=new LowestCommonAncestor.Node(30);
        System.out.println(lca(rootNode,5,30).data);

        System.out.println("IS BALANCED [([{}])]: "+ isBalanced("[([{}])]"));
        System.out.println("IS BALANCED {[()]}: "+isBalanced("{[()]}"));
        System.out.println("IS BALANCED {[(])}: NO "+ isBalanced("{[(])}"));
        System.out.println("IS BALANCED {{[(())]}}: "+isBalanced("{{[(())]}}"));

    }

    static String isBalanced(String s) {
        Stack<Character> characterStack = new Stack<Character>();
        for (int i=0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current== '(' || current== '{' || current== '[') {
                characterStack.push(current);
            } else {
                char popped = characterStack.pop();
                if (current == ')' && popped != '(') {
                    return "NO";
                } else if (current == '}' && popped != '{') {
                    return "NO";
                } else if (current == ']' && popped != '[') {
                    return "NO";
                }
            }
        }
        if (characterStack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }


    static void doDiagonalDiff() {
        int[][] arr = new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=9;
        arr[2][1]=8;
        arr[2][2]=9;
        System.out.println("-------------------");
        System.out.println(diagonalDifference(arr));
        System.out.println("-------------------");
    }
    static int simpleArraySum(int[] arr) {
        int arr_sum=0;
        for (int i=0; i < arr.length; i++) {
            arr_sum += arr[i];
        }
        return arr_sum;
    }
    static int calculateTotal(int[] arr, int key) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i]==key) {
                key *= key;
            }
        }
        return key;
    }

    static String[] removeEntry(String[] input, int rmIndex) {
        String[] output = new String[input.length-1];
        for (int i=0, k=0; i < input.length;i++) {
            if (i==rmIndex) {
                continue;
            }
            output[k++]= input[i];
        }
        return output;
    }

}
