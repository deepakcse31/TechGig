package com.example.techgig.Screen

import android.window.SplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

import com.example.techgig.R
import com.example.techgig.Screen.activity.Greeting
import com.example.techgig.ui.theme.TechGigTheme


@Composable
fun SplashScreen() {

    var isLottiePlaying by remember {
        mutableStateOf(true)
    }
    var animationSpeed by remember {
        mutableStateOf(1f)
    }
    val composition by rememberLottieComposition(
        LottieCompositionSpec
            .RawRes(R.raw.oops_lottie)
    )

    // to control the lottie animation
    val lottieAnimation by animateLottieCompositionAsState(
        // pass the composition created above
        composition,
        // Iterates Forever
        iterations = LottieConstants.IterateForever,
        // Lottie and pause/play
        isPlaying = isLottiePlaying,
        // Increasing the speed of change Lottie
        speed = animationSpeed,
        restartOnPlay = false

    )

   // val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.oops_lottie))

    //LottieAnimation(composition)
    ConstraintLayout(modifier= Modifier
        .fillMaxSize()
        .background(Color.White)) {
        // Create references for the composables to constrain
        val (button, text,lotie) = createRefs()


        LottieAnimation(composition = composition,lottieAnimation,Modifier.constrainAs(lotie){
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })

//        Button(
//            onClick = { /* Do something */ },
//            // Assign reference "button" to the Button composable
//            // and constrain it to the top of the ConstraintLayout
//            modifier = Modifier.constrainAs(button) {
//                top.linkTo(parent.top, margin = 16.dp)
//            }
//        )  {
//            Text("Button")
//        }
//
//        // Assign reference "text" to the Text composable
//        // and constrain it to the bottom of the Button composable
//        Text(
//            "Text",
//            Modifier.constrainAs(text) {
//                top.linkTo(button.bottom, margin = 16.dp)
//            }
//        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TechGigTheme {
        SplashScreen()
    }
}