package base

class Comment {
    String content
    Date dateCreated

    static constraints = {
        content blank:false
    }

    static belongsTo = [topic: Topic]
//    static belongsTo = [topic: Topic, author: User]
}
