package JavaInterviewQuestions;

import java.lang.reflect.Array;
import java.util.*;

public class sortMapByValue {


    public static int countLetters(String sentence, String input) {

        int countLetters;
        String newStr = "";
        int firstInputindx = sentence.indexOf(input);
        int inputIndex = sentence.lastIndexOf(input);

        sentence = sentence.replaceAll(" ", "");

        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) + "").equals(input)) {
                newStr = sentence.substring(firstInputindx + 1, inputIndex);
            }
        }
        countLetters = newStr.length();
        return countLetters;
    }

    public static int[] moveZeroToIndex(int arr[], int inputIndex) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int temp = list.get(inputIndex);

        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) == 0) {
                list.set(inputIndex, list.get(k));
                list.set(list.get(k), temp);
            }
        }
        System.out.println("list = " + list);

        arr = new int[arr.length];
        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }
        return arr;
    }

    public static String frq(String str) {

//        String res="";
//
//        String nonDup="";
//        for (int i=0; i<str.length(); i++){
//            if (! nonDup.contains(""+str.charAt(i))){
//                nonDup+=str.charAt(i);
//            }
//        }
//
//        for (int k=0; k<nonDup.length(); k++){
//
//            int count=0;
//            for (int j=0; j<str.length(); j++){
//                if (str.charAt(j)==nonDup.charAt(k)){
//                    count++;
//                }
//            }
//            res+=nonDup.charAt(k)+""+count;
//        }
        //Or
        String res = "";
//
//        String original=str;
//
//        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
//        str = str.replace(", ","").replace("[","").replace("]","");
//
//        for (int i=0; i<str.length(); i++){
//
//            int count=0;
//            for (int k=0; k<original.length(); k++){
//                if (original.charAt(k)==str.charAt(i)){
//                    count++;
//                }
//            }
//           // int freq = Collections.frequency(Arrays.asList(str.split("")),""+original.charAt(i));
//
//            res+=str.charAt(i)+""+count;
//        }
        return res;

    }

    public static boolean sameLetter(String st1, String st2) {

        st1 = new LinkedHashSet<String>(Arrays.asList(st1.split(""))).toString();
        st2 = new LinkedHashSet<String>(Arrays.asList(st2.split(""))).toString();

        //Or
        ArrayList<Character> nonDupArr = new ArrayList<>();
        ArrayList<Character> nonDupArr2 = new ArrayList<>();

        for (int i = 0; i < st1.length(); i++) {
            if (!nonDupArr.contains(st1.charAt(i))) {
                nonDupArr.add(st1.charAt(i));
            }
        }
        Collections.sort(nonDupArr);

        for (int i = 0; i < st2.length(); i++) {
            if (!nonDupArr2.contains(st2.charAt(i))) {
                nonDupArr2.add(st2.charAt(i));
            }
        }
        Collections.sort(nonDupArr2);

        return nonDupArr.equals(nonDupArr2);

    }

    public static String removeDup(String st) {

        st = new LinkedHashSet<String>(Arrays.asList(st.split(""))).toString();
        st = st.replace(", ", "").replace("[", "").replace("]", "");


        //or
        String res = "";
        for (int i = 0; i < st.length(); i++) {
            if (!res.contains("" + st.charAt(i))) {
                res += st.charAt(i);
            }
        }

        return res;
    }

    public static String findUnique(String st) {

        String unique1 = "";

        for (int j = 0; j < st.length(); j++) {

            int num = 0;

            for (int i = 0; i < st.length(); i++) {

                if (st.charAt(i) == st.charAt(j))

                    num++;
            }

            if (num == 1)

                unique1 += st.charAt(j);
        }


        // OR
        for (int j = 0; j < st.length(); j++) {

            int freq = Collections.frequency(Arrays.asList(st.split("")), "" + st.charAt(j));

            if (freq == 1) {
                unique1 += st.charAt(j);
            }
        }
        return unique1;
    }

    public static String reverse(String st) {
        String res = "";

        for (int i = st.length() - 1; i >= 0; i--) {
            res += st.charAt(i);
        }

        //OR

        st = new StringBuilder(st).reverse().toString();

        return st;
    }

    public static int sumOfDigits(String st) {

        int sum = 0;

        for (int i = 0; i < st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                sum += Integer.parseInt("" + st.charAt(i));
            }
        }

        return sum;
    }

    public static boolean validPassword(String password) {
        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String charachers = "(.*[-/,:-@].*)";

        boolean b1 = password.matches(lowercase);
        boolean b2 = password.matches(uppercase);
        boolean b3 = password.matches(numbers);
        boolean b4 = password.matches(charachers);

        boolean valid = false;

        if (password.length() >= 6 && !password.contains(" ")) {


            if (b1 && b2 && b3 && b4) {

                valid = true;
            }

        }
        return valid;
    }

    public static int maxNum(int[] arr) {


        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        return Collections.min(list);

        //OR
//        int max=0;
//
//        int maxArrIndex = arr[0];
//
//        for (int i=0; i < arr.length; i++){
//            if (arr[i] > maxArrIndex){
//                 max = arr[i];
//            }
//        }


        //  //or
        //        int maxNum = Integer.MIN_VALUE;
        //
        //
        //        for (int i=0; i < arr.length; i++){
        //            if (arr[i] > maxNum){
        //                 maxNum = arr[i];
        //            }
        //        }
        //
        //        return  maxNum;
        //    }
    }

    public static int[] sortArrAsc(int arr[]) {

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int k = i + 1; k < arr.length; k++) {

                if (arr[i] > arr[k]) {

                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] moveZeros(int arr[]) {

        int countOfZeros = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                countOfZeros++;
            }
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }


        for (int k = 0; k < countOfZeros; k++) {
            list.add(0);
        }

        arr = new int[list.size()];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = list.get(k);
        }


        return arr;
    }

    public static int[] concatArr(int arr1[], int arr2[]) {

        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int k = 0; k < arr2.length; k++) {
            arr3[arr1.length + k] = arr2[k];
        }

        return arr3;
    }

    public static int divideWithoutOpe(int num1, int num2) {

        int res = 0;

        while (num1 >= num2) {

            res++;
            num1--;
        }

        return res;
    }

    public static void swapNumbers(int n1, int n2) {

        int n1Copy;
        int n2Copy;

        n1Copy = n2;
        n2Copy = n1;

        n1 = n1Copy;
        n2 = n2Copy;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

    }

    public static String Codility(int n) {
        String result = "";

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        for (int each : arr) {

            if (each % 5 == 0 && each % 3 == 0 && each % 2 == 0) {
                result += "CodilityTestCoders" + " ";

            } else if (each % 3 == 0 && each % 5 == 0) {
                result += "TestCoders" + " ";

            } else if (each % 5 == 0 && each % 2 == 0) {
                result += "CodilityCoders" + " ";
            } else if (each % 5 == 0) {
                result += "Coders" + " ";

            } else if (each % 2 == 0 && each % 3 == 0) {
                result += "CodilityTest" + " ";

            } else if (each % 3 == 0) {
                result += "Test" + " ";
            } else if (each % 2 == 0) {
                result += "Codility" + " ";
            } else {
                result += each + " ";
            }


        }


        return result;
    }

    public static int factorialNumber(int n) {

        // Factorial = 4! = 4*3*2*1 = 24

        int result = 1;

        for (int i = n; i > 0; i--) {

            result = result * i;

        }

        return result;
    }

    public static String primeNumber(int num) {

        String result = "";

        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                result += "isPrime";

            } else {
                result += "isNotPrime";
            }
        }


        return result;
    }

    public static void fibonacci(int givenNum) {

        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < givenNum; i++) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }

    }

    public static int reverseNum(int num) {

        String str = new StringBuilder("" + num).reverse().toString();
        num = Integer.valueOf(str) * -1;
        return num;

    }

    public static List<String> removeAhmed(List<String> name) {

        name.removeIf(each -> each.equalsIgnoreCase("Ahmed"));

        // OR

        Iterator<String> iterator = name.iterator();

        while (iterator.hasNext()) {

            if (iterator.next().equalsIgnoreCase("Ahmed")) {
                iterator.remove();
            }
        }

        return name;
    }

    public static List<Integer> removeSOmeValue(List<Integer> list) {

        list.removeIf(each -> each < 10);

        // OR
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() < 10) {
                iterator.remove();
            }
        }
        return list;

    }

    public static ArrayList<Integer> sortListAsc(ArrayList<Integer> list) {

        //1
        //  Collections.sort(list);

        //OR
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }
        }

        return list;
    }

    public static void FrequencyTest(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }

        }

        System.out.println(map);

    }

    public static int minValueMap(Map<String, Integer> map) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first();

    }

    public static void swichingEle(int a, int b) {
        int c = a + b;
        b = a;
        a = c - a;

        System.out.println(a + "" + b);

    }

    //Q #5) Write a Java Program to count the number of words in a string using HashMap.
    public static HashMap<String, Integer> numOfWordsStr(String str){
        String[] split = str.split(" ");

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);//1
                map.put(split[i], count+1);

            }
            else {
                map.put(split[i], 1);
            }
        }
        return map;

    }

    //Q #6) Write a Java Program to iterate HashMap using While and advance for loop.
    public static void iteratingHashMap(HashMap<String, Integer> map){

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
            ;
        }

        for (Map.Entry each : map.entrySet()){
            System.out.println("Keys: "+each.getKey());
            System.out.println("Values: "+each.getValue());

        }

        for (String eachKey : map.keySet()){
            System.out.println("Keys: "+eachKey);
        }

        for (Integer eachValue : map.values()){
            System.out.println("Values ="+eachValue);
        }
        // getting the values
