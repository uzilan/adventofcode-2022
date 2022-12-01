package adventofcode

import kotlin.time.ExperimentalTime

object Day1 {
    fun part1(input: String): Int {
        return lines(input)
            .maxOf { it }
    }

    fun part2(input: String): Int {
        return lines(input)
            .sorted()
            .takeLast(3)
            .sumOf { it }
    }

    private fun lines(input: String) = input.split("\n\n")
        .map { lines ->
            lines.split("\n")
                .sumOf { it.toInt() }
        }

    @JvmStatic
    @OptIn(ExperimentalTime::class)
    fun main(args: Array<String>) {
        val input = Utils.readText("day1.txt")

        Utils.printResult("part 1") { part1(input) }
        Utils.printResult("part 2") { part2(input) }
    }
}
