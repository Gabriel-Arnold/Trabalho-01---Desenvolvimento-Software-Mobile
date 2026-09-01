package up.trabalho01.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun home() {
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Column() {
            Text(text = "Saldo", fontSize = 18.sp)
            Text(text = "R$ 08,32", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(modifier = Modifier.fillMaxWidth().height(150.dp)) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text( text = "Assine o clube.", fontSize = 25.sp)
            }
        }

        Card(modifier = Modifier.fillMaxWidth().height(150.dp)) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    var limit = 100f
                    var used = 80f
                    Text(
                        text = "Limite",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(
                        modifier = Modifier.height(30.dp)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "R$ %.2f".format(used))
                        Text(text = "R$ %.2f".format(limit))
                    }
                    Spacer(
                        modifier = Modifier.height(6.dp)
                    )
                    LinearProgressIndicator(
                        progress = {
                            if (limit > 0) used / limit else 0f
                        },
                        modifier = Modifier.fillMaxWidth().height(10.dp)
                    )

                }
            }
        }
    }
}