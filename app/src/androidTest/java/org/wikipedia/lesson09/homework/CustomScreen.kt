package org.wikipedia.lesson09.homework

import androidx.appcompat.widget.AppCompatImageButton
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.toolbar.KToolbar
import org.wikipedia.R

object CustomScreen : KScreen<CustomScreen>() {
    override val layoutId = null
    override val viewClass = null

    val toolBar = KToolbar {
        withId(R.id.toolbar)
    }

    val backButton = KImageView {
        withParent {
            withId(R.id.toolbar)
        }
        isInstanceOf(AppCompatImageButton::class.java)
    }

    val items = KRecyclerView(
        builder = {
            withId(R.id.content_types_recycler)
        },
        itemTypeBuilder = {
            itemType(::CustomRecycler)
        }
    )
}