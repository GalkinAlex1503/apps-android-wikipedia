package org.wikipedia.homeworks.homework06

import androidx.test.espresso.matcher.ViewMatchers.assertThat
import org.hamcrest.TypeSafeMatcher


// Матчер для проверки длины стороны в заданном диапазоне
class SideLengthMatcher(private val min: Float, private val max: Float) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("длина стороны в диапазоне от $min до $max")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.sideLength in min..max
    }
}
fun hasSideLengthInRange(min: Float, max: Float) = SideLengthMatcher(min, max)

// Матчер для проверки отрицательной длины стороны
class NegativeSideLengthMatcher : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("длина стороны не должна быть отрицательной")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.sideLength >= 0
    }
}
fun hasValidSideLength() = NegativeSideLengthMatcher()

// Матчер для проверки отрицательного количества сторон
class NegativeSidesMatcher : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("количество сторон не должно быть отрицательным")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.sides >= 0
    }
}
fun hasValidSides() = NegativeSidesMatcher()

// Матчер для проверки цвета
class ColorMatcher(private val expectedColor: Color) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("фигура должна иметь цвет $expectedColor")
    }
    override fun matchesSafely(item: Shape): Boolean {
        return item.color == expectedColor
    }
}
fun hasColor(expectedColor: Color) = ColorMatcher(expectedColor)

// Фильтрация с использованием allOf
val filteredShapes = shapes.filter { shape ->
    allOf(
        hasSideLengthInRange(1f, 20f),
        hasEvenSides(),
        hasValidSideLength(),
        hasValidSides()
    ).matches(shape)
}

// Примеры ассертов
fun testMatchers() {
    val shape = Shape(10f, 4, Color.RED)
    assertThat(shape, hasSideLengthInRange(1f, 20f))
    assertThat(shape, hasColor(Color.RED))
    assertThat(shape, hasValidSideLength())
    assertThat(shape, hasValidSides())
}

fun main() {
    testMatchers()
    println("Фигуры, прошедшие фильтрацию: $filteredShapes")
}