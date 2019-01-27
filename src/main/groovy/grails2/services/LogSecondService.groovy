package grails2.services

import grails.gorm.services.Service
import groovy.util.logging.Slf4j

@Service
@Slf4j
class LogSecondService {

    def log() {
        log.info 'LogSecondService'
        println 'LogSecondService usage'
    }

}
