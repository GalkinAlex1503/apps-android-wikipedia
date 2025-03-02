package org.wikipedia.homeworks.homework09

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class NewsCardItem(matcher: Matcher<View>) : KRecyclerItem<NewsCardItem>(matcher) {

    val cardNumber = KView(matcher) {
        withId(R.id.view_list_card_number)
    }

    val cardTitleText = KTextView(matcher) {
        withId(R.id.view_list_card_item_title)
    }

    val cardSubtitleText = KTextView(matcher) {
        withId(R.id.view_list_card_item_subtitle)
    }

    val cardGraph = KView(matcher) {
        withId(R.id.view_list_card_item_graph)
    }

    val cardPageViews = KTextView(matcher) {
        withId(R.id.view_list_card_item_pageviews)
    }

    val cardImage = KView(matcher) {
        withId(R.id.view_list_card_item_image)
    }
}