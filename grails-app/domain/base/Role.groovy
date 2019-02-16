package base

class Role {

    Long id
    String name

    static constraints = {
    }

    static belongsTo = User
    static hasMany = [users:User]
}
