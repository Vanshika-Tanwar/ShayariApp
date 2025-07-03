package com.example.shayariapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayariapp.Model.ShayariModel
import com.example.shayariapp.ui.theme.primaryLight

@Composable
@Preview
fun DemoMainToolBar() {
    MainToolBar("Demo", { })
}

@Composable
fun MainToolBar(title: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .size(45.dp)
                .clickable { onClick.invoke() },
            colors = CardDefaults.cardColors(containerColor = primaryLight),
            shape = RoundedCornerShape(200.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
        Text(
            text = title, style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            ), color = Color.White, modifier = Modifier.padding(start = 20.dp)
        )
    }
}

fun getList(): List<ShayariModel> {
    return listOf<ShayariModel>(
        ShayariModel(
            "Love", listOf(
                "Tere pyaar mein kho gaye hum,",
                "Dil ki baatien tujhse kehne ko jee chahta hai,",
                "Mohabbat ki raahon mein khud ko paaya hai,",
                "Tere naam se shuru hoti hai meri har khushi,",
                "Teri yaadon mein beeti har raat,",
                "Dil ki duniya mein bas ek tu hi hai,",
                "Tumse milne ki tamanna hai har pal,",
                "Teri aankhon mein kho jaana chahta hoon,",
                "Pyar ka izhaar karne ka mauka chahiye mujhe,",
                "Tere saath bitaaye lamhe yaadgar hain,"
            )
        ),
        ShayariModel(
            "Sad", listOf(
                "Tanhaai mein baithe baithe yeh raat guzar jaaye,",
                "Dard ki raahon mein bichhadna hai humein,",
                "Aansuon ki gehraaiyon mein khud ko kho baithe hain,",
                "Zindagi ke har mod par mujhe tera saath chahiye tha,",
                "Dil ko sukoon nahi milta, har pal teri yaadon se bhara hai,",
                "Chupke se ro lenge hum, jab yaad aaoge tum,",
                "Kuch khoya hai, kuch paana hai, yeh zindagi ki daastan hai,",
                "Dil se roye magar honto se muskura gaye,",
                "Dard ka ehsaas jab hota hai, tab teri yaad aati hai,",
                "Kisi ke pyaar mein khud ko bhool jaane ka dard hai,"
            )
        ),
        ShayariModel(
            "Friendship", listOf(
                "Dosti ka rishta hai anokha,",
                "Dost se judi har yaad meethi hai,",
                "Ek dost ka saath hi kaafi hai,",
                "Dosti ke rang birangi hai,",
                "Dost banaye rakhna har pal, har din,",
                "Dost hai toh zindagi hai,",
                "Dosti ka safar lamba aur khoobsurat hai,",
                "Dost milte hain kam, magar yaadon mein bas jaate hain,",
                "Dosti mein na koi din hai, na koi raat,",
                "Dost hamesha dil se yaad aate hain,"
            )
        ),
        ShayariModel(
            "Motivation", listOf(
                "Himmat na haaro, haar ke baad jeet hai,",
                "Zindagi ki raahon mein chalte raho,",
                "Manzil pane ki koshish kabhi na chhodo,",
                "Udaan bharne ka samay aa gaya hai,",
                "Hauslon se jiye, sapno ko pankh dijiye,",
                "Khud pe bharosa rakho, safalta milegi zaroor,",
                "Har mushkil ko aasan bana sakte ho,",
                "Aage badho, zindagi ka har pal jeet lo,",
                "Zindagi ke har mod par khud ko parakh lo,",
                "Jeetne ki lagan har kadam par honi chahiye,"
            )
        ),
        ShayariModel(
            "Nature", listOf(
                "Har subah ki pehli kiran mein nayi umang hai,",
                "Prakriti ke rangon mein kho jaao,",
                "Hawa ke jhokon se bikharte gulabon ki khushboo,",
                "Pawan ke jhule mein khelte phoolon ki masti,",
                "Nadiyon ki lahron mein beh jaayein,",
                "Hariyali se sajayein apni duniya ko,",
                "Chandni raat mein sitare chamakte hain,",
                "Baadal ki chadar odh kar, baarish ki boondein mehsoos karo,",
                "Hawaon ke jhonke se kaho khud ko, udne do,",
                "Prakriti ka saundarya dekh kar mann ko shaant kar lo,"
            )
        )
    )
}
