package adventofcode

import adventofcode.Utils.readText
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Day6Test : StringSpec({
    val input = readText("day6test.txt")

    "Day 6 part 1" {
        Day6.part1(input) shouldBe 7
    }

    "Day 5 part 2" {
        Day6.part2(input) shouldBe 19
    }
})
