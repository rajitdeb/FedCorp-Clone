package com.rajit.fedcorpclone.components.homepage.useractions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rajit.fedcorpclone.R
import com.rajit.fedcorpclone.ui.theme.DarkBlue
import com.rajit.fedcorpclone.util.Constants

@Preview(showBackground = true)
@Composable
fun UserActions() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 90.dp),
        userScrollEnabled = false,
        contentPadding = PaddingValues(vertical = 16.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .background(DarkBlue)
            .fillMaxWidth()
            .height(300.dp),
    ) {
        items(Constants.userActions.size) { position ->

            val currentItem = Constants.userActions[position]

            UserActionItem(
                iconId = currentItem.iconId,
                iconLabel = currentItem.label
            )
        }
    }
}

@Composable
fun UserActionItem(iconId: Int, iconLabel: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {

        Icon(
            painter = painterResource(id = iconId),
            tint = colorResource(id = R.color.orange),
            contentDescription = null,
            modifier = Modifier
                .height(32.dp)
                .background(color = Color.White, shape = CircleShape)
                .padding(4.dp)
        )

        Text(
            iconLabel,
            style = TextStyle(color = Color.White, fontSize = 13.sp),
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}