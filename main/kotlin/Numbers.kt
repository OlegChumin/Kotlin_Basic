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
    // целочисленные
    println("Integer: Byte/UByte, Short/UShort, Int/UInt, Long/ULong")
    // 8bit = 1Byte
    println("Byte and UByte (unsigned Byte) 8bit = 1Byte")
    val byteNumMin: Byte = Byte.MIN_VALUE
    val byteNumMax: Byte = Byte.MAX_VALUE
    println("Byte.MIN_VALUE = $byteNumMin; Byte.MAX_VALUE = $byteNumMax;")
    val uByteNumMin: UByte = UByte.MIN_VALUE
    val uByteNumMax: UByte = UByte.MAX_VALUE
    println("UByte.MIN_VALUE = $uByteNumMin; UByte.MAX_VALUE = $uByteNumMax;\n")

    // 16bit = 2x8bit = 2Bytes
    println("Short and UShort (unsigned Short) 16bit = 2x8bit = 2Bytes")
    val shortNumMin: Short = Short.MIN_VALUE // -32_768
    val shortNumMax: Short = Short.MAX_VALUE //  32_767
    println("Short.MIN_VALUE = $shortNumMin; Short.MAX_VALUE = $shortNumMax;")
    val uShortNumMin: UShort = UShort.MIN_VALUE // 0
    val uShortNumMax: UShort = UShort.MAX_VALUE // 65_535
    println("UShort.MIN_VALUE = $uShortNumMin; UShort.MAX_VALUE = $uShortNumMax;\n")

    //32bit = 4x8bit = 4Bytes
    println("Int and UInt (unsigned Int) 32bit = 4x8bit = 4Bytes")
    val intNumMin: Int = Int.MIN_VALUE //public const val MIN_VALUE: Int = -2_147_483_648
    val intNumMax: Int = Int.MAX_VALUE //public const val MAX_VALUE: Int =  2_147_483_647
    println("Int.MIN_VALUE = $intNumMin; Int.MAX_VALUE = $intNumMax;")
    val uIntNumMin: UInt = UInt.MIN_VALUE // 0
    val uIntNumMax: UInt = UInt.MAX_VALUE // 4_294_967_295
    println("UInt.MIN_VALUE = $uIntNumMin; UInt.MAX_VALUE = $uIntNumMax;\n")

    //64bit = 8x8bit = 64Bytes
    println("Long and ULong (unsigned Long) 64bit = 8x8bit = 64Bytes")
    val longNumMin: Long = Long.MIN_VALUE // -9_223_372_036_854_775_808
    val longNumMax: Long = Long.MAX_VALUE //  9_223_372_036_854_775_807
    println("Long.MIN_VALUE = $longNumMin; Long.MAX_VALUE = $longNumMax;")
    val uLongNumMin: ULong = ULong.MIN_VALUE // 0
    val uLongNumMax: ULong = ULong.MAX_VALUE // 18446744073709551615
    println("ULong.MIN_VALUE = $uLongNumMin; ULong.MAX_VALUE = $uLongNumMax;\n")

    // вещественные

    // строковые
    // логические

}