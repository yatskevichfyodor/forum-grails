package grails2

import groovy.util.logging.Slf4j

@Slf4j
class LogFirstService {

    def log() {
        log.info 'LogServiceFirst usage'
        println 'LogServiceFirst usage'
    }
}
