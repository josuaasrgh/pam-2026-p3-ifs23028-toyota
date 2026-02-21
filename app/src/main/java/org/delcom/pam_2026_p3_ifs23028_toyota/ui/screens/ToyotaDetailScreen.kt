package org.delcom.pam_2026_p3_ifs23028_toyota.ui.screens // Sesuaikan package

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

// Import disesuaikan dengan Toyota
import org.delcom.pam_2026_p3_ifs23028_toyota.data.DummyData
import org.delcom.pam_2026_p3_ifs23028_toyota.data.ToyotaData
import org.delcom.pam_2026_p3_ifs23028_toyota.helper.RouteHelper
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.components.BottomNavComponent
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.components.LoadingUI
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.components.TopAppBarComponent
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.theme.ToyotaTheme

@Composable
fun ToyotaDetailScreen( // Mengubah nama fungsi
    navController: NavHostController,
    toyotaName: String // Mengubah plantName menjadi toyotaName
) {
    // Muat data
    var toyota by remember { mutableStateOf<ToyotaData?>(null) }

    LaunchedEffect(Unit) {
        // Mengambil data dari daftar mobil Toyota
        toyota = DummyData.getToyotaData().find { it.nama == toyotaName }
        if (toyota == null) {
            RouteHelper.back(navController)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        if (toyota != null) {
            // Top App Bar
            TopAppBarComponent(navController = navController, title = toyotaName, true)
            // Content
            Box(
                modifier = Modifier
                    .weight(1f)
            ) {
                ToyotaDetailUI(
                    toyota = toyota!!
                )
            }
            // Bottom Nav
            BottomNavComponent(navController = navController)
        } else {
            LoadingUI()
        }
    }
}

@Composable
fun ToyotaDetailUI( // Nama fungsi diubah
    toyota: ToyotaData
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Gambar
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 16.dp)
        ) {
            Image(
                painter = painterResource(id = toyota.gambar),
                contentDescription = toyota.nama,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                text = toyota.nama,
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }

        // Deskripsi
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Deskripsi",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold
                )
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp)
                )
                Text(
                    text = toyota.deskripsi,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }

        // Spesifikasi (Sebelumnya Manfaat)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Spesifikasi", // Diubah
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold
                )
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp)
                )
                Text(
                    text = toyota.spesifikasi, // Memanggil spesifikasi
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }

        // Harga (Sebelumnya Efek Samping)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Harga", // Diubah
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold
                )
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp)
                )
                Text(
                    text = toyota.harga, // Memanggil harga
                    style = MaterialTheme.typography.titleMedium, // Diperbesar sedikit
                    color = MaterialTheme.colorScheme.primary, // Diberi warna merah agar mencolok
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun PreviewToyotaDetailUI() {
    ToyotaTheme {
        ToyotaDetailUI(
            toyota = DummyData.getToyotaData()[0] // Menampilkan data dummy mobil index 0 (Avanza)
        )
    }
}