package org.delcom.pam_2026_p3_ifs23028_toyota.ui.screens // Sesuaikan package-nya!

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

// Import disesuaikan dengan struktur folder barumu
import org.delcom.pam_2026_p3_ifs23028_toyota.data.DummyData
import org.delcom.pam_2026_p3_ifs23028_toyota.data.ToyotaData
import org.delcom.pam_2026_p3_ifs23028_toyota.helper.RouteHelper
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.components.BottomNavComponent
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.components.TopAppBarComponent
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.theme.ToyotaTheme

@Composable
fun ToyotaScreen( // Mengubah PlantsScreen menjadi ToyotaScreen
    navController: NavHostController,
) {
    // Muat data mobil Toyota
    var toyotaList by remember { mutableStateOf(DummyData.getToyotaData()) }
    var searchQuery by remember { mutableStateOf("") }

    fun onOpen(toyotaName: String) {
        RouteHelper.to(
            navController = navController,
            destination = "toyota/${toyotaName}" // Rute menuju detail disesuaikan
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Top App Bar
        TopAppBarComponent(
            navController = navController,
            title = "Katalog Toyota", // Judul diganti
            showBackButton = false,
            withSearch = true,
            searchQuery = searchQuery,
            onSearchQueryChange = { query ->
                searchQuery = query
                // Filter pencarian berdasarkan nama mobil
                toyotaList = DummyData.getToyotaData().filter {
                    it.nama
                        .lowercase()
                        .contains(query.lowercase())
                }
            }
        )
        // Content
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            ToyotaUI(
                toyotaList = toyotaList,
                onOpen = ::onOpen
            )
        }
        // Bottom Nav
        BottomNavComponent(navController = navController)
    }
}

@Composable
fun ToyotaUI( // Diubah dari PlantsUI
    toyotaList: List<ToyotaData>,
    onOpen: (String) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(toyotaList) { toyota ->
            ToyotaItemUI(
                toyota,
                onOpen
            )
        }
    }

    if(toyotaList.isEmpty()){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Text(
                text = "Mobil tidak ditemukan!", // Disesuaikan pesannya
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}

@Composable
fun ToyotaItemUI( // Diubah dari PlantItemUI
    toyota: ToyotaData,
    onOpen: (String) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                onOpen(toyota.nama)
            },
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically // Supaya gambar dan teks rata tengah
        ) {
            Image(
                painter = painterResource(id = toyota.gambar),
                contentDescription = toyota.nama,
                modifier = Modifier
                    .size(80.dp) // Sedikit diperbesar dari 70dp agar mobil lebih jelas
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(16.dp)) // Jarak diperlebar sedikit

            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = toyota.nama,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = toyota.deskripsi,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Menambahkan harga di katalog list agar lebih informatif
                Text(
                    text = toyota.harga,
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary, // Warna aksen merah
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun PreviewToyotaUI() {
    ToyotaTheme {
        ToyotaUI(
            toyotaList = DummyData.getToyotaData(),
            onOpen = {}
        )
    }
}