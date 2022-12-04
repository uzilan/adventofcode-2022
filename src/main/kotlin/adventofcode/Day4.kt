package adventofcode

import kotlin.time.ExperimentalTime

object Day4 {
    fun part1(input: List<String>): Int {
        return pairs(input)
            .count {
                it.first().containsAll(it.last())
                    || it.last().containsAll(it.first())
            }
    }

    fun part2(input: List<String>): Int {
        return pairs(input)
            .count { it.first().intersect(it.last()).isNotEmpty() }
    }

    private fun pairs(input: List<String>) = input.map { line ->
        line.split(",")
            .map { pair -> pair.split("-") }
            .map { (it.first().toInt()..it.last().toInt()).toSet() }
    }

    @JvmStatic
    @OptIn(ExperimentalTime::class)
    fun main(args: Array<String>) {
        val input = Utils.readLines("day4.txt")

        Utils.printResult("part 1") { part1(input) }
        Utils.printResult("part 2") { part2(input) }
    }
}
