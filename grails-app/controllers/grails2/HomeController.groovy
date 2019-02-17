package grails2

class HomeController {

    def index() {
        render(view: '/application', model: [
                component: 'topics-panel'
        ])
    }

    def create() {
        render view: '/application', model: [
                component: 'topic-add'
        ]
    }
}
