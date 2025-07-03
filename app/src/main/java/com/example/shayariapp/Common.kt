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
    return listOf(
        ShayariModel(
            "Love", listOf(
                "Tere bina jee na paayenge hum,\nTujh se juda ho kar mar jaayenge hum.",
                "Mohabbat ki hai tumse bepanah,\nTum na samjhe toh kya gila karen hum?",
                "Tujh mein basi hai meri duniya saari,\nTere bina lagti hai zindagi adhoori.",
                "Teri muskurahat meri pehchaan hai,\nTere bina jeena ek sazaa hai.",
                "Tere pyaar mein itna kho gaye hain hum,\nApne wajood ko hi bhool baithe hain hum.",
                "Tu paas ho toh sab kuch hai,\nTere bina sab adhoora sa lagta hai.",
                "Dil karta hai har ghadi tujhe dekhta rahoon,\nTere saath apna har pal jeeta rahoon.",
                "Na chaha tha kabhi kuch, par tujhe chaah baitha,\nKya thi khata meri jo mohabbat mein haar baitha?",
                "Pyar sirf tujhe kiya, bepanah aur bekhud,\nTere liye har dard bhi gala lagaya.",
                "Ishq hai tu mera, saza bhi tu hi,\nTu mile ya na mile, dua bhi tu hi."
            )
        ),
        ShayariModel(
            "Sad", listOf(
                "Tanha raaton mein teri yaad sataye,\nAansuon ke saath har pal guzre jaaye.",
                "Kis kis ko dard dikhayein apne,\nYahan toh log khud hi dard ka sabab hote hain.",
                "Chhod gaye jo beech raah mein,\nWahi log aaj yaadon mein hai.",
                "Dard hi toh hai jo zinda rakhta hai,\nWarna khushi mein toh sabhi marte hain.",
                "Rishton mein bharosa ho toh faasle nahi hote,\nAgar na ho toh paas hoke bhi apne nahi hote.",
                "Aansu bhi keh gaye ab toh ruk ja,\nJise chaha tha wo kisi aur ka ho gaya.",
                "Pal bhar mein jo bewafa ho gaye,\nKabhi jin ke liye sab kuch chhod diya tha.",
                "Tere jaane ka gham hai ab tak,\nPar tujhe paana bhi toh naseeb mein nahi tha.",
                "Ab toh khud se bhi darr lagta hai,\nJis dil mein tu tha, woh dil ab tanha lagta hai.",
                "Kya fayda us mohabbat ka,\nJo dard ban kar zindagi bhar sataye."
            )
        ),
        ShayariModel(
            "Friendship", listOf(
                "Dosti har mod pe saath chalti hai,\nKhushi ho ya gham, har baat mein banti hai.",
                "Ek saccha dost har mod par kaam aata hai,\nJo aansuon mein bhi muskuraana sikhaata hai.",
                "Zindagi ki raah mein dosti ka sahara ho,\nToh har gham bhi lagta hai pyaara ho.",
                "Dosti sirf lafzon ka silsila nahi hoti,\nYeh ek ehsaas hai jo har pal dil mein hoti hai.",
                "Agar dosti mein wafadar dost ho,\nToh zindagi jannat se kam nahi hoti.",
                "Sache dost dard mein saathi hote hain,\nKhushi mein unki hasi sabse baatein karti hai.",
                "Jitni baar girte hain hum,\nUtni hi baar doston ka haath milta hai.",
                "Kabhi musibat aaye toh yaad rakhna,\nTera yaar tere saath hamesha khada milega.",
                "Jin ke saath hum dil se hanste hain,\nWahi dost zindagi ka asli hissa bante hain.",
                "Dosti ek roshni hai andheron ke liye,\nEk muskaan hai dard bhare lamhon ke liye."
            )
        ),
        ShayariModel(
            "Motivation", listOf(
                "Gir kar uthna hi toh jeet hoti hai,\nRuk jao toh har jagah haar hoti hai.",
                "Sapne woh nahi jo neend mein aaye,\nSapne woh hain jo neend uda le jaaye.",
                "Har andhera ek roshni ka raasta deta hai,\nBas hausla rakho, waqt badalta hai.",
                "Asmaan ko chhoone ka junoon rakho,\nZameen par baithe toh sabhi rehte hain.",
                "Kamyabi ki raah kabhi aasan nahi hoti,\nMehnat karne walon ki har baat khaas hoti hai.",
                "Jo mushkilein deti hai zindagi,\nWahi aage badhne ka rasta bhi deti hai.",
                "Thak jao toh kuch der aaram karo,\nPar sapno ko kabhi thamna mat.",
                "Mehnat itni khamoshi se karo,\nKi safalta shor machaye.",
                "Jab tak thake nahi ho, rukna mat,\nJeet tumhara intezaar kar rahi hai.",
                "Har haar ek naya sabak deti hai,\nAur har sabak ek nayi jeet laata hai."
            )
        ),
        ShayariModel(
            "Nature", listOf(
                "Subah ki thandi hawa kuch keh jaati hai,\nHar patte ki khamoshi kuch sunaa jaati hai.",
                "Baadalon mein chhupi ek kahani hoti hai,\nHar boond mein zindagi purani hoti hai.",
                "Hawa ka jhonka bhi mehka hai aaj,\nShayad phir se aayi hai woh baag ki raaj.",
                "Pedon ki chhaya mein sukoon milta hai,\nPrakriti se jud kar mann khilta hai.",
                "Chandni raat mein sitare kuch kahte hain,\nKhamosh aasman bhi geet kehte hain.",
                "Har mausam ek naya paigam laata hai,\nPrakriti har roz ek nayi kahani sunata hai.",
                "Barish ki boondein jab chehre se takraati hain,\nToh zindagi ki thakan door ho jaati hai.",
                "Suraj ki roshni jab phoolon par padti hai,\nToh rangon ki duniya aur bhi sajti hai.",
                "Pahaadon ki wadiyon mein ek nasha hai,\nJo har musafir ko apna bana leta hai.",
                "Nadiyon ka behna, jaise geet koi gaa raha ho,\nPrakriti bhi toh ek shayar ban jaata hai."
            )
        )
    )
}