package base

class User {
    String username
    String password
    Date timestamp

    static constraints = {
    }

    static belongsTo = Role
    static hasMany = [roles:Role]
}
