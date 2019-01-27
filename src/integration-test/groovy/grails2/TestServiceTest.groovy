package grails2

import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
class TestServiceTest extends Specification {

    def testService

    def "Method"() {
        when:
        def sum = testService.method(2, 2)
        then:
        sum == 4
    }
}
