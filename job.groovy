pipelineJob('example-pipeline') {
  definition {
    cpsScm {
      scm {
        github('t-cyrill/jenkinsfile-example')
      }
    }
  }
}
