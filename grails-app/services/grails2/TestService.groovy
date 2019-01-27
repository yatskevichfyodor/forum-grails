package grails2


import grails2.services.LogSecondService
import org.springframework.beans.factory.annotation.Autowired

class TestService {

    def logFirstService

    @Autowired LogSecondService logSecondService

    def method(a, b) {
        println 'TestService.method()'
        logFirstService.log()
        logSecondService.log()
        return a + b
    }
}
