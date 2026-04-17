import java.util.*;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
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

        // Base case: overshot or no elements left
        if (index == candidates.length || remaining < 0) {
            return;
        }

        // Choice 1: TAKE current element (stay at same index!)
        current.add(candidates[index]);
        solve(candidates, index, remaining - candidates[index], current, result);

        // Choice 2: SKIP current element (move to next)
        current.remove(current.size() - 1);
        solve(candidates, index + 1, remaining, current, result);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 5, 4};
        System.out.println(combinationSum(candidates, 7));
        // [[2,2,3], [2,5], [3,4]]
    }
}