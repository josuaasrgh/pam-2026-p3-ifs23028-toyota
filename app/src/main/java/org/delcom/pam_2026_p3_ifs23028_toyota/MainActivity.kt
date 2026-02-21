package org.delcom.pam_2026_p3_ifs23028_toyota // Pastikan ini sesuai dengan nama package aslimu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.UIApp // Import disesuaikan
import org.delcom.pam_2026_p3_ifs23028_toyota.ui.theme.ToyotaTheme // Import ToyotaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToyotaTheme { // Menggunakan ToyotaTheme yang baru kita buat
                UIApp()
            }
        }
    }
}