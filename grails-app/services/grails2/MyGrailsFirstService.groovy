package grails2

import grails2.services.MySpringFirstService

import org.springframework.beans.factory.annotation.Autowired

class MyGrailsFirstService {

//    @Autowired MySpringFirstService mySpringFirstService

    def method(a, b) {
        println 'MyGrailsFirstService.method()'
//        println mySpringFirstService.toString()
        return a + b
    }
}
