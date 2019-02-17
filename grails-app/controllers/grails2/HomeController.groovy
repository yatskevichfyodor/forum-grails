package grails2

class HomeController {

    def index() {
        render(view: '/application', model: [
                component: 'topics-panel'
        ])
    }
}
