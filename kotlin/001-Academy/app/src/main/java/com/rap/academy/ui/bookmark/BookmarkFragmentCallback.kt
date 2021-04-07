package com.rap.academy.ui.bookmark

import com.rap.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
