package org.delcom.pam_2026_p3_ifs23028_toyota.helper

class ConstHelper {
    // Route Names
    enum class RouteNames(val path: String) {
        Home(path = "home"),
        Profile(path = "profile"),
        Toyota(path = "toyota"),                 // Menggantikan rute Plants
        ToyotaDetail(path = "toyota/{name}"),    // Menggantikan rute PlantsDetail
    }
}