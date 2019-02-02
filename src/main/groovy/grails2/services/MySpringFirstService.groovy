package grails2.services

import grails.util.Holders
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MySpringFirstService {

//    def myGrailsFirstService = Holders.grailsApplication.mainContext.getBean('myGrailsFirstService')

    def method(a, b) {
        println 'MyGrailsFirstService.method()'
//        println myGrailsFirstService.toString()
        return a + b
    }
}
