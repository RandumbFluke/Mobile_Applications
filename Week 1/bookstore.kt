data class Book(val title: String, val author: String, val price: Double)

class Bookstore {
    private val books = listOf(
        Book("The Great Gatsby", "F. Scott Fitzgerald", 9.99),
        Book("To Kill a Mockingbird", "Harper Lee", 8.99),
        Book("1984", "George Orwell", 7.99),
        Book("Pride and Prejudice", "Jane Austen", 10.99)
    )

    fun listBooks(){
        println("Welcome to the Online Bookstore!")
        println("Available Books:")
        books.forEachIndexed { index, book ->
            println("${index + 1}. Title: ${book.title}")
            println("   Author: ${book.author}")
            println("   Price: $${book.price}")
            println()
            }
    }
}

fun main(){
    val bookstore = Bookstore()
    bookstore.listBooks()
}