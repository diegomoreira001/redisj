package com.github.diegomoreira001.redisj.services

import com.github.diegomoreira001.redisj.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
