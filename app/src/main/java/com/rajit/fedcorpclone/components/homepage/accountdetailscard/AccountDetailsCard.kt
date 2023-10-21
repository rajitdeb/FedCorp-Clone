import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rajit.fedcorpclone.R

@Preview(showBackground = true)
@Composable
fun AccountDetailsCard() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

//        Icon(
//            painter = painterResource(id = R.drawable.ic_previous),
//            tint = Color.DarkGray,
//            contentDescription = "See Previous Account"
//        )

//        Spacer(modifier = Modifier.width(4.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
            ) {

                // FEDERAL BANK BRANDING
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .padding(8.dp),
                    horizontalAlignment = Alignment.End
                ) {

                    Text(
                        "FEDERAL BANK",
                        style = TextStyle(
                            color = Color.White,
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        )
                    )

                    Text(
                        "YOUR PERFECT BANKING PARTNER",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Normal,
                            fontSize = 7.sp
                        )
                    )

                }

                Divider(
                    color = colorResource(id = R.color.orange),
                    thickness = 3.dp
                )

                // Account Owner Name, A/c No. and Available Balance
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                        .padding(16.dp)
                ) {

                    // Account Holder Name Label
                    Text(
                        "Account Holder Name",
                        style = TextStyle(
                            color = Color.LightGray,
                            fontSize = 10.sp
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    // Account Owner Name
                    Text(
                        "BHARTIYA ENTERPRISE",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Black,
                            fontSize = 16.sp
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Account No. Label
                    Text(
                        "Account Number",
                        style = TextStyle(
                            color = Color.LightGray,
                            fontSize = 10.sp
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    // Account No.
                    Text(
                        "00350200000189",
                        style = TextStyle(
                            color = Color.White,
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Available Balance Label
                    Text(
                        "Available Balance",
                        style = TextStyle(
                            color = Color.LightGray,
                            fontSize = 10.sp
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        "Rs. 413699",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        ),
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        "FREEDOM CURRENT ACCOUNT",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        ),
                        modifier = Modifier.align(Alignment.End)
                    )
                }

            }
        }

//        Spacer(modifier = Modifier.width(4.dp))
//
//        Icon(
//            painter = painterResource(id = R.drawable.ic_next),
//            tint = Color.DarkGray,
//            contentDescription = "See Next Account"
//        )

    }

}