package org.wikipedia.homeworks.homework08

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework03.addLanguageButton
import org.wikipedia.main.MainActivity

class ExploreTestScreen : TestCase() {

    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    private val numOfPage = 3

    @Test
    fun logoTest() {
        run {
            repeat(numOfPage) { page ->
                step("Checking the display of the logo on the page $page") {
                    OnboardingScreen.onboardingPage.childAt<OnboardingPageItem>(page) {
                        icon.isDisplayed()
                    }
                }
                step("Let's move on to the next page") {
                    OnboardingScreen.forwardButton.click()
                }
            }
        }
    }

    @Test
    fun primaryTitleTest() {
        run {
            repeat(numOfPage) { page ->
                step("Checking the display of the title text field on the page $page") {
                    OnboardingScreen.onboardingPage.childAt<OnboardingPageItem>(page) {
                        textTitle.isDisplayed()
                    }
                }
                step("Let's move on to the next page") {
                    OnboardingScreen.forwardButton.click()
                }
            }
        }
    }

    @Test
    fun secondaryTitleTest() {
        run {
            repeat(numOfPage) { page ->
                step("Checking the display of the second text field on the page $page") {
                    OnboardingScreen.onboardingPage.childAt<OnboardingPageItem>(page) {
                        secondTextTitle.isDisplayed()
                    }
                }
                step("Let's move on to the next page") {
                    OnboardingScreen.forwardButton.click()
                }
            }
        }
    }

    @Test
    fun addLanguageButtonTest() {
        run {
            step("Checking the display of the (Add or change language) button") {
                OnboardingScreen.onboardingPage.childAt<OnboardingPageItem>(0) {
                    addLanguageButton.isDisplayed()
                }
            }
            step("Checking the click of the (Add or change language) button") {
                OnboardingScreen.onboardingPage.childAt<OnboardingPageItem>(0) {
                    addLanguageButton.isClickable()
                }
            }
        }
    }

    @Test
    fun bottomButtonSkipTest() {
        run {
            step("Checking the display button (Skip)") {
                OnboardingScreen.skipButton.isDisplayed()
            }

            step("Checking the click button (Skip)") {
                OnboardingScreen.skipButton.isClickable()
            }

            step("Checking click on button (Skip)") {
                OnboardingScreen.skipButton.click()
            }
        }
    }

    @Test
    fun pageIndicatorTest() {
        run {
            step("Checking page indicator") {
                OnboardingScreen.pageIndicator.isDisplayed()
            }
        }
    }

    @Test
    fun bottomButtonContinueTest() {
        run {
            step("Checking the display button (Continue)") {
                OnboardingScreen.forwardButton.isDisplayed()
            }

            step("Checking the click button (Continue)") {
                OnboardingScreen.forwardButton.isClickable()
            }

            step("Checking click on button (Continue)") {
                OnboardingScreen.forwardButton.click()
            }
        }
    }

    @Test
    fun addLanguageTest() {
        run {
            step("Checking the display button (Add or edit language)") {
                OnboardingScreen.onboardingPage.childAt<OnboardingPageItem>(0) {
                    addLanguageButton.isDisplayed()
                }
            }

            step("Checking click on button (Add or edit language)") {
                OnboardingScreen.onboardingPage.childAt<OnboardingPageItem>(0) {
                    addLanguageButton.click()
                }
            }
        }
    }
}