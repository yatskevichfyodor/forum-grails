package grails2

import base.Comment
import base.Topic

class BootStrap {

    def init = { servletContext ->
        Topic topic1 = new Topic(title: 'First topic', content: 'Hello World!').save(flush:true, failOnError: true)
        Topic topic2 = new Topic(title: 'Second topic', content: 'Hello World!').save(flush:true, failOnError: true)
        new Comment(content: 'comment11', topic: topic1).save(flush:true, failOnError: true)
        new Comment(content: 'comment12', topic: topic1).save(flush:true, failOnError: true)
        new Comment(content: 'comment21', topic: topic2).save(flush:true, failOnError: true)
    }

    def destroy = {
    }
}
