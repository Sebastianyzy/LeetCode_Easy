import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Solution {
	static int ans = 0;

	public static void main(String args[]) {
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(9);
//		l1.next.next = new ListNode(9);
//		l1.next.next.next = new ListNode(9);
//		l1.next.next.next.next = new ListNode(9);
//		l1.next.next.next.next.next = new ListNode(9);
//		l1.next.next.next.next.next.next = new ListNode(9);
//		l1.next.next.next.next.next.next.next = new ListNode(9);
//		l1.next.next.next.next.next.next.next.next = new ListNode(9);
//		l1.next.next.next.next.next.next.next.next.next = new ListNode(9);
//		ListNode l2 = new ListNode(9);
//		l2.next = new ListNode(9);
//		l2.next.next = new ListNode(9);
//		l2.next.next.next = new ListNode(9);
//		int num[] = { 1, 0, 0, 1, 0, 1 };
//		int nums[] = { 1, 0, 0, 0, 1, 0, 0, 1, 0 };
//		String s1 = "abc";
//		String s2 = "bca";
//		String s3 = "a";
//		String s4 = "aa";
//		String s5 = "cabbba";
//		String s6 = "abbccc";
//		String s7 = "cabbba";
//		String s8 = "aabbss";

//		System.out.println("s1" + longestPalindrome(s1) + "s2" + longestPalindrome(s2) + "s3" + longestPalindrome(s3)
//				+ "s4" + longestPalindrome(s4) + "s5" + longestPalindrome(s5));
//		System.out.println("case 1" + closeStrings(s1, s2));
//		System.out.println("case 2" + closeStrings(s3, s4));
//		System.out.println("case 3" + closeStrings(s5, s6));
//		System.out.println("case 3" + closeStrings(s7, s8));
//		System.out.println("Case2" + maxOperations(nums, 6));
//		System.out.println("case1" + kLengthApart(num, 2));
//		System.out.println("case2" + kLengthApart(nums, 2));
//		int[][] mat0 = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("a", 1);
//		map.put("b", 2);
//		map.put("c", 3);
//		map.put("d", 4);
//
//		map.put("e", 9);
//		map.putIfAbsent("e", 5);
//		System.out.println(map.toString());

//		int[][] mat = diagonalSort(mat0);
//		for (int row = 0; row < mat0.length; row++) {
//			for (int col = 0; col < mat[0].length; col++) {
//				System.out.println(mat[row][col]);
//			}
//			System.out.println("-----");
//		}
//		PriorityQueue<Integer> q = new PriorityQueue<>();
//
//		q.add(2);
//		q.add(4);
//		q.add(6);
//		q.add(3);
//		q.add(5);
//		q.add(0);
//		q.add(3);
//		System.out.println(q);
//		System.out.println(getSmallestString(3, 27));
//		System.out.println(getSmallestString(5, 73));
//		int[][] grid1 = { { 1, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1 }, { 0, 0, 0, 1, 0 }, { 1, 0, 1, 0, 1 } };
//		int[][] grid2 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
//		System.out.println("grid1:" + " " + countCornerRectangles(grid1));
//		System.out.println("grid2:" + " " + countCornerRectangles(grid2));
//		TreeNode tree = new TreeNode(3);
//		tree.left = new TreeNode(9);
//		tree.left.left = new TreeNode(1);
//		tree.left.right = new TreeNode(3);
//		tree.right = new TreeNode(20);
//		tree.right.left = new TreeNode(15);
//		tree.right.right = new TreeNode(7);
//		// System.out.println(verticalTraversal(tree));
//		List<Integer> list = inOrderTraversal(tree);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		int[] num1 = { 1, 3, 2, 2, 5, 2, 3, 7 };
////		int[] num2 = { 4, 1, 5, 20, 3 };
////		int[] num3 = { 2, 10, 8 };
//		// System.out.println(String.valueOf(11111111111111111111111111111101));
//		System.out.println(findLHS(num1));
//		String s = "loveleetcode";
//		char c = 'e';
//		int[] ans = shortestToChar(s, c);
//		ans = shortestToChar(s, c);
//		for (int i = 0; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}s
//		System.out.println(returnFirstchar(s, 4, 'o', false));
//		int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
//		int[] result = kWeakestRows(mat, 3);
//		printIntArray(result);
		System.out.println("jjj");

	}

	public static ListNode swapNodes(ListNode head, int k) {
		int listLength = 0;
		ListNode front = null;
		ListNode end = null;
		ListNode curr = head;
		while (curr != null) {
			listLength++;
			if (end != null) {
				end = end.next;
			}
			if (listLength == k) {
				front = curr;
				end = head;
			}
			curr = curr.next;
		}
		int temp = front.val;
		front.val = end.val;
		end.val = temp;
		return head;
	}

	public static int removePalindromeSub(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String reversed = sb.toString();
		if (reversed.equals(s)) {
			return 1;
		}
		return 2;
	}

	public static boolean isStrobogrammatic(String num) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('6', '9');
		map.put('8', '8');
		map.put('9', '6');
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < num.length(); i++) {
			if (!map.containsKey(num.charAt(i))) {
				return false;
			}
			s.append(Character.toString(map.get(num.charAt(i))));
		}
		return s.reverse().toString().equals(num);

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		while (headA != null && headB != null) {
			ListNode dummyB = headB;
			while (dummyB != null) {
				if (dummyB == headA) {
					return headA;
				}
				dummyB = dummyB.next;
			}
			headA = headA.next;

		}
		return null;
	}

	public static int[] findErrorNums(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int j : nums) {
			set.add(j);
		}
		int dup = findErrorNumsfindDup(nums);
		Arrays.sort(nums);
		int[] ans = new int[2];
		for (int i = 1; i <= nums.length; i++) {
			if (!set.contains(i)) {

				ans[0] = dup;
				ans[1] = i;
				return ans;
			}
		}
		return ans;
	}

	private static int findErrorNumsfindDup(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return nums[i];
			}
			set.add(nums[i]);
		}
		return 0;
	}

	public static int distributeCandies(int[] candyType) {
		int canEat = candyType.length / 2;
		int typeNum = numOfTypeCandy(candyType);
		if (typeNum >= canEat) {
			return canEat;
		} else {
			return typeNum;
		}
	}

	private static int numOfTypeCandy(int[] candyType) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < candyType.length; i++) {
			set.add(candyType[i]);
		}
		return set.size();
	}

	public static int calculateTime(String keyboard, String word) {
		HashMap<Character, Integer> map = new HashMap<>();
		int num = 0;
		for (int i = 0; i < keyboard.length(); i++) {
			map.put(keyboard.charAt(i), num);
			num++;
		}
		int count = 0;
		int pos = 0;
		char currentPosition = keyboard.charAt(0);
		for (int i = 0; i < word.length(); i++) {
			char currChar = word.charAt(i);
			int distance = Math.abs(map.get(currentPosition) - map.get(currChar));
			count += distance;
			currentPosition = currChar;
		}
		return count;
	}

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack<>();
		int i = 0;
		int j = 0;
		while (i < pushed.length) {
			stack.push(pushed[i]);
			if (pushed[i] == popped[j]) {
				if (stack.peek() != pushed[i]) {
					return false;
				}
				stack.pop();
				i++;
				j++;
				while (!stack.isEmpty() && popped[j] == stack.peek()) {
					stack.pop();
					j++;
				}
			} else {
				i++;
			}

		}
		while (j < popped.length) {
			if (popped[j] != stack.peek()) {
				return false;
			}
			stack.pop();
			j++;
		}

		return true;

	}

	public static int findUnsortedSubarray(int[] nums) {
		int[] copy = nums.clone();
		Arrays.sort(copy);
		int start = nums.length, end = 0;
		for (int i = 0; i < nums.length; i++) {
			if (copy[i] != nums[i]) {
				start = Math.min(start, i);
				end = Math.max(end, i);
			}
		}
		return (end - start >= 0 ? end - start + 1 : 0);

	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length - 1;
		int col = 0;
		while (row >= 0 && col < matrix[row].length) {
			if (matrix[row][col] > target) {
				row--;
			} else if (matrix[row][col] < target) {
				col++;
			} else {
				return true;
			}
		}
		return false;
	}

	public static int brokenCalc(int X, int Y) {
		int count = 0;
		while (Y > X) {
			count++;
			if (Y % 2 == 1) {
				Y++;
			} else {
				Y /= 2;
			}
		}
		return count + X - Y;
	}

	public static int maxArea(int[] height) {
		int volumn = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int len = Math.abs(j - i);
				int wid = Math.min(height[i], height[j]);
				int curVol = len * wid;
				volumn = Math.max(curVol, volumn);
			}
		}
		return volumn;
	}

	public static int[] kWeakestRows(int[][] mat, int k) {
		// Calculate all the strengths and put them into a TreeMap.
		Map<Integer, ArrayList<Integer>> strengths = new TreeMap<>();
		for (int i = 0; i < mat.length; i++) {
			int numOfsoldiers = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					numOfsoldiers++;
				}
			}
			if (!strengths.containsKey(numOfsoldiers)) {
				strengths.put(numOfsoldiers, new ArrayList<>());
			}
			strengths.get(numOfsoldiers).add(i);
		}

		int[] indexes = new int[k];
		int i = 0;
		for (int key : strengths.keySet()) {
			for (int index : strengths.get(key)) {
				indexes[i] = index;
				i++;
				if (i == k)
					break;
			}
			if (i == k)
				break;
		}

		return indexes;
	}

	public static void printIntArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int numberOfSteps(int num) {
		int step = 0;
		while (num != 0) {
			if (num % 2 == 0) {
				num /= 2;
				step++;
			} else {
				num -= 1;
				step++;
			}
		}
		return step;

	}

	public static void printCharArray(char[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != t1[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] shortestToChar(String s, char c) {
		int[] ans = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				ans[i] = 0;
			} else {
				int count = 0;
				int countl = Integer.MAX_VALUE, countr = Integer.MAX_VALUE;
				if (charExistl(s, i, c)) {
					countl = returnFirstchar(s, i, c, false);
				}
				if (charExistr(s, i, c)) {
					countr = returnFirstchar(s, i, c, true);
				}
				count = Math.min(countl, countr);
				ans[i] = count;

			}

		}
		return ans;
	}

	private static int returnFirstchar(String s, int pos, char c, boolean r) {
		int count = 0;
		int i = pos;
		if (r == true) {
			while (i < s.length() && s.charAt(i) != c) {
				// System.out.println(s.charAt(i));
				count++;
				i++;
			}
		} else {
			while (i >= 0 && s.charAt(i) != c) {
				count++;
				i--;
			}
		}
		return count;

	}

	private static boolean charExistl(String s, int pos, char c) {
		for (int i = pos; i >= 0; i--) {
			if (s.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}

	private static boolean charExistr(String s, int pos, char c) {
		for (int i = pos; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}

	public static String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		String[] Path = path.split("/");
		for (String s : Path) {
			if (s.equals(".") || s.isEmpty()) {
				continue;
			} else if (s.equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(s);
			}
		}
		StringBuilder st = new StringBuilder();
		for (String dir : stack) {
			st.append("/");
			st.append(dir);
		}
		return st.length() > 0 ? st.toString() : "/";
	}

	public static int findLHS(int[] nums) {
		HashMap<Integer, Integer> Map = new HashMap<>();
		int res = 0;
		for (int num : nums) {
			Map.put(num, Map.getOrDefault(num, 0) + 1);
			if (Map.containsKey(num + 1)) {
				res = Math.max(res, Map.get(num) + Map.get(num + 1));
			}
			if (Map.containsKey(num - 1)) {
				res = Math.max(res, Map.get(num) + Map.get(num - 1));
			}
		}
		return res;

	}

	public static boolean hasCycle(ListNode head) {
		HashSet<ListNode> Set = new HashSet<>();
		while (head != null) {
			if (Set.contains(head)) {
				return true;
			}
			Set.add(head);
			head = head.next;

		}
		return false;
	}

	public static int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
		int total_dist = 0;
		int d = Integer.MIN_VALUE;
		for (int[] nut : nuts) {
			total_dist += (distance(nut, tree) * 2);
			d = Math.max(d, distance(nut, tree) - distance(nut, squirrel));
		}
		return total_dist - d;
	}

	private static int distance(int[] a, int[] b) {
		return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
	}

	public static int hammingWeight(int n) {
		int count = 0;
		int bit = 1;
		for (int i = 0; i < 32; i++) {
			if ((n & bit) == 1) {
				count++;
			}
			bit <<= 1;
		}
		return count;
	}

	public static List<Integer> inOrderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		inOrderTraversal(root, ans);
		return ans;

	}

	public static void inOrderTraversal(TreeNode root, List<Integer> ans) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left, ans);
		ans.add(root.val);
		inOrderTraversal(root.right, ans);
	}

	public static int countCornerRectangles(int[][] grid) {
		int rectangleCount = 0;
		if (grid.length <= 1) {
			return 0;
		}
		int row = 0;
		while (row < grid.length) {
			if (!atLeastTwoOnes(grid[row])) {
				row++;
			} else {
				List<Integer> postion = returnRowPositions(grid[row]);
				for (int i = 0; i < postion.size(); i++) {
					for (int j = i + 1; j < postion.size(); j++) {
						rectangleCount += MatchingColumn(grid, row, postion.get(i), postion.get(j));
					}
				}
				row++;
			}
		}
		return rectangleCount;
	}

	private static int MatchingColumn(int[][] grid, int row, int col1, int col2) {
		int count = 0;
		for (int i = row + 1; i < grid.length; i++) {
			if (grid[i][col1] == 1 && grid[i][col2] == 1) {
				count++;
			}
		}
		return count;
	}

	private static List<Integer> returnRowPositions(int[] row) {
		List<Integer> position = new ArrayList<>();
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 1) {
				position.add(i);
			}
		}
		return position;
	}

	private static boolean atLeastTwoOnes(int[] row) {
		int count = 0;
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 1) {
				count++;
			}
		}
		return count >= 2;
	}

	public static String getSmallestString(int n, int k) {
		HashMap<Integer, String> Map = new HashMap<>();
		StringBuilder s = new StringBuilder();
		int i = 1;
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			Map.put(i, Character.toString(alphabet));
			i++;
		}
		for (int position = 1; position <= n; position++) {
			int positionLeft = n - position;
			if (k > positionLeft * 26) {
				int add = k - (positionLeft * 26);
				s.append(Map.get(1 + add - 1));
				k -= add;
			} else {
				s.append(Map.get(1));
				k--;
			}
		}
		return s.toString();

	}

	public static int concatenatedBinary(int n) {
		StringBuilder s = new StringBuilder();
		int mod = (int) Math.pow(10, 9) + 7;
		int result = 0;
		for (int i = 1; i <= n; i++) {
			String binary = Integer.toBinaryString(i);
			for (int j = 0; j < binary.length(); j++) {
				result = (result * 2 + (binary.charAt(j) - '0')) % mod;
			}
		}

		return result;
	}

	public static boolean kLengthApart(int[] nums, int k) {
		if (nums.length <= 1) {
			return true;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				list.add(i);
			}
		}
		int i = 0;
		int j = 1;
		while (j < list.size()) {
			if (list.get(j) - list.get(i) < k + 1) {
				return false;
			}
			i++;
			j++;
		}
		return true;
	}

	public static int[][] diagonalSort(int[][] mat) {
		HashMap<Integer, PriorityQueue<Integer>> Map = new HashMap<>();
		int row = mat.length;
		int col = mat[0].length;

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				Map.putIfAbsent(r - c, new PriorityQueue<>());
				Map.get(r - c).add(mat[r][c]);
			}
		}
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				mat[r][c] = Map.get(r - c).poll();
			}
		}

		return mat;

	}

	public static boolean closeStrings(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		Map<Character, Integer> word1Map = new HashMap<>();
		Map<Character, Integer> word2Map = new HashMap<>();
		for (char c : word1.toCharArray()) {
			word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
		}
		for (char c : word2.toCharArray()) {
			word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
		}
		if (!word1Map.keySet().equals(word2Map.keySet())) {
			return false;
		}
		List<Integer> word1FrequencyList = new ArrayList<>(word1Map.values());
		List<Integer> word2FrequencyList = new ArrayList<>(word2Map.values());
		Collections.sort(word1FrequencyList);
		Collections.sort(word2FrequencyList);
		return word1FrequencyList.equals(word2FrequencyList);
	}

	public static boolean isOneEditDistance(String s, String t) {

		if (s.length() > t.length()) {
			return isOneEditDistance(t, s);
		}
		if (t.length() - s.length() > 1) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				if (s.length() == t.length()) {
					return s.substring(i + 1).equals(t.substring(i + 1));
				} else {
					return s.substring(i).equals(t.substring(i + 1));
				}
			}
		}
		return (s.length() + 1 == t.length());

	}

	public static int[] mostCompetitive(int[] nums, int k) {
		Deque<Integer> q = new ArrayDeque<>();
		int count = nums.length - k;
		for (int i = 0; i < nums.length; i++) {
			while (!q.isEmpty() && q.peekLast() > nums[i] && count > 0) {
				q.pollLast();
				count--;
			}
			q.addLast(nums[i]);
		}
		int ans[] = new int[k];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = q.pollFirst();
		}
		return ans;
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if ((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && stack.isEmpty()) {
				return false;
			} else if (s.charAt(i) == ')' && stack.peek().equals('(')) {
				stack.pop();
			} else if (s.charAt(i) == '}' && stack.peek().equals('{')) {
				stack.pop();
			} else if (s.charAt(i) == ']' && stack.peek().equals('[')) {
				stack.pop();
			} else {
				return false;
			}
		}
		return (stack.isEmpty());
	}

	public static String longestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private static int expandAroundCenter(String s, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}

	public static int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		int count = 0;
		while (i < j) {
			if (nums[i] + nums[j] > k) {
				j--;
			} else if (nums[i] + nums[j] < k) {
				i++;
			} else {
				count++;
				i++;
				j--;
			}
		}
		return count;

	}

	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	public static int minOperations(int[] nums, int x) {
		int current = 0;
		for (int num : nums) {
			current += num;
		}
		int n = nums.length;
		int mini = Integer.MAX_VALUE;
		int left = 0;

		for (int right = 0; right < n; right++) {
			// sum([0,..,left) + (right,...,n-1]) = x
			current -= nums[right];
			// if smaller, move `left` to left
			while (current < x && left <= right) {
				current += nums[left];
				left += 1;
			}
			// check if equal
			if (current == x) {
				mini = Math.min(mini, (n - 1 - right) + left);
			}
		}
		return mini != Integer.MAX_VALUE ? mini : -1;
	}

	public static int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int i = 0;
		int j = people.length - 1;
		int boat = 0;
		while (j >= i) {
			boat++;
			if (people[i] + people[j] <= limit) {
				i++;
			}
			j--;

		}
		return boat;

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1_val = (l1 != null) ? l1.val : 0;
			int l2_val = (l2 != null) ? l2.val : 0;
			int sum = l1_val + l2_val + carry;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (carry == 1) {
			cur.next = new ListNode(1);
		}
		return dummy.next;

	}

	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord)) {
			return 0;
		}
		if (wordList.contains(beginWord)) {
			wordList.remove(beginWord);
		}
		int count = 0;
		String curr = beginWord;
		for (String s : wordList) {
			if (OneDifference(curr, s) == 1) {
				curr = s;
				count++;
			}
			if (curr.equals(endWord)) {
				return count;
			}
		}
		return 0;
	}

	public static int OneDifference(String a, String b) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String w1 = "";
		String w2 = "";
		for (int i = 0; i < word1.length; i++) {
			w1 += word1[i];
		}
		for (int j = 0; j < word2.length; j++) {
			w2 += word2[j];
		}
		return w1.equals(w2);
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int i = 0;
		int j = 0;
		int length = 0;
		HashSet<Character> Set = new HashSet<Character>();
		while (j < s.length()) {
			if (!Set.contains(s.charAt(j))) {
				Set.add(s.charAt(j));
				length = Math.max(Set.size(), length);
				j++;
			} else {
				Set.remove(s.charAt(i));
				i++;
			}
		}
		return length;
	}

	public static int findKthPositive(int[] arr, int k) {
		if (arr.length < 1 || arr.length > 1000) {
			return 0;
		}
		int[] missingArr = new int[k + 1];
		HashSet<Integer> map = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.add(arr[i]);
		}
		int j = 0;
		int m = 1;
		while (j < missingArr.length) {
			if (!map.contains(m)) {
				missingArr[j] = m;
				m++;
				j++;
			} else {
				m++;
			}
		}

		return missingArr[k - 1];
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

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int j = 0;
		for (int i = m; i < m + n; i++) {
			nums1[i] = nums2[j];
			j++;
		}
		Arrays.sort(nums1);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = head;
		HashSet<Integer> Set = new HashSet<Integer>();
		while (p != null) {
			Set.add(p.val);
			if (p.next != null && Set.contains(p.next.val)) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		return head;
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode l3 = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				l3.next = l1;
				l1 = l1.next;
			} else {
				l3.next = l2;
				l2 = l2.next;
			}
			l3 = l3.next;
		}
		if (l1 == null) {
			l3.next = l2;
		} else {
			l3.next = l1;
		}
		return dummy.next;

	}

	public static int countArrangement(int n) {
		if (n < 1 || n > 15) {
			return 0;
		}
		int[] nums = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			nums[i] = i;
		}
		dfs(nums, 1);
		return ans;

	}

	private static void dfs(int nums[], int index) {
		if (index == nums.length) {
			ans++;
			return;
		}
		for (int j = index; j < nums.length; j++) {
			if (nums[j] % index == 0 || index % nums[j] == 0) {
				swap(nums, index, j);
				dfs(nums, index + 1);
				swap(nums, j, index);

			}
		}
	}

	private static void swap(int nums[], int i, int j) {
		if (i == j) {
			return;
		}
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	public final static TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
		if (original == null) {
			return null;
		}
		if (original.val == target.val) {
			return cloned;
		}
		TreeNode left = getTargetCopy(original.left, cloned.left, target);
		if (left != null) {
			return left;
		}
		return getTargetCopy(original.right, cloned.right, target);

	}

	public static boolean canFormArray(int[] arr, int[][] pieces) {
		HashMap<Integer, int[]> Map = new HashMap<Integer, int[]>();
		for (int[] i : pieces) {
			Map.put(i[0], i);
		}
		int i = 0;
		while (i < arr.length) {
			if (Map.containsKey(arr[i])) {
				int[] temp = Map.get(arr[i]);
				for (int j = 0; j < temp.length; j++) {
					if (temp[j] != arr[i]) {
						return false;
					}
					i++;
				}
			} else {
				return false;
			}
		}
		return true;

	}

	public static boolean canPermutePalindrome(String s) {
		char[] sortedChar = new char[s.length()];// Create a char array and put all the character in string in array
		Stack<Character> PalindromeStack = new Stack();// Use stack to check palindrome
		for (int i = 0; i < sortedChar.length; i++) {
			sortedChar[i] = s.charAt(i);
		}
		Arrays.sort(sortedChar);// Sort the array alphabetically
		if (s.length() == 1) {
			return true;
		}
		if (checkAllSame(s)) {
			return true;
		}
		if (checkEven(s)) {// if String is even, check if stack is empty
			int j = 0;
			while (j < sortedChar.length) {
				PalindromeStack.push(sortedChar[j]);
				j++;
				if (sortedChar[j] == PalindromeStack.peek()) {
					PalindromeStack.pop();
				}
				j++;
			}
			if (PalindromeStack.isEmpty()) {
				return true;
			}
			return false;
		}
		Set<Character> hash_Set = new HashSet<Character>();
		for (int i = 0; i < sortedChar.length; i++) {
			if (hash_Set.contains(sortedChar[i])) {
				hash_Set.remove(sortedChar[i]);
			} else {
				hash_Set.add(sortedChar[i]);
			}
		}
		return hash_Set.size() == 1;
	}

	private static boolean checkAllSame(String s) {
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkEven(String s) {
		if (s.length() % 2 == 0) {
			return true;
		}
		return false;
	}

}
