package com.rap.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.rap.academy.data.CourseEntity
import com.rap.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {
    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}