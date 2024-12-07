package org.ramesh.kobwebsample.pages.admin

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.outline
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Input
import org.ramesh.kobwebsample.models.Theme
import org.ramesh.kobwebsample.pages.styles.LoginInputStyle
import org.ramesh.kobwebsample.util.Constants.FONT_FAMILY
import org.ramesh.kobwebsample.util.Res

@Page
@Composable
fun LoginPage() {
    val errorText by remember { mutableStateOf("") }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(leftRight = 80.px, topBottom = 50.px)
                .background(Theme.LightGray.rgb),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.width(100.px).margin(bottom = 50.px),
                src = Res.Image.logo,
                description = "Logo"
            )
            Input(
                type = InputType.Text,
                attrs = LoginInputStyle.toModifier()
                    .width(300.px).height(55.px)
                    .margin(bottom = 12.px)
                    .padding(leftRight = 20.px)
                    .background(Colors.White)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(16.px)
                    .fontWeight(FontWeight.Medium)
                    .outline(
                        width = 0.px,
                        style = LineStyle.None,
                        color = Colors.Transparent
                    )
                    .toAttrs {
                        attr("placeholder", "Username")
                    }
            )
            Input(
                type = InputType.Password,
                attrs = LoginInputStyle.toModifier()
                    .width(300.px).height(55.px)
                    .margin(bottom = 20.px)
                    .padding(leftRight = 20.px)
                    .background(Colors.White)
                    .fontSize(16.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Medium)
                    .outline(
                        width = 0.px,
                        style = LineStyle.None,
                        color = Colors.Transparent
                    )
                    .toAttrs {
                        attr("placeholder", "Password")
                    }
            )
            Button(
                attrs = Modifier
                    .width(300.px).height(55.px)
                    .margin(bottom = 20.px)
                    .border(
                        width = 0.px,
                        style = LineStyle.None,
                        color = Colors.Transparent
                    )
                    .background(Theme.Primary.rgb)
                    .borderRadius(4.px)
                    .fontSize(16.px)
                    .outline(
                        width = 0.px,
                        style = LineStyle.None,
                        color = Colors.Transparent
                    )
                    .color(Colors.White)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Medium)
                    .toAttrs()
            ) {
                SpanText("SIgnIn")
            }
            SpanText(
                modifier = Modifier.width(350.px).color(Colors.Red).textAlign(TextAlign.Center),
                text = errorText
            )
        }
    }
}