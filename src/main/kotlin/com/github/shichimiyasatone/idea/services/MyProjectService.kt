package com.github.shichimiyasatone.idea.services

import com.intellij.openapi.project.Project
import com.github.shichimiyasatone.idea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
