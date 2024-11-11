def call(string username, string image, string tag){
  withCredentials([UsernamePassword(credentialsId: "dockercred", passwordVariable: 'dockerpass', usernameVariable: 'dockeruser')]){
    sh ' docker login -u ${dockeruser} -p ${dockerpass}
}
    sh 'docker push ${username}/${image}:${tag}'
}
