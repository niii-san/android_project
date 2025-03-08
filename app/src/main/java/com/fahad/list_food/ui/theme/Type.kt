package com.fahad.list_food.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fahad.list_food.R

// Set of Material typography styles to start with
val Inter = FontFamily(
  listOf(
    Font(resId = R.font.inter_medium, weight = FontWeight.Medium)
  )
)

val Rubik = FontFamily(
  listOf(
    Font(resId = R.font.rubik_bold, weight = FontWeight.Bold)
  )
)

val Roboto = FontFamily(
  listOf(
    Font(resId = R.font.roboto_medium, weight = FontWeight.Medium),
    Font(resId = R.font.roboto_regular, weight = FontWeight.Normal),
    Font(resId = R.font.roboto_bold, weight = FontWeight.ExtraBold),
  )
)

val VerySmallTypography = Typography(
  headlineLarge = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.ExtraBold,
    fontSize = 22.sp
  ),
  headlineMedium = TextStyle(
    fontFamily = Rubik,
    fontWeight = FontWeight.Bold,
    fontSize = 17.sp
  ),
  titleMedium = TextStyle(
    fontFamily = Inter,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp
  ),
  labelMedium = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.Normal,
    fontSize = 8.sp
  )
)

// CompactDimens
val CompactTypography = Typography(
  headlineLarge = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.ExtraBold,
    fontSize = 24.sp
  ),
  headlineMedium = TextStyle(
    fontFamily = Rubik,
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp
  ),
  titleMedium = TextStyle(
    fontFamily = Inter,
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp
  ),
  labelMedium = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp
  )
)



val CompactMediumTypography = Typography(
  headlineLarge = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.ExtraBold,
    fontSize = 32.sp
  ),
  headlineMedium = TextStyle(
    fontFamily = Rubik,
    fontWeight = FontWeight.Bold,
    fontSize = 22.sp
  ),
  titleMedium = TextStyle(
    fontFamily = Inter,
    fontWeight = FontWeight.Medium,
    fontSize = 20.sp
  ),
  labelMedium = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,

  )
)

val MediumDimensTypography = Typography(
  headlineLarge = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.ExtraBold,
    fontSize = 35.sp
  ),
  headlineMedium = TextStyle(
    fontFamily = Rubik,
    fontWeight = FontWeight.Bold,
    fontSize = 32.sp
  ),
  titleMedium = TextStyle(
    fontFamily = Inter,
    fontWeight = FontWeight.Medium,
    fontSize = 25.sp
  ),
  labelMedium = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.Normal,
    fontSize = 20.sp
    )
)



    val LargeTypography = Typography(
  headlineLarge = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.ExtraBold,
    fontSize = 38.sp
  ),
  headlineMedium = TextStyle(
    fontFamily = Rubik,
    fontWeight = FontWeight.Bold,
    fontSize = 30.sp
  ),
  titleMedium = TextStyle(
    fontFamily = Inter,
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp
  ),
  labelMedium = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp
  )
)

val ExpandedTypography = Typography(
  headlineLarge = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.ExtraBold,
    fontSize = 42.sp
  ),
  headlineMedium = TextStyle(
    fontFamily = Rubik,
    fontWeight = FontWeight.Bold,
    fontSize = 34.sp
  ),
  titleMedium = TextStyle(
    fontFamily = Inter,
    fontWeight = FontWeight.Medium,
    fontSize = 18.sp
  ),
  labelMedium = TextStyle(
    fontFamily = Roboto,
    fontWeight = FontWeight.Normal,
    fontSize = 18.sp
  )
)