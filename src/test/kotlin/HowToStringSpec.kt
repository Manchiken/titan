import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class HowToStringSpec : StringSpec ({
    "2 + 2 = 4"{
        (2 + 2) shouldBe 4
    }
})