package adventofcode

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Day4Test : StringSpec({
    val input = Utils.readLines("day4test.txt")

    "Day 4 part 1" {
        Day4.part1(input) shouldBe 2
    }

    "Day 4 part 2" {
        Day4.part2(input) shouldBe 4
    }
})
