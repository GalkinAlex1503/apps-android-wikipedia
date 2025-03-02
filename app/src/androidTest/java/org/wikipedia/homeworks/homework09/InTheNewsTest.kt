package org.wikipedia.homeworks.homework09

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework03.OnboardingScreen
import org.wikipedia.homeworks.homework07.screens.main.ExploreScreen
import org.wikipedia.homeworks.homework07.screens.main.SearchCardViewItem
import org.wikipedia.homeworks.homework07.screens.main.TopCardViewItem
import org.wikipedia.main.MainActivity

class InTheNewsTest : TestCase() {

    @get: Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleTest() {
        run{
            step("Skipping") {
                OnboardingScreen.skipButton.click()
            }
            step("Title contains `Featured article`") {
                ExploreScreen.feed.childWith<SearchCardViewItem> {
                    withDescendant {
                        withText("In the news")
                    }
                }
            }
            step("Getting on the third page") {
                ExploreScreen.feed.childWith<SearchCardViewItem> {
                    withDescendant {
                        withText("In the news")
                    }
                }.perform {
                    TopCardViewItem.childAt<SearchCardViewItem>(2) {
                        newsCardImage.click()
                    }
                }
            }
            step("Opening second article") {
                NewsStoryScreen.items.childAt<NewsCardItem>(1) {
                    cardTitleText.click()
                }
            }
            step("Checking for element with ID page_web_view") {
                NewsPage.pageWebView.isDisplayed()
            }
        }
    }
}