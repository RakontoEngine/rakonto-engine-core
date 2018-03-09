package io.github.rakontoengine.core

import org.junit.jupiter.api.Test

class GameObjectTest {
    @Test
    fun `Can I create GameObject?`() {
        GameObject("TestGameObject")
        println("Yes, you can!")
    }
}