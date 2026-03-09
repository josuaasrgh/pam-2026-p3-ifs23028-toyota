# 🚗 Toyota Showroom - Android Compose App

Aplikasi Android berbasis **Jetpack Compose** yang menampilkan katalog mobil Toyota modern. Proyek ini dibuat sebagai studi kasus implementasi UI/UX dinamis menggunakan Material Design 3, Jetpack Navigation, dan Custom State Management di Android.

## ✨ Fitur Utama

* **Katalog Mobil Dinamis:** Menampilkan daftar mobil Toyota lengkap dengan gambar, deskripsi singkat, spesifikasi, dan harga.
* **Fitur Pencarian (Search):** Pengguna dapat mencari mobil berdasarkan nama secara langsung (real-time) melalui *Top App Bar*.
* **Custom Navigation & UI:** * *Bottom Navigation* dengan animasi perubahan ukuran dan efek *ripple*.
  * *Top App Bar* dinamis yang mendukung mode pencarian dan *dropdown menu*.
* **Custom Loading Animation:** Animasi *ripple* kustom menggunakan logo/gambar mobil saat memuat data.
* **Support Dark/Light Mode:** Menggunakan kustomisasi tema (`ToyotaTheme`) dengan palet warna khas Toyota (Merah, Hitam, Silver) yang menyesuaikan dengan tema sistem perangkat.
* **Jetpack Navigation:** Navigasi antar halaman (Home, Katalog, Detail, Profile) yang mulus dan *state-safe*.

## 🛠️ Teknologi yang Digunakan

* **Bahasa:** [Kotlin](https://kotlinlang.org/)
* **UI Toolkit:** [Jetpack Compose](https://developer.android.com/jetpack/compose)
* **Design System:** Material Design 3 (MD3)
* **Navigation:** Jetpack Navigation Compose
* **Architecture:** Pattern standar Jetpack Compose dengan pemisahan *Data*, *UI Components*, *Screens*, dan *Theme*.

## 📱 Tangkapan Layar (Screenshots)


| <img width="378" height="841" alt="image" src="https://github.com/user-attachments/assets/31db705a-a0ce-497d-a41e-5e2e52cf5cd2" /> | <img width="376" height="837" alt="image" src="https://github.com/user-attachments/assets/a31c783a-784d-4168-ba87-d6cf0ba09c22" /> |


## 📁 Struktur Proyek Utama

* `data/`: Berisi `ToyotaData` (Data Class) dan `DummyData` (Sumber data lokal).
* `helper/`: Berisi konfigurasi rute navigasi (`ConstHelper`) dan fungsi pengontrol navigasi (`RouteHelper`).
* `ui/components/`: Kumpulan komponen UI yang dapat digunakan ulang (Reusable UI) seperti `TopAppBarComponent`, `BottomNavComponent`, dan `RippleLoading`.
* `ui/screens/`: Berisi tampilan halaman utama (`HomeScreen`, `ToyotaScreen`, `ToyotaDetailScreen`, `ProfileScreen`).
* `ui/theme/`: Konfigurasi warna, tipografi, dan tema utama aplikasi (`ToyotaTheme`).

## 🚀 Cara Instalasi & Menjalankan Proyek

1. **Clone Repository ini:**
   ```bash
   git clone [https://github.com/josuaasrgh/pam-2026-p3-ifs23028-toyota]

   Buka proyek menggunakan Android Studio (disarankan versi terbaru yang mendukung Compose).

2. Tunggu hingga proses sinkronisasi Gradle selesai.

3. Siapkan Emulator Android atau sambungkan perangkat fisik melalui USB Debugging.

4. Klik tombol Run (Shift + F10) di Android Studio.

👨‍💻 Penulis
Nama: Josua Saragih

NIM: ifs23028

Institusi: Institut Teknologi Del - S1 Informatika



