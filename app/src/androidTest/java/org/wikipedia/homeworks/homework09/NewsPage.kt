package org.wikipedia.homeworks.homework09

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object NewsPage : KScreen<NewsPage>() {
    override val layoutId = null
    override val viewClass = null

    val pageWebView = KView {
        withId(R.id.page_web_view)
    }

    val pageToolbar = KView {
        withId(R.id.page_toolbar)
    }

    val articleImage = KView {
        withId(R.id.articleImage)
    }

    val articleTitle = KTextView {
        withId(R.id.articleTitle)
    }

    val articleDescription = KTextView {
        withId(R.id.articleDescription)
    }

    val pageToolbarSearchButton = KView {
        withId(R.id.page_toolbar_button_search)
    }

    val pageToolbarTabsButton = KButton {
        withId(R.id.page_toolbar_button_tabs)
    }

    val pageToolbarNotificationsButton = KButton {
        withId(R.id.page_toolbar_button_notifications)
    }

    val pageToolbarMenuButton = KButton {
        withId(R.id.page_toolbar_button_show_overflow_menu)
    }
}