// !DIAGNOSTICS: -UNUSED_PARAMETER, -EXTENSION_SHADOWED_BY_MEMBER
// !WITH_NEW_INFERENCE
// NI_EXPECTED_FILE

import kotlin.reflect.*

fun <T> ofType(x: T): T = x

class A {
    val foo: Int = 0
    fun foo() {}

    fun bar() {}
    val bar: Int = 0
}

fun A.foo(): String = "A"

val x0 = A::<!NI;CALLABLE_REFERENCE_RESOLUTION_AMBIGUITY, OI;OVERLOAD_RESOLUTION_AMBIGUITY!>foo<!>

val x1 = ofType<(A) -> Unit>(A::foo)
val x2 = ofType<KProperty1<A, Int>>(A::foo)
val x3: KProperty1<A, Int> = A::foo
val x4: (A) -> String = A::foo

val y0 = A::<!NI;CALLABLE_REFERENCE_RESOLUTION_AMBIGUITY, OI;OVERLOAD_RESOLUTION_AMBIGUITY!>bar<!>
val y1 = ofType<(A) -> Unit>(A::bar)
val y2 = ofType<KProperty1<A, Int>>(A::bar)
val y3: KProperty1<A, Int> = A::bar
