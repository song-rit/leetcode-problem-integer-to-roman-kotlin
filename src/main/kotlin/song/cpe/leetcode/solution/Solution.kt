package song.cpe.leetcode.solution

class Solution {

    enum class RomanNumber(val value: Int) {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000)
    }

    inline fun convertToInteger(romanNumber: String) = RomanNumber.valueOf(romanNumber).value

    fun intToRoman(input: Int): String {

        var num = input
        while (num > 1) {
            when {
                num % convertToInteger(RomanNumber.M.name) == 0 -> {
                    println(RomanNumber.M.name)
                    num /= convertToInteger(RomanNumber.M.name)
                }
                num % convertToInteger(RomanNumber.D.name) == 0 -> {
                    println(RomanNumber.D.name)
                    num /= convertToInteger(RomanNumber.M.name)
                }
                num % convertToInteger(RomanNumber.C.name) == 0 -> {
                    println(RomanNumber.C.name)
                    num /= convertToInteger(RomanNumber.M.name)
                }
                num % convertToInteger(RomanNumber.L.name) == 0 -> {
                    println(RomanNumber.L.name)
                    num /= convertToInteger(RomanNumber.M.name)
                }
                num % convertToInteger(RomanNumber.X.name) == 0 -> {
                    println(RomanNumber.X.name)
                    num /= convertToInteger(RomanNumber.M.name)
                }
                num % convertToInteger(RomanNumber.V.name) == 0 -> {
                    println(RomanNumber.V.name)
                    num /= convertToInteger(RomanNumber.M.name)
                }
                num % convertToInteger(RomanNumber.I.name) == 0 -> {
                    println(RomanNumber.I.name)
                    num /= convertToInteger(RomanNumber.M.name)
                }
            }
        }
        return ""
    }
}
