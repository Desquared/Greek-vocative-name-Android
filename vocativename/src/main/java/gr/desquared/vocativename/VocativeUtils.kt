package gr.desquared.vocativename

class VocativeUtils {

    companion object {

        fun getVocativeName(name: String?): String {
            if (isNullOrEmpty(name)) {
                return ""
            }

            var rawText = name
            var res = ""

            rawText = rawText!!.toLowerCase()
            rawText = rawText.substring(0, 1).toUpperCase() + rawText.substring(1)
            var sylabusCount = 0
            var tonosPoint = -1
            if (rawText.length > 2) {
                if (isSygma(rawText[rawText.length - 1])) {
                    if (isRuleEligible(
                            rawText[rawText.length - 2]
                        )
                    ) {
                        for (i in 0 until rawText.length) {
                            if (isFonien(rawText[i])
                            ) {
                                sylabusCount++
                            }
                            if (isFonienWithIntonation(rawText[i])
                            ) {
                                tonosPoint = sylabusCount
                            }
                        }
                    } else {
                        //το ας γίνεται α ή το ης γίνεται η
                        res = rawText.substring(0, rawText.length - 1)
                    }
                } else {
                    res = rawText
                }
            }
            if (tonosPoint > 0) {
                res =
                    if (tonosPoint == sylabusCount || sylabusCount - tonosPoint > 1 || isRuleExclution(
                            rawText[rawText.length - 3],
                            sylabusCount
                        )
                    ) {
                        //το ος γίνεται ε
                        rawText.substring(0, rawText.length - 2) + "ε"
                    } else {
                        //το ος γίνεται ο
                        rawText.substring(0, rawText.length - 2) + "ο"
                    }
            }

            return if (isNotNullOrEmpty(res)) {
                res
            } else {
                //Not supported for now...
                rawText
            }


        }


        private fun isNullOrEmpty(value: String?): Boolean {
            return !(value != null && value != "")
        }

        private fun isNotNullOrEmpty(value: String?): Boolean {
            return !isNullOrEmpty(value)
        }

        private fun isFonien(value: Char): Boolean {
            return value == 'ο' || value == 'ω' || value == 'ι' || value == 'η' || value == 'υ' || value == 'ε' || value == 'α' || value == 'ό' || value == 'ώ' || value == 'ί' || value == 'ή' || value == 'ύ' || value == 'έ' || value == 'ά'
        }

        private fun isFonienWithIntonation(value: Char): Boolean {
            return value == 'ό' || value == 'ώ' || value == 'ί' || value == 'ή' || value == 'ύ' || value == 'έ' || value == 'ά'
        }

        private fun isSygma(value: Char): Boolean {
            return value == 'ς' || value == 'σ'
        }

        private fun isRuleEligible(value: Char): Boolean {
            return value == 'ο' || value == 'ό'
        }

        private fun isRuleExclution(value: Char, sylabusCount: Int): Boolean {
            return sylabusCount > 2 && (value == 'ν' || value == 'ρ')
        }
    }

}