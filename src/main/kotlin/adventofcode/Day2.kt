package adventofcode

import kotlin.time.ExperimentalTime

object Day2 {
    fun part1(input: List<String>): Int {
        return pairs(input)
            .map { score(it) + shapeScore(it.second) }
            .sumOf { it }
    }

    fun part2(input: List<String>): Int {
        return pairs(input)
            .map {
                when (it.second) {
                    "X" -> 0
                    "Y" -> 3
                    "Z" -> 6
                    else -> 0
                } + shapeScore2(it)
            }.sumOf { it }
    }

    //    X -> lose
    //    Y -> draw
    //    Z -> win
    private fun shapeScore2(pair: Pair<String, String>) = when (pair) {
        "A" to "X" -> 3
        "A" to "Y" -> 1
        "A" to "Z" -> 2
        "B" to "X" -> 1
        "B" to "Y" -> 2
        "B" to "Z" -> 3
        "C" to "X" -> 2
        "C" to "Y" -> 3
        "C" to "Z" -> 1
        else -> 0
    }

    private fun pairs(input: List<String>) = input.map {
        val split = it.split(" ")
        split[0] to split[1]
    }

    private fun shapeScore(shape: String) = when (shape) {
        "X" -> 1
        "Y" -> 2
        "Z" -> 3
        else -> 0
    }

    // A, X -> rock
    // B, Y -> paper
    // C, Z -> scissors
    private fun score(pair: Pair<String, String>): Int {
        return when (pair) {
            "A" to "X", "B" to "Y", "C" to "Z" -> 3
            "A" to "Y", "B" to "Z", "C" to "X" -> 6
            "A" to "Z", "B" to "X", "C" to "Y" -> 0
            else -> 0
        }
    }

    @JvmStatic
    @OptIn(ExperimentalTime::class)
    fun main(args: Array<String>) {
        val input = Utils.readLines("day2.txt")

        Utils.printResult("part 1") { part1(input) }
        Utils.printResult("part 2") { part2(input) }
    }
}