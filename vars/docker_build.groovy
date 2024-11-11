def call(string username, string image, string tag){
  sh "docker build -t ${username}/${image}:${tag} ."
}
