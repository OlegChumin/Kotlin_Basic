fun main() {
//    println("Hello World!")
    // это комментарий

    val numberOfOrders: Int = 42

    var notificationText = "Не забудьте маску и перчатки"

    println(numberOfOrders)
//    println(notificationText)

    notificationText = "Маски больше не потребуются!"
    println(notificationText)
    println()

    // целочисленные
    //

    /**
    Names of large numbers
    миллион (6 нулей) -> million (6 digits)
    миллиард (9 нулей) -> milliard/billion (9 digits)
    триллион (18 нулей) -> trillion (18 digits)
    триллиард (21 нуль) -> trillion (21 digits)
    квадриллион ( 24 нуля) -> quadrillion (24 bits)
    квадриллиард/квинтиллион (27 нулей) -> quadrillion (27 digits)
    квинтиллион (30 нулей) -> quintillion (30 digits)
    квинтиллиард (33 нуля) -> quintbillion (33 digits)


     */

    //32bit = 4x8bit = 4Bytes
    println("Int and UInt (unsigned Int) 32bit = 4x8bit = 4Bytes")
    val intNumMin: Int = Int.MIN_VALUE //public const val MIN_VALUE: Int = -2_147_483_648
    val intNumMax: Int = Int.MAX_VALUE //public const val MAX_VALUE: Int = 2_147_483_647
    println("Int.MIN_VALUE = $intNumMin; Int.MAX_VALUE = $intNumMax;")
    val uIntNumMin: UInt = UInt.MIN_VALUE // 0
    val uIntNumMax: UInt = UInt.MAX_VALUE // 4_294_967_295
    println("UInt.MIN_VALUE = $uIntNumMin; UInt.MAX_VALUE = $uIntNumMax; \n")

    //64bit = 8x8bit = 64Bytes
    println("Long and ULong (unsigned Long) 64bit = 8x8bit = 64Bytes")
    val longNumMin: Long = Long.MIN_VALUE // -9_223_372_036_854_775_808
    val longNumMax: Long = Long.MAX_VALUE // 9_223_372_036_854_775_807
    println("Long.MIN_VALUE = $longNumMin; Long.MAX_VALUE = $longNumMax;")
    val uLongNumMin: ULong = ULong.MIN_VALUE // 0
    val uLongNumMax: ULong = ULong.MAX_VALUE // 18446744073709551615
    println("ULong.MIN_VALUE = $uLongNumMin; ULong.MAX_VALUE = $uLongNumMax; \n")

// вещественные
    // строковые
    // логические

}