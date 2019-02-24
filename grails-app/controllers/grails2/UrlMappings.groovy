package grails2

class UrlMappings {

    static mappings = {
        "/"(controller: 'home', action: 'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
