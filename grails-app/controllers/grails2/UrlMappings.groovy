package grails2

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/$controller/add"{
            action = [GET:"renderForm", POST:"create"]
        }

        "/$controller/$id"{
            action = [GET:"read", PUT:"update", DELETE:"delete"]
        }

        "/"(controller: 'home', action: 'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
