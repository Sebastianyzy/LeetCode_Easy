import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {

	public static void main(String args[]) {
		// System.out.println(mySqrt(11));
		// System.out.println(11 / 2);
		// System.out.println((int) Math.floor(2.35));
//		TreeNode tree = new TreeNode(3);
//		tree.left = new TreeNode(9);
//		tree.left.left = new TreeNode(1);
//		tree.left.right = new TreeNode(3);
//		tree.right = new TreeNode(20);
//		tree.right.left = new TreeNode(15);
//		tree.right.right = new TreeNode(7);
//		System.out.println(sumOfLeftLeaves(tree));
//		System.out.println(lowestCommonAncestor(tree, tree.left, tree.right).val);
//		levelOrderBottom(tree); 
//		int num[] = { 2, 2, 1, 1, 1, 2, 2 };
//		InsertionSort(num);
//		for (int i : num) {
//			System.out.println(i);
//		}
//		String s = "race a car";
//		Stack<Integer> stack = new Stack<>();
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
//		char c = 'A';
//		System.out.println(3 / 2);
//		System.out.println(trailingZeroes(4));
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(6);
//		l1.next.next.next = new ListNode(3);
//		l1.next.next.next.next = new ListNode(4);
//		l1.next.next.next.next.next = new ListNode(5);
//		l1.next.next.next.next.next.next = new ListNode(6);
//		removeElements(l1, 6);

//		HashMap<Character, Character> map = new HashMap<>();
//		map.put('a', 'c');
//		if (map.containsKey('a') && !map.get('a').equals('c')) {
//			System.out.println("wrong");
//		} else {
//			System.out.println("right");
//		}
//		int[] nums = { 0, 1, 2, 4, 5, 7 };
//		for (int i = 0; i < 3; i++) {
//			System.out.println(summaryRanges(nums).get(i));
//		}
//		System.out.println("---------------------------------");
//		int[] num = { 0, 2, 3, 4, 6, 8, 9 };
//		for (int i = 0; i < 4; i++) {
//			System.out.println(summaryRanges(num).get(i));
//		}
//		System.out.println(isStrobogrammatic("69"));
//		System.out.println(isStrobogrammatic("88"));
//		System.out.println(isStrobogrammatic("962"));
//		String[] words = { "practice", "makes", "perfect", "coding", "makes" };
//		System.out.println(addDigits(38));
//		System.out.println(addDigits(49));
//		int A[] = { 9, 8, 7, 6, 5, 1, 2, 2, 1 };
//		int B[] = { 9, 2 };
//		mergeSort(A, 0, A.length - 1);
//		for (int i = 0; i < A.length; i++) {
//			System.out.println(A[i]);
//		}
//		int inversion[] = { 2, 3, 8, 6, 1 };
//		System.out.println(numOfinversion(inversion, 0, inversion.length - 1));
//		int[][] interval1 = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
//		int[][] interval2 = { { 7, 10 }, { 2, 4 } };
//		int[][] interval3 = { { 8, 11 }, { 17, 20 }, { 17, 20 } };
//		System.out.println(canAttendMeetings(interval1));
//		System.out.println(38 / 10);
//		System.out.println(canPermutePalindrome("code"));
//		System.out.println(reverseVowels("hello"));
//		char[] s = { 'h', 'e', 'l', 'l', 'o' };
//		reverseStringRedo(s);
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		}
//		for (int i = 0; i < intersect(A, B).length; i++) { 
//			System.out.println(intersect(A, B)[i]);
//		}
		// System.out.println(isPerfectSquare(14));

		// System.out.println(String.valueOf('a') + String.valueOf('a'));

//		for (int i = 0; i < str.length; i++) {
//			if (str[i] == " ") {
//				System.out.println("yes");
//			}
//			
//		}
		// System.out.println(arrangeCoins(5));
//		String s = "sdfs";
//		System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
//		String a = "aba", b = "acdbcae";
//		char[] A = a.toCharArray();
//		char[] B = b.toCharArray();
//		Arrays.sort(A);
//		Arrays.sort(B);
//		printCharArray(A);
//		System.out.println("--------");
//		printCharArray(B);
//		String s = "Let's take LeetCode contest";
//		// String[] word = s.split("\\s+");
//		System.out.println(reverseWords(s));
		// System.out.println(word[0].charAt(word[0].length() - 1));
		// System.out.println(Character.toString('a') + Character.toString('a'));
//		String a = "ababab";
//		String b = "babaaa";
//		char[] A = a.toCharArray();
//		char[] B = b.toCharArray();
//		int[][] matrix = new int[7][7];
//		for (int i = 1; i < matrix.length; i++) {
//			matrix[0][i] = i;
//			matrix[i][0] = i;
//		}
//		matrix[0][0] = 0;
//		CS3340SampleMidterm_min(matrix, A, B);
//		System.out.println(matrix[matrix.length - 1][matrix.length - 1]);

//		String s = "abababc";
//		System.out.println(CS3340SampleMidterm_next(s));
//		int[] a = { 1, 2, 3, 4, 5, 6, 9, 20, 31 };
//		int[] b = { 2, 4, 5, 6, 7, 8, 32, 45 };
//		List<Integer> list = unionSortedSet(a, b);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//	}
//		System.out.println('z' - 'a');

	}

	public static int dominantIndex(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nums[i];
		}
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == max) {
				index = i;
			}
			if (2 * nums[i] > max && nums[i] != max) {
				return -1;
			}
		}
		return index;
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		int num = Integer.MAX_VALUE;
		Arrays.sort(letters);
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] > target) {
				return letters[i];
			}

		}
		return letters[0];
	}

	public static boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
		if (sentence1.length != sentence2.length) {
			return false;
		}
		HashSet<String> set = new HashSet<>();
		for (List<String> pair : similarPairs) {
			set.add(pair.get(0) + "#" + pair.get(1));
		}
		for (int i = 0; i < sentence1.length; i++) {
			if (!sentence1[i].equals(sentence2[i]) && !set.contains(sentence1[i] + "#" + sentence2[i])
					&& !set.contains(sentence2[i] + "#" + sentence1[i])) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> unionSortedSet(int[] A, int[] B) {
		Set<Integer> set = new HashSet<>();
		int m = A.length;
		int n = B.length;
		Arrays.sort(A);
		Arrays.sort(B);
		List<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < m && j < n) {
			if (A[i] <= B[j]) {
				if (!set.contains(A[i])) {
					list.add(A[i]);
					set.add(A[i]);
				}
				i++;
			} else {
				if (!set.contains(B[j])) {
					list.add(B[j]);
					set.add(B[j]);
				}
				j++;
			}
		}
		if (i != A.length - 1) {
			for (int l = i; l < A.length; l++) {
				if (!set.contains(A[l])) {
					list.add(A[l]);
					set.add(A[l]);
				}

			}
		}
		if (j != B.length - 1) {
			for (int l = j; l < B.length; l++) {
				if (!set.contains(B[l])) {
					list.add(B[l]);
					set.add(B[l]);
				}

			}
		}
		return list;
	}

	public static int CS3340SampleMidterm_next(String s) {
		int max = 0;
		for (int i = 2; i <= s.length(); i++) {
			for (int j = 1; j < i - 1; j++) {
				String si = "";
				String sj = "";
				for (int l = 0; l < j; l++) {
					si += Character.toString(s.charAt(l));
					sj += Character.toString(s.charAt(i - j - 1));
				}
//				System.out.println("si: " + si);
//				System.out.println("sj: " + sj);
//				System.out.println("----------------------");
				if (si.equals(sj)) {
					max = j;
				}

			}
		}
		return max == 0 ? 0 : max + 1;
	}

	public static void CS3340SampleMidterm_min(int[][] matrix, char[] a, char[] b) {
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				int r = (a[i - 1] == b[j - 1]) ? 0 : 1;
				int m = Math.min(matrix[i - 1][j] + 1, matrix[i][j - 1] + 1);
				m = Math.min(m, matrix[i - 1][j - 1] + r);
				matrix[i][j] = m;
			}
		}
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (isSelfDividing(i)) {
				list.add(i);
			}
		}
		return list;
	}

	private static boolean isSelfDividing(int num) {
		if (num < 1) {
			return false;
		}
		for (int i = 1; i <= num; i++) {
			String s = Integer.toString(num);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '0') {
					return false;
				}
				if (num % Integer.parseInt(Character.toString(s.charAt(j))) != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static int pivotIndex(int[] nums) {
		int sum = 0, leftsum = 0;
		for (int x : nums) {
			sum += x;
		}
		for (int i = 0; i < nums.length; i++) {
			if (leftsum == sum - leftsum - nums[i]) {
				return i;
			}
			leftsum += nums[i];
		}
		return -1;
	}

	public static String toLowerCase(String str) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			s.append(Character.toString(Character.toLowerCase(str.charAt(i))));
		}
		return s.toString();
	}

	public static int findLengthOfLCIS(int[] nums) {
		if (nums.length < 1) {
			return 0;
		}
		int j = 1;
		int count = 0;
		int cur = 1;
		while (j < nums.length) {
			if (nums[j] > nums[j - 1]) {
				cur++;
				j++;
			} else {
				count = Math.max(cur, count);
				cur = 1;
				j++;
			}
		}
		return Math.max(cur, count);
	}

	public static int findSecondMinimumValue(TreeNode root) {
		HashSet<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<>();
		findSecondMinimumValuePost(set, root);
		for (int i : set) {
			list.add(i);
		}
		Collections.sort(list);
		if (set.size() < 2) {
			return -1;
		}

		return list.get(1);

	}

	private static void findSecondMinimumValuePost(HashSet<Integer> set, TreeNode root) {

		if (root == null) {
			return;
		}
		findSecondMinimumValuePost(set, root.left);
		set.add(root.val);
		findSecondMinimumValuePost(set, root.right);

	}

	public static boolean judgeCircle(String moves) {
		int[] m = { 0, 0 };
		for (int i = 0; i < moves.length(); i++) {
			if (moves.charAt(i) == 'U') {
				m[0]--;
			}
			if (moves.charAt(i) == 'D') {
				m[0]++;
			}
			if (moves.charAt(i) == 'L') {
				m[1]--;
			}
			if (moves.charAt(i) == 'R') {
				m[1]++;
			}
		}
		return m[0] == 0 && m[1] == 0;
	}

	public static int[][] imageSmoother(int[][] M) {
		int R = M.length, C = M[0].length;
		int[][] ans = new int[R][C];

		for (int r = 0; r < R; ++r)
			for (int c = 0; c < C; ++c) {
				int count = 0;
				for (int nr = r - 1; nr <= r + 1; ++nr)
					for (int nc = c - 1; nc <= c + 1; ++nc) {
						if (0 <= nr && nr < R && 0 <= nc && nc < C) {
							ans[r][c] += M[nr][nc];
							count++;
						}
					}
				ans[r][c] /= count;
			}
		return ans;
	}

	public static boolean findTarget(TreeNode root, int k) {
		List<Integer> l = new ArrayList<>();
		findTargetinorder(root, l);
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) + l.get(j) == k) {
					return true;
				}
			}
		}
		return false;

	}

	private static void findTargetinorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		findTargetinorder(root.left, list);
		list.add(root.val);
		findTargetinorder(root.right, list);
	}

	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null) {
			return root2;
		}
		if (root2 == null) {
			return root1;
		}
		root1.val += root2.val;
		mergeTrees(root1.left, root2.left);
		mergeTrees(root1.right, root2.right);
		return root1;

	}

	public static int distributeCandies(int[] candyType) {
		int canEat = candyType.length / 2;
		int type = numOfTypeCandy(candyType);
		if (type >= canEat) {
			return canEat;
		} else {
			return type;
		}
	}

	private static int numOfTypeCandy(int[] c) {
		HashSet<Integer> type = new HashSet<>();
		for (int i = 0; i < c.length; i++) {
			type.add(c[i]);
		}
		return type.size();
	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		if (r * c != nums.length * nums[0].length) {
			return nums;
		}
		int[] element = new int[r * c];
		int[][] matrix = new int[r][c];
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				element[k] = nums[i][j];
				k++;
			}
		}
		int e = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = element[e];
				e++;
			}
		}
		return matrix;

	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}

	public static String reverseWords(String s) {
		String[] word = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length; i++) {
			for (int j = word[i].length() - 1; j >= 0; j--) {
				sb.append(Character.toString(word[i].charAt(j)));
			}
			if (i != word.length - 1) {
				sb.append(" ");
			}
		}

		return sb.toString();
	}

	public static boolean checkRecord(String s) {
		int A = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				A++;
			}
		}
		return A <= 1 && s.indexOf("LLL") < 0;
	}

	public static int findLUSlength(String a, String b) {
		if (a.equals(b)) {
			return -1;
		}
		return Math.max(a.length(), b.length());

	}

	public static String[] findRelativeRanks(int[] score) {
		String[] result = new String[score.length];
		if (score.length < 3) {
			if (score.length == 1) {
				result[0] = "Gold Medal";
			}
			if (score.length == 2) {
				if (score[0] > score[1]) {
					result[0] = "Gold Medal";
					result[1] = "Silver Medal";
				}
				result[0] = "Silver Medal";
				result[1] = "Gold Medal";
			}
			if (score.length == 3) {
				if (score[0] > score[1] && score[1] > score[2]) {
					result[0] = "Gold Medal";
					result[1] = "Silver Medal";
					result[2] = "Bronze Medal";
				} else if (score[2] > score[1] && score[1] > score[0]) {
					result[2] = "Gold Medal";
					result[1] = "Silver Medal";
					result[0] = "Bronze Medal";
				} else {
					result[1] = "Gold Medal";
					result[0] = "Silver Medal";
					result[2] = "Bronze Medal";

				}

			}
			return result;
		}
		int[] sortedScore = new int[score.length];
		for (int i = 0; i < score.length; i++) {
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
		for (int j = sortedScore.length - 4; j >= 0; j--) {
			map.put(sortedScore[j], Integer.toString(place));
			place++;
		}
		for (int j = 0; j < score.length; j++) {
			result[j] = map.get(score[j]);
		}
		return result;

	}

	public static void printCharArray(char[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	public static void printStringArray(String[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static boolean detectCapitalUse(String word) {
		if (word.length() == 0) {
			return false;
		}
		if (word.length() == 1) {
			return true;
		}

		if (Character.isUpperCase(word.charAt(0))) {
			if (Character.isUpperCase(word.charAt(1))) {
				for (int i = 0; i < word.length(); i++) {
					if (!Character.isUpperCase(word.charAt(i))) {
						return false;
					}
				}
				return true;
			}
			if (Character.isLowerCase(word.charAt(1))) {
				for (int i = 1; i < word.length(); i++) {
					if (Character.isUpperCase(word.charAt(i))) {
						return false;
					}
				}
				return true;
			}
		} else {
			for (int i = 0; i < word.length(); i++) {
				if (Character.isUpperCase(word.charAt(i))) {
					return false;
				}
			}
			return true;

		}

		return true;
	}

	public static String licenseKeyFormatting(String s, int k) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--)
			if (s.charAt(i) != '-')
				sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
		return sb.reverse().toString().toUpperCase();
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int cur = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				cur++;
			} else {
				max = Math.max(cur, max);
				cur = 0;
			}
		}
		return Math.max(cur, max);
	}

	public static int islandPerimeter(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 0) {
					continue;
				} else {
					if (checkLeft(i, j, grid)) {
						count++;
					}
					if (checkRight(i, j, grid)) {
						count++;
					}
					if (checkUp(i, j, grid)) {
						count++;
					}
					if (checkDown(i, j, grid)) {
						count++;
					}
				}
			}

		}
		return count;

	}

	private static boolean checkLeft(int i, int j, int[][] grid) {
		if (j == 0) {
			return true;
		}
		if (grid[i][j - 1] == 0) {
			return true;
		}
		return false;

	}

	private static boolean checkRight(int i, int j, int[][] grid) {
		if (j == grid[i].length - 1) {
			return true;
		} else if (grid[i][j + 1] == 0) {
			return true;
		}
		return false;

	}

	private static boolean checkUp(int i, int j, int[][] grid) {
		if (i == 0) {
			return true;
		} else if (grid[i - 1][j] == 0) {
			return true;
		}
		return false;
	}

	private static boolean checkDown(int i, int j, int[][] grid) {
		if (i == grid.length - 1) {
			return true;
		} else if (grid[i + 1][j] == 0) {
			return true;
		}
		return false;
	}

	public static void countSort(int[] A, int[] B) {
		int k = Arrays.stream(A).max().getAsInt();
		int[] C = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			C[i] = 0;
		}
		for (int i = 1; i <= A.length; i++) {
			C[A[i - 1]] += 1;
		}
		for (int i = 1; i <= k; i++) {
			C[i] += C[i - 1];
		}
		for (int i = A.length - 1; i >= 0; i--) {
			B[C[A[i]] - 1] = A[i];
			C[A[i]] -= 1;
		}

	}

	public static int findContentChildren(int[] g, int[] s) {
		int count = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		for (int i = 0; count < g.length && i < s.length; i++) {
			if (s[i] >= g[count]) {
				count++;
			}
		}
		return count;

	}

	public static int thirdMax(int[] nums) {
		HashSet<Integer> Set = new HashSet<>();
		for (int i : nums) {
			Set.add(i);
		}
		int max = Collections.max(Set);
		if (Set.size() < 3) {
			return max;
		}
		Set.remove(max);
		int max2 = Collections.max(Set);
		Set.remove(max2);
		return Collections.max(Set);

	}

	public static List<String> fizzBuzz(int n) {
		List<String> list = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			}

			else {
				list.add(Integer.toString(i));
			}
		}
		return list;
	}

	public static int arrangeCoins(int n) {

		int i = 0;
		while (n != 0) {
			n -= i;
			if (n < i + 1) {
				return i;
			}
			i++;
		}
		return 0;
	}

	public static int countSegments(String s) {
		String str = s.trim();
		if (str.equals("")) {
			return 0;
		}
		return str.split("\\s+").length;

	}

	public static boolean validWordSquare(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			StringBuilder col = new StringBuilder();
			for (int j = 0; j < words.get(i).length(); j++) {
				try {
					col.append(words.get(j).charAt(i));
				} catch (Exception e) {
					return false;

				}

			}
			if (!col.toString().equals(words.get(i))) {
				return false;
			}
			col.setLength(0);
		}
		return true;
	}

	public static String addStrings(String num1, String num2) {
		if (num1.length() > num2.length()) {
			String num = Add_zero(num2, num1.length() - num2.length());
			num2 = num;
		}
		if (num2.length() > num1.length()) {
			String num = Add_zero(num1, num2.length() - num1.length());
			num1 = num;
		}
		StringBuilder s = new StringBuilder();
		int i = num1.length() - 1;
		int carry = 0;
		while (i >= 0) {
			int add = carry + Integer.parseInt(String.valueOf(num1.charAt(i)))
					+ Integer.parseInt(String.valueOf(num2.charAt(i)));
			carry = 0;
			if (add >= 10) {
				carry = 1;
				add -= 10;
			}
			s.append(String.valueOf(add));
			i--;
		}
		if (carry > 0) {
			s.append(carry);
		}
		return s.reverse().toString();

	}

	private static String Add_zero(String num, int i) {
		StringBuilder s = new StringBuilder();
		for (int j = 0; j < i; j++) {
			s.append("0");
		}
		return s.toString() + num;

	}

	public static int longestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return 0;
		HashSet<Character> hs = new HashSet<Character>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (hs.contains(s.charAt(i))) {
				hs.remove(s.charAt(i));
				count++;
			} else {
				hs.add(s.charAt(i));
			}
		}
		if (!hs.isEmpty())
			return count * 2 + 1;
		return count * 2;

	}

	public static boolean validWordAbbreviation(String word, String abbr) {
		int i = 0, j = 0;
		while (i < word.length() && j < abbr.length()) {
			if (word.charAt(i) == abbr.charAt(j)) {
				++i;
				++j;
				continue;
			}
			if (abbr.charAt(j) <= '0' || abbr.charAt(j) > '9') {
				return false;
			}
			int start = j;
			while (j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
				++j;
			}
			int num = Integer.valueOf(abbr.substring(start, j));
			i += num;
		}
		return i == word.length() && j == abbr.length();

	}

	public static String toHex(int num) {
		char[] map = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		if (num == 0) {
			return "0";
		}
		String result = "";
		while (num != 0) {
			result = map[(num & 15)] + result;
			num = (num >>> 4);
		}
		return result;

	}

	public static boolean isSubsequence(String s, String t) {
		if (s.length() > t.length()) {
			return false;
		}
		Stack<Character> stacks = new Stack<>();
		Stack<Character> stackt = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			stacks.add(s.charAt(i));
		}
		for (int i = 0; i < t.length(); i++) {
			stackt.add(t.charAt(i));
		}
		while (!stackt.isEmpty() && !stacks.isEmpty()) {
			if (stacks.peek() == stackt.peek()) {
				stacks.pop();
				stackt.pop();
			} else {
				stackt.pop();
			}
		}

		return (stacks.isEmpty());
	}

	public static char findTheDifference(String s, String t) {
		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return arr2[i];
			}
		}
		return arr2[arr2.length - 1];
	}

	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> Map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Map.put(s.charAt(i), Map.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) {
			if (Map.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}

	private static Stack<Character> putOnStack(char[] c) {
		Stack<Character> stack = new Stack<>();
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			stack.add(c[i]);
		}
		return stack;
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) {
			return false;
		}
		char[] r = ransomNote.toCharArray();
		char[] m = magazine.toCharArray();
		Stack<Character> ranStack = putOnStack(r);
		Stack<Character> magStack = putOnStack(m);
		while (!ranStack.isEmpty()) {
			if (!ranStack.isEmpty() && magStack.isEmpty()) {
				return false;
			} else if (magStack.peek() == ranStack.peek()) {
				magStack.pop();
				ranStack.pop();
			} else if (magStack.peek() > ranStack.peek()) {
				magStack.pop();
			} else {
				return false;
			}
		}
		return true;

	}

	public static boolean isPerfectSquare(int num) {
		int square = (int) Math.sqrt(num);
		if ((int) Math.pow(square, 2) != num) {
			return false;
		}
		return true;
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			if (intersectionHelper(nums2, nums1[i])) {
				list.add(nums1[i]);
			}
		}
		int[] ans = new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> Set = new HashSet<>();
		for (int i = 0; i < nums2.length; i++) {
			Set.add(nums2[i]);
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			if (Set.contains(nums1[i])) {
				list.add(nums1[i]);
				Set.remove(nums1[i]);
			}
		}
		int[] ans = new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

	private static boolean intersectionHelper(int[] num, int i) {
		for (int j = 0; j < num.length; j++) {
			if (num[j] == i) {
				num[j] = -1;
				return true;
			}
		}
		return false;
	}

	public static String reverseVowels(String s) {
		char[] arr = s.toCharArray();
		int i = 0;
		int j = arr.length - 1;

		while (j > i) {
			char temp = ' ';
			if (isVowel(arr[i]) && isVowel(arr[j])) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j--;
			} else if (!isVowel(arr[j])) {
				j--;
			} else {
				i++;
			}
		}
		return String.valueOf(arr);
	}

	private static boolean isVowel(char c) {
		char[] arr = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < arr.length; i++) {
			if (c == arr[i]) {
				return true;
			}
		}
		return false;

	}

	public static void reverseStringRedo(char[] s) {
		int i = 0;
		int j = s.length - 1;
		char temp;
		while (j > i) {
			temp = s[j];
			s[j] = s[i];
			s[i] = temp;
			j--;
			i++;
		}
	}

	public static boolean isPowerOfFour(int n) {
		if (n < 1) {
			return false;
		}
		while (n % 4 == 0) {
			n /= 4;
		}
		return n == 1;
	}

	public static boolean isPowerOfThree(int n) {
		if (n < 1) {
			return false;
		}
		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}

	public static List<String> generatePossibleNextMoves(String s) {
		List<String> moves = new ArrayList<>();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == '+' && arr[i + 1] == '+') {
				arr[i] = '-';
				arr[i + 1] = '-';
				moves.add(String.valueOf(arr));
				arr[i] = '+';
				arr[i + 1] = '+';
			}
		}
		return moves;

	}

	public static boolean canWinNim(int n) {
		return (n % 4 != 0);
	}

	public static void moveZeroes(int[] nums) {
		int[] copy = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				copy[j] = nums[i];
				j++;
			}
		}
		while (j < copy.length) {
			copy[j] = 0;
			j++;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = copy[i];
		}

	}

	public static int numWays(int n, int k) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return k;
		}
		int[] paint = new int[n + 1];
		paint[1] = k;
		paint[2] = k * k;
		for (int i = 3; i <= n; i++) {
			paint[i] = (paint[i - 1] + paint[i - 2]) * (k - 1);
		}
		return paint[n];
	}

	private static void inOrder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		inOrder(root.right, list);
		list.add(root.val);
		inOrder(root.left, list);
	}

	public static int closestValue(TreeNode root, double target) {
		List<Integer> list = new ArrayList<>();
		inOrder(root, list);
		Stack<Integer> stack = new Stack<>();
		stack.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			if (Math.abs(stack.peek() - target) >= Math.abs(list.get(i) - target)) {
				stack.pop();
				stack.add(list.get(i));
			}
		}
		return stack.peek();
	}

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		if (nums[0] != 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0] + 1;
		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] + 1 != nums[i + 1]) {
				return nums[i] + 1;
			}
		}
		return nums[nums.length - 1] + 1;
	}

	public static boolean canPermutePalindrome(String s) {
		HashMap<Character, Integer> Map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Map.put(s.charAt(i), Map.getOrDefault(s.charAt(i), 0) + 1);
		}
		int count = 0;
		for (char key : Map.keySet()) {
			count += Map.get(key) % 2;
		}

		return count <= 1;
	}

	public static boolean isUgly(int num) {
		if (num <= 0) {
			return false;
		}

		while (num % 5 == 0) {
			num /= 5;
		}

		while (num % 3 == 0) {
			num /= 3;
		}

		while (num % 2 == 0) {
			num /= 2;
		}

		return num == 1;
	}

	public static int addDigits(int num) {
		int n = 0;
		while (num > 0) {
			n += num % 10;
			num /= 10;
			if (num == 0 && n > 9) {
				num = n;
				n = 0;
			}
		}
		return n;

	}

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<>();
		construct_path(root, "", list);
		return list;

	}

	private static void construct_path(TreeNode root, String s, List<String> list) {
		if (root != null) {
			s += Integer.toString(root.val);
			if (root.left == null && root.right == null) {
				list.add(s);
			} else {
				s += "->";
				construct_path(root.left, s, list);
				construct_path(root.right, s, list);
			}
		}
	}

	public static boolean canAttendMeetings(int[][] intervals) {
		if (intervals.length < 2) {
			return true;
		}
		for (int i = 0; i < intervals.length; i++) {
			for (int j = i + 1; j < intervals.length; j++) {
				if (!checkIntervals(intervals[i], intervals[j])) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkIntervals(int[] int1, int[] int2) {
		if (int2[0] > int1[0] && int2[0] < int1[int1.length - 1]) {
			return false;
		}
		if (int1[0] > int2[0] && int1[0] < int2[int2.length - 1]) {
			return false;
		}
		if (int1[0] == int2[0] && int1[int1.length - 1] == int2[int2.length - 1]) {
			return false;
		}
		return true;
	}

	public static boolean isStrobogrammatic(String num) {
		HashMap<Character, Character> Map = new HashMap<>();
		Map.put('1', '1');
		Map.put('6', '9');
		Map.put('8', '8');
		Map.put('9', '6');
		Map.put('0', '0');
		StringBuilder s = new StringBuilder();
		for (int i = num.length() - 1; i >= 0; i--) {
			if (!Map.containsKey(num.charAt(i))) {
				return false;
			}
			s.append(Map.get(num.charAt(i)));
		}
		return s.toString().equals(num);

	}

	public static int numOfinversion(int arr[], int start, int end) {
		int inversion = 0;
		if (start < end) {
			int mid = (start + end) / 2;
			inversion += numOfinversion(arr, start, mid);
			inversion += numOfinversion(arr, mid + 1, end);
			inversion += Merge(arr, start, mid, end);
		}
		return inversion;
	}

	public static int Merge(int arr[], int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int inversion = 0;
		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[start + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[mid + 1 + j];
		}

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = start;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				inversion += n1 - i;
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		return inversion;

	}

	public static void merge(int arr[], int start, int mid, int end) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - start + 1;
		System.out.println("start is " + start + " " + "mid is " + mid + " " + "n1 is " + n1);
		int n2 = end - mid;
		System.out.println("end is " + end + " " + "n2 is " + n2);

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[start + i];
			System.out.println("L[i] is " + L[i]);
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[mid + 1 + j];
			System.out.println("R[j] is " + R[j]);
		}

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = start;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				System.out.println("arr[k] is " + arr[k]);
				i++;
			} else {
				arr[k] = R[j];
				System.out.println("arr[k] is " + arr[k]);
				j++;
			}
			k++;
			System.out.println("k is " + k);

		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			System.out.println("L remaining is " + L[i]);
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			System.out.println("R remaining is " + R[j]);
			j++;
			k++;
		}
		System.out.println("-------------");
	}

	// Main function that sorts arr[l..r] using
	// merge()
	public static void mergeSort(int arr[], int start, int end) {
		if (start < end) {
			// Find the middle point
			int m = (start + end) / 2;

			// Sort first and second halves
			mergeSort(arr, start, m);
			mergeSort(arr, m + 1, end);

			// Merge the sorted halves
			merge(arr, start, m, end);
		}
	}

	public static int shortestDistance(String[] words, String word1, String word2) {
		HashMap<String, ArrayList<Integer>> Map = new HashMap<>();
		Map.put(word1, new ArrayList<Integer>());
		Map.put(word2, new ArrayList<Integer>());
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				Map.get(word1).add(i);
			} else if (words[i].equals(word2)) {
				Map.get(word2).add(i);
			}
		}
		List<Integer> w1 = Map.get(word1);
		List<Integer> w2 = Map.get(word2);
		int count = Math.abs(w1.get(0) - w2.get(0));
		for (int i = 0; i < w1.size(); i++) {
			for (int j = 0; j < w2.size(); j++) {
				count = Math.min(count, Math.abs(w1.get(i) - w2.get(j)));
			}
		}
		return count;

	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return root;
		}
		int parent = root.val;
		int l = p.val;
		int r = q.val;
		if (l > parent && r > parent) {
			return lowestCommonAncestor(root.right, p, q);
		} else if (l < parent && r < parent) {
			return lowestCommonAncestor(root.left, p, q);
		} else {
			return root;
		}

	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 0) {
			return false;
		}
		while (n % 2 == 0) {
			n /= 2;
		}
		return (n == 1);
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> l = new ArrayList<>();
		StringBuilder s = new StringBuilder();
		int i = 0;

		for (int j = 0; j < nums.length; j++) {
			// check if j + 1 extends the range [nums[i], nums[j]]
			if (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
				continue;
			}
			// put the range [nums[i], nums[j]] into the list
			if (i == j) {
				s.append(Integer.toString(nums[i]));
				l.add(s.toString());
				s.setLength(0);
			} else {
				s.append(Integer.toString(nums[i]));
				s.append("->");
				s.append(Integer.toString(nums[j]));
				l.add(s.toString());
				s.setLength(0);
			}
			i = j + 1;
		}
		return l;
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && j - i < k + 1) {
					return true;
				}
			}
		}
		return false;
	}

	public ListNode reverseList(ListNode head) {
		List<Integer> l = new ArrayList<>();
		while (head != null) {
			l.add(head.val);
			head = head.next;
		}
		ListNode dummy = new ListNode(0);
		ListNode cur = new ListNode(0);
		dummy.next = cur;
		int i = 1;
		for (int j = l.size() - 1; j >= 0; j--) {
			cur.next = new ListNode(l.get(l.size() - i));
			i++;
			cur = cur.next;
		}
		return dummy.next.next;
	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if (map.containsKey(a)) {
				if (map.get(a).equals(b)) {

				} else {
					return false;
				}
			} else {
				if (map.containsValue(b)) {
					return false;
				}
				map.put(a, b);
			}
		}
		return true;

	}

	public static int countPrimes(int n) {
		boolean[] notPrime = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (!notPrime[i]) {
				count++;
			}
			for (int j = 2; j * i < n; j++) {
				notPrime[i * j] = true;
			}
		}
		return count;
	}

	public static ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = head;
		ListNode pre = dummy;
		while (cur != null) {
			if (cur.val == val) {
				pre.next = cur.next;

			} else {
				pre = cur;
			}
			cur = cur.next;
		}
		return dummy.next;
	}

	public static int reverseBits(int n) {
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			ans <<= 1;
			ans = ans | (n & 1);
			n >>= 1;
		}
		return ans;
	}

	public static int trailingZeroes(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		String s = fact.toString();
		System.out.println(s);
		int count = 0;
		for (int j = s.length() - 1; j >= 0; j--) {
			if (s.charAt(j) != '0') {
				return count;
			}
			count++;
		}
		return count;
	}

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return (nums[nums.length / 2]);
	}

	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
		int n = nums.length;

		if (n == 0) {
			return Collections.singletonList(formatRange(lower, upper));
		}

		List<String> missingRanges = new ArrayList<>();

		// Edge case 1) Missing ranges at the beginning
		if (nums[0] > lower) {
			missingRanges.add(formatRange(lower, nums[0] - 1));
		}

		// Missing ranges between array elements
		for (int i = 1; i < n; ++i) {
			if (nums[i] - nums[i - 1] > 1) {
				missingRanges.add(formatRange(nums[i - 1] + 1, nums[i] - 1));
			}
		}

		// Edge case 2) Missing ranges at the end
		if (nums[n - 1] < upper) {
			missingRanges.add(formatRange(nums[n - 1] + 1, upper));
		}

		return missingRanges;
	}

	// formats range in the requested format
	private static String formatRange(int lower, int upper) {
		if (lower == upper) {
			return String.valueOf(lower);
		} else {
			return lower + "->" + upper;
		}
	}

	public static int singleNumber(int[] nums) {
		int ans = 0;
		Arrays.sort(nums);
		HashSet<Integer> Set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (Set.contains(nums[i])) {
				Set.remove(nums[i]);
			} else {
				Set.add(nums[i]);
			}
		}
		for (int i : Set) {
			ans = i;
		}
		return ans;

	}

	public static boolean isPalindrome(String s) {
		String s1 = removeNonAlphanumeric(s);
		int i = 0;
		int j = s1.length() - 1;
		while (j >= i) {
			if (Character.toLowerCase(s1.charAt(i)) != Character.toLowerCase(s1.charAt(j))) {
				System.out.println("i is: " + Character.toLowerCase(s1.charAt(i)));
				System.out.println("j is: " + Character.toLowerCase(s1.charAt(j)));
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	private static String removeNonAlphanumeric(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		return s;

	}

	public static void InsertionSort(int[] num) {
		for (int i = 1; i < num.length; i++) {
			int key = num[i];
			int j = i - 1;
			while (j >= 0 && num[j] > key) {
				num[j + 1] = num[j];
				j--;
			}
			num[j + 1] = key;
		}

	}

	public static List<Integer> getRow(int rowIndex) {
		rowIndex += 1;
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> First = new ArrayList<>();
		List<Integer> Second = new ArrayList<>();
		First.add(1);
		Second.add(1);
		Second.add(1);
		if (rowIndex == 1) {
			return First;
		}
		if (rowIndex == 2) {
			return Second;
		}
		triangle.add(First);
		triangle.add(Second);
		for (int row = 2; row <= rowIndex; row++) {
			List<Integer> subList = new ArrayList<Integer>();
			subList.add(1);
			List<Integer> pre = triangle.get(triangle.size() - 1);
			for (int i = 1; i < pre.size(); i++) {
				subList.add(pre.get(i) + pre.get(i - 1));
			}
			subList.add(1);
			triangle.add(subList);
		}
		return triangle.get(rowIndex - 1);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return triangle;
		}
		List<Integer> initList = new ArrayList<Integer>();
		initList.add(1);
		triangle.add(initList);
		for (int i = 2; i <= numRows; i++) {
			List<Integer> subList = new ArrayList<Integer>();
			subList.add(1);
			List<Integer> pre = triangle.get(triangle.size() - 1);
			for (int j = 1; j < pre.size(); j++) {
				subList.add(pre.get(j) + pre.get(j - 1));
			}
			subList.add(1);
			triangle.add(subList);
		}
		return triangle;
	}

	public static TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
	}

	public static TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int mid = left + (right - left) / 2;
		TreeNode root = new TreeNode(mid);
		root.left = sortedArrayToBSTHelper(nums, left, mid - 1);
		root.right = sortedArrayToBSTHelper(nums, mid + 1, right);
		return root;

	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> level = new ArrayList<List<Integer>>();
		if (root == null) {
			return level;
		}
		ArrayDeque<TreeNode> currentLevel = new ArrayDeque<TreeNode>();
		ArrayDeque<TreeNode> nextLevel = new ArrayDeque<TreeNode>();
		nextLevel.push(root);

		while (!nextLevel.isEmpty()) {
			currentLevel = nextLevel.clone();
			nextLevel.clear();
			level.add(new ArrayList<Integer>());

			for (TreeNode t : currentLevel) {
				level.get(level.size() - 1).add(t.val);

				if (t.left != null) {
					nextLevel.add(t.left);
				}
				if (t.right != null) {
					nextLevel.add(t.right);
				}
			}
		}
		Collections.reverse(level);
		return level;

	}

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
	}

	public static boolean isSymmetric(TreeNode root) {
		return isSymmetricHelper(root, root);

	}

	private static boolean isSymmetricHelper(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		return (t1.val == t2.val) && isSymmetricHelper(t1.right, t2.left) && isSymmetricHelper(t1.left, t2.right);
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		} else if (p.val != q.val) {
			return false;
		} else {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}

	}

	public static ListNode deleteDuplicatesII(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = head;
		HashSet<Integer> Set = new HashSet<Integer>();
		while (p != null) {
			if (p.next != null && p.val == p.next.val) {
				Set.add(p.val);
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		while (head != null && Set.contains(head.val)) {
			head = head.next;
		}
		ListNode dummy = head;
		while (dummy != null) {
			if (dummy.next != null && Set.contains(dummy.next.val)) {
				dummy.next = dummy.next.next;
			} else {
				dummy = dummy.next;
			}
		}

		return head;

	}

	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode first = head;
		ListNode second = first.next;

		first.next = swapPairs(second.next);
		second.next = first;
		return second;
	}

	public static void reverseString(char[] s) {
		reverseHelper(s, 0, s.length - 1);

	}

	private static void reverseHelper(char[] s, int l, int r) {
		if (l >= r) {
			return;
		}
		char temp = s[l];
		s[l++] = s[r];
		s[r--] = temp;
		reverseHelper(s, l, r);
	}

	public static int mySqrt(int x) {
		if (x <= 0) {
			return 0;
		}
		long l = 0;
		long r = x;
		while (l + 1 < r) {
			long mid = l + (r - l) / 2;
			long sqr = (long) Math.pow(mid, 2);
			if (sqr == x) {
				return (int) mid;
			} else if (sqr > x) {
				r = mid;
			} else {
				l = mid;
			}
		}
		if (r * r == x) {
			return (int) r;
		}
		return (int) l;
	}

	public static String addBinary(String a, String b) {
		StringBuilder x = new StringBuilder();
		if (a.length() > b.length()) {
			int l = a.length() - b.length();
			for (int i = 0; i < l; i++) {
				x.append('0');
			}
			x.append(b);
			b = x.toString();

		}
		if (b.length() > a.length()) {

			int l = b.length() - a.length();
			for (int i = 0; i < l; i++) {
				x.append('0');
			}
			x.append(a);
			a = x.toString();

		}
		StringBuilder sb = new StringBuilder();
		int Length = a.length() - 1;
		int carry = 0;
		while (Length >= 0) {
			int sum = a.charAt(Length) + b.charAt(Length);
			if (sum == 98 && carry == 1) {
				carry = 1;
				sb.append('1');
			} else if (sum == 98 && carry == 0) {
				carry = 1;
				sb.append('0');
			} else if (sum == 97 && carry == 1) {
				carry = 1;
				sb.append('0');
			} else if (sum == 97 && carry == 0) {
				carry = 0;
				sb.append('1');
			} else if (sum == 96 && carry == 1) {
				carry = 0;
				sb.append('1');
			} else if (sum == 96 && carry == 0) {
				carry = 0;
				sb.append('0');
			}
			Length--;

		}
		if (carry == 1) {
			sb.append('1');
		}

		return sb.reverse().toString();

	}

	public static int[] plusOne(int[] digits) {
		if (checkNines(digits)) {
			int[] new_digits = new int[digits.length + 1];
			new_digits[0] = 1;
			for (int i = 1; i < new_digits.length; i++) {
				new_digits[i] = 0;
			}
			return new_digits;
		} else if (digits[digits.length - 1] != 9) {
			digits[digits.length - 1] += 1;
			return digits;
		} else {
			digits[digits.length - 1] = 0;
			int end = digits.length - 2;
			while (digits[end] == 9 && end >= 0) {
				digits[end] = 0;
				end--;
			}
			digits[end] = digits[end] + 1;
		}
		return digits;

	}

	private static boolean checkNines(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != 9) {
				return false;
			}
		}
		return true;
	}

	public static int lengthOfLastWord(String s) {
		int count = 0;
		int i = s.length() - 1;
		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}
		while (i >= 0 && s.charAt(i) != ' ') {
			count++;
			i--;
		}
		return count;
	}

	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		int cur = nums[0];
		for (int i = 1; i < nums.length; i++) {
			cur = Math.max(nums[i], cur + nums[i]);
			max = Math.max(max, cur);
		}
		return max;
	}

	public static String countAndSay(int n) {
		if (n < 0 || n > 30) {
			return null;
		}
		String s = "1";
		int i = 1;
		while (i < n) {
			StringBuilder new_string = new StringBuilder();
			int count = 1;
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(j) == s.charAt(j - 1)) {
					count++;
				} else {
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

	public static int searchInsert(int[] nums, int target) {
		int i = 0;
		while (i < nums.length && target != nums[i] && nums[i] < target) {
			i++;
		}
		return i;
	}

	public static int strStr(String haystack, String needle) {
		if (needle == "") {
			return -1;
		}
		int haystackLength = haystack.length();
		int needleLength = needle.length();
		for (int count = 0; count < haystackLength - needleLength + 1; count++) {
			if (haystack.substring(count, count + needleLength).equals(needle)) {
				return count;
			}
		}
		return -1;
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static boolean isValid(String s) {

		Stack<Character> bracketsStack = new Stack();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				bracketsStack.push(c);
			} else if (c == ')' && !bracketsStack.isEmpty() && bracketsStack.peek() == '(') {
				bracketsStack.pop();
			} else if (c == ']' && !bracketsStack.isEmpty() && bracketsStack.peek() == '[') {
				bracketsStack.pop();
			} else if (c == '}' && !bracketsStack.isEmpty() && bracketsStack.peek() == '{') {
				bracketsStack.pop();
			} else {
				bracketsStack.push(c);
			}
		}
		return bracketsStack.isEmpty();

	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length <= 0 || strs.length > 200) {
			return "";
		}
		String prefix = strs[0];
		for (int i = 0; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;

	}

	static Map<String, Integer> library = new HashMap<>();

	static {
		library.put("I", 1);
		library.put("V", 5);
		library.put("X", 10);
		library.put("L", 50);
		library.put("C", 100);
		library.put("D", 500);
		library.put("M", 1000);

	}

	public static int romanToInt(String s) {
		int i = 0;
		int ans = 0;
		while (i < s.length()) {
			String currSt = s.substring(i, i + 1);
			int currVal = library.get(currSt);
			int nextVal = 0;
			if (i + 1 < s.length()) {
				nextVal = library.get(s.substring(i + 1, i + 2));
			}
			if (nextVal > currVal) {
				ans = ans + nextVal - currVal;
				i += 2;
			} else {
				ans = ans + currVal;
				i++;
			}
		}
		return ans;

	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (reverse(x) == x) {
			return true;
		}
		return false;

	}

	public static int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int cur = x % 10;
			int NewResult = result * 10 + cur;
			if ((NewResult - cur) / 10 != result) {
				return 0;
			}
			x /= 10;
			result = NewResult;
		}
		return result;

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					ans[0] = i;
					ans[1] = j;
				}
			}

		}
		return ans;
	}
}
