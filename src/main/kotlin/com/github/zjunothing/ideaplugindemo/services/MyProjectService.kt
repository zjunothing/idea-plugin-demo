package com.github.zjunothing.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.zjunothing.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
