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
                "Ishq par zor nahi,\nYeh woh aatish hai jo lagaye na lage.",

                "Dil hi toh hai na sang-o-khisht,\nDard se bhar na aaye kyun.",

                "Mohabbat mein nahi hai farq jeene aur marne ka,\nUsi ko dekh kar jeete hain jis kaafir pe dum nikle.",

                "Hazaron khwahishein aisi,\nKi har khwahish pe dum nikle.",

                "Tum aaye ho toh shab-e-intezar guzri hai,\nTalash mein thi sahar, ab bahaar guzri hai.",

                "Aur bhi dukh hain zamaane mein mohabbat ke siwa,\nRaahatein aur bhi hain wasl ki raahat ke siwa.",

                "Kabhi kisi ko mukammal jahaan nahi milta,\nKahin zameen toh kahin aasmaan nahi milta.",

                "Nahi nigah mein manzil,\nToh justuju hi sahi.",

                "Tere vaade par jiye hum,\nToh yeh jaan jhooth jaana.",

                "Tum mere paas hote ho goya,\nJab koi doosra nahi hota."
            )
        ),

        ShayariModel(
            "Sad", listOf(
                "Ab ke hum bichhde toh shayad kabhi khwabon mein milein,\nJis tarah sukhe hue phool kitaabon mein milein.",

                "Ranjish hi sahi,\nDil hi dukhane ke liye aa.",

                "Dil na-umeed toh nahi,\nNakaam hi toh hai.",

                "Humko mita sake yeh zamaane mein dum nahi,\nHumse zamaana khud hai zamaane se hum nahi.",

                "Main akela hi chala tha janib-e-manzil magar,\nLog saath aate gaye aur karwaan banta gaya.",

                "Kar raha tha gham-e-jahan ka hisaab,\nAaj tum yaad be-hisaab aaye.",

                "Bhool shayad bahut badi kar li,\nDil ne duniya se dosti kar li.",

                "Humne maana ke taghaful na karoge lekin,\nKhaak ho jaayenge hum tumko khabar hone tak.",

                "Woh afsana jise anjaam tak laana na ho mumkin,\nUse ek khoobsurat mod dekar chhodna achha.",

                "Aaj ek aur baras beet gaya uske baghair,\nJiske hote hue hote the zamaane mere."
            )
        ),

        ShayariModel(
            "Motivation", listOf(
                "Khudi ko kar buland itna,\nKi har taqdeer se pehle khuda bande se pooche bata teri raza kya hai.",

                "Sitaron se aage jahan aur bhi hain,\nAbhi ishq ke imtihaan aur bhi hain.",

                "Parwaaz hai dono ki isi ek fiza mein,\nKargas ka jahan aur hai, shaheen ka jahan aur.",

                "Waqt karta hai parwarish barson,\nHaadsa ek dum nahi hota.",

                "Safar khoobsurat hai manzil se bhi,\nYeh har kisi ko samajh nahi aata.",

                "Khwaabon ke bojh se ab thak chuke hain log,\nPar aasman abhi bhi buland hai.",

                "Jo tufanon mein palte ja rahe hain,\nWahi duniya badalte ja rahe hain.",

                "Raste kabhi khatam nahi hote,\nLog himmat haar jaate hain.",

                "Girna bhi achha hai,\nAukaat ka pata chalta hai.",

                "Manzil mile na mile,\nSafar khoobsurat hona chahiye."
            )
        ),

        ShayariModel(
            "Life", listOf(
                "Zindagi kya kisi muflis ki qaba hai,\nJisme har ghadi dard ke paiband lage jaate hain.",

                "Kaun kehta hai ki maut aayi toh mar jaaunga,\nMain toh dariya hoon samundar mein utar jaaunga.",

                "Yeh daagh daagh ujala,\nYeh shab-gazida sahar.",

                "Bas ek khamoshi hai,\nJo har baat keh jaati hai.",

                "Waqt sabko milta hai zindagi badalne ke liye,\nPar zindagi dobara nahi milti waqt badalne ke liye.",

                "Zindagi se yahi gila hai mujhe,\nTu bahut der se mila hai mujhe.",

                "Har ek baat pe kehte ho tum ke tu kya hai,\nTumhi kaho ke yeh andaaz-e-guftagu kya hai.",

                "Yeh duniya agar mil bhi jaaye toh kya hai.",

                "Kuch toh majbooriyan rahi hongi,\nYun koi bewafa nahi hota.",

                "Zindagi yun hui basar tanha,\nKaafila saath aur safar tanha."
            )
        ),

        ShayariModel(
            "Friendship", listOf(
                "Dost ghamkhaar hona chahiye,\nDukh mein saath dene wala.",

                "Dosti naam hai sukoon ka,\nWarna thak toh sab jaate hain.",

                "Sacchi dosti mein hisaab nahi hota,\nBas saath hota hai.",

                "Waqt badalta raha,\nPar kuch dost aaj bhi wahi hain.",

                "Dosti woh nahi jo har roz baat kare,\nDosti woh hai jo har haal mein saath rahe.",

                "Kuch rishte khoon se nahi,\nDil se bante hain.",

                "Ek achha dost,\nZindagi ka sabse bada gift hota hai.",

                "Doston ke saath chai bhi,\nDaawat lagti hai.",

                "Har kisi ko dost mat samajhna,\nKuch log sirf waqt guzaarne aate hain.",

                "Zindagi mein acche dost milna,\nKismat ki baat hoti hai."
            )
        )
    )
}