project_name = "jenkins-pipeline-seeds"
repo = "git@github.com:SaituXx/test-jenkings.git"
repo_name = "test-jenkings"
 pipelineJob(project_name) {
    definition {
       triggers{
          scm('H/1 * * * *')
       }
         cpsScm{
            scm {
                git {
                    remote {
                    name(repo_name)
                    url(repo)
                    }
                }
                scriptPath("Jenkinsfile")
             }
        }
    }
}
