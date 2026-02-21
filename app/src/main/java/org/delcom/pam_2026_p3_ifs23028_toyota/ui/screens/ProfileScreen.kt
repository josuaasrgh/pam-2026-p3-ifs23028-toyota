package org.delcom.pam_2026_p3_ifs23028_toyota.ui.screens // Sesuaikan package aslimu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

// Import disesuaikan dengan folder barumu
import org.delcom.pam_2026_p3_ifs23028_toyota.R
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.components.BottomNavComponent
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.components.TopAppBarComponent
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.theme.ToyotaTheme // Menggunakan ToyotaTheme

@Composable
fun ProfileScreen(
    navController: NavHostController,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Top App Bar
        TopAppBarComponent(navController = navController, title = "Profile", false)
        // Content
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            ProfileUI()
        }
        // Bottom Nav
        BottomNavComponent(navController = navController)
    }
}

@Composable
fun ProfileUI(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        // Header Profile
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp, bottom = 16.dp),
            contentAlignment = Alignment.Center
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                // Foto Profile (Pastikan kamu punya gambar bernama 'profile' di res/drawable)
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile Photo",
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape)
                        .border(3.dp, MaterialTheme.colorScheme.primary, CircleShape) // Border disesuaikan jadi warna merah Toyota
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Josua", // Ubah dengan nama panggilanmu
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "ifs23028", // Ubah dengan NIM kamu
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        // Bio Section
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    "Tentang Saya",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Saya adalah seorang mahasiswa Institut Teknologi Del prodi S1 Informatika. Saya sedang belajar mengembangkan aplikasi mobile menggunakan Android Jetpack Compose. Proyek ini adalah studi kasus modifikasi aplikasi daftar mobil Toyota.", // Deskripsi disesuaikan
                    fontSize = 15.sp,
                    textAlign = TextAlign.Justify
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun PreviewProfileUI(){
    ToyotaTheme { // Theme diubah jadi ToyotaTheme
        ProfileUI()
    }
}