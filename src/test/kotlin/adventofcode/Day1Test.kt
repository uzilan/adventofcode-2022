package adventofcode

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Day1Test : StringSpec({
    val input = Utils.readText("day1test.txt")

    "Day 1 part 1" {
        Day1.part1(input) shouldBe 24000
    }

    "Day 1 part 2" {
        Day1.part2(input) shouldBe 45000
    }
})
