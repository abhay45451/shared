def call(String username, String image, String tag){
  withCredentials([UsernamePassword(credentialsId: "docker", passwordVariable: 'dockerpass', usernameVariable: 'dockeruser')]){
    sh ' docker login -u ${dockeruser} -p ${dockerpass}'
}
  sh 'docker tag ${image}:${tag} ${username}/${image}:${tag}'  
  sh 'docker push ${username}/${image}:${tag}'
}
