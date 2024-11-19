def call(String username,String image, String tag){
  sh "docker rmi ${username}/${image}:${tag}"
}
