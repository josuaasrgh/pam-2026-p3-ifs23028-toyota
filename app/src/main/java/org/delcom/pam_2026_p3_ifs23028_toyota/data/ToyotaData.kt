package org.delcom.pam_2026_p3_ifs23028_toyota.data

data class ToyotaData(
    val nama: String,        // Contoh: "Toyota Fortuner GR Sport"
    val gambar: Int,         // ID gambar dari drawable (misal: R.drawable.img_fortuner)
    val deskripsi: String,   // Penjelasan singkat tentang mobilnya
    val spesifikasi: String, // Menggantikan 'manfaat' -> Misal: "Mesin 2.8L VRZ, 4x4, 200 HP"
    val harga: String        // Menggantikan 'efekSamping' -> Misal: "Mulai dari Rp 600 Jutaan"
)