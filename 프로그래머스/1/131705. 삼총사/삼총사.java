import java.util.stream.IntStream;
class Solution {
    public int solution(int[] number) {
        return (int) IntStream.range(0, number.length - 2)
                .flatMap(i -> IntStream.range(i + 1, number.length - 1)
                .flatMap(j -> IntStream.range(j + 1, number.length )
                .filter(k -> number[i] + number[j] + number[k] == 0)))
                .count();
    }
}