// !DIAGNOSTICS: -UNUSED_PARAMETER

fun foo() {}
fun foo(s: String) {}

fun bar(f: () -> Unit) = 1
fun bar(f: (String) -> Unit) = 2

val x1 = ::<!CALLABLE_REFERENCE_RESOLUTION_AMBIGUITY!>foo<!> as () -> Unit
val x2 = bar(::<!CALLABLE_REFERENCE_RESOLUTION_AMBIGUITY!>foo<!> as (String) -> Unit)