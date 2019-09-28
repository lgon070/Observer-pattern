class subscriber(val name: String, val pub: NewsLetterPublisher) : observer {
    override fun update(newsletter: String) {
        printNewsletter(newsletter)
    }


    fun subscribe() {
        pub.registerObserver(this)
    }

    fun unsubscribe() {
        pub.removeObserver(this)
    }

    fun printNewsletter(newsletter: String) {
        println(newsletter + "   [$name]")
    }
}