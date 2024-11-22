def call(String cb){
    if (cb == "SUCCESS"){
                emailext (
                    subject: "SUCCESSFUL:Job ${env.JOB_NAME}",
                    body: """
                        <html>
                            <body>
                                <p>Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} has finished successfully </p>. 
                                <p>This is the job URL: ${env.JOB_URL}</p>
                            </body>
                        <html>
                    """,
                    to: "bolotbekfatima1@gmail.com",
                    mimeType: 'text/html'
                    ) 
    }
    else if (cb == "FAILURE"){
            emailext (
                subject: "FAILED:Job ${env.JOB_NAME}",
                body: "Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} has finished with failure. This is the job URL: ${env.JOB_URL}",
                to: "bolotbekfatima1@gmail.com")
    }
    else if (cb == "UNSTABLE"){
            emailext (
                subject: "FAILED:Job ${env.JOB_NAME}",
                body: "Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} has finished with failure. This is the job URL: ${env.JOB_URL}",
                to: "bolotbekfatima1@gmail.com")
    }
    else{
        emailext (
            subject: "JOB ${env.JOB_NAME}",
            body: "Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} has finished with UNKNOWN STATUS. This is the job URL:  ${env.JOB_URL}",
            to: "bolotbekfatima1@gmail.com")       
    }
}







