package com.rap.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.rap.academy.data.CourseEntity
import com.rap.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {
    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}