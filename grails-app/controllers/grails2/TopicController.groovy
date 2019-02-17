package grails2

import base.Topic

class TopicController {

    def renderForm() {
        render view: '/application', model: [
                component: 'topic-add'
        ]
    }

    def create() {
        new Topic(title: params.title, content: params.content).save(failOnError: true, flush: true)
        render(view: '/application', model: [
                component: 'topics-panel'
        ])
    }

    def findAll() {
        respond Topic.findAll()
    }
}
