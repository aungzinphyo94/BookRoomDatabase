package com.example.roomdatabaseview.repository

import androidx.lifecycle.LiveData
import com.example.roomdatabaseview.dao.BookDao
import com.example.roomdatabaseview.model.Book

class BookRepository(private val bookDao: BookDao) {

    val allBook: LiveData<List<Book>> = bookDao.getAllBook()

    suspend fun insert(book: Book) {
        bookDao.insert(book)
    }

    suspend fun delete() {
        bookDao.deleteAll()
    }

    suspend fun deleteItem(name: String) {
        bookDao.deleteItem(name)
    }

    suspend fun updateItem(updateName: String, name: String){
        bookDao.updateItem(updateName, name)
    }

}