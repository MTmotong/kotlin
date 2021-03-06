/*
 * KOTLIN PSI SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACE: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 14
 * DESCRIPTION: The use of Boolean literals as the identifier (without backtick) in the typeParameter.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

fun <true> f1() {}

fun <reified T : false> T.f2() {}

class B<K: L<M<true>>> {}

class B<K, T: A<in false>> {}

fun <T : org.jetbrains.true> T.f3() {}

fun f4(a: List<out false>) {}

fun f5(a: List<List<List<true?>>>) {}
