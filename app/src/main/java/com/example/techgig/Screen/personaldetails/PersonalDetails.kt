package com.example.techgig.Screen.personaldetails

import android.annotation.SuppressLint
import android.widget.ScrollView
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.BottomSheetState
import androidx.compose.material.BottomSheetValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.techgig.Screen.SplashScreen
import com.example.techgig.Screen.gothrough.gothrough
import com.example.techgig.ui.theme.TechGigTheme
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun personaldetails() {

    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()
        //val bottomSheetState =rememberModalBottomSheetState()
    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState(bottomSheetState =
    BottomSheetState(BottomSheetValue.Collapsed)
    )
    val modalSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        confirmValueChange = { it != ModalBottomSheetValue.HalfExpanded },
        skipHalfExpanded = false
    )
    BoxWithConstraints {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {
            val (scroll, content,headingtv,submit) = createRefs()

            Text(text = "Personal Details", textAlign = TextAlign.Center, color = Color.Gray, style = TextStyle(fontSize = 20.sp),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .constrainAs(headingtv) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    })

            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .height(55.dp)
                .padding(top = 10.dp)
                .constrainAs(submit) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                },onClick = {
                coroutineScope.launch {
                    if (modalSheetState.isVisible)
                        modalSheetState.hide()
                    else
                        modalSheetState.show()
                    //
                }
               // bottomSheetState.show()
                //your onclick code here
            },elevation =  ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp,

                )

            ) {
                Text(text = "Login")
            }


            Box(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 100.dp)
                    .constrainAs(scroll) {
                        top.linkTo(headingtv.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(scrollState)

                )
                {
                    // Add your content here
                    // ...
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 1") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 2") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 3") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 4") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 5") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 6") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 6") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 6") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 6") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 6") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("EditText 9") },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    )
                }
                }


            ModalBottomSheetLayout(
                sheetState = modalSheetState,
                sheetShape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp),
                modifier = Modifier.fillMaxWidth(),
                sheetElevation = 50.dp,

                sheetContent = {

                    Column(

                        //...
                    ) {
                        //...

                        Button(
                            onClick = {
                                coroutineScope.launch { modalSheetState.hide() }
                            }
                        ) {
                            Text(text = "Hide Sheet", modifier = Modifier.height(200.dp))
                        }
                    }
                }
            ) {
//                Scaffold {
//                    Box(
//                        //...
//                    ) {
//                        Button(
//                            onClick = {
//                                coroutineScope.launch {
//                                    if (modalSheetState.isVisible)
//                                        modalSheetState.hide()
//                                    else
//                                        modalSheetState.show()
//                                 //       modalSheetState.animateTo(ModalBottomSheetValue.Expanded)
//                                }
//                            },
//                        ) {
//                            Text(text = "Open Sheet")
//                        }
//                    }
//                }
            }

            }

        }

    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TechGigTheme {
        personaldetails()
    }
}

