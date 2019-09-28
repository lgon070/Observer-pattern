fun main() {
    var theNews: NewsLetterPublisher = NewsLetterPublisher
    var mike: subscriber = subscriber("Mike", theNews)
    var kevin: subscriber = subscriber("Kevin", theNews)
    var esme: subscriber = subscriber("Esmeralda", theNews)
    var hector: subscriber = subscriber("Hector", theNews)
    var letty: subscriber = subscriber("Letty", theNews)

    mike.subscribe()
    kevin.subscribe()
    esme.subscribe()
    hector.subscribe()
    letty.subscribe()



    for (i in 1..20) {
        theNews.setState(i)
        if (i == 4) {
            mike.unsubscribe()
            esme.unsubscribe()
        }
        if (i == 11) {
            kevin.unsubscribe()
            hector.unsubscribe()
        }
        theNews.notifyObserver()
    }


}