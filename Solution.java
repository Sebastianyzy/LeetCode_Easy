import java.math.BigInteger;
import java.util.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution{
    static Map<String, Integer> library = new HashMap<>();

    static{
        library.put("I", 1);
        library.put("V", 5);
        library.put("X", 10);
        library.put("L", 50);
        library.put("C", 100);
        library.put("D", 500);
        library.put("M", 1000);
    }

    public static void main(String[] args){
        // System.out.println(mySqrt(11));
        // System.out.println(11 / 2);
        // System.out.println((int) Math.floor(2.35));
//		TreeNode tree = new TreeNode(3);
//		tree.left = new TreeNode(5);
//		tree.left.left = new TreeNode(6);
//		tree.left.right = new TreeNode(2);
//		tree.left.right.left = new TreeNode(7);
//		tree.left.right.right = new TreeNode(4);
//		tree.right = new TreeNode(1);
//		tree.right.left = new TreeNode(9);
//		tree.right.right = new TreeNode(8);
//		List<Integer> list = new ArrayList<>();
//		leafSimilar_loadLeaf(tree, list);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println(minDiffInBST(tree));
//		List<Integer> list = new ArrayList<>();
        // System.out.println(sumOfLeftLeaves(tree));
        // System.out.println(lowestCommonAncestor(tree, tree.left, tree.right).val);
        // levelOrderBottom(tree);
        // int num[] = { 2, 2, 1, 1, 1, 2, 2 };
        // InsertionSort(num);
        // for (int i : num) {
        // System.out.println(i);
        // }
        // String s = "race a car";
        // Stack<Integer> stack = new Stack<>();
        // for (int i = 0; i < num.length; i++) {
        // System.out.println(num[i]);
        // }
        // char c = 'A';
        // System.out.println(3 / 2);
        // System.out.println(trailingZeroes(4));
        // ListNode l1 = new ListNode(1);
        // l1.next = new ListNode(2);
        // l1.next.next = new ListNode(6);
        // l1.next.next.next = new ListNode(3);
        // l1.next.next.next.next = new ListNode(4);
        // l1.next.next.next.next.next = new ListNode(5);
        // l1.next.next.next.next.next.next = new ListNode(6);
        // removeElements(l1, 6);
        // HashMap<Character, Character> map = new HashMap<>();
        // map.put('a', 'c');
        // if (map.containsKey('a') && !map.get('a').equals('c')) {
        // System.out.println("wrong");
        // } else {
        // System.out.println("right");
        // }
        // int[] nums = { 0, 1, 2, 4, 5, 7 };
        // for (int i = 0; i < 3; i++) {
        // System.out.println(summaryRanges(nums).get(i));
        // }
        // System.out.println("---------------------------------");
        // int[] num = { 0, 2, 3, 4, 6, 8, 9 };
        // for (int i = 0; i < 4; i++) {
        // System.out.println(summaryRanges(num).get(i));
        // }
        // System.out.println(isStrobogrammatic("69"));
        // System.out.println(isStrobogrammatic("88"));
        // System.out.println(isStrobogrammatic("962"));
        // String[] words = { "practice", "makes", "perfect", "coding", "makes" };
        // System.out.println(addDigits(38));
        // System.out.println(addDigits(49));
        // int A[] = { 9, 8, 7, 6, 5, 1, 2, 2, 1 };
        // int B[] = { 9, 2 };
        // mergeSort(A, 0, A.length - 1);
        // for (int i = 0; i < A.length; i++) {
        // System.out.println(A[i]);
        // }
        // int inversion[] = { 2, 3, 8, 6, 1 };
        // System.out.println(numOfinversion(inversion, 0, inversion.length - 1));
        // int[][] interval1 = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
        // int[][] interval2 = { { 7, 10 }, { 2, 4 } };
        // int[][] interval3 = { { 8, 11 }, { 17, 20 }, { 17, 20 } };
        // System.out.println(canAttendMeetings(interval1));
        // System.out.println(38 / 10);
        // System.out.println(canPermutePalindrome("code"));
        // System.out.println(reverseVowels("hello"));
        // char[] s = { 'h', 'e', 'l', 'l', 'o' };
        // reverseStringRedo(s);
        // for (int i = 0; i < s.length; i++) {
        // System.out.println(s[i]);
        // }
        // for (int i = 0; i < intersect(A, B).length; i++) {
        // System.out.println(intersect(A, B)[i]);
        // }
        // System.out.println(isPerfectSquare(14));
        // System.out.println(String.valueOf('a') + String.valueOf('a'));
        // for (int i = 0; i < str.length; i++) {
        // if (str[i] == " ") {
        // System.out.println("yes");
        // }
        //
        // }
        // System.out.println(arrangeCoins(5));
        // String s = "sdfs";
        // System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        // String a = "aba", b = "acdbcae";
        // char[] A = a.toCharArray();
        // char[] B = b.toCharArray();
        // Arrays.sort(A);
        // Arrays.sort(B);
        // printCharArray(A);
        // System.out.println("--------");
        // printCharArray(B);
        // String s = "Let's take LeetCode contest";
        // // String[] word = s.split("\\s+");
        // System.out.println(reverseWords(s));
        // System.out.println(word[0].charAt(word[0].length() - 1));
        // System.out.println(Character.toString('a') + Character.toString('a'));
//
//		String[] A = { "looks", "pest", "stew", "show" };
//		String b = "1s3 456";
//		System.out.println("ans is" + shortestCompletingWord(b, A));
        // char[] B = b.toCharArray();
        // int[][] matrix = new int[7][7];
        // for (int i = 1; i < matrix.length; i++) {
        // matrix[0][i] = i;
        // matrix[i][0] = i;
        // }
        // matrix[0][0] = 0;
        // CS3340SampleMidterm_min(matrix, A, B);
        // System.out.println(matrix[matrix.length - 1][matrix.length - 1]);
        // String s = "abababc";
//		// System.out.println(CS3340SampleMidterm_next(s));
//		int[] a = { 12, 28, 46, 32, 50 };
//		int[] b = { 50, 12, 32, 46, 28 };
//		int[] P = anagramMappings(a, b);
//		printIntArray(P);
        // List<Integer> list = unionSortedSet(a, b);
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }
        // System.out.println('z' - 'a');
//
//		Map<Integefor (int i : a) {r, Integer> map = new HashMap<>();
//			if (!map.containsKey(i)) {
//				map.put(i, 1);
//			} else {
//				map.put(i, map.get(i + 1));
//			}
    }

    public static String reversePrefix(String word, char ch){
        String replace = "";
        if(!word.contains(Character.toString(ch))){
            return word;
        }
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                for(int j = i; j >= 0; j--){
                    replace += Character.toString(word.charAt(j));
                }
                if(i == word.length() - 1){
                    return replace;
                }
                for(int k = i + 1; k < word.length(); k++){
                    replace += Character.toString(word.charAt(k));
                }
                break;
            }
        }
        return replace;
    }

    public static int minimumMoves(String s){
        int count = 0;
        for(int i = 0; i < s.length(); ){
            count += (s.charAt(i) == 'X') ? 1 : 0;
            i += (s.charAt(i) == 'X') ? 3 : 1;
        }
        return count;
    }

    public static int countKDifference(int[] nums, int k){
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                count += Math.abs(nums[i] - nums[j]) == k ? 1 : 0;
            }
        }
        return count;
    }

    public static int countPoints(String rings){
        int ans = 0, i = 0;
        HashMap<Character, Set<Character>> map = new HashMap<>();
        while(i < rings.length() - 1){
            char color = rings.charAt(i), rod = rings.charAt(i + 1);
            if(map.containsKey(rod)){
                map.get(rod).add(color);
            } else{
                Set<Character> temp = new HashSet<>();
                temp.add(color);
                map.put(rod, temp);
            }
            i += 2;
        }
        for(char c = '0'; c <= '9'; c++){
            ans += map.containsKey(c) && map.get(c).size() == 3 ? 1 : 0;
        }
        return ans;
    }


    public static int finalValueAfterOperations(String[] operations){
        int X = 0;
        for(String s : operations){
            X += s.charAt(1) == '+' ? 1 : -1;
        }
        return X;
    }

    public static int timeRequiredToBuy(int[] tickets, int k){
        int ans = 0;
        while(tickets[k] != 0){
            for(int j = 0; j < tickets.length; j++){
                if(tickets[j] != 0 && tickets[k] != 0){
                    tickets[j]--;
                    ans++;
                }

            }
        }
        return ans;
    }

    public static List<Integer> targetIndices(int[] nums, int target){
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3){
        List<Integer> ans = new ArrayList<>();
        for(int i : nums1){
            if(!ans.contains(i) && twoOutOfThree_CheckTwoOutOfThree(i, nums2, nums3)){
                ans.add(i);
            }
        }
        for(int i : nums2){
            if(!ans.contains(i) && twoOutOfThree_CheckTwoOutOfThree(i, nums1, nums3)){
                ans.add(i);
            }
        }
        for(int i : nums3){
            if(!ans.contains(i) && twoOutOfThree_CheckTwoOutOfThree(i, nums1, nums2)){
                ans.add(i);
            }
        }
        return ans;
    }

    private static boolean twoOutOfThree_CheckTwoOutOfThree(int i, int[] a, int[] b){
        for(int val : a){
            if(val == i){
                return true;
            }
        }
        for(int val : b){
            if(val == i){
                return true;
            }
        }
        return false;
    }

    public static String kthDistinct(String[] arr, int k){
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        for(String s : arr){
            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            } else{
                map.put(s, 1);
            }
        }
        for(String s : arr){
            if(map.get(s) == 1){
                ans.add(s);
            }
        }
        return ans.size() < k ? "" : ans.get(k - 1);
    }

    public static int countValidWords(String sentence){
        String[] splitted = sentence.trim().split("\\s+");
        int ans = 0;
        for(String s : splitted){
            char[] c = s.toCharArray();
            boolean isHypen = false, isPunctuation = false, isNumber = false;
            int hypen_count = 0, punctuation_count = 0;
            for(int i = 0; i < c.length; i++){
                if(c[i] == '-'){
                    isHypen = (i == 0 || i == c.length - 1 || !Character.isLetter(c[i - 1]) || !Character.isLetter(c[i + 1]) || hypen_count >= 1);
                    hypen_count++;
                } else if(c[i] == '!' || c[i] == '.' || c[i] == ','){
                    isPunctuation = i != c.length - 1 || isPunctuation || punctuation_count >= 1;
                    punctuation_count++;
                } else if(c[i] >= '0' && c[i] <= '9'){
                    isNumber = true;
                }
            }
            ans += !isHypen && !isPunctuation && !isNumber ? 1 : 0;

        }
        return ans;

    }

    public static int maximumDifference(int[] nums){
        int max = -1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] > nums[i]){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] <= nums[i]){
                        break;
                    }
                    max = Math.max(max, nums[j] - nums[i]);
                }
            }
        }
        return max;
    }


    public static boolean areNumbersAscending(String s){
        int min = -1;
        String[] arr = s.split("\\s+");
        for(String value : arr){
            if(areNumbersAscending_isInteger(value)){
                if(min - Integer.parseInt(value) >= 0){
                    return false;
                }
                min = Integer.parseInt(value);
            }
        }
        return true;
    }

    private static boolean areNumbersAscending_isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public static boolean checkAlmostEquivalent(String word1, String word2){
        for(int i = 0; i < word1.length(); i++){
            char cur1 = word1.charAt(i), cur2 = word2.charAt(i);
            if(Math.abs(checkAlmostEquivalent_checkNumber(word1, cur1) - checkAlmostEquivalent_checkNumber(word2, cur1)) > 3 || (Math.abs(checkAlmostEquivalent_checkNumber(word1, cur2) - checkAlmostEquivalent_checkNumber(word2, cur2)) > 3)){
                return false;
            }
        }
        return true;
    }

    private static int checkAlmostEquivalent_checkNumber(String s, char c){
        int i = 0;
        for(char ch : s.toCharArray()){
            i += ch == c ? 1 : 0;
        }
        return i;
    }

    public static int findGCD(int[] nums){
        int ans = 1;
        Arrays.sort(nums);
        for(int i = 1; i <= nums[0]; i++){
            ans = nums[0] % i == 0 && nums[nums.length - 1] % i == 0 ? Math.max(ans, i) : ans;
        }
        return ans;
    }

    public static int minTimeToType(String word){
        char curr = 'a';
        int count = 0;
        for(char c : word.toCharArray()){
            int temp = Math.abs(curr - c);
            count += Math.min(temp, 26 - temp) + 1;
            curr = c;
        }
        return count;
    }

    public static int numOfStrings(String[] patterns, String word){
        int count = 0;
        for(String s : patterns){
            count += word.contains(s) ? 1 : 0;
        }
        return count;
    }

    public static boolean isPrefixString(String s, String[] words){
        for(int i = 0; i < words.length; i++){
            if(s.equals("")){
                return true;
            }
            if(s.indexOf(words[i]) == 0){
                s = s.substring(words[i].length(), s.length());
                if(i == words.length - 1 && !s.equals("")){
                    return false;
                }
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    public static String makeFancyString(String s){
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i] == arr[i + 1] && arr[i + 1] == arr[i + 2]){
                arr[i] = ' ';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            if(c != ' ') sb.append(c);
        }
        return sb.toString();
    }

    public static boolean isThree(int n){
        int numOfDiv = 0;
        for(int i = 1; i <= n; i++){
            numOfDiv += n % i == 0 ? 1 : 0;
        }
        return numOfDiv == 3;
    }

    public static int getLucky(String s, int k){
        int num = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            int e = (int) s.charAt(i) - 'a' + 1;
            num += (e / 10) + (e % 10);
        }
        int sum = num;
        for(int i = 1; i < k; i++){
            sum = getLucky_transform(num);
            num = sum;
        }
        return sum;
    }

    private static int getLucky_transform(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static boolean areOccurrencesEqual(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else{
                map.put(c, 1);
            }
        }
        int compare = map.get(s.charAt(0));
        for(char c : s.toCharArray()){
            if(map.get(c) != compare){
                return false;
            }
        }
        return true;
    }

    public static int canBeTypedWords(String text, String brokenLetters){
        String[] splitted = text.split("\\s+");
        Set<Character> set = new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for(String s : splitted){
            count += canBeTypedWords_canType(s, set) ? 1 : 0;
        }
        return count;
    }

    private static boolean canBeTypedWords_canType(String s, Set<Character> set){
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                return false;
            }
        }
        return true;
    }

    public static boolean isDecomposable(String s){
        int countLenTwo = 0;
        for(int i = 0; i < s.length(); ){
            if((i < s.length() - 2) && (s.charAt(i) == s.charAt(i + 1)) && (s.charAt(i) == s.charAt(i + 2))){
                i = i + 3;
            } else if((i < s.length() - 1) && (s.charAt(i) == s.charAt(i + 1))){
                i = i + 2;
                countLenTwo++;
            } else{
                return false;
            }
        }
        return countLenTwo == 1;
    }

    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[2 * nums.length];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        int j = 0;
        for(int i = nums.length; i < ans.length; i++){
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }

    public static int countTriples(int n){
        int count = 0;
        for(int i = 1; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                int x = (i * i) + (j * j);
                int c = (int) Math.sqrt(x);
                if(c > n){
                    break;
                }
                count += (c * c == x) ? 2 : 0;
            }
        }
        return count;
    }

    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < ans.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static int maxProductDifference(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }

    public static boolean canBeIncreasing(int[] nums){
        int infractionA = 0, infractionB = 0, size = nums.length, prevA = nums[0], prevB = nums[size - 1];
        for(int i = 0; i < size - 1; i++){
            if(prevA < nums[i + 1]){
                prevA = nums[i + 1];
            } else{
                infractionA++;
            }
            if(prevB > nums[size - i - 2]){
                prevB = nums[size - i - 2];
            } else{
                infractionB++;
            }
            if(infractionA > 1 && infractionB > 1){
                return false;
            }
        }
        return true;
    }

    public static String largestOddNumber(String num){
        int l = num.length();
        for(int i = l - 1; i >= 0; i--){
            char ch = num.charAt(i);
            if(ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9'){
                if(i == l - 1){
                    return num;
                }
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static boolean makeEqual(String[] words){
        int[] alph = new int[26];
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                alph[words[i].charAt(j) - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++){
            if(alph[i] % words.length != 0){
                return false;
            }
        }
        return true;

    }

    public static boolean isCovered(int[][] ranges, int left, int right){
        List<Integer> list = new ArrayList<>();
        for(int[] arr : ranges){
            for(int i = arr[0]; i <= arr[1]; i++){
                list.add(i);
            }
        }
        for(int i = left; i <= right; i++){
            if(!list.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean findRotation(int[][] mat, int[][] target){
        int n = mat.length;
        int[] res[] = new int[n][n], res2[] = new int[n][n], res3[] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[i][j] = mat[n - 1 - j][i];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res2[i][j] = res[n - 1 - j][i];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res3[i][j] = res2[n - 1 - j][i];
            }
        }
        return (Arrays.deepEquals(target, res) || Arrays.deepEquals(target, res2) || Arrays.deepEquals(target, res3) || Arrays.deepEquals(target, mat));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord){
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        for(char c = 'a'; c <= 'z'; c++){
            map.put(c, i);
            i++;
        }
        String f = "", s = "", t = "";
        for(char c : firstWord.toCharArray()){
            f += map.get(c);
        }
        for(char c : secondWord.toCharArray()){
            s += map.get(c);
        }
        for(char c : targetWord.toCharArray()){
            t += map.get(c);
        }
        return Integer.parseInt(f) + Integer.parseInt(s) == Integer.parseInt(t);
    }

    public static int countGoodSubstrings(String s){
        int count = 0;
        for(int i = 0; i < s.length() - 2; i++){
            count += countGoodSubstrings_isGood(s.substring(i, i + 3)) ? 1 : 0;
        }
        return count;
    }

    private static boolean countGoodSubstrings_isGood(String s){
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }
        return set.size() == s.length();
    }

    public static boolean checkZeroOnes(String s){
        int maxZero = 0, countZero = 0, maxOne = 0, countOne = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                countOne++;
                countZero = 0;
                maxOne = Math.max(countOne, maxOne);
            } else{
                countZero++;
                countOne = 0;
                maxZero = Math.max(countZero, maxZero);
            }
        }
        return maxOne > maxZero;
    }

    public static int subsetXORSum(int[] nums){
        int res = 0;
        for(int num : nums){
            res |= num;
        }
        return res * (int) Math.pow(2, nums.length - 1);
    }

    public static String sortSentence(String s){
        String[] splited = s.split("\\s+"), ans = new String[splited.length];
        for(String str : splited){
            int pos = sortSentence_Position(str);
            ans[pos - 1] = str.substring(0, str.length() - 1);
        }
        String sentence = "";
        for(String str : ans){
            sentence += str + " ";
        }
        return sentence.substring(0, sentence.length() - 1);
    }

    private static int sortSentence_Position(String s){
        return Integer.parseInt(Character.toString(s.charAt(s.length() - 1)));
    }

    public static int maximumPopulation(int[][] logs){
        int[] year = new int[101];
        for(int[] log : logs){
            year[log[0] - 1950]++;
            year[log[1] - 1950]--;
        }
        int maxNum = year[0], maxYear = 1950;
        for(int i = 1; i < year.length; i++){
            year[i] += year[i - 1];
            if(year[i] > maxNum){
                maxNum = year[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }

    public static int getMinDistance(int[] nums, int target, int start){
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            ans = nums[i] == target ? Math.min(ans, Math.abs(i - start)) : ans;
        }
        return ans;
    }

    public static String replaceDigits(String s){
        String ans = "";
        int i = 0;
        while(i < s.length()){
            try{
                String temp = replaceDigits_shift(s.charAt(i), Integer.parseInt(Character.toString(s.charAt(i + 1))));
                ans += s.charAt(i) + temp;
                i += 2;
            } catch(Exception e){
                break;
            }
        }
        return Character.isDigit(s.charAt(s.length() - 1)) ? ans : ans + s.charAt(s.length() - 1);
    }

    private static String replaceDigits_shift(char c, int i){
        return Character.toString(c + i);
    }

    public static boolean checkIfPangram(String sentence){
        Set<Character> set = new HashSet<>();
        for(char c : sentence.toCharArray()){
            set.add(c);
        }
        return set.size() == 26;
    }

    public static int minOperations(int[] nums){
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                int temp = nums[i - 1] - nums[i] + 1;
                count += temp;
                nums[i] += temp;
            }
        }
        return count;
    }

    public static int badSensor(int[] sensor1, int[] sensor2){
        int i = 0;
        while(i < sensor1.length){
            if(sensor1[i] != sensor2[i]){
                break;
            }
            i++;
        }
        if(i == sensor1.length){
            return -1;
        }
        if(i == sensor1.length - 1){
            return -1;
        }
        int j = i;
        while(j < sensor1.length - 1){
            if(sensor1[j] != sensor2[j + 1]){
                break;
            }
            j++;
        }
        boolean sensor1CouldBeDefective = false;
        if(j == sensor1.length - 1){
            sensor1CouldBeDefective = true;
        }
        j = i;
        while(j < sensor1.length - 1){
            if(sensor2[j] != sensor1[j + 1]){
                break;
            }
            j++;
        }
        boolean sensor2CouldBeDefective = false;
        if(j == sensor2.length - 1){
            sensor2CouldBeDefective = true;
        }
        if(sensor1CouldBeDefective && sensor2CouldBeDefective){
            return -1;
        } else if(sensor1CouldBeDefective){
            return 1;
        } else{
            return 2;
        }

    }


    public static String truncateSentence(String s, int k){
        String[] splited = s.split("\\s+");
        String ans = "";
        for(int i = 0; i < k; i++){
            ans += splited[i] + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }

    public static boolean squareIsWhite(String coordinates){
        return ((coordinates.charAt(0) - 'a') % 2 == 0 && Integer.parseInt(Character.toString(coordinates.charAt(1))) % 2 == 0) || ((coordinates.charAt(0) - 'a') % 2 != 0 && Integer.parseInt(Character.toString(coordinates.charAt(1))) % 2 != 0);
    }

    public static int numDifferentIntegers(String word){
        String replaced = word.replaceAll("[a-z]", " ");
        Set<String> nums = new HashSet<>();
        String[] words = replaced.split(" ");
        for(String s : words){
            if(s.trim().length() > 0)
                nums.add(s.replaceAll("^0*", ""));
        }
        return nums.size();
    }

    public static int maxAscendingSum(int[] nums){
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            int cur = 0;
            if(nums[i] > nums[i - 1]){
                cur += nums[i - 1];
                int j = i;
                while(j < nums.length && nums[j] > nums[j - 1]){
                    cur += nums[j];
                    j++;
                }
                sum = Math.max(sum, cur);
            }
        }
        return sum;
    }

    public static int secondHighest(String s){
        Set<Integer> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                set.add(Integer.parseInt(Character.toString(c)));
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return (set.size() < 2) ? -1 : list.get(list.size() - 2);
    }

    public static int findCenter(int[][] edges){
        return (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) ? edges[0][0] : edges[0][1];
    }

    public static boolean areAlmostEqual(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            char temp = s1.charAt(i);
            if(areAlmostEqual_NumOfChar(s1, temp) != areAlmostEqual_NumOfChar(s2, temp)){
                return false;
            }
            count += s1.charAt(i) == s2.charAt(i) ? 0 : 1;
        }
        return count <= 2;
    }

    private static int areAlmostEqual_NumOfChar(String s, char c){
        int count = 0;
        for(char cc : s.toCharArray()){
            count += cc == c ? 1 : 0;
        }
        return count;
    }

    public static boolean checkOnesSegment(String s){
        return !s.contains("01");
    }

    public static int nearestValidPoint(int x, int y, int[][] points){
        int distance = Integer.MAX_VALUE;
        for(int[] point : points){
            if(point[0] == x || point[1] == y){
                distance = Math.min(distance, Math.abs(x - point[0]) + Math.abs(y - point[1]));
            }
        }
        for(int i = 0; i < points.length; i++){
            if(Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]) == distance && (points[i][0] == x || points[i][1] == y)){
                return i;
            }
        }
        return -1;
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        if(items.size() == 0) return 0;
        int j = switch(ruleKey){
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> 0;
        };
        int count = 0;
        for(List<String> item : items){
            count += (item.get(j).equals(ruleValue)) ? 1 : 0;
        }
        return count;
    }

    public static String mergeAlternately(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());
        for(int i = 0; i < length; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(length == word1.length()){
            sb.append(word2.substring(length, word2.length()));
        } else{
            sb.append(word1.substring(length, word1.length()));
        }
        return sb.toString();
    }

    public static String longestNiceSubstring(String s){
        String ans = "", temp;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + ans.length(); j < s.length(); j++){
                temp = s.substring(i, j + 1);
                if(longestNiceSubstring_isNice(temp)){
                    ans = temp;
                }
            }
        }
        return ans;
    }

    private static boolean longestNiceSubstring_isNice(String s){
        int lower = 0, upper = 0;
        for(char c : s.toCharArray()){
            if(c < 'a'){
                upper |= 1 << (c - 'A');
            } else{
                lower |= 1 << (c - 'a');
            }
        }
        return (lower ^ upper) == 0;
    }


    public static int minOperations(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int numeric = Character.getNumericValue(s.charAt(i));
            count += (numeric == i % 2) ? 1 : 0;
        }
        return Math.min(count, s.length() - count);
    }

    public static boolean check(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count += nums[i] > nums[(i + 1) % nums.length] ? 1 : 0;
        }
        return count <= 1;
    }

    public static int sumOfUnique(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum += sumOfUnique_isUnique(nums, i) ? i : 0;
        }
        return sum;
    }

    private static boolean sumOfUnique_isUnique(int[] nums, int i){
        int j = 0;
        for(int k : nums){
            j += k == i ? 1 : 0;
        }
        return j == 1;
    }

    public static int countBalls(int lowLimit, int highLimit){
        int[] arr = new int[46];
        int digit = lowLimit;
        int id = 0;
        int max = 1;
        while(digit != 0){
            id += digit % 10;
            digit /= 10;
        }
        ++arr[id];
        for(int i = lowLimit + 1; i <= highLimit; i++){
            digit = i;
            while(digit % 10 == 0){
                id -= 9;
                digit /= 10;
            }
            ++arr[++id];
            max = Math.max(max, arr[id]);
        }
        return max;

    }

    public static String maximumTime(String time){
        char[] ti = time.toCharArray();
        if(ti[0] == '?'){
            ti[0] = (ti[1] == '?' || ti[1] <= '3') ? '2' : '1';
        }
        if(ti[1] == '?'){
            ti[1] = ti[0] == '2' ? '3' : '9';
        }
        if(ti[3] == '?'){
            ti[3] = '5';
        }
        if(ti[4] == '?'){
            ti[4] = '9';
        }
        return String.valueOf(ti);
    }

    public static int largestAltitude(int[] gain){
        int max = 0, height = 0;
        for(int i : gain){
            height += i;
            max = Math.max(max, height);
        }
        return max;
    }

    public static int countGoodRectangles(int[][] rectangles){
        int[] temp = new int[rectangles.length];
        int i = 0, count = 0, maxLen = 0;
        for(int[] rec : rectangles){
            temp[i] = Math.min(rec[0], rec[1]);
            maxLen = Math.max(temp[i], maxLen);
            i++;
        }
        for(int k : temp){
            count += k == maxLen ? 1 : 0;
        }
        return count;
    }

    public static int[] decode(int[] encoded, int first){
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }

    public static int totalMoney(int n){
        int finalResult = 1;
        int count = 1;
        for(int i = 1; i < n; i++){
            count = (i % 7 == 0) ? (i / 7) + 1 : count + 1;
            finalResult += count;
        }
        return finalResult;
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize){
        int unitCount = 0;
        int remainingTruckSize = truckSize;
        while(remainingTruckSize > 0){
            int maxUnitBoxIndex = findMaxUnitBox(boxTypes);
            if(maxUnitBoxIndex == -1){
                break;
            }
            int boxCount = Math.min(remainingTruckSize, boxTypes[maxUnitBoxIndex][0]);
            unitCount += boxCount * boxTypes[maxUnitBoxIndex][1];
            remainingTruckSize -= boxCount;
            boxTypes[maxUnitBoxIndex][1] = -1;
        }
        return unitCount;
    }

    public static int findMaxUnitBox(int[][] boxTypes){
        int maxUnitBoxIndex = -1;
        int maxUnits = 0;
        for(int i = 0; i < boxTypes.length; i++){
            if(boxTypes[i][1] > maxUnits){
                maxUnits = boxTypes[i][1];
                maxUnitBoxIndex = i;
            }
        }
        return maxUnitBoxIndex;
    }

    public static boolean halvesAreAlike(String s){
        int j = s.length() / 2, a = 0, b = 0;
        for(int i = 0; i < s.length() / 2; i++){
            char cur_a = s.charAt(i), cur_b = s.charAt(j);
            a += cur_a == 'a' || cur_a == 'e' || cur_a == 'i' || cur_a == 'o' || cur_a == 'u' || cur_a == 'A' || cur_a == 'E' || cur_a == 'I' || cur_a == 'O' || cur_a == 'U' ? 1 : 0;
            b += cur_b == 'a' || cur_b == 'e' || cur_b == 'i' || cur_b == 'o' || cur_b == 'u' || cur_b == 'A' || cur_b == 'E' || cur_b == 'I' || cur_b == 'O' || cur_b == 'U' ? 1 : 0;
            j++;
        }
        return a == b;
    }

    public static int countStudents(int[] students, int[] sandwiches){
        int[] a = {0, 0};
        for(int i = 0; i < students.length; i++){
            a[students[i]] += 1;
        }
        int k = 0;
        while(k < sandwiches.length){
            if(a[sandwiches[k]] > 0){
                a[sandwiches[k]] -= 1;
            } else{
                break;
            }
            k += 1;
        }
        return sandwiches.length - k;
    }

    public static String reformatNumber(String number){
        number = number.replace("-", "").replace(" ", "");
        int len = number.length();
        if(len == 0 || len == 1 || len == 2 || len == 3){
            return number;
        }
        StringBuffer sb = new StringBuffer(number);
        int i = 3;
        while(len > 4){
            sb.insert(i, "-");
            len -= 3;
            i += 4;
        }
        while(len == 4){
            i -= 1;
            sb.insert(i, "-");
            len -= 2;
        }
        return sb.toString();
    }

    public static int numberOfMatches(int n){
        int count = 0;
        while(n > 1){
            count += (n % 2 == 0) ? n / 2 : (n - 1) / 2;
            n = (n % 2 == 0) ? n / 2 : (n + 1) / 2;
        }
        return count;
    }

    public static int countConsistentStrings(String allowed, String[] words){
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        for(String s : words){
            count += countConsistentStrings_consistent(s, set) ? 1 : 0;
        }
        return count;

    }

    private static boolean countConsistentStrings_consistent(String s, HashSet<Character> set){
        for(char c : s.toCharArray()){
            if(!set.contains(c)){
                return false;
            }
        }
        return true;
    }

    public static String interpret(String command){
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }

    public static int maximumWealth(int[][] accounts){
        int ans = 0;
        for(int[] i : accounts){
            int temp = 0;
            for(int integer : i){
                temp += integer;
            }
            ans = Math.max(temp, ans);
        }
        return ans;
    }

    public static int maxRepeating(String sequence, String word){
        String temp = word;
        int count = 0;
        while(sequence.contains(temp)){
            count++;
            temp += word;
        }
        return count;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String s1 = "", s2 = "";
        for(String s : word1){
            s1 += s;
        }
        for(String s : word2){
            s2 += s;
        }
        return s1.equals(s2);
    }

    public static int[] decrypt(int[] code, int k){
        if(k == 0){
            return new int[code.length];
        }
        int[] prefix = new int[code.length * 2 + 1];
        for(int i = 0; i < code.length * 2; i++){
            prefix[i + 1] = prefix[i] + code[i % code.length];
        }
        int[] ret = new int[code.length];
        for(int i = 0; i < code.length; i++){
            int end = i + k;
            if(k < 0){
                ret[i] = prefix[i + code.length] - prefix[end + code.length];
            } else{
                ret[i] = prefix[end + 1] - prefix[i + 1];
            }
        }
        return ret;
    }

    public static int getMaximumGenerated(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int ans = 1;
        for(int i = 1; (2 * i + 1) <= n; i++){
            nums[2 * i] = nums[i];
            nums[2 * i + 1] = nums[i] + nums[i + 1];
            ans = Math.max(ans, nums[2 * i + 1]);
        }
        return ans;
    }

    public static int[] largestSubarray(int[] nums, int k){
        int length = nums.length;
        int maxIdx = 0;
        for(int windowEnd = 0; windowEnd < length - k + 1; windowEnd++){
            maxIdx = nums[maxIdx] > nums[windowEnd] ? maxIdx : windowEnd;
        }
        int[] resultArr = new int[k];
        int counter = 0;
        for(int res = maxIdx; res < maxIdx + k; res++){
            resultArr[counter++] = nums[res];
        }
        return resultArr;
    }

    public static boolean canFormArray(int[] arr, int[][] pieces){
        HashMap<Integer, int[]> Map = new HashMap<Integer, int[]>();
        for(int[] i : pieces){
            Map.put(i[0], i);
        }
        int i = 0;
        while(i < arr.length){
            if(Map.containsKey(arr[i])){
                int[] temp = Map.get(arr[i]);
                for(int j = 0; j < temp.length; j++){
                    if(temp[j] != arr[i]){
                        return false;
                    }
                    i++;
                }
            } else{
                return false;
            }
        }
        return true;
    }

    public static int[] frequencySort(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
        return Arrays.stream(nums).boxed()
                .sorted((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
                .mapToInt(n -> n)
                .toArray();
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed){
        int maxTime = -1, lastReleaseTime = 0;
        char slowestKey = keysPressed.charAt(0);
        for(int i = 0; i < releaseTimes.length; i++){
            int duration = releaseTimes[i] - lastReleaseTime;
            if(duration > maxTime){
                slowestKey = keysPressed.charAt(i);
                maxTime = duration;
            } else if(duration == maxTime){
                slowestKey = keysPressed.charAt(i) - slowestKey > 0
                        ? keysPressed.charAt(i) : slowestKey;
            }
            lastReleaseTime = releaseTimes[i];
        }
        return slowestKey;
    }

    public static int maxLengthBetweenEqualCharacters(String s){
        int max = 0, flag = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int x = s.lastIndexOf(ch);
            flag = x != i ? 1 : flag;
            max = Math.max(x - i - 1, max);
        }
        return flag == 0 ? -1 : max;
    }

    public static double trimMean(int[] arr){
        Arrays.sort(arr);
        double count = 0;
        int begin = (int) (arr.length * 0.05), end = (int) (arr.length - arr.length * 0.05);
        for(int i = begin; i < end; i++){
            count += arr[i];
        }
        return count / (arr.length - 2 * (arr.length * 0.05));
    }

    public static int maxDepth(String s){
        int depth = 0, max_count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                max_count++;
            } else if(s.charAt(i) == ')'){
                max_count--;
            }
            depth = Math.max(depth, max_count);
        }
        return depth;
    }

    public static int specialArray(int[] nums){
        for(int i = 0; i <= nums.length; i++){
            if(specialArray_greater(nums, i) == i){
                return i;
            }
        }
        return -1;
    }

    private static int specialArray_greater(int[] nums, int x){
        int count = 0;
        for(int i : nums){
            count += i >= x ? 1 : 0;
        }
        return count;
    }

    public static int minOperations(String[] logs){
        int depth = 0;
        for(String s : logs){
            depth -= s.charAt(0) == '.' ? depth == 0 || s.charAt(1) == '/' ? 0 : 1 : -1;
        }
        return depth;
    }

    public static String reorderSpaces(String text){
        List<String> words = Stream.of(text.split(" ")).filter(word -> !"".endsWith(word)).collect(Collectors.toList());
        int space = 0;
        for(char c : text.toCharArray()){
            if(' ' == c){
                space++;
            } else{
                continue;
            }
        }
        if(space == 0){
            return text;
        }
        String spacer = "";
        String extraSpacer = "";
        int between = space;
        int spaceLeft = 0;
        if(words.size() > 1 && space != 0){
            between = space / (words.size() - 1);
            spaceLeft = space - (words.size() - 1) * between;
        }
        for(int i = 0; i < between; i++){
            spacer += " ";
        }
        for(int i = 0; i < spaceLeft; i++){
            extraSpacer += " ";
        }
        String res = "";
        if(words.size() > 1){
            res = words.stream().collect(Collectors.joining(spacer));
        } else{
            res = words.get(0) + spacer;
        }
        if(spaceLeft != 0){
            res += extraSpacer;
        }
        return res;
    }

    public static int sumOddLengthSubarrays(int[] arr){
        int totalSum = 0;
        for(int i = 0; i < arr.length; i += 1){
            for(int j = i + 1; j <= arr.length; j += 2){
                int[] subArray = Arrays.copyOfRange(arr, i, j);
                for(int value : subArray){
                    totalSum += value;
                }
            }
        }
        return totalSum;
    }

    public static int numSpecial(int[][] mat){
        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count += numSpecial_checkCol(mat, j) && numSpecial_checkRow(mat, i) ? 1 : 0;
                }
            }
        }
        return count;
    }

    private static boolean numSpecial_checkRow(int[][] mat, int row){
        int count = 0;
        for(int i = 0; i < mat[row].length; i++){
            count += mat[row][i] == 1 ? 1 : 0;
        }
        return count == 1;
    }

    private static boolean numSpecial_checkCol(int[][] mat, int col){
        int count = 0;
        for(int[] ints : mat){
            count += ints[col] == 1 ? 1 : 0;
        }
        return count == 1;
    }

    public static String modifyString(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '?'){
                char ch = 'a';
                while((i != 0 && s.charAt(i - 1) == ch) || (i != s.length() - 1 && s.charAt(i + 1) == ch)) ch++;
                s = s.substring(0, i) + ch + s.substring(i + 1);
            }
        }
        return s;
    }

    public static int diagonalSum(int[][] mat){
        int sum = 0, j = mat.length - 1;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i] + mat[i][j];
            j--;
        }
        return mat.length % 2 == 0 ? sum : sum - mat[mat.length / 2][mat.length / 2];
    }

    public static boolean containsPattern(int[] arr, int m, int k){
        int count = 0;
        for(int i = 0; i + m < arr.length; i++){
            if(arr[i] == arr[i + m]){
                count++;
            } else{
                count = 0;
            }
            if(count == (k - 1) * m){
                return true;
            }
        }
        return false;
    }

    public static List<Integer> mostVisited(int n, int[] rounds){
        var start = rounds[0];
        var end = rounds[rounds.length - 1];
        var res = new ArrayList<Integer>();
        if(start <= end){
            for(int i = start; i <= end; i++) res.add(i);
        } else{
            for(int i = 1; i <= end; i++) res.add(i);
            for(int i = start; i <= n; i++) res.add(i);
        }
        return res;
    }

    public static String thousandSeparator(int n){
        String s = n + "";
        int count = 0;
        if(s.length() <= 3){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            count++;
            sb.append(s.charAt(i));
            if(count == 3 && i != 0){
                sb.append(".");
                count = 0;
            }
        }
        return sb.reverse().toString();
    }

    public static boolean threeConsecutiveOdds(int[] arr){
        int pass = 0;
        for(int i = 0; i < arr.length; i++){
            pass = arr[i] % 2 == 0 ? 0 : pass + 1;
            if(pass >= 3){
                return true;
            }
        }
        return false;
    }

    public static String makeGood(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!stack.empty() && Math.abs((int) stack.peek() - (int) ch) == 32){
                stack.pop();
            } else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static int findKthPositive(int[] arr, int k){
        if(arr.length < 1 || arr.length > 1000){
            return 0;
        }
        int[] missingArr = new int[k + 1];
        HashSet<Integer> map = new HashSet<Integer>();
        for(int value : arr){
            map.add(value);
        }
        int j = 0;
        int m = 1;
        while(j < missingArr.length){
            if(!map.contains(m)){
                missingArr[j] = m;
                m++;
                j++;
            } else{
                m++;
            }
        }
        return missingArr[k - 1];
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    ans += (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) ? 1 : 0;
                }
            }
        }
        return ans;
    }

    public static String restoreString(String s, int[] indices){
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < indices.length; i++){
            map.put(indices[i], s.charAt(i));
        }
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < indices.length; i++){
            temp.append(map.get(i));
        }
        return temp.toString();
    }

    public static int countOdds(int low, int high){
        return (high + 1) / 2 - (low / 2);
    }

    public static int numWaterBottles(int numBottles, int numExchange){
        int drink = numBottles, numFull = 0;
        while(numBottles >= numExchange){
            numFull = numBottles / numExchange;
            drink += numFull;
            numBottles = numFull + (numBottles % numExchange);
        }
        return drink;
    }

    public static int numIdenticalPairs(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                count += j > i && nums[i] == nums[j] ? 1 : 0;
            }
        }
        return count;
    }

    public static String reformatDate(String date){
        HashMap<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        String[] splited = date.split("\\s+");
        String year = splited[splited.length - 1], month = map.get(splited[splited.length - 2]),
                day = Character.isDigit(splited[0].charAt(1))
                        ? Character.toString(splited[0].charAt(0)) + splited[0].charAt(1)
                        : "0" + splited[0].charAt(0);
        return year + "-" + month + "-" + day;
    }

    public static boolean canMakeArithmeticProgression(int[] arr){
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i - 1] != diff){
                return false;
            }
        }
        return true;
    }

    public static boolean isPathCrossing(String path){
        Set<String> set = new HashSet<>();
        int x = 0, y = 0;
        set.add("(0,0)");
        char[] arr = path.toCharArray();
        for(char c : arr){
            x += c == 'W' ? -1 : c == 'E' ? 1 : 0;
            y += c == 'S' ? -1 : c == 'N' ? 1 : 0;
            String cur = "(" + x + "," + y + ")";
            if(set.contains(cur)){
                return true;
            } else{
                set.add(cur);
            }
        }
        return false;
    }

    public static ListNode deleteNodes(ListNode head, int m, int n){
        List<Integer> list = new ArrayList<>();
        while(head != null){
            int M = m, N = n;
            while(M != 0 && head != null){
                list.add(head.val);
                M--;
                head = head.next;
            }
            while(N != 0 && head != null){
                head = head.next;
                N--;
            }
        }
        ListNode dummy = new ListNode(list.get(0));
        ListNode newHead = dummy;
        for(int i = 1; i < list.size(); i++){
            newHead.next = new ListNode(list.get(i));
            newHead = newHead.next;
        }
        return dummy;
    }

    public static List<Integer> getLonelyNodes(TreeNode root){
        List<Integer> lonely = new ArrayList<>();
        getLonelyNodeHelper(root, lonely, null);
        return lonely;
    }

    public static void getLonelyNodeHelper(TreeNode root, List<Integer> lonely, TreeNode parent){
        if(root == null){
            return;
        }
        if(parent != null){
            if(parent.left == null && parent.right == null){
            } else if(parent.left == null || parent.right == null){
                lonely.add(parent.left == null ? parent.right.val : parent.left.val);
            }
        }
        getLonelyNodeHelper(root.left, lonely, root);
        getLonelyNodeHelper(root.right, lonely, root);
    }

    public static double average(int[] salary){
        double max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        for(int i : salary){
            sum += i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return (sum - max - min) / (salary.length - 2);
    }

    public static int xorOperation(int n, int start){
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans ^= (start + 2 * i);
        }
        return ans;
    }

    public static int[] finalPrices(int[] prices){
        int[] out = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            out[i] = finalPrices_findDiscount(prices, i);
        }
        return out;
    }

    private static int finalPrices_findDiscount(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        for(int j = i + 1; j < arr.length; j++){
            if(arr[j] <= arr[i]){
                return arr[i] - arr[j];
            }
        }
        return arr[i];
    }

    public static int[] shuffle(int[] nums, int n){
        int max = 1001, ind = 0;
        for(int i = n; i < nums.length; i++){
            nums[i] = max * nums[i] + nums[i - n];
        }
        for(int i = n; i < nums.length; i++){
            nums[ind] = nums[i] % max;
            nums[ind + 1] = nums[i] / max;
            ind += 2;
        }
        return nums;
    }

    public static int maxProduct(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public static boolean canBeEqual(int[] target, int[] arr){
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

    public static int isPrefixOfWord(String sentence, String searchWord){
        for(int i = 0; i < sentence.split("\\s+").length; i++){
            if(sentence.split("\\s+")[i].length() >= searchWord.length()
                    && searchWord.equals(sentence.split("\\s+")[i].substring(0, searchWord.length()))){
                return i + 1;
            }
        }
        return -1;
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime){
        int count = 0;
        for(int i = 0; i < endTime.length; i++){
            count += (startTime[i] <= queryTime && endTime[i] >= queryTime) ? 1 : 0;
        }
        return count;
    }

    public static int maxPower(String s){
        int count = 0, max_count = 0;
        char prev = ' ';
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == prev){
                count++;
            } else{
                count = 1;
                prev = s.charAt(i);
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;
    }

    public static List<String> buildArray(int[] target, int n){
        List<String> list = new ArrayList();
        int i = 0, j = 0;
        while(i++ <= n && j < target.length){
            list.add("Push");
            if(target[j] == i){
                j++;
            } else{
                list.add("Pop");
            }
        }
        return list;
    }

    public static String destCity(List<List<String>> paths){
        HashMap<String, String> map = new HashMap<>();
        for(List<String> path : paths){
            map.put(path.get(0), path.get(1));
        }
        for(List<String> path : paths){
            if(!map.containsKey(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int max = Integer.MIN_VALUE;
        for(int i : candies){
            max = Math.max(max, i);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int candy : candies){
            ans.add(candy + extraCandies >= max);
        }
        return ans;
    }

    public static int countElements(int[] arr){
        int count = 0;
        for(int i : arr){
            count += countElements_exist(arr, i) ? 1 : 0;
        }
        return count;
    }

    private static boolean countElements_exist(int[] arr, int num){
        for(int j : arr){
            if(j == num + 1){
                return true;
            }
        }
        return false;
    }

    public static int maxScore(String s){
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= s.length(); i++){
            String l = s.substring(0, i), r = s.substring(i);
            if(l.length() > 0 && r.length() > 0){
                max = Math.max(maxScore(l, '0') + maxScore(r, '1'), max);
            }
        }
        return max;
    }

    private static int maxScore(String s, char c){
        int count = 0;
        for(char ch : s.toCharArray()){
            count += ch == c ? 1 : 0;
        }
        return count;
    }

    public static String reformat(String s){
        if(s.length() == 0 || s.length() == 1){
            return s;
        }
        StringBuilder result = new StringBuilder();
        Queue<Character> alphabets = new LinkedList<>();
        Queue<Character> digits = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(Character.isDigit(current)){
                digits.add(current);
            } else{
                alphabets.add(current);
            }
        }
        int diff = digits.size() - alphabets.size();
        if(diff < -1 || diff > 1){
            return result.toString();
        }
        char prev = digits.size() > alphabets.size() ? digits.poll() : alphabets.poll();
        result.append(prev);
        while(!alphabets.isEmpty() || !digits.isEmpty()){
            result.append(prev = (Character.isDigit(prev) ? alphabets.poll() : digits.poll()));
        }
        return result.toString();
    }

    public static int minStartValue(int[] nums){
        int sum = 0, minSum = 0;
        for(int num : nums){
            sum += num;
            minSum = Math.min(sum, minSum);
        }
        return 1 - minSum;
    }

    public static List<String> stringMatching(String[] words){
        Set<String> ans = new HashSet<>();
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1; j < words.length; j++){
                String a = words[i], b = words[j];
                if(a.contains(b)){
                    ans.add(b);
                } else if(b.contains(a)){
                    ans.add(a);
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static List<Integer> minSubsequence(int[] nums){
        int[] count = new int[101];
        int totalSum = 0, currSum = 0;
        for(int currInt : nums){
            totalSum += currInt;
            count[currInt]++;
        }
        List<Integer> currSubseq = new ArrayList<>();
        for(int i = count.length - 1; i >= 0; --i){
            while(count[i] > 0){
                currSubseq.add(i);
                currSum += i;
                count[i]--;
                if(currSum > totalSum - currSum){
                    i = -1;
                    break;
                }
            }
        }
        return currSubseq;
    }

    public static int countLargestGroup(int n){
        int[] ans = new int[n + 1];
        for(int i = 1; i <= n; i++){
            int cur = countLargestGroup_Sum(i);
            ans[cur]++;
        }
        Arrays.sort(ans);
        int count = 0, max = ans[ans.length - 1];
        for(int i = ans.length - 1; i >= 0; i--){
            count += ans[i] == max ? 1 : 0;
        }
        return count;
    }

    private static int countLargestGroup_Sum(int n){
        String s = n + "";
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += Integer.parseInt(Character.toString(c));
        }
        return sum;
    }

    public static int findLucky(int[] arr){
        Arrays.sort(arr);
        for(int i = arr.length - 1; i >= 0; i--){
            if(findLucky_frequency(arr, arr[i]) == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    private static int findLucky_frequency(int[] arr, int num){
        int count = 0;
        for(int j : arr){
            count += j == num ? 1 : 0;
        }
        return count;
    }

    public static int[] createTargetArray(int[] nums, int[] index){
        int[] target = new int[nums.length];
        int i = 0, k = 0;
        while(i < index.length){
            for(k = target.length - 1; k > index[i]; k--)
                target[k] = target[k - 1];
            target[index[i]] = nums[i];
            i++;
        }
        return target;
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d){
        int l1 = arr1.length, l2 = arr2.length, distance = l1;
        for(int i : arr1){
            for(int j : arr2){
                if(Math.abs(i - j) <= d){
                    distance -= 1;
                    break;
                }
            }
        }
        return distance;
    }

    public static List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        for(int[] ints : matrix){
            for(int j = 0; j < ints.length; j++){
                if(luckyNumbers_CheckRow(ints, ints[j]) && luckyNumbers_CheckCol(matrix, j, ints[j])){
                    ans.add(ints[j]);
                }
            }
        }
        return ans;
    }

    private static boolean luckyNumbers_CheckRow(int[] matrix, int num){
        for(int j : matrix){
            if(j < num){
                return false;
            }
        }
        return true;
    }

    private static boolean luckyNumbers_CheckCol(int[][] matrix, int col, int num){
        for(int[] ints : matrix){
            if(ints[col] > num){
                return false;
            }
        }
        return true;
    }

    public static String generateTheString(int n){
        StringBuilder ans = new StringBuilder();
        ans.append("a".repeat(Math.max(0, n - 1)));
        return n % 2 == 0 ? ans + "b" : ans + "a";
    }

    public static String sortString(String s){
        int[] map = new int[26];
        int len = 0;
        for(char c : s.toCharArray()){
            map[c - 'a']++;
            len++;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0, step = 1;
        while(len-- > 0){
            while(map[i] == 0){
                if(i == 25){
                    step = -1;
                }
                if(i == 0){
                    step = 1;
                }
                i += step;
            }
            sb.append((char) ('a' + i));
            map[i]--;
            i += step;
            if(i < 0){
                step = 1;
                i = 0;
            } else if(i > 25){
                step = -1;
                i = 25;
            }
        }
        return sb.toString();
    }

    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = smallerNumbersThanCurrent_HowManyNumbers(nums, nums[i]);
        }
        return ans;
    }

    private static int smallerNumbersThanCurrent_HowManyNumbers(int[] nums, int i){
        int count = 0;
        for(int integer : nums){
            count += integer < i ? 1 : 0;
        }
        return count;
    }

    public static int daysBetweenDates(String date1, String date2){
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");
        int[] id1 = {Integer.parseInt(d1[0]), Integer.parseInt(d1[1]), Integer.parseInt(d1[2])};
        int[] id2 = {Integer.parseInt(d2[0]), Integer.parseInt(d2[1]), Integer.parseInt(d2[2])};
        int[][] m2d = {{-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {-1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        long days1 = 0;
        long days2 = 0;
        for(int i = 1971; i < id1[0]; i++){
            days1 += leap(i) == 1 ? 366 : 365;
        }
        for(int i = 1971; i < id2[0]; i++){
            days2 += leap(i) == 1 ? 366 : 365;
        }
        int leap1 = leap(id1[0]);
        int leap2 = leap(id2[0]);
        for(int i = 1; i < id1[1]; i++){
            days1 += m2d[leap1][i];
        }
        for(int i = 1; i < id2[1]; i++){
            days2 += m2d[leap2][i];
        }
        days1 += id1[2];
        days2 += id2[2];
        return (int) Math.abs(days1 - days2);
    }

    public static int leap(int year){
        if(year % 4 != 0)
            return 0;
        else if(year % 100 != 0)
            return 1;
        else if(year % 400 != 0)
            return 0;
        else
            return 1;
    }

    public static int[] sortByBits(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int k : arr){
            map.put(k, sortByBits_numOfzero(Integer.toBinaryString(k)));
        }
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(map.get(arr[j]) < map.get(arr[min])
                        || (map.get(arr[j]).equals(map.get(arr[min])) && arr[j] < arr[min])){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static int sortByBits_numOfzero(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            count += c == '1' ? 1 : 0;
        }
        return count;
    }

    public static int countNegatives(int[][] grid){
        int count = 0;
        for(int[] i : grid){
            for(int num : i){
                count += num < 0 ? 1 : 0;
            }
        }
        return count;
    }

    public static int[] arrayRankTransform(int[] arr){
        int[] ans = new int[arr.length];
        System.arraycopy(arr, 0, ans, 0, arr.length);
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 1;
        for(int k : arr){
            if(!map.containsKey(k)){
                map.put(k, j);
                j++;
            }
        }
        for(int i = 0; i < ans.length; i++){
            ans[i] = map.get(ans[i]);
        }
        return ans;
    }

    public static int maximum69Number(int num){
        return Integer.parseInt((num + "").replaceFirst("6", "9"));
    }

    public static int[] getNoZeroIntegers(int n){
        for(int i = 1; i < n; i++){
            int part = n - i;
            if(getNoZeroIntegers_noZero(i, part)){
                return new int[]{i, part};
            }
        }
        return new int[]{0, 0};
    }

    private static boolean getNoZeroIntegers_noZero(int i, int j){
        String s = "" + i + j;
        for(char c : s.toCharArray()){
            if(c == '0'){
                return false;
            }
        }
        return true;
    }

    public static int[] decompressRLElist(int[] nums){
        int len = 0;
        for(int i = 0; i < nums.length; i += 2){
            len += nums[i];
        }
        int[] ans = new int[len];
        int i = 0, j = 0;
        while(j < ans.length){
            for(int cur = 0; cur < nums[i]; cur++){
                ans[j] = nums[i + 1];
                j++;
            }
            i += 2;
        }
        return ans;
    }

    public static String freqAlphabets(String s){
        HashMap<String, String> map = new HashMap<>();
        int i = 1;
        for(char c = 'a'; c <= 'i'; c++){
            map.put(i + "", Character.toString(c));
            i++;
        }
        for(char c = 'j'; c <= 'z'; c++){
            map.put(i + "#", Character.toString(c));
            i++;
        }
        String ans = "";
        for(int j = 0; j < s.length(); j++){
            String cur = "";
            if(s.charAt(j) == '1' || s.charAt(j) == '2'){
                if(j + 2 >= s.length()){
                    cur = Character.toString(s.charAt(j));
                } else{
                    if(s.charAt(j + 2) == '#'){
                        cur = Character.toString(s.charAt(j)) + s.charAt(j + 1) + "#";
                        j += 2;
                    } else{
                        cur = Character.toString(s.charAt(j));
                    }
                }
            } else{
                cur = s.charAt(j) == '#' || s.charAt(j) == '0' ? "" : Character.toString(s.charAt(j));
            }
            ans += cur.equals("") ? "" : map.get(cur);
        }
        return ans;
    }

    public static int[] sumZero(int n){
        int[] ans = new int[n];
        if(n % 2 == 0){
            for(int i = 0; i < ans.length; i += 2){
                ans[i] = i + 1;
                ans[i + 1] = -i - 1;
            }
        } else{
            ans[0] = 0;
            for(int i = 1; i < ans.length; i += 2){
                ans[i] = i + 1;
                ans[i + 1] = -i - 1;
            }
        }
        return ans;
    }

    public static int subtractProductAndSum(int n){
        String num = n + "";
        int sum = 0, product = 1;
        for(char c : num.toCharArray()){
            sum += Integer.parseInt(Character.toString(c));
            product *= Integer.parseInt(Character.toString(c));
        }
        return product - sum;
    }

    public static int getDecimalValue(ListNode head){
        String ans = "";
        while(head != null){
            ans += head.val;
            head = head.next;
        }
        return Integer.parseInt(ans, 2);
    }

    public static int[] replaceElements(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length - 1; i++){
            ans[i] = replaceElements_Max(arr, i + 1);
        }
        ans[ans.length - 1] = -1;
        return ans;
    }

    private static int replaceElements_Max(int[] arr, int start){
        int max = Integer.MIN_VALUE;
        for(int i = start; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static String tictactoe(int[][] moves){
        int n = moves[0].length + 1, diagSum = 0, antiDiagSum = 0, playerVal = 1;
        int[] rowSum = new int[n], colSum = new int[n];
        for(int[] move : moves){
            int row = move[0], col = move[1];
            rowSum[row] += playerVal;
            colSum[col] += playerVal;
            if(row == col){
                diagSum = diagSum + playerVal;
                if(diagSum == n){
                    return "A";
                }
                if(diagSum == -n){
                    return "B";
                }
            }
            if(row + col + 1 == n){
                antiDiagSum += playerVal;
            }
            if(rowSum[row] == n || colSum[col] == n || diagSum == n || antiDiagSum == n){
                return "A";
            }
            if(rowSum[row] == -n || colSum[col] == -n || diagSum == -n || antiDiagSum == -n){
                return "B";
            }
            playerVal = playerVal == 1 ? -1 : 1;
        }
        return moves.length < n * n ? "Pending" : "Draw";
    }

    public static String toHexspeak(String num){
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');
        set.add('E');
        set.add('F');
        set.add('I');
        set.add('O');
        String ans = "";
        for(char c : new BigInteger(num + "", 10).toString(16).toCharArray()){
            ans += c == '1' ? "I" : c == '0' ? "O" : Character.toString(Character.toUpperCase(c));
        }
        for(char c : ans.toCharArray()){
            if(!set.contains(c)){
                return "ERROR";
            }
        }
        return ans;
    }

    public static int minTimeToVisitAllPoints(int[][] points){
        if(points.length <= 2){
            return minTimeToVisitAllPoints_timeCost(points[0][0], points[0][1], points[1][0], points[1][1]);
        }
        int time = 0;
        for(int i = 1; i < points.length; i++){
            int x = points[i - 1][0], y = points[i - 1][1], fx = points[i][0], fy = points[i][1];
            time += minTimeToVisitAllPoints_timeCost(x, y, fx, fy);
        }
        return time;
    }

    private static int minTimeToVisitAllPoints_timeCost(int x, int y, int fx, int fy){
        int time = 1;
        while(x != fx || y != fy){
            if(x <= fx && y <= fy){
                x += x == fx ? 0 : 1;
                y += y == fy ? 0 : 1;
                time += x == fx && y == fy ? 0 : 1;
            } else if(x >= fx && y <= fy){
                x -= x == fx ? 0 : 1;
                y += y == fy ? 0 : 1;
                time += x == fx && y == fy ? 0 : 1;
            } else if(x >= fx && y >= fy){
                x -= x == fx ? 0 : 1;
                y -= y == fy ? 0 : 1;
                time += x == fx && y == fy ? 0 : 1;
            } else{
                x += x == fx ? 0 : 1;
                y -= y == fy ? 0 : 1;
                time += x == fx && y == fy ? 0 : 1;
            }
        }
        return time;
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k){
        for(; k > 0; k--){
            int[][] newGrid = new int[grid.length][grid[0].length];
            for(int row = 0; row < grid.length; row++){
                if(grid[0].length - 1 >= 0)
                    System.arraycopy(grid[row], 0, newGrid[row], 1, grid[0].length - 1);
            }
            for(int row = 0; row < grid.length - 1; row++){
                newGrid[row + 1][0] = grid[row][grid[0].length - 1];
            }
            newGrid[0][0] = grid[grid.length - 1][grid[0].length - 1];
            grid = newGrid;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int[] row : grid){
            List<Integer> listRow = new ArrayList<>();
            result.add(listRow);
            for(int v : row)
                listRow.add(v);
        }
        return result;
    }

    public static int oddCells(int m, int n, int[][] indices){
        int count = 0;
        int[][] mat = new int[m][n];
        for(int[] index : indices){
            for(int j = 0; j < n; j++){
                mat[index[0]][j]++;
            }
            for(int j = 0; j < m; j++){
                mat[j][index[1]]++;
            }
        }
        for(int[] ints : mat){
            for(int anInt : ints){
                if(anInt % 2 == 1){
                    count++;
                }
            }
        }
        return count;
    }

    public static List<Integer> transformArray(int[] arr){
        List<Integer> res = new ArrayList<>();
        while(true){
            boolean correct = true;
            int prev = arr[0];
            for(int i = 1; i < arr.length - 1; i++){
                if(prev > arr[i] && arr[i + 1] > arr[i]){
                    prev = arr[i];
                    arr[i]++;
                    correct = false;
                } else if(prev < arr[i] && arr[i + 1] < arr[i]){
                    prev = arr[i];
                    arr[i]--;
                    correct = false;
                } else{
                    prev = arr[i];
                }
            }
            if(correct)
                break;
        }
        for(int j : arr){
            res.add(j);
        }
        return res;
    }

    public static boolean checkStraightLine(int[][] coordinates){
        int x = coordinates[0][0];
        int y = coordinates[0][1];
        for(int i = 1; i < coordinates.length; i++){
            if((y - coordinates[i - 1][1]) * (coordinates[i][0] - coordinates[i - 1][0]) != (x - coordinates[i - 1][0])
                    * (coordinates[i][1] - coordinates[i - 1][1])){
                return false;
            }
        }
        return true;
    }

    public static int minCostToMoveChips(int[] position){
        int even = 0, odd = 0;
        for(int i : position){
            even += i % 2 == 0 ? 1 : 0;
            odd += i % 2 == 0 ? 0 : 1;
        }
        return Math.min(odd, even);
    }

    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3){
        List<Integer> ans = new ArrayList<>(), a1 = new ArrayList<>(), a2 = new ArrayList<>(), a3 = new ArrayList<>();
        for(int i : arr1){
            a1.add(i);
        }
        for(int i : arr2){
            a2.add(i);
        }
        for(int i : arr3){
            a3.add(i);
        }
        for(int i : a1){
            if(a2.contains(i) && a3.contains(i) && !ans.contains(i)){
                ans.add(i);
            }
        }
        for(int i : a2){
            if(a1.contains(i) && a3.contains(i) && !ans.contains(i)){
                ans.add(i);
            }
        }
        for(int i : a3){
            if(a2.contains(i) && a1.contains(i) && !ans.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else{
                map.put(i, 1);
            }
        }
        for(int i : arr){
            set.add(map.get(i));
        }
        return set.size() == map.size();
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int cur = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(Math.abs(arr[i] - arr[i - 1]) <= cur){
                List<Integer> list = new ArrayList<>();
                if(Math.abs(arr[i] - arr[i - 1]) < cur){
                    cur = Math.abs(arr[i] - arr[i - 1]);
                    ans.clear();
                }
                list.add(arr[i - 1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }
        return ans;
    }

    public static int maxNumberOfApples(int[] arr){
        int max = 5000, i = 0, count = 0;
        Arrays.sort(arr);
        while(max >= 0 && i < arr.length){
            if(max - arr[i] >= 0){
                max -= arr[i];
                count++;
            }
            i++;
        }
        return count;
    }

    public static int maxNumberOfBalloons(String text){
        List<Character> list = new ArrayList<>();
        for(char c : text.toCharArray()){
            list.add(c);
        }
        String balloon = "balloon";
        int i = 0, count = 0;
        char cur = balloon.charAt(i);
        while(list.contains(cur)){
            list.remove(cur);
            i = i + 1 == balloon.length() ? 0 : i + 1;
            count += i == 0 ? 1 : 0;
            cur = balloon.charAt(i);
        }
        return count;
    }

    public static String dayOfTheWeek(int day, int month, int year){
        return LocalDate.of(year, month, day).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination){
        int totalSum = 0;
        int distanceSum = 0;
        int min = Integer.MAX_VALUE;
        int left = Math.min(start, destination);
        int right = Math.max(start, destination);
        for(int j : distance){
            totalSum += j;
        }
        for(int i = left; i < right; i++){
            distanceSum += distance[i];
        }
        return Math.min(distanceSum, totalSum - distanceSum);
    }

    public static int countLetters(String S){
        int total = 0;
        for(int left = 0, right = 0; right <= S.length(); right++){
            if(right == S.length() || S.charAt(left) != S.charAt(right)){
                int lenSubstring = right - left;
                total += (1 + lenSubstring) * lenSubstring / 2;
                left = right;
            }
        }
        return total;
    }

    public static int findNumbers(int[] nums){
        int ans = 0;
        for(int i : nums){
            ans += String.valueOf(i).length() % 2 == 0 ? 1 : 0;
        }
        return ans;
    }

    public static boolean checkIfExist(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if((arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) && i != j){
                    return true;
                }
            }
        }
        return false;
    }

    public static int numberOfSteps(int num){
        int steps = 0;
        while(num != 0){
            num = num % 2 == 0 ? num / 2 : num - 1;
            steps++;
        }
        return steps;
    }

    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper){
        int start = 0, score = 0, cur = 0;
        for(int end = 0; end < calories.length; end++){
            cur += calories[end];
            score += end - start + 1 == k ? cur > upper ? 1 : cur < lower ? -1 : 0 : 0;
            cur -= end - start + 1 == k ? calories[start++] : 0;
        }
        return score;
    }

    public static int numPrimeArrangements(int n){
        if(n < 2){
            return 1;
        }
        long res = 1;
        int prime = 1;
        int notPrime = 1;
        for(int i = 3; i <= n; i++){
            if(numPrimeArrangements_isPrime(i)){
                prime++;
            } else{
                notPrime++;
            }
        }
        for(int i = prime; i > 0; i--){
            res *= i;
            res %= 1000000007;
        }
        for(int i = notPrime; i > 0; i--){
            res *= i;
            res %= 1000000007;
        }
        return (int) res;
    }

    private static boolean numPrimeArrangements_isPrime(int num){
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int calculateTime(String keyboard, String word){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i <= 25; i++){
            map.put(keyboard.charAt(i), i);
        }
        char cur_pos = keyboard.charAt(0);
        int time = 0;
        for(int i = 0; i < word.length(); i++){
            char cur_word = word.charAt(i);
            time += Math.abs(map.get(cur_word) - map.get(cur_pos));
            cur_pos = cur_word;
        }
        return time;
    }

    public static int countCharacters(String[] words, String chars){
        List<Character> list = new ArrayList<>();
        for(char c : chars.toCharArray()){
            list.add(c);
        }
        int ans = 0;
        for(String s : words){
            ans += (s.length() > chars.length() || !countCharacters_contains(list, s)) ? 0 : s.length();
        }
        return ans;
    }

    private static boolean countCharacters_contains(List<Character> list0, String s){
        List<Character> list = new ArrayList<>();
        list.addAll(list0);
        for(int i = 0; i < s.length(); i++){
            if(!list.contains(s.charAt(i))){
                return false;
            }
            list.remove(s.charAt(i));
        }
        return true;
    }

    public static int dayOfYear(String date){
        String[] s = date.split("-");
        int year = Integer.parseInt(s[0]), month = Integer.parseInt(s[1]), day = Integer.parseInt(s[2]), count = 0;
        boolean leap = (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        for(int i = 1; i < month; i++){
            count += i == 4 || i == 6 || i == 9 || i == 11 ? 30 : i == 2 ? (leap ? 29 : 28) : 31;
        }
        return count + day;
    }

    public static boolean isMajorityElement(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else{
                map.put(i, 1);
            }
        }
        try{
            return map.get(target) > nums.length / 2;
        } catch(Exception e){
            return false;
        }
    }

    public static int tribonacci(int n){
        if(n < 3){
            return n == 0 ? 0 : 1;
        }
        int temp, x = 0, y = 1, z = 1;
        for(int i = 3; i <= n; i++){
            temp = x + y + z;
            x = y;
            y = z;
            z = temp;
        }
        return z;
    }

    public static boolean isArmstrong(int n){
        String str = n + "";
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            int cur = (int) Math.pow(Integer.parseInt(Character.toString(str.charAt(i))), str.length());
            sum += cur;
        }
        return sum == n;
    }

    public static int numEquivDominoPairs(int[][] dominoes){
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int[] item : dominoes){
            int val = item[0] < item[1] ? item[0] * 10 + item[1] : item[1] * 10 + item[0];
            int count = map.getOrDefault(val, 0);
            map.put(val, count + 1);
            result += count;
        }
        return result;
    }

    public static int largestUniqueNumber(int[] A){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : A){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else{
                map.put(i, 1);
            }
        }
        Arrays.sort(A);
        for(int i = A.length - 1; i >= 0; i--){
            if(map.get(A[i]) == 1){
                return A[i];
            }
        }
        return -1;
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>(), out = new ArrayList<>();
        for(int i : arr2){
            list.add(i);
        }
        int[] ans = new int[arr1.length];
        int j = 0;
        for(int i : arr1){
            if(!list.contains(i)){
                out.add(i);
            }
        }
        for(int temp : arr2){
            for(int integer : arr1){
                if(integer == temp){
                    ans[j] = integer;
                    j++;
                }
            }
        }
        j = ans.length - 1;
        List<Integer> list_sort = new ArrayList<Integer>(out);
        Collections.sort(list_sort);
        for(int i = list_sort.size() - 1; i >= 0; i--){
            ans[j] = list_sort.get(i);
            j--;
        }
        return ans;
    }

    public static String removeVowels(String s){
        String ans = "";
        for(char c : s.toCharArray()){
            ans += c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ? "" : Character.toString(c);
        }
        return ans;
    }

    public static int numberOfDays(int Y, int M){
        return M == 4 || M == 6 || M == 9 || M == 11 ? 30
                : M != 2 ? 31 : (Y % 4 == 0 && Y % 100 == 0 && Y % 400 == 0) || (Y % 4 == 0 && Y % 100 != 0) ? 29 : 28;
    }

    public static int arraySign(int[] nums){
        int neg = 0;
        for(int i : nums){
            if(i == 0){
                return 0;
            }
            neg += i < 0 ? 1 : 0;
        }
        return neg % 2 == 0 ? 1 : -1;
    }

    public static int balancedStringSplit(String s){
        int boo = 0, count = 0;
        for(char c : s.toCharArray()){
            boo += c == 'R' ? 1 : -1;
            count += boo == 0 ? 1 : 0;
        }
        return count;
    }

    public static String defangIPaddr(String address){
        String ans = "";
        for(char c : address.toCharArray()){
            ans += c == '.' ? "[.]" : Character.toString(c);
        }
        return ans;
    }

    public static int[] distributeCandies(int candies, int num_people){
        int[] people = new int[num_people];
        int numOfCandies = 1, i = 0;
        while(candies > 0){
            if(candies - numOfCandies <= 0){
                people[i] += candies;
                break;
            }
            people[i] += numOfCandies;
            candies -= numOfCandies;
            numOfCandies++;
            i = i == people.length - 1 ? 0 : i + 1;
        }
        return people;
    }

    public static int twoSumLessThanK(int[] nums, int k){
        int cur = -1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int cur_sum = nums[j] + nums[i];
                if(cur_sum < k && cur_sum > cur){
                    cur = cur_sum;
                }
            }
        }
        return cur;
    }

    public static void duplicateZeros(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int j : arr){
            if(j == 0){
                list.add(0);
                list.add(0);
            } else{
                list.add(j);
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
    }

    public static int[][] highFive(int[][] items){
        int K = 5;
        TreeMap<Integer, Queue<Integer>> allScores = new TreeMap<>();
        for(int[] item : items){
            int id = item[0];
            int score = item[1];
            if(!allScores.containsKey(id))
                allScores.put(id, new PriorityQueue<>((a, b) -> b - a));
            allScores.get(id).add(score);
        }
        List<int[]> solution = new ArrayList<>();
        for(int id : allScores.keySet()){
            int sum = 0;
            // obtain the top k scores (k = 5)
            for(int i = 0; i < K; ++i)
                sum += allScores.get(id).poll();
            solution.add(new int[]{id, sum / K});
        }
        int[][] solutionArray = new int[solution.size()][];
        return solution.toArray(solutionArray);
    }

    public static String stringShift(String string, int[][] shift){
        int len = string.length();
        for(int[] move : shift){
            int direction = move[0];
            int amount = move[1] % len;
            if(direction == 0){
                string = string.substring(amount) + string.substring(0, amount);
            } else{
                string = string.substring(len - amount) + string.substring(0, len - amount);
            }
        }
        return string;
    }

    public static int sumOfDigits(int[] A){
        Arrays.sort(A);
        return sumOfDigits_getSum(A[0]) % 2 == 0 ? 1 : 0;
    }

    private static int sumOfDigits_getSum(int i){
        int count = 0;
        String s = i + "";
        for(int j = 0; j < s.length(); j++){
            count += Integer.parseInt(Character.toString(s.charAt(j)));
        }
        return count;
    }

    public static String[] findOcurrences(String text, String first, String second){
        String[] ans = text.split("\\s+");
        List<String> list = new ArrayList<>();
        for(int i = 1; i < ans.length - 1; i++){
            String fir = ans[i - 1], sec = ans[i], third = ans[i + 1];
            if(fir.equals(first) && sec.equals(second)){
                list.add(third);
            }
        }
        String[] output = new String[list.size()];
        for(int i = 0; i < output.length; i++){
            output[i] = list.get(i);
        }
        return output;
    }

    public static Boolean isDivide(String a, String b){
        if(a.equals("")){
            return true;
        }
        int times = (b.length()) / a.length();
        StringBuilder tmp = new StringBuilder(a);
        times--;
        while(times > 0){
            tmp.append(a);
            times--;
        }
        return tmp.toString().equals(b);
    }

    public static String gcdOfStrings(String str1, String str2){
        String ans = "";
        String prev = "";
        for(int i = 0; i < str2.length(); i++){
            ans += str2.charAt(i);
            if(isDivide(ans, str1) && isDivide(ans, str2)){
                prev = ans;
            }
        }
        return prev;
    }

    public static int[][] indexPairs(String text, String[] words){
        List<int[]> store = new ArrayList<>();
        List<String> dictionary = new ArrayList<>(Arrays.asList(words));
        for(int i = 0; i < text.length(); i++){
            for(int j = i; j <= text.length(); j++){
                String cur = text.substring(i, j);
                if(dictionary.contains(cur)){
                    store.add(new int[]{i, j - 1});
                }
            }
        }
        int[][] ans = new int[store.size()][2];
        for(int i = 0; i < ans.length; i++){
            ans[i] = store.get(i);
        }
        return ans;
    }

    public static int fixedPoint(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    public static boolean confusingNumber(int N){
        String n = N + "";
        int i = 0, j = n.length() - 1;
        char[] num = n.toCharArray();
        while(j >= i){
            char cur = n.charAt(i), curj = n.charAt(j);
            if(cur == '2' || cur == '3' || cur == '4' || cur == '5' || cur == '7' || curj == '2' || curj == '3'
                    || curj == '4' || curj == '5' || curj == '7'){
                return false;
            }
            char temp = (num[j] == '6' || num[j] == '9') ? (num[j] == '6') ? '9' : '6' : num[j];
            num[j] = (num[i] == '6' || num[i] == '9') ? (num[i] == '6') ? '9' : '6' : num[i];
            num[i] = temp;
            i++;
            j--;
        }
        return Integer.parseInt(new String(num)) != N;
    }

    public static int heightChecker(int[] heights){
        int count = 0;
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        Arrays.sort(expected);
        for(int i = 0; i < heights.length; i++){
            count += heights[i] != expected[i] ? 1 : 0;
        }
        return count;
    }

    public static String removeDuplicates(String S){
        if(S.length() < 2){
            return S;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(S.charAt(0));
        for(int i = 1; i < S.length(); i++){
            if(!stack.isEmpty() && stack.peek() == S.charAt(i)){
                stack.pop();
            } else{
                stack.push(S.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static int lastStoneWeight(int[] stones){
        if(stones.length == 1){
            return stones[0];
        }
        for(int i = 0; i < stones.length; i++){
            Arrays.sort(stones);
            if(stones[stones.length - 1] >= stones[stones.length - 2]){
                int cur = stones[stones.length - 2];
                stones[stones.length - 2] = 0;
                stones[stones.length - 1] -= cur;
            }
        }
        return stones[stones.length - 1];
    }

    public static int[] numMovesStones(int a, int b, int c){
        int[] s = {a, b, c};
        Arrays.sort(s);
        if(s[2] - s[0] == 2){
            return new int[]{0, 0};
        }
        return new int[]{Math.min(s[1] - s[0], s[2] - s[1]) <= 2 ? 1 : 2, s[2] - s[0] - 2};
    }

    public static boolean isBoomerang(int[][] points){
        Set<int[]> set = new HashSet<>();
        Collections.addAll(set, points);
        return !collinear(points[0][0], points[0][1], points[1][0], points[1][1], points[2][0], points[2][1])
                && set.size() == 3;
    }

    private static boolean collinear(int x1, int y1, int x2, int y2, int x3, int y3){
        return x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) == 0;
    }

    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0){
        int[][] origin = new int[R * C][2];
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                origin[i * C + j] = new int[]{i, j};
            }
        }
        Arrays.sort(origin, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return Math.abs(a[0] - r0) + Math.abs(a[1] - c0) - Math.abs(b[0] - r0) - Math.abs(b[1] - c0);
            }
        });
        return origin;
    }

    public static boolean divisorGame(int n){
        return n % 2 == 0;
    }

    public static int sumRootToLeaf(TreeNode root){
        return sumRootToLeaf_Traversal(root, 0);
    }

    private static int sumRootToLeaf_Traversal(TreeNode node, int value){
        if(node == null)
            return 0;
        value = value * 2 + node.val;
        if(node.left == null && node.right == null){
            return value;
        }
        return sumRootToLeaf_Traversal(node.left, value) + sumRootToLeaf_Traversal(node.right, value);
    }

    public static String removeOuterParentheses(String S){
        StringBuilder SB = new StringBuilder();
        int currDepth = 0;
        for(char curr : S.toCharArray()){
            if(curr == '(' && (currDepth += 1) > 1){
                SB.append(curr);
            }
            if(curr == ')' && (currDepth -= 1) >= 1){
                SB.append(curr);
            }
        }
        return SB.toString();
    }

    public static List<Boolean> prefixesDivBy5(int[] A){
        List<Boolean> result = new ArrayList<>();
        int s = 0;
        for(int i : A){
            result.add((s = (s * 2 + i) % 5) == 0);
        }
        return result;
    }

    public static boolean canThreePartsEqualSum(int[] A){
        int sum = Arrays.stream(A).sum();
        if(sum % 3 != 0){
            return false;
        }
        int each = sum / 3, temp = 0, found = 0;
        for(int j : A){
            temp += j;
            if(temp == each){
                temp = 0;
                found++;
            }
        }
        return found >= 3;
    }

    public static int bitwiseComplement(int N){
        String n = Integer.toBinaryString(N), comp = "";
        for(char c : n.toCharArray()){
            comp += c == '1' ? '0' : '1';
        }
        return Integer.parseInt(comp, 2);
    }

    public static int sumBase(int n, int k){
        String base_k = sumBase_baseConversion(Integer.toString(n), k);
        int ans = 0;
        for(char c : base_k.toCharArray()){
            ans += Integer.parseInt(Character.toString(c));
        }
        return ans;
    }

    private static String sumBase_baseConversion(String number, int dBase){
        return Integer.toString(Integer.parseInt(number, 10), dBase);
    }

    public static int largestSumAfterKNegations(int[] A, int K){
        for(int i = 0; i < K; i++){
            int min = largestSumAfterKNegations_findMin(A);
            largestSumAfterKNegations_modify(A, min);
        }
        int ans = 0;
        for(int i : A){
            ans += i;
        }
        return ans;
    }

    private static int largestSumAfterKNegations_findMin(int[] A){
        int min = Integer.MAX_VALUE;
        for(int i : A){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    private static void largestSumAfterKNegations_modify(int[] A, int integer){
        for(int i = 0; i < A.length; i++){
            if(A[i] == integer){
                A[i] = -A[i];
                return;
            }
        }
    }

    public static List<String> commonChars(String[] A){
        List<String> ans = new ArrayList<>();
        if(A.length == 0){
            return ans;
        }
        String common = A[0];
        for(String s : A){
            List<Character> list = new ArrayList<>();
            for(char c : s.toCharArray()){
                list.add(c);
            }
            for(char c : common.toCharArray()){
                if(!list.contains(c)){
                    common = commonChars_DeleteChars(common, c);
                } else{
                    list.remove(c);
                }
            }
        }
        for(char c : common.toCharArray()){
            ans.add(Character.toString(c));
        }
        return ans;
    }

    private static String commonChars_DeleteChars(String s, char c){
        boolean remove = true;
        String ans = "";
        for(char ch : s.toCharArray()){
            if(ch == c){
                if(remove){
                    remove = false;
                } else{
                    ans += ch;
                }
            } else{
                ans += ch;
            }
        }
        return ans;
    }

    public static int findJudge(int N, int[][] trust){
        if(trust.length < N - 1){
            return -1;
        }
        int[] trustScores = new int[N + 1];
        for(int[] relation : trust){
            trustScores[relation[0]]--;
            trustScores[relation[1]]++;
        }
        for(int i = 1; i <= N; i++){
            if(trustScores[i] == N - 1){
                return i;
            }
        }
        return -1;
    }

    public static boolean isCousins(TreeNode root, int x, int y){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            boolean siblings = false;
            boolean cousins = false;
            int nodesAtDepth = queue.size();
            for(int i = 0; i < nodesAtDepth; i++){
                TreeNode node = queue.remove();
                if(node == null){
                    siblings = false;
                } else{
                    if(node.val == x || node.val == y){
                        if(!cousins){
                            siblings = cousins = true;
                        } else{
                            return !siblings;
                        }
                    }
                    if(node.left != null)
                        queue.add(node.left);
                    if(node.right != null)
                        queue.add(node.right);
                    queue.add(null);
                }
            }
            if(cousins){
                return false;
            }
        }
        return false;
    }

    public static List<Integer> addToArrayForm(int[] num, int k){
        int N = num.length, cur = k;
        List<Integer> ans = new ArrayList<>();
        int i = N;
        while(--i >= 0 || cur > 0){
            if(i >= 0){
                cur += num[i];
            }
            ans.add(cur % 10);
            cur /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries){
        int sum = 0;
        for(int i : A){
            sum += i % 2 == 0 ? i : 0;
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i < ans.length; i++){
            int val = queries[i][0], index = queries[i][1];
            if(A[index] % 2 == 0){
                sum -= A[index];
            }
            A[index] += val;
            if(A[index] % 2 == 0){
                sum += A[index];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static int[] sortedSquares(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int largestPerimeter(int[] nums){
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 2; i--){
            if(nums[i] < nums[i - 1] + nums[i - 2]){
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }

    public static boolean isUnivalTree(TreeNode root){
        if(root == null){
            return true;
        }
        Set<Integer> set = new HashSet<>();
        isUnivalTree_AddNode(root, set);
        return set.size() == 1;
    }

    private static void isUnivalTree_AddNode(TreeNode root, Set<Integer> set){
        if(root == null){
            return;
        }
        set.add(root.val);
        isUnivalTree_AddNode(root.left, set);
        isUnivalTree_AddNode(root.right, set);
    }

    public static int repeatedNTimes(int[] A){
        HashMap<Integer, Integer> map = new HashMap<>();
        int repeat = A.length / 2;
        for(int i : A){
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else{
                map.put(i, map.get(i) + 1);
            }
            if(map.get(i) == repeat){
                return i;
            }
        }
        return 0;
    }

    public static boolean isAlienSorted(String[] words, String order){
        if(words.length < 2){
            return true;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        isAlienSorted_SetOrder(order, map);
        for(int i = 1; i < words.length; i++){
            if(!isAlienSorted_isLexicographicalySort(words[i - 1], words[i], map)){
                return false;
            }
        }
        return true;
    }

    private static boolean isAlienSorted_isLexicographicalySort(String s1, String
            s2, HashMap<Character, Integer> map){
        int len = Math.min(s1.length(), s2.length());
        if(s1.substring(0, len).equals(s2.substring(0, len)) && s1.length() > s2.length()){
            return false;
        }
        for(int i = 0; i < len; i++){
            if(map.get(s2.charAt(i)) > map.get(s1.charAt(i))){
                return true;
            } else if(map.get(s2.charAt(i)).equals(map.get(s1.charAt(i)))){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    private static void isAlienSorted_SetOrder(String order, HashMap<Character, Integer> map){
        for(int i = 0; i < order.length(); i++){
            map.put(order.charAt(i), i);
        }
    }

    public static int minDeletionSize(String[] strs){
        String[] ans = new String[strs[0].length()];
        for(int i = 0; i < strs[0].length(); i++){
            String cur = "";
            for(String str : strs){
                cur += str.charAt(i);
            }
            ans[i] = cur;
        }
        int count = 0;
        for(String an : ans){
            if(!minDeletionSize_isSorted(an)){
                count++;
            }
        }
        return count;
    }

    private static boolean minDeletionSize_isSorted(String s){
        if(s.length() < 2){
            return true;
        }
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) < s.charAt(i - 1)){
                return false;
            }
        }
        return true;
    }

    public static int[] diStringMatch(String S){
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for(int i = 0; i < N; ++i){
            if(S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }
        ans[N] = lo;
        return ans;
    }

    public static boolean validMountainArray(int[] arr){
        if(arr.length < 3){
            return false;
        }
        int max = validMountainArray_getPeak(arr);
        if(arr[0] == max){
            return false;
        }
        int i = 1;
        while(i < arr.length && arr[i] != max){
            if(arr[i] <= arr[i - 1]){
                return false;
            }
            i++;
        }
        if(i == arr.length - 1){
            return false;
        }
        for(int j = i; j < arr.length - 1; j++){
            if(arr[j] <= arr[j + 1]){
                return false;
            }
        }
        return true;
    }

    private static int validMountainArray_getPeak(int[] arr){
        int i = Integer.MIN_VALUE;
        for(int k : arr){
            if(k > i){
                i = k;
            }
        }
        return i;
    }

    public static int rangeSumBST(TreeNode root, int low, int high){
        List<Integer> list = new ArrayList<>();
        rangeSumBST_preOrder(list, root);
        int ans = 0;
        for(Integer integer : list){
            if(integer >= low && integer <= high){
                ans += integer;
            }
        }
        return ans;
    }

    private static void rangeSumBST_preOrder(List<Integer> list, TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        rangeSumBST_preOrder(list, root.left);
        rangeSumBST_preOrder(list, root.right);
    }

    public static String[] reorderLogFiles(String[] logs){
        Comparator<String> myComp = new Comparator<String>(){
            @Override
            public int compare(String log1, String log2){
                // split each log into two parts: <identifier, content>
                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);
                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
                // case 1). both logs are letter-logs
                if(!isDigit1 && !isDigit2){
                    // first compare the content
                    int cmp = split1[1].compareTo(split2[1]);
                    if(cmp != 0)
                        return cmp;
                    // logs of same content, compare the identifiers
                    return split1[0].compareTo(split2[0]);
                }
                // case 2). one of logs is digit-log
                if(!isDigit1 && isDigit2)
                    // the letter-log comes before digit-logs
                    return -1;
                else if(isDigit1 && !isDigit2)
                    return 1;
                else
                    // case 3). both logs are digit-log
                    return 0;
            }
        };
        Arrays.sort(logs, myComp);
        return logs;
    }

    public static int numUniqueEmails(String[] emails){
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String s : emails){
            boolean end_loop = true;
            boolean include = false;
            for(int i = 0; i < s.length(); i++){
                char cur = s.charAt(i);
                if(cur == '.' && include){
                    sb.append(cur);
                } else if(cur == '@'){
                    end_loop = false;
                    include = true;
                    sb.append(cur);
                } else if(cur == '+' && end_loop){
                    int j = i;
                    while(s.charAt(j) != '@'){
                        j++;
                    }
                    while(j < s.length()){
                        sb.append(s.charAt(j));
                        j++;
                    }
                    break;
                } else{
                    if(cur != '.'){
                        sb.append(cur);
                    }
                }
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }

    public static boolean isLongPressedName(String name, String typed){
        Stack<Character> name_stack = new Stack<>(), typed_stack = new Stack<>();
        for(char c : name.toCharArray()){
            name_stack.push(c);
        }
        for(char c : typed.toCharArray()){
            typed_stack.push(c);
        }
        char last_pop_type = ' ';
        while(!name_stack.isEmpty() && !typed_stack.isEmpty()){
            char cur_name = name_stack.peek(), cur_type = typed_stack.peek();
            if(cur_name == cur_type){
                name_stack.pop();
                last_pop_type = typed_stack.pop();
            } else{
                if(cur_type != last_pop_type){
                    return false;
                }
                while(cur_type == last_pop_type){
                    last_pop_type = typed_stack.pop();
                    cur_type = typed_stack.peek();
                }
                if(cur_type != cur_name){
                    return false;
                }
            }
        }
        while(!typed_stack.isEmpty()){
            char cur = typed_stack.peek();
            if(last_pop_type != cur){
                return false;
            }
            last_pop_type = typed_stack.pop();
        }
        return name_stack.isEmpty();
    }

    public static int[] sortArrayByParityII(int[] nums){
        List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
        for(int i : nums){
            if(i % 2 == 0){
                even.add(i);
            } else{
                odd.add(i);
            }
        }
        int e = 0, o = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = even.get(e);
                e++;
            } else{
                nums[i] = odd.get(o);
                o++;
            }
        }
        return nums;
    }

    public static HashMap<Integer, String> probability_distribution(int t, HashMap<Integer, String> map){
        HashMap<Integer, String> ans = new HashMap<>();
        for(int i = 1; i <= 6; i++){
            if(i <= t){
                ans.put(i, "0.00");
            } else{
                ans.put(i, map.get(i));
            }
        }
        int sum = 0;
        for(int i = 0; i < map.size(); i++){
            if(i + 1 <= t){
                sum += Integer.parseInt(map.get(i));
            }
        }
        int part = sum / (6 - t);
        for(int i = t + 1; i < ans.size(); i++){
            ans.put(i, ans.get(i) + part);
        }
        return ans;
    }

    public static String reverseOnlyLetters(String S){
        Stack<Character> letters = new Stack();
        for(char c : S.toCharArray())
            if(Character.isLetter(c))
                letters.push(c);
        StringBuilder ans = new StringBuilder();
        for(char c : S.toCharArray()){
            if(Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }
        return ans.toString();
    }

    public static boolean hasGroupsSizeX(int[] deck){
        int N = deck.length;
        int[] count = new int[10000];
        for(int c : deck)
            count[c]++;
        List<Integer> values = new ArrayList<>();
        for(int i = 0; i < 10000; ++i)
            if(count[i] > 0)
                values.add(count[i]);
        search:
        for(int X = 2; X <= N; ++X)
            if(N % X == 0){
                for(int v : values)
                    if(v % X != 0)
                        continue search;
                return true;
            }
        return false;
    }

    public static int smallestRangeI(int[] A, int K){
        int min = A[0], max = A[0];
        for(int i : A){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return Math.max(0, max - min - 2 * K);
    }

    public static int[] sortArrayByParity(int[] A){
        List<Integer> Even = new ArrayList<>(), Odd = new ArrayList<>();
        for(int i : A){
            if(i % 2 == 0){
                Even.add(i);
            } else{
                Odd.add(i);
            }
        }
        for(int i = 0; i < Even.size(); i++){
            A[i] = Even.get(i);
        }
        int j = 0;
        for(int i = Even.size(); i < A.length; i++){
            A[i] = Odd.get(j);
            j++;
        }
        return A;
    }

    public static TreeNode increasingBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        increasingBST_inOrder(root, list);
        TreeNode ans = new TreeNode(list.get(0)), cur = ans;
        for(int i : list){
            cur.right = new TreeNode(i);
            cur = cur.right;
        }
        return ans.right;
    }

    private static void increasingBST_inOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        increasingBST_inOrder(root.left, list);
        list.add(root.val);
        increasingBST_inOrder(root.right, list);
    }

    public static boolean isMonotonic(int[] A){
        return isMonotonic_increase(A) || isMonotonic_decrease(A);
    }

    public static int numSpecialEquivGroups(String[] A){
        Set<String> seen = new HashSet<>();
        for(String s : A){
            int[] count = new int[52];
            for(int i = 0; i < s.length(); i++){
                count[s.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            seen.add(Arrays.toString(count));
        }
        return seen.size();
    }

    public static int surfaceArea(int[][] grid){
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        int N = grid.length;
        int ans = 0;
        for(int r = 0; r < N; ++r)
            for(int c = 0; c < N; ++c)
                if(grid[r][c] > 0){
                    ans += 2;
                    for(int k = 0; k < 4; ++k){
                        int nr = r + dr[k];
                        int nc = c + dc[k];
                        int nv = 0;
                        if(0 <= nr && nr < N && 0 <= nc && nc < N)
                            nv = grid[nr][nc];
                        ans += Math.max(grid[r][c] - nv, 0);
                    }
                }
        return ans;
    }

    public static int[] fairCandySwap(int[] A, int[] B){
        int a = 0, b = 0;
        for(int i : A){
            a += i;
        }
        for(int i : B){
            b += i;
        }
        int delta = (b - a) / 2;
        Set<Integer> setB = new HashSet<>();
        for(int i : B){
            setB.add(i);
        }
        for(int i : A){
            if(setB.contains(i + delta)){
                return new int[]{i, i + delta};
            }
        }
        throw null;
    }

    public static String[] uncommonFromSentences(String A, String B){
        String[] a = A.split("\\s+");
        String[] b = B.split("\\s+");
        HashMap<String, Integer> adup = new HashMap<>();
        HashMap<String, Integer> bdup = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(String s : a){
            if(adup.containsKey(s)){
                adup.put(s, adup.get(s) + 1);
            } else{
                adup.put(s, 1);
            }
        }
        for(String s : b){
            if(bdup.containsKey(s)){
                bdup.put(s, bdup.get(s) + 1);
            } else{
                bdup.put(s, 1);
            }
        }
        for(String s : a){
            if(adup.get(s) == 1 && !bdup.containsKey(s) && !ans.contains(s)){
                ans.add(s);
            }
        }
        for(String s : b){
            if(bdup.get(s) == 1 && !adup.containsKey(s) && !ans.contains(s)){
                ans.add(s);
            }
        }
        String[] final_ans = new String[ans.size()];
        for(int i = 0; i < final_ans.length; i++){
            final_ans[i] = ans.get(i);
        }
        return final_ans;
    }

    public static int projectionArea(int[][] grid){
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            int row = 0;
            int col = 0;
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] > 0){
                    count++;
                }
                row = Math.max(row, grid[i][j]);
                col = Math.max(col, grid[j][i]);
            }
            count += row + col;
        }
        return count;
    }

    public static ListNode middleNode(ListNode head){
        List<ListNode> list = new ArrayList<>();
        while(head != null){
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() / 2);
    }

    public static int robotSim(int[] commands, int[][] obstacles){
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, di = 0;
        // Encode obstacles (x, y) as (x+30000) * (2^16) + (y+30000)
        Set<Long> obstacleSet = new HashSet();
        for(int[] obstacle : obstacles){
            long ox = (long) obstacle[0] + 30000;
            long oy = (long) obstacle[1] + 30000;
            obstacleSet.add((ox << 16) + oy);
        }
        int ans = 0;
        for(int cmd : commands){
            if(cmd == -2) // left
                di = (di + 3) % 4;
            else if(cmd == -1) // right
                di = (di + 1) % 4;
            else{
                for(int k = 0; k < cmd; ++k){
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    long code = (((long) nx + 30000) << 16) + ((long) ny + 30000);
                    if(!obstacleSet.contains(code)){
                        x = nx;
                        y = ny;
                        ans = Math.max(ans, x * x + y * y);
                    }
                }
            }
        }
        return ans;
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2){
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        leafSimilar_loadLeaf(root1, l1);
        leafSimilar_loadLeaf(root2, l2);
        return l1.equals(l2);
    }

    private static void leafSimilar_loadLeaf(TreeNode r, List<Integer> list){
        if(r != null){
            if(r.left == null && r.right == null)
                list.add(r.val);
            leafSimilar_loadLeaf(r.left, list);
            leafSimilar_loadLeaf(r.right, list);
        }
    }

    public static int binaryGap(int n){
        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '1'){
                for(int j = i + 1; j < s.length(); j++){
                    if(s.charAt(j) == '1'){
                        count = Math.max(j - i, count);
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static int[][] transpose(int[][] matrix){
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < transpose.length; i++){
            for(int j = 0; j < transpose[i].length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    public static boolean lemonadeChange(int[] bills){
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;
            }
            if(bill == 10){
                ten++;
                five--;
            }
            if(bill == 20){
                twenty++;
                if(ten != 0){
                    ten--;
                    five--;
                } else{
                    five -= 3;
                }
            }
            if(five < 0 || ten < 0 || twenty < 0){
                return false;
            }
        }
        return true;
    }

    public static int peakIndexInMountainArray(int[] arr){
        int i = 0;
        while(arr[i] < arr[i + 1]){
            i++;
        }
        return i;
    }

    public static boolean backspaceCompare(String S, String T){
        String s = backspaceCompare_Trim(S);
        String t = backspaceCompare_Trim(T);
        return s.equals(t);
    }

    private static String backspaceCompare_Trim(String S){
        String s = "";
        for(int i = 0; i < S.length(); i++){
            if(!Character.toString(S.charAt(i)).equals("#")){
                s += Character.toString(S.charAt(i));
            } else{
                if(s.length() != 0){
                    s = s.substring(0, s.length() - 1);
                }
            }
        }
        return s;
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2){
        if(rec1[0] == rec1[2] || rec1[1] == rec1[3] || rec2[0] == rec2[2] || rec2[1] == rec2[3]){
            return false;
        }
        return !(rec1[2] <= rec2[0] || rec1[3] <= rec2[1] || rec1[0] >= rec2[2] || rec1[1] >= rec2[3]);
    }

    public static int[][] flipAndInvertImage(int[][] image){
        for(int[] ints : image){
            flipAndInvertImage_flip(ints);
            flipAndInvertImage_Invert(ints);
        }
        return image;
    }

    private static void flipAndInvertImage_flip(int[] image){
        int i = 0;
        int j = image.length - 1;
        while(j >= i){
            int cur = image[i];
            image[i] = image[j];
            image[j] = cur;
            i++;
            j--;
        }
    }

    private static void flipAndInvertImage_Invert(int[] image){
        for(int i = 0; i < image.length; i++){
            image[i] = image[i] == 0 ? 1 : 0;
        }
    }

    public static List<List<Integer>> largeGroupPositions(String s){
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        for(int j = 0; j < s.length(); j++){
            if(j == s.length() - 1 || s.charAt(j) != s.charAt(j + 1)){
                if(j - i + 1 >= 3){
                    ans.add(Arrays.asList(i, j));
                }
                i = j + 1;
            }
        }
        return ans;
    }

    public static String toGoatLatin(String S){
        String[] word = S.split("\\s+");
        String sb = "";
        int round = 1;
        for(int i = 0; i < word.length; i++){
            if(toGoatLatin_isVowel(Character.toLowerCase(word[i].charAt(0)))){
                sb += word[i];
                sb += "ma";
                for(int j = 0; j < round; j++){
                    sb += "a";
                }
            } else{
                sb += word[i].substring(1);
                sb += Character.toString(word[i].charAt(0));
                sb += "ma";
                for(int j = 0; j < round; j++){
                    sb += "a";
                }
            }
            sb += i == word.length - 1 ? "" : " ";
            round++;
        }
        return sb;
    }

    private static boolean toGoatLatin_isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static String mostCommonWord(String paragraph, String[] banned){
        HashSet<String> ban = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String[] words = normalizedStr.split("\\s+");
        Collections.addAll(ban, banned);
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String ans = "";
        int freq = 0;
        for(String s : words){
            if(map.get(s) > freq && !ban.contains(s)){
                ans = s;
                freq = map.get(s);
            }
        }
        return ans;
    }

    public static double largestTriangleArea(int[][] points){
        int N = points.length;
        double ans = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                for(int k = j + 1; k < N; k++){
                    ans = Math.max(ans, area(points[i], points[j], points[k]));
                }
            }
        }
        return ans;
    }

    private static double area(int[] P, int[] Q, int[] R){
        return 0.5 * Math.abs(P[0] * Q[1] + Q[0] * R[1] + R[0] * P[1] - P[1] * Q[0] - Q[1] * R[0] - R[1] * P[0]);
    }

    public static List<String> subdomainVisits(String[] cpdomains){
        Map<String, Integer> counts = new HashMap();
        for(String domain : cpdomains){
            String[] cpinfo = domain.split("\\s+");
            String[] frags = cpinfo[1].split("\\.");
            int count = Integer.valueOf(cpinfo[0]);
            String cur = "";
            for(int i = frags.length - 1; i >= 0; --i){
                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                counts.put(cur, counts.getOrDefault(cur, 0) + count);
            }
        }
        List<String> ans = new ArrayList();
        for(String dom : counts.keySet())
            ans.add("" + counts.get(dom) + " " + dom);
        return ans;
    }

    public static int[] numberOfLines(int[] widths, String S){
        int lines = 1, width = 0;
        for(char c : S.toCharArray()){
            int w = widths[c - 'a'];
            width += w;
            if(width > 100){
                lines++;
                width = w;
            }
        }
        return new int[]{lines, width};
    }

    public static int uniqueMorseRepresentations(String[] words){
        String[] code = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for(String s : words){
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()){
                sb.append(code[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static boolean rotateString(String A, String B){
        if(A.equals(B)){
            return true;
        }
        if(A.equals("")){
            return false;
        }
        String s = A.substring(1) + A.charAt(0);
        while(!s.equals(A)){
            if(s.equals(B)){
                return true;
            }
            s = s.substring(1) + s.charAt(0);
        }
        return false;
    }

    public static int rotatedDigits(int N){
        int count = 0;
        for(int i = 0; i <= N; i++){
            if(rotatedDigitsisGood(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean rotatedDigitsisGood(int n){
        Map<String, String> map = new HashMap<>();
        map.put("0", "0");
        map.put("1", "1");
        map.put("2", "5");
        map.put("5", "2");
        map.put("6", "9");
        map.put("8", "8");
        map.put("9", "6");
        String s = Integer.toString(n);
        String rotate = "";
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(Character.toString(s.charAt(i)))){
                return false;
            }
            rotate += map.get(Character.toString(s.charAt(i)));
        }
        return !rotate.equals(s);
    }

    public static int minDiffInBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        minDiffInBSTPreOrder(root, list);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i + 1 < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                int diff = Math.abs(list.get(j) - list.get(i));
                min = Math.min(min, diff);
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    private static void minDiffInBSTPreOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        minDiffInBSTPreOrder(root.left, list);
        minDiffInBSTPreOrder(root.right, list);
    }

    public static int numJewelsInStones(String jewels, String stones){
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char c : jewels.toCharArray()){
            set.add(c);
        }
        for(char c : stones.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }

    public static boolean isToeplitzMatrix(int[][] matrix){
        int i = 0;
        int j = 0;
        while(i < matrix.length){
            while(j < matrix[i].length){
                try{
                    if(matrix[i][j] != matrix[i + 1][j + 1]){
                        return false;
                    }
                    j++;
                } catch(Exception e){
                    break;
                }
            }
            i++;
            j = 0;
        }
        return true;
    }

    public static int[] anagramMappings(int[] A, int[] B){
        int[] P = new int[A.length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(B[j] == A[i]){
                    P[i] = j;
                }
            }
        }
        return P;
    }

    public static String shortestCompletingWord(String licensePlate, String[] words){
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            boolean fit = true;
            List<Character> list = new ArrayList<>();
            for(char c : words[i].toCharArray()){
                list.add(c);
            }
            for(int j = 0; j < licensePlate.length(); j++){
                char curr = licensePlate.charAt(j);
                if(Character.isLetter(curr)){
                    curr = Character.toLowerCase(curr);
                    if(list.contains(curr)){
                        list.remove(curr);
                    } else{
                        fit = false;
                    }
                }
            }
            if(fit){
                ans.add(words[i]);
            }
        }
        int len = Integer.MAX_VALUE;
        String final_ans = "";
        for(int i = 0; i < ans.size(); i++){
            if(len > ans.get(i).length()){
                len = ans.get(i).length();
                final_ans = ans.get(i);
            }
        }
        return final_ans;
    }

    public static int dominantIndex(int[] nums){
        int[] arr = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, arr.length);
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                index = i;
            }
            if(2 * nums[i] > max && nums[i] != max){
                return -1;
            }
        }
        return index;
    }

    public static char nextGreatestLetter(char[] letters, char target){
        int num = Integer.MAX_VALUE;
        Arrays.sort(letters);
        for(char letter : letters){
            if(letter > target){
                return letter;
            }
        }
        return letters[0];
    }

    public static boolean areSentencesSimilar(String[] sentence1, String[]
            sentence2, List<List<String>> similarPairs){
        if(sentence1.length != sentence2.length){
            return false;
        }
        HashSet<String> set = new HashSet<>();
        for(List<String> pair : similarPairs){
            set.add(pair.get(0) + "#" + pair.get(1));
        }
        for(int i = 0; i < sentence1.length; i++){
            if(!sentence1[i].equals(sentence2[i]) && !set.contains(sentence1[i] + "#" + sentence2[i])
                    && !set.contains(sentence2[i] + "#" + sentence1[i])){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> unionSortedSet(int[] A, int[] B){
        Set<Integer> set = new HashSet<>();
        int m = A.length;
        int n = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(A[i] <= B[j]){
                if(!set.contains(A[i])){
                    list.add(A[i]);
                    set.add(A[i]);
                }
                i++;
            } else{
                if(!set.contains(B[j])){
                    list.add(B[j]);
                    set.add(B[j]);
                }
                j++;
            }
        }
        if(i != A.length - 1){
            for(int l = i; l < A.length; l++){
                if(!set.contains(A[l])){
                    list.add(A[l]);
                    set.add(A[l]);
                }
            }
        }
        if(j != B.length - 1){
            for(int l = j; l < B.length; l++){
                if(!set.contains(B[l])){
                    list.add(B[l]);
                    set.add(B[l]);
                }
            }
        }
        return list;
    }

    public static int CS3340SampleMidterm_next(String s){
        int max = 0;
        for(int i = 2; i <= s.length(); i++){
            for(int j = 1; j < i - 1; j++){
                String si = "";
                String sj = "";
                for(int l = 0; l < j; l++){
                    si += Character.toString(s.charAt(l));
                    sj += Character.toString(s.charAt(i - j - 1));
                }
                // System.out.println("si: " + si);
                // System.out.println("sj: " + sj);
                // System.out.println("----------------------");
                if(si.equals(sj)){
                    max = j;
                }
            }
        }
        return max == 0 ? 0 : max + 1;
    }

    public static void CS3340SampleMidterm_min(int[][] matrix, char[] a, char[] b){
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                int r = (a[i - 1] == b[j - 1]) ? 0 : 1;
                int m = Math.min(matrix[i - 1][j] + 1, matrix[i][j - 1] + 1);
                m = Math.min(m, matrix[i - 1][j - 1] + r);
                matrix[i][j] = m;
            }
        }
    }

    public static List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isSelfDividing(int num){
        if(num < 1){
            return false;
        }
        for(int i = 1; i <= num; i++){
            String s = Integer.toString(num);
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '0'){
                    return false;
                }
                if(num % Integer.parseInt(Character.toString(s.charAt(j))) != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int pivotIndex(int[] nums){
        int sum = 0, leftsum = 0;
        for(int x : nums){
            sum += x;
        }
        for(int i = 0; i < nums.length; i++){
            if(leftsum == sum - leftsum - nums[i]){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static String toLowerCase(String str){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            s.append(Character.toLowerCase(str.charAt(i)));
        }
        return s.toString();
    }

    public static int findLengthOfLCIS(int[] nums){
        if(nums.length < 1){
            return 0;
        }
        int j = 1;
        int count = 0;
        int cur = 1;
        while(j < nums.length){
            if(nums[j] > nums[j - 1]){
                cur++;
                j++;
            } else{
                count = Math.max(cur, count);
                cur = 1;
                j++;
            }
        }
        return Math.max(cur, count);
    }

    public static int findSecondMinimumValue(TreeNode root){
        HashSet<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<>();
        findSecondMinimumValuePost(set, root);
        for(int i : set){
            list.add(i);
        }
        Collections.sort(list);
        if(set.size() < 2){
            return -1;
        }
        return list.get(1);
    }

    private static void findSecondMinimumValuePost(HashSet<Integer> set, TreeNode root){
        if(root == null){
            return;
        }
        findSecondMinimumValuePost(set, root.left);
        set.add(root.val);
        findSecondMinimumValuePost(set, root.right);
    }

    public static boolean judgeCircle(String moves){
        int[] m = {0, 0};
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                m[0]--;
            }
            if(moves.charAt(i) == 'D'){
                m[0]++;
            }
            if(moves.charAt(i) == 'L'){
                m[1]--;
            }
            if(moves.charAt(i) == 'R'){
                m[1]++;
            }
        }
        return m[0] == 0 && m[1] == 0;
    }

    public static int[][] imageSmoother(int[][] M){
        int R = M.length, C = M[0].length;
        int[][] ans = new int[R][C];
        for(int r = 0; r < R; ++r)
            for(int c = 0; c < C; ++c){
                int count = 0;
                for(int nr = r - 1; nr <= r + 1; ++nr)
                    for(int nc = c - 1; nc <= c + 1; ++nc){
                        if(0 <= nr && nr < R && 0 <= nc && nc < C){
                            ans[r][c] += M[nr][nc];
                            count++;
                        }
                    }
                ans[r][c] /= count;
            }
        return ans;
    }

    public static boolean findTarget(TreeNode root, int k){
        List<Integer> l = new ArrayList<>();
        findTargetinorder(root, l);
        for(int i = 0; i < l.size(); i++){
            for(int j = i + 1; j < l.size(); j++){
                if(l.get(i) + l.get(j) == k){
                    return true;
                }
            }
        }
        return false;
    }

    private static void findTargetinorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        findTargetinorder(root.left, list);
        list.add(root.val);
        findTargetinorder(root.right, list);
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        root1.val += root2.val;
        mergeTrees(root1.left, root2.left);
        mergeTrees(root1.right, root2.right);
        return root1;
    }

    public static int distributeCandies(int[] candyType){
        int canEat = candyType.length / 2, type = numOfTypeCandy(candyType);
        return Math.min(type, canEat);
    }

    private static int numOfTypeCandy(int[] c){
        HashSet<Integer> type = new HashSet<>();
        for(int i = 0; i < c.length; i++){
            type.add(c[i]);
        }
        return type.size();
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c){
        if(r * c != nums.length * nums[0].length){
            return nums;
        }
        int[] element = new int[r * c];
        int[][] matrix = new int[r][c];
        int k = 0, e = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                element[k] = nums[i][j];
                k++;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = element[e];
                e++;
            }
        }
        return matrix;
    }

    public static int arrayPairSum(int[] nums){
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }

    public static String reverseWords(String s){
        String[] word = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length; i++){
            for(int j = word[i].length() - 1; j >= 0; j--){
                sb.append(word[i].charAt(j));
            }
            if(i != word.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static boolean checkRecord(String s){
        int A = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                A++;
            }
        }
        return A <= 1 && s.indexOf("LLL") < 0;
    }

    public static int findLUSlength(String a, String b){
        if(a.equals(b)){
            return -1;
        }
        return Math.max(a.length(), b.length());
    }

    public static String[] findRelativeRanks(int[] score){
        String[] result = new String[score.length];
        if(score.length <= 3){
            if(score.length == 1){
                result[0] = "Gold Medal";
            }
            if(score.length == 2){
                if(score[0] > score[1]){
                    result[0] = "Gold Medal";
                    result[1] = "Silver Medal";
                }
                result[0] = "Silver Medal";
                result[1] = "Gold Medal";
            }
            if(score.length == 3){
                if(score[0] > score[1] && score[1] > score[2]){
                    result[0] = "Gold Medal";
                    result[1] = "Silver Medal";
                    result[2] = "Bronze Medal";
                } else if(score[2] > score[1] && score[1] > score[0]){
                    result[2] = "Gold Medal";
                    result[1] = "Silver Medal";
                    result[0] = "Bronze Medal";
                } else{
                    result[1] = "Gold Medal";
                    result[0] = "Silver Medal";
                    result[2] = "Bronze Medal";
                }
            }
            return result;
        }
        int[] sortedScore = new int[score.length];
        for(int i = 0; i < score.length; i++){
            sortedScore[i] = score[i];
        }
        Arrays.sort(sortedScore);
        HashMap<Integer, String> map = new HashMap<>();
        int i = sortedScore.length - 1;
        map.put(sortedScore[i], "Gold Medal");
        i--;
        map.put(sortedScore[i], "Silver Medal");
        i--;
        map.put(sortedScore[i], "Bronze Medal");
        int place = 4;
        for(int j = sortedScore.length - 4; j >= 0; j--){
            map.put(sortedScore[j], Integer.toString(place));
            place++;
        }
        for(int j = 0; j < score.length; j++){
            result[j] = map.get(score[j]);
        }
        return result;
    }

    public static void printCharArray(char[] c){
        for(char value : c){
            System.out.println(value);
        }
    }

    public static void printStringArray(String[] c){
        for(String s : c){
            System.out.println(s);
        }
    }

    public static void printIntArray(int[] a){
        for(int j : a){
            System.out.println(j);
        }
    }

    public static boolean detectCapitalUse(String word){
        if(word.length() == 0){
            return false;
        }
        if(word.length() == 1){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            if(Character.isUpperCase(word.charAt(1))){
                for(int i = 0; i < word.length(); i++){
                    if(!Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
                return true;
            }
            if(Character.isLowerCase(word.charAt(1))){
                for(int i = 1; i < word.length(); i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
                return true;
            }
        } else{
            for(int i = 0; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static String licenseKeyFormatting(String s, int k){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--)
            if(s.charAt(i) != '-')
                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
        return sb.reverse().toString().toUpperCase();
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int max = 0, cur = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cur++;
            } else{
                max = Math.max(cur, max);
                cur = 0;
            }
        }
        return Math.max(cur, max);
    }

    public static int islandPerimeter(int[][] grid){
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    continue;
                } else{
                    if(checkLeft(i, j, grid)){
                        count++;
                    }
                    if(checkRight(i, j, grid)){
                        count++;
                    }
                    if(checkUp(i, j, grid)){
                        count++;
                    }
                    if(checkDown(i, j, grid)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean checkLeft(int i, int j, int[][] grid){
        if(j == 0){
            return true;
        }
        return grid[i][j - 1] == 0;
    }

    private static boolean checkRight(int i, int j, int[][] grid){
        if(j == grid[i].length - 1){
            return true;
        } else
            return grid[i][j + 1] == 0;
    }

    private static boolean checkUp(int i, int j, int[][] grid){
        if(i == 0){
            return true;
        } else
            return grid[i - 1][j] == 0;
    }

    private static boolean checkDown(int i, int j, int[][] grid){
        if(i == grid.length - 1){
            return true;
        } else
            return grid[i + 1][j] == 0;
    }

    public static void countSort(int[] A, int[] B){
        int k = Arrays.stream(A).max().getAsInt();
        int[] C = new int[k + 1];
        for(int i = 0; i <= k; i++){
            C[i] = 0;
        }
        for(int i = 1; i <= A.length; i++){
            C[A[i - 1]] += 1;
        }
        for(int i = 1; i <= k; i++){
            C[i] += C[i - 1];
        }
        for(int i = A.length - 1; i >= 0; i--){
            B[C[A[i]] - 1] = A[i];
            C[A[i]] -= 1;
        }
    }

    public static int findContentChildren(int[] g, int[] s){
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = 0; count < g.length && i < s.length; i++){
            if(s[i] >= g[count]){
                count++;
            }
        }
        return count;
    }

    public static int thirdMax(int[] nums){
        HashSet<Integer> Set = new HashSet<>();
        for(int i : nums){
            Set.add(i);
        }
        int max = Collections.max(Set);
        if(Set.size() < 3){
            return max;
        }
        Set.remove(max);
        int max2 = Collections.max(Set);
        Set.remove(max2);
        return Collections.max(Set);
    }

    public static List<String> fizzBuzz(int n){
        List<String> list = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            } else if(i % 3 == 0){
                list.add("Fizz");
            } else if(i % 5 == 0){
                list.add("Buzz");
            } else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public static int arrangeCoins(int n){
        int i = 0;
        while(n != 0){
            n -= i;
            if(n < i + 1){
                return i;
            }
            i++;
        }
        return 0;
    }

    public static int countSegments(String s){
        String str = s.trim();
        if(str.equals("")){
            return 0;
        }
        return str.split("\\s+").length;
    }

    public static boolean validWordSquare(List<String> words){
        for(int i = 0; i < words.size(); i++){
            StringBuilder col = new StringBuilder();
            for(int j = 0; j < words.get(i).length(); j++){
                try{
                    col.append(words.get(j).charAt(i));
                } catch(Exception e){
                    return false;
                }
            }
            if(!col.toString().equals(words.get(i))){
                return false;
            }
            col.setLength(0);
        }
        return true;
    }

    public static String addStrings(String num1, String num2){
        if(num1.length() > num2.length()){
            String num = Add_zero(num2, num1.length() - num2.length());
            num2 = num;
        }
        if(num2.length() > num1.length()){
            String num = Add_zero(num1, num2.length() - num1.length());
            num1 = num;
        }
        StringBuilder s = new StringBuilder();
        int i = num1.length() - 1;
        int carry = 0;
        while(i >= 0){
            int add = carry + Integer.parseInt(String.valueOf(num1.charAt(i)))
                    + Integer.parseInt(String.valueOf(num2.charAt(i)));
            carry = 0;
            if(add >= 10){
                carry = 1;
                add -= 10;
            }
            s.append(add);
            i--;
        }
        if(carry > 0){
            s.append(carry);
        }
        return s.reverse().toString();
    }

    private static String Add_zero(String num, int i){
        StringBuilder s = new StringBuilder();
        for(int j = 0; j < i; j++){
            s.append("0");
        }
        return s + num;
    }

    public static int longestPalindrome(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            } else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty())
            return count * 2 + 1;
        return count * 2;
    }

    public static boolean validWordAbbreviation(String word, String abbr){
        int i = 0, j = 0;
        while(i < word.length() && j < abbr.length()){
            if(word.charAt(i) == abbr.charAt(j)){
                ++j;
                ++i;
                continue;
            }
            if(abbr.charAt(j) <= '0' || abbr.charAt(j) > '9'){
                return false;
            }
            int start = j;
            while(j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9'){
                ++j;
            }
            int num = Integer.valueOf(abbr.substring(start, j));
            i += num;
        }
        return i == word.length() && j == abbr.length();
    }

    public static String toHex(int num){
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if(num == 0){
            return "0";
        }
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result;
            num = (num >>> 4);
        }
        return result;
    }

    public static boolean isSubsequence(String s, String t){
        if(s.length() > t.length()){
            return false;
        }
        Stack<Character> stacks = new Stack<>(), stackt = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            stacks.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++){
            stackt.add(t.charAt(i));
        }
        while(!stackt.isEmpty() && !stacks.isEmpty()){
            if(stacks.peek() == stackt.peek()){
                stacks.pop();
                stackt.pop();
            } else{
                stackt.pop();
            }
        }
        return (stacks.isEmpty());
    }

    public static char findTheDifference(String s, String t){
        char[] arr1 = s.toCharArray(), arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return arr2[i];
            }
        }
        return arr2[arr2.length - 1];
    }

    public static int firstUniqChar(String s){
        HashMap<Character, Integer> Map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            Map.put(s.charAt(i), Map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(Map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    private static Stack<Character> putOnStack(char[] c){
        Stack<Character> stack = new Stack<>();
        Arrays.sort(c);
        for(int i = 0; i < c.length; i++){
            stack.add(c[i]);
        }
        return stack;
    }

    public static boolean canConstruct(String ransomNote, String magazine){
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        char[] r = ransomNote.toCharArray(), m = magazine.toCharArray();
        Stack<Character> ranStack = putOnStack(r), magStack = putOnStack(m);
        while(!ranStack.isEmpty()){
            if(!ranStack.isEmpty() && magStack.isEmpty()){
                return false;
            } else if(magStack.peek() == ranStack.peek()){
                magStack.pop();
                ranStack.pop();
            } else if(magStack.peek() > ranStack.peek()){
                magStack.pop();
            } else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectSquare(int num){
        int square = (int) Math.sqrt(num);
        return (int) Math.pow(square, 2) == num;
    }

    public static int[] intersect(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(intersectionHelper(nums2, nums1[i])){
                list.add(nums1[i]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> Set = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            Set.add(nums2[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(Set.contains(nums1[i])){
                list.add(nums1[i]);
                Set.remove(nums1[i]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    private static boolean intersectionHelper(int[] num, int i){
        for(int j = 0; j < num.length; j++){
            if(num[j] == i){
                num[j] = -1;
                return true;
            }
        }
        return false;
    }

    public static String reverseVowels(String s){
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(j > i){
            char temp = ' ';
            if(isVowel(arr[i]) && isVowel(arr[j])){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            } else if(!isVowel(arr[j])){
                j--;
            } else{
                i++;
            }
        }
        return String.valueOf(arr);
    }

    private static boolean isVowel(char c){
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i = 0; i < arr.length; i++){
            if(c == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void reverseStringRedo(char[] s){
        int i = 0, j = s.length - 1;
        char temp;
        while(j > i){
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j--;
            i++;
        }
    }

    public static boolean isPowerOfFour(int n){
        if(n < 1){
            return false;
        }
        while(n % 4 == 0){
            n /= 4;
        }
        return n == 1;
    }

    public static boolean isPowerOfThree(int n){
        if(n < 1){
            return false;
        }
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }

    public static List<String> generatePossibleNextMoves(String s){
        List<String> moves = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == '+' && arr[i + 1] == '+'){
                arr[i] = '-';
                arr[i + 1] = '-';
                moves.add(String.valueOf(arr));
                arr[i] = '+';
                arr[i + 1] = '+';
            }
        }
        return moves;
    }

    public static boolean canWinNim(int n){
        return (n % 4 != 0);
    }

    public static void moveZeroes(int[] nums){
        int[] copy = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                copy[j] = nums[i];
                j++;
            }
        }
        while(j < copy.length){
            copy[j] = 0;
            j++;
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = copy[i];
        }
    }

    public static int numWays(int n, int k){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return k;
        }
        int[] paint = new int[n + 1];
        paint[1] = k;
        paint[2] = k * k;
        for(int i = 3; i <= n; i++){
            paint[i] = (paint[i - 1] + paint[i - 2]) * (k - 1);
        }
        return paint[n];
    }

    private static void inOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.right, list);
        list.add(root.val);
        inOrder(root.left, list);
    }

    public static int closestValue(TreeNode root, double target){
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        Stack<Integer> stack = new Stack<>();
        stack.add(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(Math.abs(stack.peek() - target) >= Math.abs(list.get(i) - target)){
                stack.pop();
                stack.add(list.get(i));
            }
        }
        return stack.peek();
    }

    public static int missingNumber(int[] nums){
        Arrays.sort(nums);
        if(nums[0] != 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0] + 1;
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] + 1 != nums[i + 1]){
                return nums[i] + 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }

    public static boolean canPermutePalindrome(String s){
        HashMap<Character, Integer> Map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Map.put(s.charAt(i), Map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for(char key : Map.keySet()){
            count += Map.get(key) % 2;
        }
        return count <= 1;
    }

    public static boolean isUgly(int num){
        if(num <= 0){
            return false;
        }
        while(num % 5 == 0){
            num /= 5;
        }
        while(num % 3 == 0){
            num /= 3;
        }
        while(num % 2 == 0){
            num /= 2;
        }
        return num == 1;
    }

    public static int addDigits(int num){
        int n = 0;
        while(num > 0){
            n += num % 10;
            num /= 10;
            if(num == 0 && n > 9){
                num = n;
                n = 0;
            }
        }
        return n;
    }

    public static List<String> binaryTreePaths(TreeNode root){
        List<String> list = new ArrayList<>();
        construct_path(root, "", list);
        return list;
    }

    private static void construct_path(TreeNode root, String s, List<String> list){
        if(root != null){
            s += Integer.toString(root.val);
            if(root.left == null && root.right == null){
                list.add(s);
            } else{
                s += "->";
                construct_path(root.left, s, list);
                construct_path(root.right, s, list);
            }
        }
    }

    public static boolean canAttendMeetings(int[][] intervals){
        if(intervals.length < 2){
            return true;
        }
        for(int i = 0; i < intervals.length; i++){
            for(int j = i + 1; j < intervals.length; j++){
                if(!checkIntervals(intervals[i], intervals[j])){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkIntervals(int[] int1, int[] int2){
        if(int2[0] > int1[0] && int2[0] < int1[int1.length - 1]){
            return false;
        }
        if(int1[0] > int2[0] && int1[0] < int2[int2.length - 1]){
            return false;
        }
        return int1[0] != int2[0] || int1[int1.length - 1] != int2[int2.length - 1];
    }

    public static boolean isStrobogrammatic(String num){
        HashMap<Character, Character> Map = new HashMap<>();
        Map.put('1', '1');
        Map.put('6', '9');
        Map.put('8', '8');
        Map.put('9', '6');
        Map.put('0', '0');
        StringBuilder s = new StringBuilder();
        for(int i = num.length() - 1; i >= 0; i--){
            if(!Map.containsKey(num.charAt(i))){
                return false;
            }
            s.append(Map.get(num.charAt(i)));
        }
        return s.toString().equals(num);
    }

    public static int numOfinversion(int[] arr, int start, int end){
        int inversion = 0;
        if(start < end){
            int mid = (start + end) / 2;
            inversion += numOfinversion(arr, start, mid);
            inversion += numOfinversion(arr, mid + 1, end);
            inversion += Merge(arr, start, mid, end);
        }
        return inversion;
    }

    public static int Merge(int[] arr, int start, int mid, int end){
        int n1 = mid - start + 1, n2 = end - mid, inversion = 0;
        /* Create temp arrays */
        int[] L = new int[n1], R = new int[n2];

        /* Copy data to temp arrays */
        for(int i = 0; i < n1; ++i){
            L[i] = arr[start + i];
        }
        for(int j = 0; j < n2; ++j){
            R[j] = arr[mid + 1 + j];
        }
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        // Initial index of merged subarry array
        int i = 0, j = 0, k = start;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else{
                inversion += n1 - i;
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
        return inversion;
    }

    public static void merge(int[] arr, int start, int mid, int end){
        // Find sizes of two subarrays to be merged
        int n1 = mid - start + 1;
        System.out.println("start is " + start + " " + "mid is " + mid + " " + "n1 is " + n1);
        int n2 = end - mid;
        System.out.println("end is " + end + " " + "n2 is " + n2);

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /* Copy data to temp arrays */
        for(int i = 0; i < n1; ++i){
            L[i] = arr[start + i];
            System.out.println("L[i] is " + L[i]);
        }
        for(int j = 0; j < n2; ++j){
            R[j] = arr[mid + 1 + j];
            System.out.println("R[j] is " + R[j]);
        }

        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarry array
        int k = start;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                System.out.println("arr[k] is " + arr[k]);
                i++;
            } else{
                arr[k] = R[j];
                System.out.println("arr[k] is " + arr[k]);
                j++;
            }
            k++;
            System.out.println("k is " + k);
        }

        /* Copy remaining elements of L[] if any */
        while(i < n1){
            arr[k] = L[i];
            System.out.println("L remaining is " + L[i]);
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while(j < n2){
            arr[k] = R[j];
            System.out.println("R remaining is " + R[j]);
            j++;
            k++;
        }
        System.out.println("-------------");
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            // Find the middle point
            int m = (start + end) / 2;
            // Sort first and second halves
            mergeSort(arr, start, m);
            mergeSort(arr, m + 1, end);
            // Merge the sorted halves
            merge(arr, start, m, end);
        }
    }

    public static int shortestDistance(String[] words, String word1, String word2){
        HashMap<String, ArrayList<Integer>> Map = new HashMap<>();
        Map.put(word1, new ArrayList<Integer>());
        Map.put(word2, new ArrayList<Integer>());
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                Map.get(word1).add(i);
            } else if(words[i].equals(word2)){
                Map.get(word2).add(i);
            }
        }
        List<Integer> w1 = Map.get(word1);
        List<Integer> w2 = Map.get(word2);
        int count = Math.abs(w1.get(0) - w2.get(0));
        for(int i = 0; i < w1.size(); i++){
            for(int j = 0; j < w2.size(); j++){
                count = Math.min(count, Math.abs(w1.get(i) - w2.get(j)));
            }
        }
        return count;
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return root;
        }
        int parent = root.val;
        int l = p.val;
        int r = q.val;
        if(l > parent && r > parent){
            return lowestCommonAncestor(root.right, p, q);
        } else if(l < parent && r < parent){
            return lowestCommonAncestor(root.left, p, q);
        } else{
            return root;
        }
    }

    public static boolean isPowerOfTwo(int n){
        if(n == 0){
            return false;
        }
        while(n % 2 == 0){
            n /= 2;
        }
        return (n == 1);
    }

    public static List<String> summaryRanges(int[] nums){
        List<String> l = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            // check if j + 1 extends the range [nums[i], nums[j]]
            if(j + 1 < nums.length && nums[j + 1] == nums[j] + 1){
                continue;
            }
            // put the range [nums[i], nums[j]] into the list
            if(i == j){
                s.append(nums[i]);
                l.add(s.toString());
                s.setLength(0);
            } else{
                s.append(nums[i]);
                s.append("->");
                s.append(nums[j]);
                l.add(s.toString());
                s.setLength(0);
            }
            i = j + 1;
        }
        return l;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && j - i < k + 1){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a).equals(b)){
                } else{
                    return false;
                }
            } else{
                if(map.containsValue(b)){
                    return false;
                }
                map.put(a, b);
            }
        }
        return true;
    }

    public static int countPrimes(int n){
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!notPrime[i]){
                count++;
            }
            for(int j = 2; j * i < n; j++){
                notPrime[i * j] = true;
            }
        }
        return count;
    }

    public static ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
            } else{
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    public static int reverseBits(int n){
        int ans = 0;
        for(int i = 0; i < 32; i++){
            ans <<= 1;
            ans = ans | (n & 1);
            n >>= 1;
        }
        return ans;
    }

    public static int trailingZeroes(int n){
        BigInteger fact = new BigInteger("1");
        for(int i = 2; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        String s = fact.toString();
        System.out.println(s);
        int count = 0;
        for(int j = s.length() - 1; j >= 0; j--){
            if(s.charAt(j) != '0'){
                return count;
            }
            count++;
        }
        return count;
    }

    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length / 2]);
    }

    public static int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper){
        int n = nums.length;
        if(n == 0){
            return Collections.singletonList(formatRange(lower, upper));
        }
        List<String> missingRanges = new ArrayList<>();
        // Edge case 1) Missing ranges at the beginning
        if(nums[0] > lower){
            missingRanges.add(formatRange(lower, nums[0] - 1));
        }
        // Missing ranges between array elements
        for(int i = 1; i < n; ++i){
            if(nums[i] - nums[i - 1] > 1){
                missingRanges.add(formatRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }
        // Edge case 2) Missing ranges at the end
        if(nums[n - 1] < upper){
            missingRanges.add(formatRange(nums[n - 1] + 1, upper));
        }
        return missingRanges;
    }

    // formats range in the requested format
    private static String formatRange(int lower, int upper){
        if(lower == upper){
            return String.valueOf(lower);
        } else{
            return lower + "->" + upper;
        }
    }

    public static int singleNumber(int[] nums){
        int ans = 0;
        Arrays.sort(nums);
        HashSet<Integer> Set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(Set.contains(nums[i])){
                Set.remove(nums[i]);
            } else{
                Set.add(nums[i]);
            }
        }
        for(int i : Set){
            ans = i;
        }
        return ans;
    }

    public static boolean isPalindrome(String s){
        String s1 = removeNonAlphanumeric(s);
        int i = 0, j = s1.length() - 1;
        while(j >= i){
            if(Character.toLowerCase(s1.charAt(i)) != Character.toLowerCase(s1.charAt(j))){
                System.out.println("i is: " + Character.toLowerCase(s1.charAt(i)));
                System.out.println("j is: " + Character.toLowerCase(s1.charAt(j)));
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static String removeNonAlphanumeric(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return s;
    }

    public static void InsertionSort(int[] num){
        for(int i = 1; i < num.length; i++){
            int key = num[i], j = i - 1;
            while(j >= 0 && num[j] > key){
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = key;
        }
    }

    public static List<Integer> getRow(int rowIndex){
        rowIndex += 1;
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> First = new ArrayList<>();
        List<Integer> Second = new ArrayList<>();
        First.add(1);
        Second.add(1);
        Second.add(1);
        if(rowIndex == 1){
            return First;
        }
        if(rowIndex == 2){
            return Second;
        }
        triangle.add(First);
        triangle.add(Second);
        for(int row = 2; row <= rowIndex; row++){
            List<Integer> subList = new ArrayList<Integer>();
            subList.add(1);
            List<Integer> pre = triangle.get(triangle.size() - 1);
            for(int i = 1; i < pre.size(); i++){
                subList.add(pre.get(i) + pre.get(i - 1));
            }
            subList.add(1);
            triangle.add(subList);
        }
        return triangle.get(rowIndex - 1);
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return triangle;
        }
        List<Integer> initList = new ArrayList<Integer>();
        initList.add(1);
        triangle.add(initList);
        for(int i = 2; i <= numRows; i++){
            List<Integer> subList = new ArrayList<Integer>();
            subList.add(1);
            List<Integer> pre = triangle.get(triangle.size() - 1);
            for(int j = 1; j < pre.size(); j++){
                subList.add(pre.get(j) + pre.get(j - 1));
            }
            subList.add(1);
            triangle.add(subList);
        }
        return triangle;
    }

    public static TreeNode sortedArrayToBST(int[] nums){
        if(nums.length == 0){
            return null;
        }
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    public static TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(mid);
        root.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        root.right = sortedArrayToBSTHelper(nums, mid + 1, right);
        return root;
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> level = new ArrayList<List<Integer>>();
        if(root == null){
            return level;
        }
        ArrayDeque<TreeNode> currentLevel = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> nextLevel = new ArrayDeque<TreeNode>();
        nextLevel.push(root);
        while(!nextLevel.isEmpty()){
            currentLevel = nextLevel.clone();
            nextLevel.clear();
            level.add(new ArrayList<Integer>());
            for(TreeNode t : currentLevel){
                level.get(level.size() - 1).add(t.val);
                if(t.left != null){
                    nextLevel.add(t.left);
                }
                if(t.right != null){
                    nextLevel.add(t.right);
                }
            }
        }
        Collections.reverse(level);
        return level;
    }

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }

    public static boolean isSymmetric(TreeNode root){
        return isSymmetricHelper(root, root);
    }

    private static boolean isSymmetricHelper(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) && isSymmetricHelper(t1.right, t2.left) && isSymmetricHelper(t1.left, t2.right);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        } else if(p == null || q == null){
            return false;
        } else if(p.val != q.val){
            return false;
        } else{
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public static ListNode deleteDuplicatesII(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        HashSet<Integer> Set = new HashSet<Integer>();
        while(p != null){
            if(p.next != null && p.val == p.next.val){
                Set.add(p.val);
                p.next = p.next.next;
            } else{
                p = p.next;
            }
        }
        while(head != null && Set.contains(head.val)){
            head = head.next;
        }
        ListNode dummy = head;
        while(dummy != null){
            if(dummy.next != null && Set.contains(dummy.next.val)){
                dummy.next = dummy.next.next;
            } else{
                dummy = dummy.next;
            }
        }
        return head;
    }

    public static ListNode swapPairs(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        ListNode second = first.next;
        first.next = swapPairs(second.next);
        second.next = first;
        return second;
    }

    public static void reverseString(char[] s){
        reverseHelper(s, 0, s.length - 1);
    }

    private static void reverseHelper(char[] s, int l, int r){
        if(l >= r){
            return;
        }
        char temp = s[l];
        s[l++] = s[r];
        s[r--] = temp;
        reverseHelper(s, l, r);
    }

    public static int mySqrt(int x){
        if(x <= 0){
            return 0;
        }
        long l = 0, r = x;
        while(l + 1 < r){
            long mid = l + (r - l) / 2;
            long sqr = (long) Math.pow(mid, 2);
            if(sqr == x){
                return (int) mid;
            } else if(sqr > x){
                r = mid;
            } else{
                l = mid;
            }
        }
        if(r * r == x){
            return (int) r;
        }
        return (int) l;
    }

    public static String addBinary(String a, String b){
        StringBuilder x = new StringBuilder();
        if(a.length() > b.length()){
            int l = a.length() - b.length();
            for(int i = 0; i < l; i++){
                x.append('0');
            }
            x.append(b);
            b = x.toString();
        }
        if(b.length() > a.length()){
            int l = b.length() - a.length();
            for(int i = 0; i < l; i++){
                x.append('0');
            }
            x.append(a);
            a = x.toString();
        }
        StringBuilder sb = new StringBuilder();
        int Length = a.length() - 1, carry = 0;
        while(Length >= 0){
            int sum = a.charAt(Length) + b.charAt(Length);
            if(sum == 98 && carry == 1){
                carry = 1;
                sb.append('1');
            } else if(sum == 98 && carry == 0){
                carry = 1;
                sb.append('0');
            } else if(sum == 97 && carry == 1){
                carry = 1;
                sb.append('0');
            } else if(sum == 97 && carry == 0){
                carry = 0;
                sb.append('1');
            } else if(sum == 96 && carry == 1){
                carry = 0;
                sb.append('1');
            } else if(sum == 96 && carry == 0){
                carry = 0;
                sb.append('0');
            }
            Length--;
        }
        if(carry == 1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }

    public static int[] plusOne(int[] digits){
        if(checkNines(digits)){
            int[] new_digits = new int[digits.length + 1];
            new_digits[0] = 1;
            for(int i = 1; i < new_digits.length; i++){
                new_digits[i] = 0;
            }
            return new_digits;
        } else if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] += 1;
            return digits;
        } else{
            digits[digits.length - 1] = 0;
            int end = digits.length - 2;
            while(digits[end] == 9 && end >= 0){
                digits[end] = 0;
                end--;
            }
            digits[end] = digits[end] + 1;
        }
        return digits;
    }

    private static boolean checkNines(int[] digits){
        for(int i = 0; i < digits.length; i++){
            if(digits[i] != 9){
                return false;
            }
        }
        return true;
    }

    public static int lengthOfLastWord(String s){
        int count = 0, i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    public static int maxSubArray(int[] nums){
        int max = nums[0], cur = nums[0];
        for(int i = 1; i < nums.length; i++){
            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);
        }
        return max;
    }

    public static String countAndSay(int n){
        if(n < 0 || n > 30){
            return null;
        }
        String s = "1";
        int i = 1;
        while(i < n){
            StringBuilder new_string = new StringBuilder();
            int count = 1;
            for(int j = 1; j < s.length(); j++){
                if(s.charAt(j) == s.charAt(j - 1)){
                    count++;
                } else{
                    new_string.append(count);
                    new_string.append(s.charAt(j - 1));
                    count = 1;
                }
            }
            new_string.append(count);
            new_string.append(s.charAt(s.length() - 1));
            s = new_string.toString();
            i++;
        }
        return s;
    }

    public static int searchInsert(int[] nums, int target){
        int i = 0;
        while(i < nums.length && target != nums[i] && nums[i] < target){
            i++;
        }
        return i;
    }

    public static int strStr(String haystack, String needle){
        if(needle == ""){
            return -1;
        }
        int haystackLength = haystack.length(), needleLength = needle.length();
        for(int count = 0; count < haystackLength - needleLength + 1; count++){
            if(haystack.substring(count, count + needleLength).equals(needle)){
                return count;
            }
        }
        return -1;
    }

    public static int removeElement(int[] nums, int val){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static boolean isValid(String s){
        Stack<Character> bracketsStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                bracketsStack.push(c);
            } else if(c == ')' && !bracketsStack.isEmpty() && bracketsStack.peek() == '('){
                bracketsStack.pop();
            } else if(c == ']' && !bracketsStack.isEmpty() && bracketsStack.peek() == '['){
                bracketsStack.pop();
            } else if(c == '}' && !bracketsStack.isEmpty() && bracketsStack.peek() == '{'){
                bracketsStack.pop();
            } else{
                bracketsStack.push(c);
            }
        }
        return bracketsStack.isEmpty();
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs.length <= 0 || strs.length > 200){
            return "";
        }
        String prefix = strs[0];
        for(int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static int romanToInt(String s){
        int i = 0;
        int ans = 0;
        while(i < s.length()){
            String currSt = s.substring(i, i + 1);
            int currVal = library.get(currSt);
            int nextVal = 0;
            if(i + 1 < s.length()){
                nextVal = library.get(s.substring(i + 1, i + 2));
            }
            if(nextVal > currVal){
                ans = ans + nextVal - currVal;
                i += 2;
            } else{
                ans = ans + currVal;
                i++;
            }
        }
        return ans;
    }

    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        return reverse(x) == x;
    }

    public static int reverse(int x){
        int result = 0;
        while(x != 0){
            int cur = x % 10;
            int NewResult = result * 10 + cur;
            if((NewResult - cur) / 10 != result){
                return 0;
            }
            x /= 10;
            result = NewResult;
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    private static boolean isMonotonic_increase(int[] A){
        for(int i = 1; i < A.length; i++){
            if(A[i - 1] > A[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean isMonotonic_decrease(int[] A){
        for(int i = 1; i < A.length; i++){
            if(A[i - 1] < A[i]){
                return false;
            }
        }
        return true;
    }

    public static int findSpecialInteger(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        double ans = 0.25 * arr.length;
        for(int k : arr){
            if(!map.containsKey(k)){
                map.put(k, 1);
            } else{
                map.put(k, map.get(k) + 1);
            }
        }
        for(int j : arr){
            if(map.get(j) > ans){
                return j;
            }
        }
        return 0;
    }

    public static ListNode reverseList(ListNode head){
        List<Integer> l = new ArrayList<>();
        while(head != null){
            l.add(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = new ListNode(0);
        dummy.next = cur;
        int i = 1;
        for(int j = l.size() - 1; j >= 0; j--){
            cur.next = new ListNode(l.get(l.size() - i));
            i++;
            cur = cur.next;
        }
        return dummy.next.next;
    }
}