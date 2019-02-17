package grails2

import base.Topic

class TopicController {

    def renderForm() {
        render view: '/application', model: [
                component: 'topic-add'
        ]
    }

    def create() {
        def topic = new Topic(title: params.title, content: params.content, timestamp: new Date())
        topic.validate()
        def result = topic.save()

        topic.save(failOnError: true, flush: true)
        println 'tmp'

        render(view: '/application', model: [
                component: 'topics-panel'
        ])
    }
}
