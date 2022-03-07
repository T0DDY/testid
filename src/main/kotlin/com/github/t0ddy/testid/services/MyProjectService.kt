package com.github.t0ddy.testid.services

import com.intellij.openapi.project.Project
import com.github.t0ddy.testid.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
