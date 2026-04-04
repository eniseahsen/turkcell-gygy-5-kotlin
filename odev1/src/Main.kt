// Bir bankacılık uygulaması (OOP yok)
// Min 5. adet bankacılık uygulamasında olması gerektiğini düşündüğünüz fonksiyonu tanımlayalım.
// Main fonksiyonunda da bu fonksiyonları çağırıp test edelim.

fun bakiyeGoster(bakiye: Double){
    println("Mevcut bakiye: $bakiye TL")

}

fun paraYatir(bakiye: Double, miktar: Double): Double{
    val yeniBakiye = bakiye + miktar
    println("$miktar TL yatırıldı.")
    return yeniBakiye
}

fun paraCek(bakiye: Double, miktar: Double): Double{
    return if (miktar<= bakiye){
        println("$miktar TL çekildi.")
        bakiye - miktar
    }
    else{
        println("Yetersiz bakiye!")
        bakiye

    }
}

fun havaleYap(bakiye: Double, miktar: Double, alici:String): Double{
    return if(miktar <= bakiye){
        println("$alici hesabina $miktar TL yatirildi.")
        bakiye - miktar
    }
    else{
        println("Havale basarisiz. Yetersiz bakiye.")
        bakiye
    }
}

fun hesapBilgisi(ad: String, hesapNo: String){
    println("Hesap Sahibi: $ad")
    println("Hesap No: $hesapNo")
}


fun main(){
    var bakiye = 1000.0
    bakiyeGoster(bakiye)
    val ad = "Enise"
    val hesapNo = "TR2003"
    hesapBilgisi(ad, hesapNo)
    bakiyeGoster(bakiye)
    bakiye = paraYatir(bakiye, 100.0)
    bakiyeGoster(bakiye)
    bakiye = paraCek(bakiye, 200.0)
    bakiyeGoster(bakiye)
    bakiye = havaleYap(bakiye, 300.0, "Ahsen")
    bakiyeGoster(bakiye)

}