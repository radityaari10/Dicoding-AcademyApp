package com.rap.academy.ui.bookmark

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class BookmarkViewModelTest {
    private lateinit var bookmarkViewModel: BookmarkViewModel

    @Before
    fun setup() {
        bookmarkViewModel = BookmarkViewModel()
    }

    @Test
    fun getBookmarks() {
        val courseEntities = bookmarkViewModel.getBookmarks()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities.size)
    }
}