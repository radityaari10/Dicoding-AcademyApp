package com.rap.academy.ui.detail

import androidx.lifecycle.ViewModel
import com.rap.academy.data.CourseEntity
import com.rap.academy.data.ModuleEntity
import com.rap.academy.utils.DataDummy

class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String){
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity {
        lateinit var course: CourseEntity
        val coursesEntites = DataDummy.generateDummyCourses()
        for (courseEntity in coursesEntites){
            if (courseEntity.courseId == courseId){
                course = courseEntity
            }
        }
        return course
    }

    fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}