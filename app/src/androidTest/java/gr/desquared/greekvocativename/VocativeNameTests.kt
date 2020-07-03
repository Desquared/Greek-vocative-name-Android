package gr.desquared.greekvocativename

import android.util.Log
import gr.desquared.vocativename.VocativeUtils
import junit.framework.Assert.assertEquals
import org.junit.Test

class VocativeNameTests {

    @Test
    fun testDifferentNames() {

        assertEquals("Test null", "", VocativeUtils.getVocativeName(null))

        var testName: String? = "Νικηφόρος"
        assertEquals("Test \""+testName+"\"", "Νικηφόρε", VocativeUtils.getVocativeName(testName))

        testName = "Μάκης"
        assertEquals("Test \""+testName+"\"", "Μάκη", VocativeUtils.getVocativeName(testName))

        testName = "Κοσμάς"
        assertEquals("Test \""+testName+"\"", "Κοσμά", VocativeUtils.getVocativeName(testName))

        testName = "Κώστας"
        assertEquals("Test \""+testName+"\"", "Κώστα", VocativeUtils.getVocativeName(testName))

        testName = "Θοδωρής"
        assertEquals("Test \""+testName+"\"", "Θοδωρή", VocativeUtils.getVocativeName(testName))

        testName = "Γιάννης"
        assertEquals("Test \""+testName+"\"", "Γιάννη", VocativeUtils.getVocativeName(testName))

        testName = "Πέτρος"
        assertEquals("Test \""+testName+"\"", "Πέτρο", VocativeUtils.getVocativeName(testName))

        testName = "Νίκος"
        assertEquals("Test \""+testName+"\"", "Νίκο", VocativeUtils.getVocativeName(testName))

        testName = "Στυλιανός"
        assertEquals("Test \""+testName+"\"", "Στυλιανέ", VocativeUtils.getVocativeName(testName))

        testName = "Στέλιος"
        assertEquals("Test \""+testName+"\"", "Στέλιο", VocativeUtils.getVocativeName(testName))

        testName = "Ευαγγελάτος"
        assertEquals("Test \""+testName+"\"", "Ευαγγελάτο", VocativeUtils.getVocativeName(testName))

        testName = "Ιωσήφ"
        assertEquals("Test \""+testName+"\"", "Ιωσήφ", VocativeUtils.getVocativeName(testName))

        testName = "Κωσταντίνος"
        assertEquals("Test \""+testName+"\"", "Κωσταντίνε", VocativeUtils.getVocativeName(testName))

        testName = "Αναστάσης"
        assertEquals("Test \""+testName+"\"", "Αναστάση", VocativeUtils.getVocativeName(testName))

        testName = "Αυγουστίνος"
        assertEquals("Test \""+testName+"\"", "Αυγουστίνε", VocativeUtils.getVocativeName(testName))

        testName = "Πλάτων"
        assertEquals("Test \""+testName+"\"", "Πλάτων", VocativeUtils.getVocativeName(testName))

        testName = "Πλάτωνας"
        assertEquals("Test \""+testName+"\"", "Πλάτωνα", VocativeUtils.getVocativeName(testName))

        testName = "Παύλος"
        assertEquals("Test \""+testName+"\"", "Παύλο", VocativeUtils.getVocativeName(testName))

        testName = "Κωσταντίνα"
        assertEquals("Test \""+testName+"\"", "Κωσταντίνα", VocativeUtils.getVocativeName(testName))

        testName = "Μαριλένα"
        assertEquals("Test \""+testName+"\"", "Μαριλένα", VocativeUtils.getVocativeName(testName))

        testName = "Δημήτριος"
        assertEquals("Test \""+testName+"\"", "Δημήτριε", VocativeUtils.getVocativeName(testName))

        testName = "Δημητρός"
        assertEquals("Test \""+testName+"\"", "Δημητρό", VocativeUtils.getVocativeName(testName))

        testName = "Αντωνάκος"
        assertEquals("Test \""+testName+"\"", "Αντωνάκο", VocativeUtils.getVocativeName(testName))

        testName = "Σέργιος"
        assertEquals("Test \""+testName+"\"", "Σέργιε", VocativeUtils.getVocativeName(testName))

        testName = "Παπαδόπουλος"
        assertEquals("Test \""+testName+"\"", "Παπαδόπουλε", VocativeUtils.getVocativeName(testName))

        testName = "Άννα"
        assertEquals("Test \""+testName+"\"", "Άννα", VocativeUtils.getVocativeName(testName))

        testName = "Λαμπρινή"
        assertEquals("Test \""+testName+"\"", "Λαμπρινή", VocativeUtils.getVocativeName(testName))

        testName = "Χρήστος"
        assertEquals("Test \""+testName+"\"", "Χρήστο", VocativeUtils.getVocativeName(testName))

        testName = "Ιορδάνης"
        assertEquals("Test \""+testName+"\"", "Ιορδάνη", VocativeUtils.getVocativeName(testName))

        testName = "Ανδρίτσος"
        assertEquals("Test \""+testName+"\"", "Ανδρίτσο", VocativeUtils.getVocativeName(testName))

        testName = "Mark"
        assertEquals("Test \""+testName+"\"", "Mark", VocativeUtils.getVocativeName(testName))

        testName = "Harry"
        assertEquals("Test \""+testName+"\"", "Harry", VocativeUtils.getVocativeName(testName))

        testName = "Μ"
        assertEquals("Test \""+testName+"\"", "Μ", VocativeUtils.getVocativeName(testName))

        testName = "4"
        assertEquals("Test \""+testName+"\"", "4", VocativeUtils.getVocativeName(testName))

        testName = ""
        assertEquals("Test \""+testName+"\"", "", VocativeUtils.getVocativeName(testName))


    }
}