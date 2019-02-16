package base

class Topic {

    Long id
    String username
    Date timestamp
    String password

    static constraints = {
    }

    static belongsTo = [topic: Topic]
}
