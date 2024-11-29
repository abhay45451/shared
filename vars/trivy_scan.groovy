def call (){
sh "trivy fs --formate table -o trivy-fs-report.html ."
}   
