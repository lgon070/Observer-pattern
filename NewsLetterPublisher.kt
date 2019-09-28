object NewsLetterPublisher : subject {
    var x: Int = 1
    var subbedToNewsLetter = mutableListOf<subscriber>()
    override fun registerObserver(sub: subscriber) {
        subbedToNewsLetter.add(sub)
    }

    override fun removeObserver(sub: subscriber) {
        subbedToNewsLetter.remove(sub)
    }

    override fun notifyObserver() {
        for (subbed in subbedToNewsLetter) {
            subbed.update("Exciting news! We have raised $x million dollars!")
        }
        println("----------------------------------------------------------------")
    }

    fun setState(state: Int) {
        x = state
    }


}