// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8

fun box(): String {
    true.hashCode()
    1.toByte().hashCode()
    1.toChar().hashCode()
    1.toShort().hashCode()
    1.hashCode()
    1L.hashCode()
    1.0F.hashCode()
    1.0.hashCode()
    "".hashCode()

    return "OK"
}
