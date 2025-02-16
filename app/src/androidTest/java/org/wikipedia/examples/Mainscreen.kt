package org.wikipedia.examples

import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.textview.MaterialTextView
import io.github.kakaocup.kakao.image.KImageView
import org.wikipedia.R

val imageViewCentered = KImageView {
    withId(R.id.imageViewCentered)
}

val textTest = KImageView {
    withText(R.string.view_featured_article_card_title)
    withId(R.id.view_card_header_title)
    isInstanceOf(MaterialTextView::class.java)
    withParent {
        isInstanceOf(ConstraintLayout::class.java)
    }
}

fun main() {
    imageViewCentered.isDisplayed()
}