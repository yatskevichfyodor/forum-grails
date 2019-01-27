package grails2

class TestController {

    def testService

    def index() {
        println 'TestController.index()'
        testService.method(2, 2)

        render (view: '/index')
    }
}
