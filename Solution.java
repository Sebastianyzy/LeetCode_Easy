import java.math.BigInteger;
import java.util.*;

public class Solution {

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

	public static void main(String[] args) {
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
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i : a) {
//			if (!map.containsKey(i)) {
//				map.put(i, 1);
//			} else {
//				map.put(i, map.get(i + 1));
//			}
//		 }

	}

	public static int lastStoneWeight(int[] stones) {
		if (stones.length == 1) {
			return stones[0];
		}
		for (int i = 0; i < stones.length; i++) {
			Arrays.sort(stones);
			if (stones[stones.length - 1] >= stones[stones.length - 2]) {
				int cur = stones[stones.length - 2];
				stones[stones.length - 2] = 0;
				stones[stones.length - 1] -= cur;
			}
		}
		return stones[stones.length - 1];
	}

	public static boolean isBoomerang(int[][] points) {
		Set<int[]> set = new HashSet<>();
		Collections.addAll(set, points);
		return !collinear(points[0][0], points[0][1], points[1][0], points[1][1], points[2][0], points[2][1])
				&& set.size() == 3;
	}

	private static boolean collinear(int x1, int y1, int x2, int y2, int x3, int y3) {
		return x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) == 0;
	}

	public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
		int[][] origin = new int[R * C][2];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				origin[i * C + j] = new int[] { i, j };
			}
		}
		Arrays.sort(origin, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Math.abs(a[0] - r0) + Math.abs(a[1] - c0) - Math.abs(b[0] - r0) - Math.abs(b[1] - c0);
			}
		});
		return origin;
	}

	public static boolean divisorGame(int n) {
		return n % 2 == 0;
	}

	public static int sumRootToLeaf(TreeNode root) {
		return sumRootToLeaf_Traversal(root, 0);
	}

	private static int sumRootToLeaf_Traversal(TreeNode node, int value) {
		if (node == null)
			return 0;

		value = value * 2 + node.val;
		if (node.left == null && node.right == null) {
			return value;
		}
		return sumRootToLeaf_Traversal(node.left, value) + sumRootToLeaf_Traversal(node.right, value);
	}

	public static String removeOuterParentheses(String S) {
		StringBuilder SB = new StringBuilder();
		int currDepth = 0;
		for (char curr : S.toCharArray()) {
			if (curr == '(' && (currDepth += 1) > 1) {
				SB.append(curr);
			}
			if (curr == ')' && (currDepth -= 1) >= 1) {
				SB.append(curr);
			}
		}
		return SB.toString();
	}

	public static List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> result = new ArrayList<>();
		int s = 0;
		for (int i : A) {
			result.add((s = (s * 2 + i) % 5) == 0);
		}
		return result;
	}

	public static boolean canThreePartsEqualSum(int[] A) {
		int sum = Arrays.stream(A).sum();
		if (sum % 3 != 0) {
			return false;
		}
		int each = sum / 3, temp = 0, found = 0;
		for (int j : A) {
			temp += j;
			if (temp == each) {
				temp = 0;
				found++;
			}
		}
		return found >= 3;
	}

	public static int bitwiseComplement(int N) {
		String n = Integer.toBinaryString(N), comp = "";
		for (char c : n.toCharArray()) {
			comp += c == '1' ? '0' : '1';
		}
		return Integer.parseInt(comp, 2);
	}

	public static int sumBase(int n, int k) {
		String base_k = sumBase_baseConversion(Integer.toString(n), k);
		int ans = 0;
		for (char c : base_k.toCharArray()) {
			ans += Integer.parseInt(Character.toString(c));
		}
		return ans;
	}

	private static String sumBase_baseConversion(String number, int dBase) {
		return Integer.toString(Integer.parseInt(number, 10), dBase);
	}

	public static int largestSumAfterKNegations(int[] A, int K) {
		for (int i = 0; i < K; i++) {
			int min = largestSumAfterKNegations_findMin(A);
			largestSumAfterKNegations_modify(A, min);
		}
		int ans = 0;
		for (int i : A) {
			ans += i;
		}
		return ans;

	}

	private static int largestSumAfterKNegations_findMin(int[] A) {
		int min = Integer.MAX_VALUE;
		for (int i : A) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	private static void largestSumAfterKNegations_modify(int[] A, int integer) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == integer) {
				A[i] = -A[i];
				return;
			}
		}
	}

	public static List<String> commonChars(String[] A) {
		List<String> ans = new ArrayList<>();
		if (A.length == 0) {
			return ans;
		}
		String common = A[0];
		for (String s : A) {
			List<Character> list = new ArrayList<>();
			for (char c : s.toCharArray()) {
				list.add(c);
			}
			for (char c : common.toCharArray()) {
				if (!list.contains(c)) {
					common = commonChars_DeleteChars(common, c);
				} else {
					list.remove(c);
				}
			}
		}
		for (char c : common.toCharArray()) {
			ans.add(Character.toString(c));
		}
		return ans;
	}

	private static String commonChars_DeleteChars(String s, char c) {
		boolean remove = true;
		String ans = "";
		for (char ch : s.toCharArray()) {
			if (ch == c) {
				if (remove) {
					remove = false;
				} else {
					ans += ch;
				}
			} else {
				ans += ch;
			}
		}
		return ans;
	}

	public static int findJudge(int N, int[][] trust) {
		if (trust.length < N - 1) {
			return -1;
		}
		int[] trustScores = new int[N + 1];
		for (int[] relation : trust) {
			trustScores[relation[0]]--;
			trustScores[relation[1]]++;
		}
		for (int i = 1; i <= N; i++) {
			if (trustScores[i] == N - 1) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isCousins(TreeNode root, int x, int y) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			boolean siblings = false;
			boolean cousins = false;

			int nodesAtDepth = queue.size();

			for (int i = 0; i < nodesAtDepth; i++) {
				TreeNode node = queue.remove();
				if (node == null) {
					siblings = false;
				} else {
					if (node.val == x || node.val == y) {
						if (!cousins) {
							siblings = cousins = true;
						} else {
							return !siblings;
						}
					}
					if (node.left != null)
						queue.add(node.left);
					if (node.right != null)
						queue.add(node.right);
					queue.add(null);
				}
			}
			if (cousins) {
				return false;
			}

		}
		return false;
	}

	public static List<Integer> addToArrayForm(int[] num, int k) {
		int N = num.length, cur = k;
		List<Integer> ans = new ArrayList<>();
		int i = N;
		while (--i >= 0 || cur > 0) {
			if (i >= 0) {
				cur += num[i];
			}
			ans.add(cur % 10);
			cur /= 10;
		}
		Collections.reverse(ans);
		return ans;
	}

	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int sum = 0;
		for (int i : A) {
			sum += i % 2 == 0 ? i : 0;
		}
		int[] ans = new int[queries.length];
		for (int i = 0; i < ans.length; i++) {
			int val = queries[i][0], index = queries[i][1];
			if (A[index] % 2 == 0) {
				sum -= A[index];
			}
			A[index] += val;
			if (A[index] % 2 == 0) {
				sum += A[index];
			}
			ans[i] = sum;
		}
		return ans;
	}

	public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	public static int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for (int i = nums.length - 1; i >= 2; i--) {
			if (nums[i] < nums[i - 1] + nums[i - 2]) {
				return nums[i] + nums[i - 1] + nums[i - 2];
			}
		}
		return 0;
	}

	public static boolean isUnivalTree(TreeNode root) {
		if (root == null) {
			return true;
		}
		Set<Integer> set = new HashSet<>();
		isUnivalTree_AddNode(root, set);
		return set.size() == 1;

	}

	private static void isUnivalTree_AddNode(TreeNode root, Set<Integer> set) {
		if (root == null) {
			return;
		}
		set.add(root.val);
		isUnivalTree_AddNode(root.left, set);
		isUnivalTree_AddNode(root.right, set);
	}

	public static int repeatedNTimes(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int repeat = A.length / 2;
		for (int i : A) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
			if (map.get(i) == repeat) {
				return i;
			}
		}
		return 0;
	}

	public static boolean isAlienSorted(String[] words, String order) {
		if (words.length < 2) {
			return true;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		isAlienSorted_SetOrder(order, map);
		for (int i = 1; i < words.length; i++) {
			if (!isAlienSorted_isLexicographicalySort(words[i - 1], words[i], map)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isAlienSorted_isLexicographicalySort(String s1, String s2, HashMap<Character, Integer> map) {
		int len = Math.min(s1.length(), s2.length());
		if (s1.substring(0, len).equals(s2.substring(0, len)) && s1.length() > s2.length()) {
			return false;
		}
		for (int i = 0; i < len; i++) {
			if (map.get(s2.charAt(i)) > map.get(s1.charAt(i))) {
				return true;
			} else if (map.get(s2.charAt(i)).equals(map.get(s1.charAt(i)))) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	private static void isAlienSorted_SetOrder(String order, HashMap<Character, Integer> map) {
		for (int i = 0; i < order.length(); i++) {
			map.put(order.charAt(i), i);
		}
	}

	public static int minDeletionSize(String[] strs) {
		String[] ans = new String[strs[0].length()];
		for (int i = 0; i < strs[0].length(); i++) {
			String cur = "";
			for (String str : strs) {
				cur += str.charAt(i);
			}
			ans[i] = cur;
		}
		int count = 0;
		for (String an : ans) {
			if (!minDeletionSize_isSorted(an)) {
				count++;
			}
		}
		return count;
	}

	private static boolean minDeletionSize_isSorted(String s) {
		if (s.length() < 2) {
			return true;
		}
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) < s.charAt(i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static int[] diStringMatch(String S) {
		int N = S.length();
		int lo = 0, hi = N;
		int[] ans = new int[N + 1];
		for (int i = 0; i < N; ++i) {
			if (S.charAt(i) == 'I')
				ans[i] = lo++;
			else
				ans[i] = hi--;
		}
		ans[N] = lo;
		return ans;
	}

	public static boolean validMountainArray(int[] arr) {
		if (arr.length < 3) {
			return false;
		}
		int max = validMountainArray_getPeak(arr);
		if (arr[0] == max) {
			return false;
		}
		int i = 1;
		while (i < arr.length && arr[i] != max) {
			if (arr[i] <= arr[i - 1]) {
				return false;
			}
			i++;
		}
		if (i == arr.length - 1) {
			return false;
		}
		for (int j = i; j < arr.length - 1; j++) {
			if (arr[j] <= arr[j + 1]) {
				return false;
			}
		}
		return true;
	}

	private static int validMountainArray_getPeak(int[] arr) {
		int i = Integer.MIN_VALUE;
		for (int k : arr) {
			if (k > i) {
				i = k;
			}
		}
		return i;
	}

	public static int rangeSumBST(TreeNode root, int low, int high) {
		List<Integer> list = new ArrayList<>();
		rangeSumBST_preOrder(list, root);
		int ans = 0;
		for (Integer integer : list) {
			if (integer >= low && integer <= high) {
				ans += integer;
			}
		}
		return ans;
	}

	private static void rangeSumBST_preOrder(List<Integer> list, TreeNode root) {
		if (root == null) {
			return;
		}
		list.add(root.val);
		rangeSumBST_preOrder(list, root.left);
		rangeSumBST_preOrder(list, root.right);
	}

	public static String[] reorderLogFiles(String[] logs) {
		Comparator<String> myComp = new Comparator<String>() {
			@Override
			public int compare(String log1, String log2) {
				// split each log into two parts: <identifier, content>
				String[] split1 = log1.split(" ", 2);
				String[] split2 = log2.split(" ", 2);

				boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
				boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
				// case 1). both logs are letter-logs
				if (!isDigit1 && !isDigit2) {
					// first compare the content
					int cmp = split1[1].compareTo(split2[1]);
					if (cmp != 0)
						return cmp;
					// logs of same content, compare the identifiers
					return split1[0].compareTo(split2[0]);
				}
				// case 2). one of logs is digit-log
				if (!isDigit1 && isDigit2)
					// the letter-log comes before digit-logs
					return -1;
				else if (isDigit1 && !isDigit2)
					return 1;
				else
					// case 3). both logs are digit-log
					return 0;
			}
		};

		Arrays.sort(logs, myComp);
		return logs;
	}

	public static int numUniqueEmails(String[] emails) {
		HashSet<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (String s : emails) {
			boolean end_loop = true;
			boolean include = false;
			for (int i = 0; i < s.length(); i++) {
				char cur = s.charAt(i);
				if (cur == '.' && include) {
					sb.append(cur);
				} else if (cur == '@') {
					end_loop = false;
					include = true;
					sb.append(cur);
				} else if (cur == '+' && end_loop) {
					int j = i;
					while (s.charAt(j) != '@') {
						j++;
					}
					while (j < s.length()) {
						sb.append(s.charAt(j));
						j++;
					}
					break;
				} else {
					if (cur != '.') {
						sb.append(cur);
					}
				}
			}
			set.add(sb.toString());
			sb.setLength(0);
		}
		return set.size();
	}

	public static boolean isLongPressedName(String name, String typed) {
		Stack<Character> name_stack = new Stack<>(), typed_stack = new Stack<>();
		for (char c : name.toCharArray()) {
			name_stack.push(c);
		}
		for (char c : typed.toCharArray()) {
			typed_stack.push(c);
		}
		char last_pop_type = ' ';
		while (!name_stack.isEmpty() && !typed_stack.isEmpty()) {
			char cur_name = name_stack.peek(), cur_type = typed_stack.peek();
			if (cur_name == cur_type) {
				name_stack.pop();
				last_pop_type = typed_stack.pop();
			} else {
				if (cur_type != last_pop_type) {
					return false;
				}
				while (cur_type == last_pop_type) {
					last_pop_type = typed_stack.pop();
					cur_type = typed_stack.peek();
				}
				if (cur_type != cur_name) {
					return false;
				}
			}
		}
		while (!typed_stack.isEmpty()) {
			char cur = typed_stack.peek();
			if (last_pop_type != cur) {
				return false;
			}
			last_pop_type = typed_stack.pop();
		}
		return name_stack.isEmpty();
	}

	public static int[] sortArrayByParityII(int[] nums) {
		List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
		for (int i : nums) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}
		int e = 0, o = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				nums[i] = even.get(e);
				e++;
			} else {
				nums[i] = odd.get(o);
				o++;
			}
		}
		return nums;
	}

	public static HashMap<Integer, String> probability_distribution(int t, HashMap<Integer, String> map) {
		HashMap<Integer, String> ans = new HashMap<>();
		for (int i = 1; i <= 6; i++) {
			if (i <= t) {
				ans.put(i, "0.00");
			} else {
				ans.put(i, map.get(i));
			}
		}
		int sum = 0;
		for (int i = 0; i < map.size(); i++) {
			if (i + 1 <= t) {
				sum += Integer.parseInt(map.get(i));
			}
		}
		int part = sum / (6 - t);
		for (int i = t + 1; i < ans.size(); i++) {
			ans.put(i, ans.get(i) + part);
		}

		return ans;

	}

	public static String reverseOnlyLetters(String S) {
		Stack<Character> letters = new Stack();
		for (char c : S.toCharArray())
			if (Character.isLetter(c))
				letters.push(c);

		StringBuilder ans = new StringBuilder();
		for (char c : S.toCharArray()) {
			if (Character.isLetter(c))
				ans.append(letters.pop());
			else
				ans.append(c);
		}

		return ans.toString();
	}

	public static boolean hasGroupsSizeX(int[] deck) {
		int N = deck.length;
		int[] count = new int[10000];
		for (int c : deck)
			count[c]++;
		List<Integer> values = new ArrayList<>();
		for (int i = 0; i < 10000; ++i)
			if (count[i] > 0)
				values.add(count[i]);
		search: for (int X = 2; X <= N; ++X)
			if (N % X == 0) {
				for (int v : values)
					if (v % X != 0)
						continue search;
				return true;
			}
		return false;
	}

	public static int smallestRangeI(int[] A, int K) {
		int min = A[0], max = A[0];
		for (int i : A) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		return Math.max(0, max - min - 2 * K);
	}

	public static int[] sortArrayByParity(int[] A) {
		List<Integer> Even = new ArrayList<>(), Odd = new ArrayList<>();
		for (int i : A) {
			if (i % 2 == 0) {
				Even.add(i);
			} else {
				Odd.add(i);
			}
		}
		for (int i = 0; i < Even.size(); i++) {
			A[i] = Even.get(i);
		}
		int j = 0;
		for (int i = Even.size(); i < A.length; i++) {
			A[i] = Odd.get(j);
			j++;
		}
		return A;
	}

	public static TreeNode increasingBST(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		increasingBST_inOrder(root, list);
		TreeNode ans = new TreeNode(list.get(0)), cur = ans;
		for (int i : list) {
			cur.right = new TreeNode(i);
			cur = cur.right;
		}
		return ans.right;

	}

	private static void increasingBST_inOrder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		increasingBST_inOrder(root.left, list);
		list.add(root.val);
		increasingBST_inOrder(root.right, list);
	}

	public static boolean isMonotonic(int[] A) {
		return isMonotonic_increase(A) || isMonotonic_decrease(A);
	}

	public static int numSpecialEquivGroups(String[] A) {
		Set<String> seen = new HashSet<>();
		for (String s : A) {
			int[] count = new int[52];
			for (int i = 0; i < s.length(); i++) {
				count[s.charAt(i) - 'a' + 26 * (i % 2)]++;
			}
			seen.add(Arrays.toString(count));
		}
		return seen.size();
	}

	public static int surfaceArea(int[][] grid) {
		int[] dr = new int[] { 0, 1, 0, -1 };
		int[] dc = new int[] { 1, 0, -1, 0 };

		int N = grid.length;
		int ans = 0;

		for (int r = 0; r < N; ++r)
			for (int c = 0; c < N; ++c)
				if (grid[r][c] > 0) {
					ans += 2;
					for (int k = 0; k < 4; ++k) {
						int nr = r + dr[k];
						int nc = c + dc[k];
						int nv = 0;
						if (0 <= nr && nr < N && 0 <= nc && nc < N)
							nv = grid[nr][nc];

						ans += Math.max(grid[r][c] - nv, 0);
					}
				}

		return ans;
	}

	public static int[] fairCandySwap(int[] A, int[] B) {
		int a = 0, b = 0;
		for (int i : A) {
			a += i;
		}
		for (int i : B) {
			b += i;
		}
		int delta = (b - a) / 2;
		Set<Integer> setB = new HashSet<>();
		for (int i : B) {
			setB.add(i);
		}
		for (int i : A) {
			if (setB.contains(i + delta)) {
				return new int[] { i, i + delta };
			}
		}
		throw null;
	}

	public static String[] uncommonFromSentences(String A, String B) {
		String[] a = A.split("\\s+");
		String[] b = B.split("\\s+");
		HashMap<String, Integer> adup = new HashMap<>();
		HashMap<String, Integer> bdup = new HashMap<>();
		List<String> ans = new ArrayList<>();
		for (String s : a) {
			if (adup.containsKey(s)) {
				adup.put(s, adup.get(s) + 1);
			} else {
				adup.put(s, 1);
			}
		}
		for (String s : b) {
			if (bdup.containsKey(s)) {
				bdup.put(s, bdup.get(s) + 1);
			} else {
				bdup.put(s, 1);
			}
		}
		for (String s : a) {
			if (adup.get(s) == 1 && !bdup.containsKey(s) && !ans.contains(s)) {
				ans.add(s);
			}
		}
		for (String s : b) {
			if (bdup.get(s) == 1 && !adup.containsKey(s) && !ans.contains(s)) {
				ans.add(s);
			}
		}
		String[] final_ans = new String[ans.size()];
		for (int i = 0; i < final_ans.length; i++) {
			final_ans[i] = ans.get(i);
		}
		return final_ans;

	}

	public static int projectionArea(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			int row = 0;
			int col = 0;
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] > 0) {
					count++;
				}
				row = Math.max(row, grid[i][j]);
				col = Math.max(col, grid[j][i]);
			}
			count += row + col;
		}
		return count;
	}

	public static ListNode middleNode(ListNode head) {
		List<ListNode> list = new ArrayList<>();
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		return list.get(list.size() / 2);
	}

	public static int robotSim(int[] commands, int[][] obstacles) {
		int[] dx = new int[] { 0, 1, 0, -1 };
		int[] dy = new int[] { 1, 0, -1, 0 };
		int x = 0, y = 0, di = 0;

		// Encode obstacles (x, y) as (x+30000) * (2^16) + (y+30000)
		Set<Long> obstacleSet = new HashSet();
		for (int[] obstacle : obstacles) {
			long ox = (long) obstacle[0] + 30000;
			long oy = (long) obstacle[1] + 30000;
			obstacleSet.add((ox << 16) + oy);
		}

		int ans = 0;
		for (int cmd : commands) {
			if (cmd == -2) // left
				di = (di + 3) % 4;
			else if (cmd == -1) // right
				di = (di + 1) % 4;
			else {
				for (int k = 0; k < cmd; ++k) {
					int nx = x + dx[di];
					int ny = y + dy[di];
					long code = (((long) nx + 30000) << 16) + ((long) ny + 30000);
					if (!obstacleSet.contains(code)) {
						x = nx;
						y = ny;
						ans = Math.max(ans, x * x + y * y);
					}
				}
			}
		}

		return ans;
	}

	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		leafSimilar_loadLeaf(root1, l1);
		leafSimilar_loadLeaf(root2, l2);
		return l1.equals(l2);
	}

	private static void leafSimilar_loadLeaf(TreeNode r, List<Integer> list) {
		if (r != null) {
			if (r.left == null && r.right == null)
				list.add(r.val);
			leafSimilar_loadLeaf(r.left, list);
			leafSimilar_loadLeaf(r.right, list);
		}

	}

	public static int binaryGap(int n) {
		String s = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '1') {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == '1') {
						count = Math.max(j - i, count);
						break;
					}
				}
			}
		}
		return count;

	}

	public static int[][] transpose(int[][] matrix) {
		int[][] transpose = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[i].length; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		return transpose;
	}

	public static boolean lemonadeChange(int[] bills) {
		int five = 0;
		int ten = 0;
		int twenty = 0;
		for (int bill : bills) {
			if (bill == 5) {
				five++;
			}
			if (bill == 10) {
				ten++;
				five--;
			}
			if (bill == 20) {
				twenty++;
				if (ten != 0) {
					ten--;
					five--;
				} else {
					five -= 3;
				}
			}
			if (five < 0 || ten < 0 || twenty < 0) {
				return false;
			}
		}
		return true;
	}

	public static int peakIndexInMountainArray(int[] arr) {
		int i = 0;
		while (arr[i] < arr[i + 1]) {
			i++;
		}
		return i;
	}

	public static boolean backspaceCompare(String S, String T) {
		String s = backspaceCompare_Trim(S);
		String t = backspaceCompare_Trim(T);
		return s.equals(t);
	}

	private static String backspaceCompare_Trim(String S) {
		String s = "";
		for (int i = 0; i < S.length(); i++) {
			if (!Character.toString(S.charAt(i)).equals("#")) {
				s += Character.toString(S.charAt(i));
			} else {
				if (s.length() != 0) {
					s = s.substring(0, s.length() - 1);
				}
			}
		}
		return s;
	}

	public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if (rec1[0] == rec1[2] || rec1[1] == rec1[3] || rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
			return false;
		}
		return !(rec1[2] <= rec2[0] || rec1[3] <= rec2[1] || rec1[0] >= rec2[2] || rec1[1] >= rec2[3]);
	}

	public static int[][] flipAndInvertImage(int[][] image) {
		for (int[] ints : image) {
			flipAndInvertImage_flip(ints);
			flipAndInvertImage_Invert(ints);
		}
		return image;
	}

	private static void flipAndInvertImage_flip(int[] image) {
		int i = 0;
		int j = image.length - 1;
		while (j >= i) {
			int cur = image[i];
			image[i] = image[j];
			image[j] = cur;
			i++;
			j--;
		}
	}

	private static void flipAndInvertImage_Invert(int[] image) {
		for (int i = 0; i < image.length; i++) {
			image[i] = image[i] == 0 ? 1 : 0;
		}
	}

	public static List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> ans = new ArrayList<>();
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			if (j == s.length() - 1 || s.charAt(j) != s.charAt(j + 1)) {
				if (j - i + 1 >= 3) {
					ans.add(Arrays.asList(i, j));
				}
				i = j + 1;
			}
		}
		return ans;
	}

	public static String toGoatLatin(String S) {
		String[] word = S.split("\\s+");
		String sb = "";
		int round = 1;
		for (int i = 0; i < word.length; i++) {
			if (toGoatLatin_isVowel(Character.toLowerCase(word[i].charAt(0)))) {
				sb += word[i];
				sb += "ma";
				for (int j = 0; j < round; j++) {
					sb += "a";

				}
			} else {
				sb += word[i].substring(1);
				sb += Character.toString(word[i].charAt(0));
				sb += "ma";
				for (int j = 0; j < round; j++) {
					sb += "a";
				}
			}
			sb += i == word.length - 1 ? "" : " ";
			round++;
		}
		return sb;
	}

	private static boolean toGoatLatin_isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static String mostCommonWord(String paragraph, String[] banned) {
		HashSet<String> ban = new HashSet<>();
		HashMap<String, Integer> map = new HashMap<>();
		String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
		String[] words = normalizedStr.split("\\s+");
		Collections.addAll(ban, banned);
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		String ans = "";
		int freq = 0;
		for (String s : words) {
			if (map.get(s) > freq && !ban.contains(s)) {
				ans = s;
				freq = map.get(s);
			}
		}
		return ans;
	}

	public static double largestTriangleArea(int[][] points) {
		int N = points.length;
		double ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					ans = Math.max(ans, area(points[i], points[j], points[k]));
				}
			}
		}
		return ans;
	}

	private static double area(int[] P, int[] Q, int[] R) {
		return 0.5 * Math.abs(P[0] * Q[1] + Q[0] * R[1] + R[0] * P[1] - P[1] * Q[0] - Q[1] * R[0] - R[1] * P[0]);
	}

	public static List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> counts = new HashMap();
		for (String domain : cpdomains) {
			String[] cpinfo = domain.split("\\s+");
			String[] frags = cpinfo[1].split("\\.");
			int count = Integer.valueOf(cpinfo[0]);
			String cur = "";
			for (int i = frags.length - 1; i >= 0; --i) {
				cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
				counts.put(cur, counts.getOrDefault(cur, 0) + count);
			}
		}

		List<String> ans = new ArrayList();
		for (String dom : counts.keySet())
			ans.add("" + counts.get(dom) + " " + dom);
		return ans;
	}

	public static int[] numberOfLines(int[] widths, String S) {
		int lines = 1, width = 0;
		for (char c : S.toCharArray()) {
			int w = widths[c - 'a'];
			width += w;
			if (width > 100) {
				lines++;
				width = w;
			}
		}

		return new int[] { lines, width };
	}

	public static int uniqueMorseRepresentations(String[] words) {
		String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Set<String> set = new HashSet<>();
		for (String s : words) {
			StringBuilder sb = new StringBuilder();
			for (char c : s.toCharArray()) {
				sb.append(code[c - 'a']);
			}
			set.add(sb.toString());
		}
		return set.size();
	}

	public static boolean rotateString(String A, String B) {
		if (A.equals(B)) {
			return true;
		}
		if (A.equals("")) {
			return false;
		}
		String s = A.substring(1) + A.charAt(0);
		while (!s.equals(A)) {
			if (s.equals(B)) {
				return true;
			}
			s = s.substring(1) + s.charAt(0);
		}
		return false;
	}

	public static int rotatedDigits(int N) {
		int count = 0;
		for (int i = 0; i <= N; i++) {
			if (rotatedDigitsisGood(i)) {
				count++;
			}
		}
		return count;

	}

	private static boolean rotatedDigitsisGood(int n) {
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
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(Character.toString(s.charAt(i)))) {
				return false;
			}
			rotate += map.get(Character.toString(s.charAt(i)));
		}
		return !rotate.equals(s);
	}

	public static int minDiffInBST(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		minDiffInBSTPreOrder(root, list);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i + 1 < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int diff = Math.abs(list.get(j) - list.get(i));
				min = Math.min(min, diff);
			}
		}
		return (min == Integer.MAX_VALUE) ? 0 : min;

	}

	private static void minDiffInBSTPreOrder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		list.add(root.val);
		minDiffInBSTPreOrder(root.left, list);
		minDiffInBSTPreOrder(root.right, list);

	}

	public static int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (char c : jewels.toCharArray()) {
			set.add(c);
		}
		for (char c : stones.toCharArray()) {
			if (set.contains(c)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isToeplitzMatrix(int[][] matrix) {
		int i = 0;
		int j = 0;
		while (i < matrix.length) {
			while (j < matrix[i].length) {
				try {
					if (matrix[i][j] != matrix[i + 1][j + 1]) {
						return false;
					}
					j++;
				} catch (Exception e) {
					break;
				}
			}
			i++;
			j = 0;
		}
		return true;

	}

	public static int[] anagramMappings(int[] A, int[] B) {
		int[] P = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (B[j] == A[i]) {
					P[i] = j;
				}
			}
		}
		return P;
	}

	public static String shortestCompletingWord(String licensePlate, String[] words) {

		List<String> ans = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			boolean fit = true;

			List<Character> list = new ArrayList<>();
			for (char c : words[i].toCharArray()) {
				list.add(c);
			}

			for (int j = 0; j < licensePlate.length(); j++) {
				char curr = licensePlate.charAt(j);

				if (Character.isLetter(curr)) {
					curr = Character.toLowerCase(curr);
					if (list.contains(curr)) {
						list.remove(curr);
					} else {
						fit = false;
					}
				}

			}
			if (fit) {
				ans.add(words[i]);
			}
		}
		int len = Integer.MAX_VALUE;
		String final_ans = "";
		for (int i = 0; i < ans.size(); i++) {
			if (len > ans.get(i).length()) {
				len = ans.get(i).length();
				final_ans = ans.get(i);
			}
		}
		return final_ans;
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
				// System.out.println("si: " + si);
				// System.out.println("sj: " + sj);
				// System.out.println("----------------------");
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
			s.append(Character.toLowerCase(str.charAt(i)));
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
				sb.append(word[i].charAt(j));
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
		return grid[i][j - 1] == 0;

	}

	private static boolean checkRight(int i, int j, int[][] grid) {
		if (j == grid[i].length - 1) {
			return true;
		} else
			return grid[i][j + 1] == 0;

	}

	private static boolean checkUp(int i, int j, int[][] grid) {
		if (i == 0) {
			return true;
		} else
			return grid[i - 1][j] == 0;
	}

	private static boolean checkDown(int i, int j, int[][] grid) {
		if (i == grid.length - 1) {
			return true;
		} else
			return grid[i + 1][j] == 0;
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
			s.append(add);
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
		return s + num;

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
		return (int) Math.pow(square, 2) == num;
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
		return int1[0] != int2[0] || int1[int1.length - 1] != int2[int2.length - 1];
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

	public static int numOfinversion(int[] arr, int start, int end) {
		int inversion = 0;
		if (start < end) {
			int mid = (start + end) / 2;
			inversion += numOfinversion(arr, start, mid);
			inversion += numOfinversion(arr, mid + 1, end);
			inversion += Merge(arr, start, mid, end);
		}
		return inversion;
	}

	public static int Merge(int[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int inversion = 0;
		/* Create temp arrays */
		int[] L = new int[n1];
		int[] R = new int[n2];

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

	public static void merge(int[] arr, int start, int mid, int end) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - start + 1;
		System.out.println("start is " + start + " " + "mid is " + mid + " " + "n1 is " + n1);
		int n2 = end - mid;
		System.out.println("end is " + end + " " + "n2 is " + n2);

		/* Create temp arrays */
		int[] L = new int[n1];
		int[] R = new int[n2];

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
	public static void mergeSort(int[] arr, int start, int end) {
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
				s.append(nums[i]);
				l.add(s.toString());
				s.setLength(0);
			} else {
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
		return reverse(x) == x;

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

	private static boolean isMonotonic_increase(int[] A) {
		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] > A[i]) {
				return false;
			}
		}
		return true;
	}

	private static boolean isMonotonic_decrease(int[] A) {
		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] < A[i]) {
				return false;
			}
		}
		return true;
	}

	public int[] numMovesStones(int a, int b, int c) {
		int[] s = { a, b, c };
		Arrays.sort(s);
		if (s[2] - s[0] == 2) {
			return new int[] { 0, 0 };
		}
		return new int[] { Math.min(s[1] - s[0], s[2] - s[1]) <= 2 ? 1 : 2, s[2] - s[0] - 2 };
	}

	public int findSpecialInteger(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		double ans = 0.25 * arr.length;
		for (int k : arr) {
			if (!map.containsKey(k)) {
				map.put(k, 1);
			} else {
				map.put(k, map.get(k) + 1);
			}
		}
		for (int j : arr) {
			if (map.get(j) > ans) {
				return j;
			}
		}
		return 0;

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
}
