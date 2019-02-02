package grails2

class MyController {

    def myGrailsFirstService

    def index() {
        println 'MyController.index()'
        myGrailsFirstService.method(2, 2)

        render (view: '/index')
    }
}
