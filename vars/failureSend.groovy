def call(){
        emailext (subject: "FAILED: Job  ${env.JOB_NAME}", 
                     body: "Job ${env.JOB_NAME}  with B ${env.BUILD_NUMBER} has finished with failure.. This is the job: ${env.JOB_URL}", 
                     to: "bolotbekfatima1@gmail.com")
}