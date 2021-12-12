package com.github.dariachembrovskaya.vendorcabinetplugin.services

import com.github.dariachembrovskaya.vendorcabinetplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
