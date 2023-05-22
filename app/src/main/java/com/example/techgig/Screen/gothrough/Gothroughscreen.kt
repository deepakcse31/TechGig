package com.example.techgig.Screen.gothrough

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.techgig.R
import com.example.techgig.Screen.SplashScreen
import com.example.techgig.Screen.component.ButtonWithElevation
import com.example.techgig.ui.theme.TechGigTheme
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlinx.coroutines.delay

@Composable
fun gothrough(){

    val textList = listOf("Option 1", "Option 2", "Option 3")
    var currentIndex by remember { mutableStateOf(0) }
    val imageList = listOf(
        painterResource(R.drawable.scrollerone),
        painterResource(R.drawable.scrollertwo),
        painterResource(R.drawable.scrollearthree)
    )

    LaunchedEffect(Unit) {
        while (true) {
            delay(1000)
            currentIndex = (currentIndex + 1) % textList.size
        }
    }

    ConstraintLayout(modifier= Modifier
        .fillMaxSize()
        .background(Color.White)) {
        val (image,heding,headingbottom,indicator,login) = createRefs()
        var find : String="Find Your Dream Job"
        var hint :String="Make your carrier in tech"
        Image(painter = painterResource(id = R.drawable.gothrough),
            contentDescription = "content description",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )

        Text(text = textList[currentIndex], textAlign = TextAlign.Center, color = Color.Black, style = TextStyle(fontSize = 30.sp),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .constrainAs(heding) {
                    top.linkTo(image.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })
        Text(text = hint, textAlign = TextAlign.Center, color = Color.Gray, style = TextStyle(fontSize = 20.sp),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .constrainAs(headingbottom) {
                    top.linkTo(heding.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })
        Image(painter = imageList[currentIndex],
            contentDescription = "content description",
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .padding(top = 10.dp)
                .constrainAs(indicator) {
                    top.linkTo(headingbottom.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .height(55.dp)
            .padding(top = 10.dp)
            .constrainAs(login) {
                top.linkTo(indicator.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            },onClick = {
            //your onclick code here
        },elevation =  ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp,

        )

        ) {
            Text(text = "Login")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TechGigTheme {
        gothrough()
    }
}