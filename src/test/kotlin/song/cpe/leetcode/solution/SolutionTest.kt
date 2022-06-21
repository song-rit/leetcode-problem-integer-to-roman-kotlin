package song.cpe.leetcode.solution

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class SolutionTest {

    var solution: Solution = Solution()

    companion object {
        @JvmStatic
        fun inputs(): List<Arguments> {
            return listOf(
                Arguments.of(4, "IV"),
            )
        }
    }

    @ParameterizedTest
    @MethodSource("inputs")
    fun romanToInt(input: Int, expectedValue: String) {
        val result = solution.intToRoman(input)
        Assertions.assertEquals(expectedValue, result)
    }
}
