package grails2

import grails.testing.mixin.integration.Integration
import grails.transaction.*
import grails2.services.MySpringFirstService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@Integration
@Rollback
class MyGrailsFirstServiceSpec extends Specification {

    def myGrailsFirstService
//    @Autowired MySpringFirstService mySpringFirstService

    def "Method"() {
        when:
        def sum = myGrailsFirstService.method(2, 2)
        then:
        sum == 4

//        when:
//        sum = mySpringFirstService.method(3, 3)
//        then:
//        sum == 6
    }
}
