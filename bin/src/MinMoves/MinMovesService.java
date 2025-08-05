package MinMoves;
import java.util.Arrays;

public class MinMovesService {
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int median;
        int n = nums.length;
        if (n % 2 == 0) {
            median = nums[n / 2 - 1];
        } else {
            median = nums[n / 2];
        } //В поисках медианы

        int moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - median);
        } //В поисках количества шагов

        return moves;
    }
}
