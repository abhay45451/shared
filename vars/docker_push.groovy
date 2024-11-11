def call(String username, String image, String tag) {
    withCredentials([usernamePassword(credentialsId: "docker", passwordVariable: 'dockerpass', usernameVariable: 'dockeruser')]) {
        sh "docker login -u ${dockeruser} -p ${dockerpass}"
    }
    sh "docker push ${username}/${image}:${tag}"
}
