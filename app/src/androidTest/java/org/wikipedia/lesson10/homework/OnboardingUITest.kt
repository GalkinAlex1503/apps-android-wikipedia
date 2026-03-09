package org.wikipedia.lesson10.homework

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.lesson08.homework.ExploreScreen
import org.wikipedia.main.MainActivity

class OnboardingUITest : TestCase() {

    @get:Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkSkipButtonOnOnboardingScreen() {
        run("Проверка закрытия экрана Onboarding при нажатии кнопки Skip") {
            step("Нажимает Skip") {
                OnboardingUiScreen.skipButton.click()
            }
            step("Отображение экрана Explore") {
                ExploreScreen.pageLogo.isDisplayed()
            }
        }
    }

    @Test
    fun checkSkipDeviceBackOnOnboardingScreen() {
        run("Проверка скрытия экрана Onboarding по системной кнопке Back") {
            step("Нажимает системную Back") {
                device.uiDevice.pressBack()
            }
            step("Отображение экрана Explore") {
                ExploreScreen.pageLogo.isDisplayed()
            }
        }
    }

    @Test
    fun checkOnboardingPagesScreen() {
        run("Проверка отображения всех элементов Onboarding") {
            OnboardingUiScreen {
                step("Отображение элементов на первой странице") {
                    image.isDisplayed()
                    primaryText.containsText("The Free Encyclopedia")
                    secondaryText.containsText("We’ve found the following on your device:")
                    language.containsText("English")
                    addLanguageButton.isDisplayed()
                    skipButton.isDisplayed()
                    pageIndicator.isDisplayed()
                    continueButton.isDisplayed()
                }
                step("Переход на следующую страницу") {
                    continueButton.click()
                }
                step("Отображение элементов на первой странице") {
                    image.isDisplayed()
                    primaryText.containsText("New ways to explore")
                    secondaryText.containsText("Dive down the Wikipedia")
                    skipButton.isDisplayed()
                    pageIndicator.isDisplayed()
                    continueButton.isDisplayed()
                }
                step("Переход на следующую страницу") {
                    continueButton.click()
                }
                step("Отображение элементов на второй странице") {
                    image.isDisplayed()
                    primaryText.containsText("Reading lists with sync")
                    secondaryText.containsText("Join Wikipedia")
                    skipButton.isDisplayed()
                    pageIndicator.isDisplayed()
                    continueButton.isDisplayed()
                }
                step("Переход на следующую страницу") {
                    continueButton.click()
                }
                step("Отображение элементов на третьей странице") {
                    image.isDisplayed()
                    primaryText.containsText("Data & Privacy")
                    secondaryText.containsText("We believe")
                    skipButton.isDisplayed()
                    pageIndicator.isDisplayed()
                    getStartedButton.isDisplayed()
                }
            }
        }
    }


    @Test
    fun checkPositiveOnboarding() {
        run("Проверка кнопки Get Started на экране Onboarding") {
            OnboardingUiScreen {
                step("Переходит на последнюю страницу Onboarding") {
                    continueButton.click()
                    continueButton.click()
                    continueButton.click()
                }
                step("Проверяет отображение кнопки Get Started") {
                    getStartedButton.isDisplayed()
                }
                step("Нажимает кнопку Get Started") {
                    getStartedButton.click()
                }
            }
            step("Проверяет отображение экрана Explore") {
                ExploreScreen.pageLogo.isDisplayed()
            }
        }
    }
}