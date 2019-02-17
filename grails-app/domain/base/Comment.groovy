package base

class Comment {

    Long id
    Date timestamp

    static constraints = {
    }

    static belongsTo = [topic: Topic, author: User]
}