//        while (iterator.hasNext()){
//            System.out.println("Values: "+map.get(iterator.next()));
//            //iterator.next();
//        }
    }

    public static boolean isPrimeNumber(int num){
        for (int i=2; i < num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    // check if a number is palindrome or not
    public static boolean numIsPalindrome(int num){

        StringBuilder str = new StringBuilder(Integer.toString(num));
        str.reverse();

        int result= Integer.parseInt(str.toString());
        return num==result;
    }

    public static void fibNum(int num){

        int n1=0 ; int n2=1 ; int n3;

        System.out.print(n1+" "+n2);

        for (int i=2; i < num; i++){

            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }

    public static ArrayList<String> iterate (ArrayList<String> list){

      //  Iterator<String>iterator = list.iterator();

//        while (iterator.hasNext()){
//
//            if (iterator.next().equalsIgnoreCase("AA")){
//                iterator.remove();
//            }

            for (Iterator<String> it = list.iterator() ; it.hasNext();){
                if (it.next().equalsIgnoreCase("AA")){
                    it.remove();
                }
            }

        return list;
    }

    public static String dupli(String str){
        str = str.toLowerCase();
        String duplicate="";
        int count=0;
        for (int i=0; i<str.length(); i++){
            for (int k=0; k <str.length(); k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    count++;
                }
            }
            if (count > 1){
                duplicate+=str.charAt(i);
            }
        }

        return duplicate;
    }

    //Q #16) Write a Java Program to find the second-highest number in an array.
    public static int scndHighest (int[] arr){
        int highestNum=0;

        TreeSet<Integer> set = new TreeSet<>();
        for (int each:arr) {
            set.add(each);
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        highestNum=list.get(list.size()-2);
        return  highestNum;

        // OR
//        for (int k=0; k<arr.length; k++){
//            for (int i=k+1; i<arr.length; i++){
//                if (arr[i] < arr[k]){
//
//                    temp = arr[i];
//                    arr[i]=arr[k];
//                    arr[k]=temp;
//                }
//            }
//        }

    }

    public static String rmvSpace(String str){
        String[] arr = str.split("");
        str="";
        for (int i=0; i<arr.length; i++){
            if (!("" + arr[i]).equals(" ")){
                str+=arr[i];
            }
        }
        return str;
    }

    // find the first non-repeated character in a string
    public static String firstNonRptd(String str){
        String unique="";
        String firstNonRpt="";

         for (int k=0; k<str.length(); k++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==str.charAt(k)){
                    count++;
                }
            }
            if (count == 1){
                unique+=str.charAt(k);
            }
        }///
        firstNonRpt=unique.substring(0,1);

        return firstNonRpt;
    }

    //Q3. How to find intersection of two arrays in java?
    public static ArrayList<Integer> commonNums (int [] arr1, int [] arr2) {

        ArrayList<Integer> commonNums = new ArrayList<>();

        for (int k = 0; k < arr1.length; k++) {

            for (int i = 0; i < arr2.length; i++) {

                if (arr2[i] == arr1[k]) {

                    commonNums.add(arr2[i]);
                }

            }

        }
        return commonNums;
    }

    //Q4 Find out if String has all Unique Characters?
    public static boolean allUnique(String st){

        String original=st;
        st = new LinkedHashSet<>(Arrays.asList(st.split(" "))).toString();
        st = st.replace("[","").replace(",","")
                                                    .replace("]","");
        return st.length()==original.length();
//          OR

//        String unique="";
//            for (int i=0; i<st.length(); i++){
//
//                int count=0;
//                for (int k=0; k<st.length(); k++){
//                    if (st.charAt(k)==st.charAt(i)){
//                        count++;
//                    }
//                }
//                if (count==1){
//                    unique+=st.charAt(i)+"";
//                }
//
     //   return st.length()==unique.length();
//        }


    }






    public static void main(String[] args) {
//
        ArrayList<String> list = new ArrayList<>(Arrays.asList("aa","bb","AA","CC"));

        int[] array1 = {1,4,7, 9, 2,10} ;
        int[] arrray2  = {0,1,7,3,4,5,10};
        String st = "Alivexzd swumnbo";


        System.out.println(commonNums(array1,arrray2));
    }

    
    
    
    }




