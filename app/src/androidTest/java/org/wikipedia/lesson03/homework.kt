package org.wikipedia.lesson03

import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatImageView
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.textview.MaterialTextView
import org.wikipedia.views.AppTextView
import org.wikipedia.views.FaceAndColorDetectImageView

// first screen
val logoImage = listOf(
    AppCompatImageView::class.java,
    "imageViewCentered",
)

val textDescriptionApp = listOf(
    AppTextView::class.java,
    "primaryTextView",
    "onboarding_welcome_title_v2"
)

val languageListContainer = listOf(
    LinearLayout::class.java,
    "languageListContainer"
)

val languageInList = listOf(
    AppTextView::class.java,
    "option_label",

    )

val addLanguageButton = listOf(
    MaterialButton::class.java,
    "addLanguageButton",
    "onboarding_multilingual_add_language_text"
)
/*
val skipButton = listOf(
    MaterialButton::class.java,
    "fragment_onboarding_skip_button",
    "onboarding_skip"
)
*/
val pageIndicator = listOf(
    TabLayout::class.java,
    "view_onboarding_page_indicator"
)

val continueButton = listOf(
    MaterialButton::class.java,
    "fragment_onboarding_forward_button",
    "onboarding_continue"
)

//Main screen

val mainToolbar = listOf(
    MaterialToolbar::class.java,
    "main_toolbar"
)

val appTitleText = listOf(
    AppCompatImageView::class.java,
    "main_toolbar_wordmark",
)

val searchButton = listOf(
    AppCompatImageView::class.java
)

val searchTextField = listOf(
    MaterialTextView::class.java,
    null,
    "search_hint"
)

val voiceSearchButton = listOf(
    AppCompatImageView::class.java,
    "voice_search_button"
)

val headerImage = listOf(
    FaceAndColorDetectImageView::class.java,
    "view_announcement_header_image"
)

val customizeText = listOf(
    MaterialTextView::class.java,
    "view_announcement_text",
)

val customizeButton = listOf(
    MaterialButton::class.java,
    "view_announcement_action_positive",
    "feed_configure_onboarding_action"
)