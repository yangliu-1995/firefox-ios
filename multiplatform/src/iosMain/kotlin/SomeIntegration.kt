import mozilla.components.multiplatform.lib.dummy.Dummy
import mozilla.components.multiplatform.lib.dummy.DummyDelegate

class SomeIntegration {
    fun getValue(): String {
        val delegate = DummyDelegate()
        val dummy = Dummy(delegate)
        return dummy.getValue()
    }
}
