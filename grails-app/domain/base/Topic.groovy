package base

class Topic {

    Long id
    String title
    String content
    Date timestamp = new Date()

    static constraints = {
    }

    static hasMany = [comments: Comment]
//   static belongsTo = [author: User]
}
