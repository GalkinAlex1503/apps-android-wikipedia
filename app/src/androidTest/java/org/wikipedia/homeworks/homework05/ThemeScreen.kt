package org.wikipedia.homeworks.homework05

import com.google.android.material.textview.MaterialTextView
import io.github.kakaocup.kakao.progress.KSeekBar
import io.github.kakaocup.kakao.switch.KSwitch
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

val captionReading = KTextView {
    withId(R.id.textSettingsCategory)
    withText(R.string.theme_category_reading)
}

val sizeTextSeekBar = KSeekBar {
    withId(R.id.text_size_seek_bar)
}

val buttonFontSensSerif = KButton{
    withId(R.id.button_font_family_sans_serif)
}

val buttonFontSerif = KButton{
    withId(R.id.button_font_family_serif)
}

val captionTheme = KTextView{
    withParent { isInstanceOf(MaterialTextView::class.java) }
    withText(R.string.color_theme_select)
}

val buttonThemeLight = KButton{
    withId(R.id.button_theme_light)
}

val buttonThemeSepia = KButton{
    withId(R.id.button_theme_sepia)
}

val buttonThemeDark = KButton{
    withId(R.id.button_theme_dark)
}

val buttonThemeBlack = KButton{
    withId(R.id.button_theme_black)
}

val themeSwitchSystemTheme = KSwitch{
    withId(R.id.theme_chooser_match_system_theme_switch)
    withText(R.string.theme_chooser_dialog_match_system_theme_switch_label)
}

val themeSwitchDarkMode = KSwitch{
    withId(R.id.theme_chooser_dark_mode_dim_images_switch)
    withText(R.string.theme_chooser_dialog_image_dimming_switch_label)
}

fun main() {
    captionReading.isVisible()
    sizeTextSeekBar.isDisplayed()
}