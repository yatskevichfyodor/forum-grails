package base

class Role {
    String name

    static constraints = {
    }

    static belongsTo = User
    static hasMany = [users:User]
}
