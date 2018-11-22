project_name = "jenkins-pipeline-seeds"
repo = "git@github.com:SaituXx/test-jenkings.git"
repo_name = "test-jenkings"

folder('jenkins-pipeline-seeds-folder') {
    displayName('Seeds folder Proyect')
    description('jenkins-pipeline-seeds-folder')
}
 pipelineJob(project_name) {
    definition {
       triggers{
          scm('H/1 * * * *')
       }
         cpsScm{
            scm {
                git {
                    remote {
                    name('druapal8dev')
                    url('git@bitbucket.org:devshot/druapal8dev.git')
                    }
                }
                scriptPath("Jenkinsfile")
             }
        }
    }
}




folder('jenkins-pipeline-seeds-folder/testing') {
    description('Folder containing all QA jobs for project A')
}