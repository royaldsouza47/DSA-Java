import java.util.*;

public class combinationsum2 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // sort first!
        solve(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    public static void solve(int[] candidates, int index, int remaining,
                              List<Integer> current, List<List<Integer>> result) {

        // Base case: found valid combination
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each element from index onwards
        for (int i = index; i < candidates.length; i++) {

            // Skip duplicates at same level
            if (i > index && candidates[i] == candidates[i - 1]) continue;

            // If current element exceeds remaining → stop (sorted array!)
            if (candidates[i] > remaining) break;

            // Take current element
            current.add(candidates[i]);
            solve(candidates, i + 1, remaining - candidates[i], current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum2(candidates, 8));
        // [[1,1,6], [1,2,5], [1,7], [2,6]]
    }
}