package base

import grails.rest.Resource

@Resource(uri = '/topic')
class Topic {
    String title
    String content
    Date dateCreated

    static constraints = {
        title blank:false
        content blank:false
    }

    static hasMany = [comments: Comment]
//   static belongsTo = [author: User]
}
