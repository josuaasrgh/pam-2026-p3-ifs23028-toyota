package org.delcom.pam_2026_p3_ifs23028_toyota.ui // Pastikan package sesuai!

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.delcom.pam_2026_p3_ifs23028_toyota.helper.ConstHelper

// Import untuk screen akan merah sementara sampai kita membuat/mengubah file screen-nya
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.screens.HomeScreen
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.screens.ToyotaDetailScreen // Menggantikan PlantsDetailScreen
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.screens.ToyotaScreen       // Menggantikan PlantsScreen
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.screens.ProfileScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UIApp(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold { _ ->
        NavHost(
            navController = navController,
            startDestination = ConstHelper.RouteNames.Home.path,
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF7F8FA)) // Warna background dasar aplikasi

        ) {
            // Home
            composable(
                route = ConstHelper.RouteNames.Home.path,
            ) { _ ->
                HomeScreen(
                    navController = navController,
                )
            }

            // Profile
            composable(
                route = ConstHelper.RouteNames.Profile.path,
            ) { _ ->
                ProfileScreen(
                    navController = navController,
                )
            }

            // Toyota (Daftar Mobil Toyota)
            composable(
                route = ConstHelper.RouteNames.Toyota.path,
            ) { _ ->
                ToyotaScreen( // Menggantikan PlantsScreen
                    navController = navController,
                )
            }

            // Toyota Detail (Detail Mobil Toyota)
            composable(
                route = ConstHelper.RouteNames.ToyotaDetail.path,
                arguments = listOf(
                    navArgument("name") { type = NavType.StringType },
                )
            ) { backStackEntry ->
                // Mengambil nama mobil yang dikirim dari halaman list
                val toyotaName = backStackEntry.arguments?.getString("name") ?: ""

                ToyotaDetailScreen( // Menggantikan PlantsDetailScreen
                    navController = navController,
                    toyotaName = toyotaName
                )
            }
        }
    }
}